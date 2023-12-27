package fpt.fa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import fpt.fa.DTO.DatVeDTO;
import fpt.fa.entity.DatVe;
import fpt.fa.entity.KhachHang;
import fpt.fa.repository.DatVeRepository;
import fpt.fa.repository.KhachHangRepository;
import fpt.fa.service.DatVeService;

@Service
public class DatVeServiceImpl implements DatVeService {
	@Autowired
	private DatVeRepository repositoryDatVe;
	
	@Autowired
	private KhachHangRepository repositoryKhachHang;

	@Override
	public void create(DatVeDTO dto) {
		
		KhachHang khachHang = repositoryKhachHang.findById(dto.getCccd()).orElse(new KhachHang());
		
		if (khachHang.getCccd() != null) {
            repositoryKhachHang.save(khachHang);
        } else {
            khachHang.setCccd(dto.getCccd());
            khachHang.setHoTen(dto.getHoTen());
            khachHang.setNgaySinh(dto.getNgaySinh());
            khachHang.setGioiTinh(dto.getGioiTinh());
            khachHang.setSoDienThoai(dto.getSoDienThoai());
            khachHang.setTrangThaiTiem(dto.getTrangThaiTiem());
            khachHang.setKetQuaXetNghiem(dto.getKetQuaXetNghiem());
            khachHang.setNgayXetNghiem(dto.getNgayXetNghiem());
            repositoryKhachHang.save(khachHang);
        }
		
		DatVe datVe = new DatVe();
        datVe.setMaDatVe(dto.getMaDatVe());
        datVe.setCccd(dto.getCccd());
        datVe.setNgayDatVe(dto.getNgayDatVe());
        datVe.setBienSoXe(dto.getBienSoXe());
        datVe.setDiaDiemXuatPhat(dto.getDiaDiemXuatPhat());
        datVe.setDiaDiemDen(dto.getDiaDiemDen());
        datVe.setNgayXuatPhat(dto.getNgayXuatPhat());        
        repositoryDatVe.save(datVe);
	}

	@Override
	public void update(DatVe dv) {
		repositoryDatVe.save(dv);
	}

	@Override
	public DatVe findById(String id) {
		// TODO Auto-generated method stub
		return repositoryDatVe.findById(id).orElse(null);
	}

	@Override
	public List<DatVe> findAll() {
		// TODO Auto-generated method stub
		return repositoryDatVe.findAll();
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		repositoryDatVe.deleteById(id);
	}

//	@Override
//	public Page<DatVe> findAll(String search, Pageable pageable) {
//		// TODO Auto-generated method stub
//		return repositoryDatVe.findAll(search, pageable);
//	}

}
