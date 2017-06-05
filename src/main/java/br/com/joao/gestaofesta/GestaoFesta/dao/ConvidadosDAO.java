/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.joao.gestaofesta.GestaoFesta.dao;

import br.com.joao.gestaofesta.GestaoFesta.model.Convidado;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 *
 * @author joaoassis
 */
public interface ConvidadosDAO extends JpaRepository<Convidado, Long>{
    
}
