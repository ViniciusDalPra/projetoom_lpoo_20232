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
public class Veiculo implements Serializable{
    private String placa;
    private String modelo;
    private Integer ano;
    private Calendar data_ultimo_servico;
}
