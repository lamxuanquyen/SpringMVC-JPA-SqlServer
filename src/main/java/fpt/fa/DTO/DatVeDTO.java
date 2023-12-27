package fpt.fa.DTO;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;

public class DatVeDTO {
	private String cccd;

    private String hoTen;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate ngaySinh;

    private String gioiTinh;

    @Pattern(regexp = "^0[0-9]{9,10}$", message = "SDT chua dung dinh dang")
    private String soDienThoai;

    private String trangThaiTiem;

    private String ketQuaXetNghiem;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate ngayXetNghiem;

    private String maDatVe;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate ngayDatVe;

    @Pattern(regexp = "^[0-9]{2}[A-Z]-[0-9]{3}\\.[0-9]{2}$", message = "BSX chua dung dinh dang")
    private String bienSoXe;

    private String diaDiemXuatPhat;

    private String diaDiemDen;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate ngayXuatPhat;
	
	public DatVeDTO() {
		// TODO Auto-generated constructor stub
	}

	public DatVeDTO(String cccd, String hoTen, LocalDate ngaySinh, String gioiTinh,
			String soDienThoai,String trangThaiTiem, String ketQuaXetNghiem, LocalDate ngayXetNghiem, String maDatVe, LocalDate ngayDatVe,
			String bienSoXe,String diaDiemXuatPhat, String diaDiemDen, LocalDate ngayXuatPhat) {
		super();
		this.cccd = cccd;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.soDienThoai = soDienThoai;
		this.trangThaiTiem = trangThaiTiem;
		this.ketQuaXetNghiem = ketQuaXetNghiem;
		this.ngayXetNghiem = ngayXetNghiem;
		this.maDatVe = maDatVe;
		this.ngayDatVe = ngayDatVe;
		this.bienSoXe = bienSoXe;
		this.diaDiemXuatPhat = diaDiemXuatPhat;
		this.diaDiemDen = diaDiemDen;
		this.ngayXuatPhat = ngayXuatPhat;
	}

	public String getCccd() {
		return cccd;
	}

	public void setCccd(String cccd) {
		this.cccd = cccd;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public LocalDate getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(LocalDate ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getTrangThaiTiem() {
		return trangThaiTiem;
	}

	public void setTrangThaiTiem(String trangThaiTiem) {
		this.trangThaiTiem = trangThaiTiem;
	}

	public String getKetQuaXetNghiem() {
		return ketQuaXetNghiem;
	}

	public void setKetQuaXetNghiem(String ketQuaXetNghiem) {
		this.ketQuaXetNghiem = ketQuaXetNghiem;
	}

	public LocalDate getNgayXetNghiem() {
		return ngayXetNghiem;
	}

	public void setNgayXetNghiem(LocalDate ngayXetNghiem) {
		this.ngayXetNghiem = ngayXetNghiem;
	}

	public String getMaDatVe() {
		return maDatVe;
	}

	public void setMaDatVe(String maDatVe) {
		this.maDatVe = maDatVe;
	}

	public LocalDate getNgayDatVe() {
		return ngayDatVe;
	}

	public void setNgayDatVe(LocalDate ngayDatVe) {
		this.ngayDatVe = ngayDatVe;
	}

	public String getBienSoXe() {
		return bienSoXe;
	}

	public void setBienSoXe(String bienSoXe) {
		this.bienSoXe = bienSoXe;
	}

	public String getDiaDiemXuatPhat() {
		return diaDiemXuatPhat;
	}

	public void setDiaDiemXuatPhat(String diaDiemXuatPhat) {
		this.diaDiemXuatPhat = diaDiemXuatPhat;
	}

	public String getDiaDiemDen() {
		return diaDiemDen;
	}

	public void setDiaDiemDen(String diaDiemDen) {
		this.diaDiemDen = diaDiemDen;
	}

	public LocalDate getNgayXuatPhat() {
		return ngayXuatPhat;
	}

	public void setNgayXuatPhat(LocalDate ngayXuatPhat) {
		this.ngayXuatPhat = ngayXuatPhat;
	}

	

	
}
