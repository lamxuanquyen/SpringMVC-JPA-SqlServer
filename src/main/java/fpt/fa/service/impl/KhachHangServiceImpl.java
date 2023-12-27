package fpt.fa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import fpt.fa.DTO.DatVeDTO;
import fpt.fa.entity.DatVe;
import fpt.fa.entity.KhachHang;
import fpt.fa.repository.DatVeRepository;
import fpt.fa.repository.KhachHangRepository;
import fpt.fa.service.KhachHangService;

@Service
public class KhachHangServiceImpl implements KhachHangService {
	@Autowired
	private KhachHangRepository repositoryKhachHang;
	
	@Autowired
	private DatVeRepository repositoryDatVe;	

	@Override
	public List<DatVeDTO> getAllKhachHangDatVe(String trangThaiTiem, String ketQuaXetNghiem) {
		return repositoryKhachHang.getAllKhachHangDatVe(trangThaiTiem,ketQuaXetNghiem);
	}

	@Override
	public DatVeDTO getKhachHangDatVeByCCCDAndMaDV(String cccd, String maDatVe) {
		// TODO Auto-generated method stub
		return repositoryKhachHang.getKhachHangDatVeByCCCDAndMaDV(cccd, maDatVe);
	}

	
	@Override
	public void update(DatVeDTO dto) {		
		KhachHang khachHang = repositoryKhachHang.findById(dto.getCccd()).orElse(new KhachHang());
		
		if (khachHang.getCccd() != null) {
            khachHang.setSoDienThoai(dto.getSoDienThoai());
            khachHang.setTrangThaiTiem(dto.getTrangThaiTiem());
            khachHang.setKetQuaXetNghiem(dto.getKetQuaXetNghiem());
            khachHang.setNgayXetNghiem(dto.getNgayXetNghiem());
            repositoryKhachHang.save(khachHang);
        }
	}
	
	
}
