package ar.edu.grupoesfera.cursospring.controladores;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladorSarasa {
	
	@RequestMapping(value="/home")
	public ModelAndView vista() {
		return new ModelAndView("vistas");
	}
	
	@RequestMapping(value="/inicio")
	public ModelAndView inicio(@RequestParam("nombre")String nombre) {
		Map <Integer, String> mapita = new HashMap<Integer, String>();
		return new ModelAndView("inicio");
	}
	
	@RequestMapping(value="/inicio/{nombreREST}")
	public ModelAndView inicioREST(@PathVariable String nombreREST) {
		ModelMap modelo = new ModelMap();
		TreeSet colec = new TreeSet();
		modelo.put("nombreCompleto", nombreREST + " Pótamo");
		modelo.put("colec", colec);
		return new ModelAndView("inicioREST", modelo);
	}
}
