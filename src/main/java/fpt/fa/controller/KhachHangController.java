package fpt.fa.controller;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import fpt.fa.DTO.DatVeDTO;
import fpt.fa.service.KhachHangService;


@Controller
@RequestMapping("/khachhang")
public class KhachHangController {
	@Autowired
    private KhachHangService service;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String showKhachHang(Model model,
			@RequestParam(value = "searchTrangThaiTiem", required = false, defaultValue = "") String trangThaiTiem,
			@RequestParam(value = "searchKetQuaXetNghiem", required = false, defaultValue = "") String ketQuaXetNghiem
			) {
		model.addAttribute("searchTrangThaiTiem", trangThaiTiem);
		model.addAttribute("searchKetQuaXetNghiem", ketQuaXetNghiem);
		model.addAttribute("khachHangList", service.getAllKhachHangDatVe(trangThaiTiem,ketQuaXetNghiem));
		return "khachhang/listKhachHang";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String showUpdateKhachHang(Model model,
			@RequestParam String cccd,
			@RequestParam String maDatVe
			) {
		model.addAttribute("datvedto", service.getKhachHangDatVeByCCCDAndMaDV(cccd, maDatVe));
		return "khachhang/updateKhachHang";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateKhachHang(Model model,@ModelAttribute(name = "datvedto") DatVeDTO dv) {
		service.update(dv);
		return "redirect:/khachhang/list";
	}

}
