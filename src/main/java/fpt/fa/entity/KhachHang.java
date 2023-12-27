package fpt.fa.entity;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Pattern;

@Entity
public class KhachHang {
	@Id
    private String cccd;

	private String hoTen;
	
	private LocalDate ngaySinh;

    private String gioiTinh;

    private String soDienThoai;

    private String trangThaiTiem;

    private String ketQuaXetNghiem;

    private LocalDate ngayXetNghiem;
    
    @OneToMany(mappedBy = "khachHang",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Set<DatVe> datVes;

	public KhachHang() {
		super();
	}

	public KhachHang(String cccd, String hoTen, LocalDate ngaySinh, String gioiTinh, String soDienThoai,
			String trangThaiTiem, String ketQuaXetNghiem, LocalDate ngayXetNghiem) {
		super();
		this.cccd = cccd;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.soDienThoai = soDienThoai;
		this.trangThaiTiem = trangThaiTiem;
		this.ketQuaXetNghiem = ketQuaXetNghiem;
		this.ngayXetNghiem = ngayXetNghiem;
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

	public String isGioiTinh() {
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

	public Set<DatVe> getDatVes() {
		return datVes;
	}

	public void setDatVes(Set<DatVe> datVes) {
		this.datVes = datVes;
	}

	@Override
	public String toString() {
		return "KhachHang [cccd=" + cccd + ", hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", gioiTinh=" + gioiTinh
				+ ", soDienThoai=" + soDienThoai + ", trangThaiTiem=" + trangThaiTiem + ", ketQuaXetNghiem="
				+ ketQuaXetNghiem + ", ngayXetNghiem=" + ngayXetNghiem + "]";
	}

	
    
    
}
