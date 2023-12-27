package fpt.fa.entity;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Pattern;

@Entity
public class DatVe {

	@Id
    private String maDatVe;

    private String cccd;

    private LocalDate ngayDatVe;

    private String bienSoXe;

    private String diaDiemXuatPhat;

    private String diaDiemDen;

    private LocalDate ngayXuatPhat;
    
    @ManyToOne
//    @JoinColumn(name="cccd")
    @JoinColumn(name="cccd", insertable = false, updatable = false)
    private KhachHang khachHang;

	public DatVe() {
		super();
	}

	public DatVe(String maDatVe, String cccd, LocalDate ngayDatVe, String bienSoXe, String diaDiemXuatPhat,
			String diaDiemDen, LocalDate ngayXuatPhat) {
		super();
		this.maDatVe = maDatVe;
		this.cccd = cccd;
		this.ngayDatVe = ngayDatVe;
		this.bienSoXe = bienSoXe;
		this.diaDiemXuatPhat = diaDiemXuatPhat;
		this.diaDiemDen = diaDiemDen;
		this.ngayXuatPhat = ngayXuatPhat;
	}

	public String getMaDatVe() {
		return maDatVe;
	}

	public void setMaDatVe(String maDatVe) {
		this.maDatVe = maDatVe;
	}

	public String getCccd() {
		return cccd;
	}

	public void setCccd(String cccd) {
		this.cccd = cccd;
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

	public KhachHang getKhachHang() {
		return khachHang;
	}

	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}

	@Override
	public String toString() {
		return "DatVe [maDatVe=" + maDatVe + ", cccd=" + cccd + ", ngayDatVe=" + ngayDatVe + ", bienSoXe=" + bienSoXe
				+ ", diaDiemXuatPhat=" + diaDiemXuatPhat + ", diaDiemDen=" + diaDiemDen + ", ngayXuatPhat="
				+ ngayXuatPhat + "]";
	}
    
    
    
}
