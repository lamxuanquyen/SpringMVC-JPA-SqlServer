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

import fpt.fa.DTO.DatVeDTO;
import fpt.fa.service.DatVeService;


@Controller
@RequestMapping("/datve")
public class DatVeController {
	@Autowired
    private DatVeService service;
	
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String showCreate(Model model) {
		DatVeDTO datveDTO = new DatVeDTO();
		datveDTO.setNgayDatVe(LocalDate.now());
		model.addAttribute("datvedto",datveDTO);
		return "datve/createDatVe";
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String doCreate(Model model,@Validated @ModelAttribute(name = "datvedto") DatVeDTO datveDTO, BindingResult rs) {
		
		if (rs.hasErrors()) {
            return "datve/createDatVe";
        }
		
		service.create(datveDTO);
		return "redirect:/khachhang/list";
	}

}
