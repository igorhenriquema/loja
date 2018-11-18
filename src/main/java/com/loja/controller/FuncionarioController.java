package com.loja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

	@Controller
	public class FuncionarioController {

		@GetMapping("/funcionario")
		public ModelAndView findAll() {

			ModelAndView mv = new ModelAndView("/funcionario/index");

			return mv;
		}
	}