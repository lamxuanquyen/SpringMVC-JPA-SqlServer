<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<section class="content">
       <div class="container-fluid">
           <!-- Striped Rows -->
        <div class="row clearfix">
            <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                <div class="card">
                    <div class="header">
                        <h2>
                            Danh sach
                        </h2>
                    </div>
                    <div class="body table-responsive">
                        <table class="table table-striped" id="dataTable-listMember">
                            <thead>
                                <tr>
                                    <th >CCCD</th>
				                    <th >Họ tên</th>
				                    <th >Ngày sinh</th>
				                    <th >Giới tính</th>
				                    <th >Số điện thoại</th>
				                    <th >Trạng thái tiêm</th>
				                    <th >Kết quả xét nghiệm</th>
				                    <th >Ngày xét nghiệm</th>
				                    <th >Mã đặt vé</th>
				                    <th >Ngày đặt vé</th>
				                    <th >Biển số xe</th>
				                    <th >Địa điểm xuất phát</th>
				                    <th >Địa điểm đến</th>
				                    <th >Ngày xuất phát</th>
									<th>Action</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:if test="${not empty khachHangList}">
                                	<c:forEach items="${khachHangList}" var="khachhang">
										<tr>
											<td>${khachhang.cccd }</td>
											<td>${khachhang.hoTen}</td>
											<td>${khachhang.ngaySinh}</td>
											<td>${khachhang.gioiTinh}</td>
											<td>${khachhang.soDienThoai}</td>
											<td>${khachhang.trangThaiTiem}</td>
											<td>${khachhang.ketQuaXetNghiem}</td>
											<td>${khachhang.ngayXetNghiem}</td>
					                        <td>${khachhang.maDatVe}</td>
					                        <td>${khachhang.ngayDatVe}</td>
					                        <td>${khachhang.bienSoXe}</td>
					                        <td>${khachhang.diaDiemXuatPhat}</td>
					                        <td>${khachhang.diaDiemDen}</td>
					                        <td>${khachhang.ngayXuatPhat}</td>
											
											<td>
												<a href="${contextPath}/khachhang/update?cccd=${khachhang.cccd}&maDatVe=${khachhang.maDatVe}">Update</a>
											</td>
										</tr>
									</c:forEach>
                                </c:if>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
        <!-- #END# Striped Rows -->
    </div>
</section>
