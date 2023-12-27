<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<div class="container bg-light mt-5">
    <div class="row mt-3">
        <div class="col-lg">			
			<form:form action="${contextPath}/khachhang/list" method="get" >
			    <input type="text" name="searchTrangThaiTiem" placeholder="search TrangThaiTiem" value ="${searchTrangThaiTiem}"/>
			    <input type="text" name="searchKetQuaXetNghiem" placeholder="search KetQuaXetNghiem" value ="${searchKetQuaXetNghiem}"/>
			    <input type="submit" value="Tìm kiếm" />
			     <a class="btn" href="${contextPath}/khachhang/list" >cancel</a>   
			</form:form>
        </div>
    </div>
</div>
