/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.lpoo.om.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Collection;

/**
 *
 * @author 20182PF.CC0033
 */
public class Funcionario extends Pessoa implements Serializable{
    private String numero_ctps;
    private Calendar data_admissao;
    private Calendar data_demissao;
    private Collection<Curso> cursos;
    private Cargo cargo;
}
