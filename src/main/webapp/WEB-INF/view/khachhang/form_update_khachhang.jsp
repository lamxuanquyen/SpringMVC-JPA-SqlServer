<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<div class="container bg-light mt-5">
    <div class="row mt-3">
        <div class="col-lg-12 text-center">
            <h2 class="mt-3">UPDATE</h2>
        </div>
        <div class="col-lg">
            <form:form method="post" action="${contextPath}/khachhang/update"  modelAttribute="datvedto" id="formUpdate">
			  <div class="form-group d-flex flex-row flex-wrap">
			    <div class="form-group mt-3 col-6">
			        <form:label path="cccd" for="cccd" style="font-weight: bold">CCCD<sup style="color: red" title="Bắt buộc nhập">*</sup></form:label>
			        <form:input id="cccd" path="cccd" cssClass="form-control" placeholder="Nhập cccd ..." readonly="true" />
			        <form:errors path="cccd" cssClass ="error"></form:errors>
			        <span id = "errorCCCD" class ="error"></span>
			    </div>
			
			    <div class="form-group mt-3 col-6">
			        <form:label path="hoTen" for="hoTen" style="font-weight: bold">Ho Ten<sup style="color: red" title="Bắt buộc nhập">*</sup></form:label>
			        <form:input id="hoTen" path="hoTen" cssClass="form-control" placeholder="Nhập ten  ..." readonly="true"/>
			    	<form:errors path="hoTen" cssClass ="error"></form:errors>
			        <span id = "errorHoTen" class ="error"></span>			  
			    </div>
			
			    <div class="form-group mt-3 col-6">
			        <form:label path="ngaySinh" for="ngaySinh" style="font-weight: bold">Ngay Sinh<sup style="color: red" title="Bắt buộc nhập">*</sup></form:label>
			        <form:input id="ngaySinh" path="ngaySinh" type="date" cssClass="form-control" placeholder="Nhập ngay sinh ..." readonly="true"/>
			    	<form:errors path="ngaySinh" cssClass ="error"></form:errors>
			        <span id = "errorNgaySinh" class ="error"></span>
			    </div>
			    
			    <div class="form-group mt-3 col-6">
			        <form:label path="gioiTinh" for="gioiTinh" style="font-weight: bold">Gioi Tinh<sup style="color: red" title="Bắt buộc nhập">*</sup></form:label>
			        <form:input id="gioiTinh" path="gioiTinh" cssClass="form-control" placeholder="Nhập gioi tinh ..." readonly="true"/>		        
			        <form:errors path="gioiTinh" cssClass ="error"></form:errors>
			        <span id = "errorGioiTinh" class ="error"></span>
			    </div>
			    
			    <div class="form-group mt-3 col-6">
			        <form:label path="soDienThoai" for="soDienThoai" style="font-weight: bold">soDienThoai<sup style="color: red" title="Bắt buộc nhập">*</sup></form:label>
			        <form:input id="soDienThoai" path="soDienThoai" cssClass="form-control" placeholder="Nhập soDienThoai ..."/>
			        <form:errors path="soDienThoai" cssClass ="error"></form:errors>
			        <span id = "errorSoDienThoai" class ="error"></span>
			    </div>
			    
			    <div class="form-group mt-3 col-6">
			        <form:label path="trangThaiTiem" for="trangThaiTiem" style="font-weight: bold">trangThaiTiem<sup style="color: red" title="Bắt buộc nhập">*</sup></form:label>
<%-- 			        <form:input id="trangThaiTiem" path="trangThaiTiem" cssClass="form-control" placeholder="Nhập trang thai tiem ..."/> --%>
			        
			        <form:select path="trangThaiTiem" id="trangThaiTiem" cssClass="form-control">
				        <form:option value="" label="-- Chọn một --" />
				        <form:option value="chua tiem" label="chua tiem" />
				        <form:option value="da tiem it nhat 1 mui" label="da tiem it nhat 1 mui" />
				    </form:select>
				    
			        <form:errors path="trangThaiTiem" cssClass ="error"></form:errors>
			        <span id = "errorTrangThaiTiem" class ="error"></span>
			    </div>
			    
			    <div class="form-group mt-3 col-6">
			        <form:label path="ketQuaXetNghiem" for="ketQuaXetNghiem" style="font-weight: bold">ketQuaXetNghiem<sup style="color: red" title="Bắt buộc nhập">*</sup></form:label>
