package com.paulo.even3.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/certificado")
public class CertificadoController {

	@RequestMapping
	public ModelAndView novo() {
		ModelAndView mv = new ModelAndView("GerarCertificado");
		
		return mv;
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/gerar")
	public ModelAndView salvar(@RequestParam("arquivo") MultipartFile file, @RequestParam("participantes") String participantes, RedirectAttributes redirectAttributes) {
		ModelAndView mv = new ModelAndView("GerarCertificado");
		
		return mv;
	}
	
}
