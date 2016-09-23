package ar.edu.grupoesfera.cursospring.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.modelo.Persona;

@Controller

public class Controller11Ideal {
	
	 @RequestMapping(value="/hello")
	  public ModelAndView vistas() {
		  
		     return new ModelAndView("hello");
		  }
	 
	 @RequestMapping(value="/inicio")
	 public  ModelAndView inicio(@RequestParam ("nombre") String nombre,
			 					 @RequestParam ("apellido") String apellido ) {
		
		 ModelMap modelo = new ModelMap();
		 modelo.put("surName", nombre);
		 modelo.put("apellido", apellido);
		
		return new ModelAndView("inicio", modelo);
		 
	 }
	 
	 @RequestMapping(value="/inicioSaludo")
	 @ModelAttribute("persona")
	 public  ModelAndView formulario(@ModelAttribute Persona persona) {
		
		return new ModelAndView("inicioSaludo");
		 
	 }
	 
	 @RequestMapping(value="/saludo")
	 @ModelAttribute("persona")
	 public  ModelAndView CrearPersona(@ModelAttribute Persona persona) {
		 	
		 	Persona per = new Persona();
			ModelMap modelo = new ModelMap();
			
			per.setNombre(persona.getNombre());
			per.setApellido(persona.getApellido());

			modelo.addAttribute(per);
			modelo.put("surName", persona.getNombre());
			modelo.put("apellido", persona.getApellido());
			
			return new ModelAndView("saludo",modelo);
		 
	 }
	 
	 @RequestMapping(value="/inicio/{nombre}/tallerweb/{apellido}")
	 public  ModelAndView inicio2(@PathVariable ("nombre") String nombre,
			 					  @PathVariable ("apellido") String apellido ) {
		
		 return new ModelAndView("Inicio");
		 
	 }
	 
	 
	 /*////////////////////////////////////////////////////*/
	 @RequestMapping(value = "/index", method = RequestMethod.GET)
	   public String index() {
	    return "Ejemplo";
	   }
	 @RequestMapping(value = "/staticPage", method = RequestMethod.GET)
	   public String redirect() {
	      return "final";
	   }
	 /*/////////////////////////////////////////////////*/
	 

}
