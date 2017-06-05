/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.joao.gestaofesta.GestaoFesta.controller;

import br.com.joao.gestaofesta.GestaoFesta.dao.ConvidadosDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author joaoassis
 */
// @Controller diz que essa classe é um componente Spring, que é uma classe Controller.
@Controller
public class ConvidadosController {
    
    @Autowired
    private ConvidadosDAO convidadosDAO;
    
    // @GetMapping("/convidados") indica que, ao digitarmos http://localhost:8080/convidados o SpringMVC saberá que deve acessar o método listar() e com isso irá chamar a view ListarConvidados
    @GetMapping("/convidados")
    public ModelAndView listar(){
        
        ModelAndView modelAndView = new ModelAndView("ListaConvidados");
        modelAndView.addObject("convidados", convidadosDAO.findAll());
        
        return modelAndView;
    }
    
}
