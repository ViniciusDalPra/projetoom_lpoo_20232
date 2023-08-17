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
public class Servico implements Serializable{
    private Integer id;
    private Float valor;
    private Calendar data_inicio;
    private Calendar data_fim;
    private StatusServico statusServico;
    private Orcamento orcamento;
    private Equipe equipe;
    private Collection<Pagamento> pagamento;
    
    
}
