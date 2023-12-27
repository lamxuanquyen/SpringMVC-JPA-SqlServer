package fpt.fa.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import fpt.fa.DTO.DatVeDTO;
import fpt.fa.entity.KhachHang;

public interface KhachHangService {
	List<DatVeDTO> getAllKhachHangDatVe(String trangThaiTiem, String ketQuaXetNghiem);
	DatVeDTO getKhachHangDatVeByCCCDAndMaDV(String cccd, String maDatVe);
	void update(DatVeDTO dv);
}
