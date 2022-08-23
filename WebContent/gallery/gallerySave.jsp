<%@page import="board.dao.GalleryDao"%>
<%@page import="board.vo.Gallery"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%


	String path = "E:\\iclass05\\upload";	//파일 업로드 경로
	int size = 10*1024*1024;		//10MByte, 전송파일의 최대 크기
	
	MultipartRequest multiRequest = new MultipartRequest(request,
				path,size,"UTF-8",
				new DefaultFileRenamePolicy());
	//DefaultFileRenamePolicy 객체 : 업도르한 파일명이 중복될 경우 파일명 변경하는 정책을 설정
	//			ㄴ 해쉬값 이용하거나 업로드날짜시간을 이용해서 파일명을 변경할 수 있습니다.
	
	//request 객체 대신에 multiRequest 사용합니다 -> 파일 전송을 처리하는 객체
	String title = multiRequest.getParameter("title");
	String filename = multiRequest.getFilesystemName("pic");

	Gallery vo = new Gallery(0,title,null,filename);
	GalleryDao dao = GalleryDao.getInstance();
	dao.insert(vo);
	response.sendRedirect("galleryAction.jsp");
%>