/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.lpoo.om.model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author 20182PF.CC0033
 */
public class MaoObra implements Serializable{
    private Integer id;
    private String descricao;
    private Date tempo_estimado_execucao;
    private Float valor;
}
