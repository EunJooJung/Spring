package com.mvc.updown;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.FileEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.WebUtils;

import com.mvc.updown.validate.FileValidator;
import com.mvc.updown.validate.UploadFile;

@Controller
public class HomeController {
	
	@Autowired
	private FileValidator fileValidator;
	
	@RequestMapping("/form")
	public String uploadForm() {
		return "upload";
	}
	
	@RequestMapping("/upload")
	public String fileUpload(HttpServletRequest requset, Model model,
			UploadFile uploadFile, BindingResult result) {
		
		// BindingResult : 발생한 오류 정보를 받기 위한 객체
		// uploadFile에 대해 유효성 검사를 하고 오류가 있는 경우 result에 오류 등록

		
		fileValidator.validate(uploadFile, result);
		
		// 오류가 있을 때 처리
		if(result.hasErrors()) {
			return "upload";
		}
		
		MultipartFile file = uploadFile.getMpfile();
		String name = file.getOriginalFilename(); // 업로드한 실제 파일명 추출

		// DTO에 셋팅
		UploadFile fileobj = new UploadFile();
		fileobj.setName(name);
		fileobj.setDesc(uploadFile.getDesc());
		
		InputStream inputStream = null;
		OutputStream outputStream = null;
		
		try {
			 // 파일 내용을 읽기 위해 InputStream을 얻어옴
			inputStream = file.getInputStream();
			
			// 파일이 저장될 실제 서버상의 경로 생성
			String path = WebUtils.getRealPath(requset.getSession().getServletContext(), "/resources/storage");
			
			System.out.println("업로드 될 실제 경로 : "+path);
			
			// 경로가 존재하지 않으면 생성
			File storage = new File(path);
			if(!storage.exists()) {
				storage.mkdir();
			}
			
			// 파일이 존재하지 않으면 생성
			File newFile = new File(path+"/"+name);
			if(!newFile.exists()) {
				newFile.createNewFile();
			}
			
			// 지정한 파일로 OutputStream을 생성
			outputStream = new FileOutputStream(newFile);
			
			int read = 0; // 읽은 데이터의 크기
			byte[] b = new byte[(int)file.getSize()];
			
			 // InputStream에서 b의 배열크기만큼씩 읽어서 int 값으로 반환한다. 스트림의 끝에 도달하면 -1을 리턴
			while((read=inputStream.read(b)) != -1) {
				outputStream.write(b, 0, read);
				// write(byte buf[], int index, int size) : b 배열에 저장된 데이터를 0부터 size만큼 outputStream에 쓴다.
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				inputStream.close();
				outputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		model.addAttribute("fileObj",fileobj);
		
		
		return "download";
		
	}
	
	@RequestMapping("/download")
	@ResponseBody
	public byte[] fileDownload(HttpServletRequest requst, HttpServletResponse response, String name) {
		
		byte[] down = null;
		
		try {
			String path = WebUtils.getRealPath(requst.getSession().getServletContext(), "/resources/storage");
			
			File file = new File(path+"/"+name);
			
			down = FileCopyUtils.copyToByteArray(file);
			String filename = new String(file.getName().getBytes(),"8859_1");
			
			response.setHeader("Content-Disposition", "attachment; filename=\""+filename+"\"");
			response.setContentLength(down.length);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return down;
		
	}
	
	
}
