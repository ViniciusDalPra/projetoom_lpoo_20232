/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.lpoo.om.model;

import java.io.Serializable;
import java.util.Calendar;

/**
 *
 * @author 20182PF.CC0033
 */
public class Pessoa implements Serializable {
    private String nome;
    private String cpf;
    private String senha;
    private Calendar data_nascimento;
    private String cep;
    private String complemento;
}