<%-- 			        <form:input id="ketQuaXetNghiem" path="ketQuaXetNghiem" cssClass="form-control" placeholder="Nhập ket qua xet nghiem ..."/> --%>
			        
			        <form:select path="ketQuaXetNghiem" id="ketQuaXetNghiem" cssClass="form-control">
				        <form:option value="" label="-- Chọn một --" />
				        <form:option value="am tinh" label="am tinh" />
				        <form:option value="duong tinh" label="duong tinh" />
				    </form:select>
			        
			        <form:errors path="ketQuaXetNghiem" cssClass ="error"></form:errors>
			        <span id = "errorKetQuaXetNghiem" class ="error"></span>
			    </div>
			    
			    <div class="form-group mt-3 col-6">
			        <form:label path="ngayXetNghiem" for="ngayXetNghiem" style="font-weight: bold">ngayXetNghiem<sup style="color: red" title="Bắt buộc nhập">*</sup></form:label>
			        <form:input id="ngayXetNghiem" path="ngayXetNghiem" cssClass="form-control" type="date" placeholder="Nhập ngay xet nghiem ..."/>
			        <form:errors path="ngayXetNghiem" cssClass ="error"></form:errors>
			        <span id = "errorNgayXetNghiem" class ="error"></span>
			    </div>
			    
			    <div class="form-group mt-3 col-6">
			        <form:label path="maDatVe" for="maDatVe" style="font-weight: bold">maDatVe<sup style="color: red" title="Bắt buộc nhập">*</sup></form:label>
			        <form:input id="maDatVe" path="maDatVe" cssClass="form-control" placeholder="Nhập maDatVe ..." readonly="true"/>
			        <form:errors path="maDatVe" cssClass ="error"></form:errors>
			        <span id = "errorMaDatVe" class ="error"></span>
			    </div>
			    
			    <div class="form-group mt-3 col-6">
			        <form:label path="ngayDatVe" for="ngayDatVe" style="font-weight: bold">ngayDatVe<sup style="color: red" title="Bắt buộc nhập">*</sup></form:label>
			        <form:input id="ngayDatVe" path="ngayDatVe" cssClass="form-control" type="date" placeholder="Nhập ngayDatVe ..." readonly="true"/>
			        <form:errors path="ngayDatVe" cssClass ="error"></form:errors>
			        <span id = "errorNgayDatVe" class ="error"></span>
			    </div>
			    
			    <div class="form-group mt-3 col-6">
			        <form:label path="bienSoXe" for="bienSoXe" style="font-weight: bold">bienSoXe<sup style="color: red" title="Bắt buộc nhập">*</sup></form:label>
			        <form:input id="bienSoXe" path="bienSoXe" cssClass="form-control" placeholder="Nhập bienSoXe ..." readonly="true"/>
			        <form:errors path="bienSoXe" cssClass ="error"></form:errors>
			        <span id = "errorBienSoXe" class ="error"></span>
			    </div>
			    
			    <div class="form-group mt-3 col-6">
			        <form:label path="diaDiemXuatPhat" for="diaDiemXuatPhat" style="font-weight: bold">diaDiemXuatPhat<sup style="color: red" title="Bắt buộc nhập">*</sup></form:label>
			        <form:input id="diaDiemXuatPhat" path="diaDiemXuatPhat" cssClass="form-control" placeholder="Nhập diaDiemXuatPhat ..." readonly="true"/>
			        <form:errors path="diaDiemXuatPhat" cssClass ="error"></form:errors>
			        <span id = "errorDiaDiemXuatPhat" class ="error"></span>
			    </div>
			    
			    <div class="form-group mt-3 col-6">
			        <form:label path="diaDiemDen" for="diaDiemDen" style="font-weight: bold">diaDiemDen<sup style="color: red" title="Bắt buộc nhập">*</sup></form:label>
			        <form:input id="diaDiemDen" path="diaDiemDen" cssClass="form-control" placeholder="Nhập diaDiemDen ..." readonly="true"/>
			        <form:errors path="diaDiemDen" cssClass ="error"></form:errors>
			        <span id = "errorDiaDiemDen" class ="error"></span>
			    </div>
			    
			    <div class="form-group mt-3 col-6">
			        <form:label path="ngayXuatPhat" for="ngayXuatPhat" style="font-weight: bold">ngayXuatPhat<sup style="color: red" title="Bắt buộc nhập">*</sup></form:label>
			        <form:input id="ngayXuatPhat" path="ngayXuatPhat" cssClass="form-control" type="date" placeholder="Nhập ngayXuatPhat ..." readonly="true"/>
			        <form:errors path="ngayXuatPhat" cssClass ="error"></form:errors>
			        <span id = "errorNgayXuatPhat" class ="error"></span>
			    </div>
			
			</div>	
			    <div class="form-group mt-5">
			        <button class="btn btn-success" type="submit">update</button>
			        <a class="btn btn-danger ml-3" type="text" href="${contextPath}/khachhang/list" >Hủy bỏ</a>				 
			    </div>
			    			    		    
			</form:form>
	
        </div>
    </div>
</div>
