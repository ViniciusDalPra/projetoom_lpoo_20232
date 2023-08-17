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
public class Curso implements Serializable{
    private Integer id;
    private String descricao;
    private Calendar dt_conclusao;
    private Integer carga_horaria;
}
