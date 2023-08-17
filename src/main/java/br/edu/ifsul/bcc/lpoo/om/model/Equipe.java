/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.lpoo.om.model;

import java.io.Serializable;
import java.util.Collection;

/**
 *
 * @author 20182PF.CC0033
 */
public class Equipe implements Serializable {
    private Integer id;
    private String nome;
    private String especialidades;
    private Collection<Funcionario> funcionarios;
    
}
