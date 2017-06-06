/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.joao.gestaofesta.GestaoFesta.controller;

import br.com.joao.gestaofesta.GestaoFesta.dao.ConvidadosDAO;
import br.com.joao.gestaofesta.GestaoFesta.model.Convidado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author joaoassis
 */
// @Controller diz que essa classe é um componente Spring, que é uma classe Controller.
@Controller
@RequestMapping("/paginaConvidados")
public class ConvidadosController {
    
    @Autowired
    private ConvidadosDAO convidadosDAO;
    
    // @GetMapping("/convidados") indica que, ao digitarmos http://localhost:8080/convidados o SpringMVC saberá que deve acessar o método listar() e com isso irá chamar a view ListarConvidados
    @GetMapping("/convidados")
    public ModelAndView listar(){
        
        ModelAndView modelAndView = new ModelAndView("ListaConvidados");
        modelAndView.addObject("convidados", convidadosDAO.findAll());
        modelAndView.addObject(new Convidado());//Esse será o objeto que será utilizado no formulário para ligarmos os campos
        //Vamos usar a expressão *{} para ligar os atributos da classe aos campos do formulário

        return modelAndView;
    }
    
    @PostMapping("/salvarConvidados")
    public String salvar(Convidado convidado){
    	this.convidadosDAO.save(convidado);
    	return "redirect:/paginaConvidados/convidados";//Com o redirect: faz com que o browser faça uma nova requisição get para /convidados
    }
    
    @GetMapping("/edit/{id}")
    public ModelAndView edit(@PathVariable("id") Long id) {
         
        return add(this.convidadosDAO.findOne(id));
    }   
    
    @GetMapping("/add")
    public ModelAndView add(Convidado convidado) {
         
        ModelAndView mv = new ModelAndView("/paginaConvidados/convidados");
        mv.addObject("post", convidado);
         
        return mv;
    }    
    
}
