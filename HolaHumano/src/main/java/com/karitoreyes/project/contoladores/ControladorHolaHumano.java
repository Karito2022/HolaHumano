package com.karitoreyes.project.contoladores;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ControladorHolaHumano {
	@RequestMapping("/")
    public String index(
    		@RequestParam(value="name", required=false) String name, 
    		@RequestParam(value="last_name", required=false) String last_name,
    		@RequestParam(value="times", required=false) String times
    	) {
        if(name != null && times != null) {
        	String text = "";
        	for (int n = 0; n < Integer.parseInt(times); n++) {
                text = text + "Hola " + name + " ";
            }
        	return text;
        }
        
        if(name == null && last_name == null) {
        	return "Hola Humano";
        }else if(last_name == null){
        	return "Hola " + name;
        }else {
        	return "Hola " + name + " " + last_name;
        }
    }
}
