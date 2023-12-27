package fpt.fa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fpt.fa.DTO.DatVeDTO;
import fpt.fa.entity.KhachHang;

public interface KhachHangRepository extends JpaRepository<KhachHang, String> {
	@Query("select distinct new fpt.fa.DTO.DatVeDTO(kh.cccd, kh.hoTen, kh.ngaySinh, kh.gioiTinh, kh.soDienThoai, kh.trangThaiTiem, " +
            "kh.ketQuaXetNghiem, kh.ngayXetNghiem, dv.maDatVe, dv.ngayDatVe, dv.bienSoXe, dv.diaDiemXuatPhat, dv.diaDiemDen, dv.ngayXuatPhat) " +
            "from KhachHang kh join DatVe dv ON dv.cccd = kh.cccd " +
            "where kh.trangThaiTiem like %:trangThaiTiem% AND kh.ketQuaXetNghiem like %:ketquaxetnghiem%")
    List<DatVeDTO> getAllKhachHangDatVe(@Param("trangThaiTiem") String trangThaiTiem, @Param("ketquaxetnghiem") String ketQuaXetNghiem);
	
	@Query("select distinct new fpt.fa.DTO.DatVeDTO(kh.cccd, kh.hoTen, kh.ngaySinh, kh.gioiTinh, kh.soDienThoai, kh.trangThaiTiem, " +
            "kh.ketQuaXetNghiem, kh.ngayXetNghiem, dv.maDatVe, dv.ngayDatVe, dv.bienSoXe, dv.diaDiemXuatPhat, dv.diaDiemDen, dv.ngayXuatPhat) " +
            "from KhachHang kh join DatVe dv ON dv.cccd = kh.cccd " +
            "where kh.cccd = :cccd AND dv.maDatVe = :maDatVe")
    DatVeDTO getKhachHangDatVeByCCCDAndMaDV(@Param("cccd") String cccd, @Param("maDatVe") String maDatVe);
	
}
