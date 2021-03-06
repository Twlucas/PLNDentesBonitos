/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model;

import br.com.model.bd.Cliente;
import br.com.model.bd.Dentista;
import br.com.model.bd.Evento;

/**
 *
 * @author nakao<nakaosensei@gmail.com>
 */
public class HorarioFilter {
    private Dentista dentista;    
    private String data;
    private String horario;   
    private String nomeCliente;
    private String foneFixoCliente;
    private String foneCelularCliente;
    private String dia;
    private String mes;
    private String ano;
    private String hora;
    private String minuto;
    private Cliente cliente;
    
    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMinuto() {
        return minuto;
    }

    public void setMinuto(String minuto) {
        this.minuto = minuto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Dentista getDentista() {
        return dentista;
    }

    public void setDentista(Dentista dentista) {
        this.dentista = dentista;
    }
    
    

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getFoneFixoCliente() {
        return foneFixoCliente;
    }

    public void setFoneFixoCliente(String foneFixoCliente) {
        this.foneFixoCliente = foneFixoCliente;
    }

    public String getFoneCelularCliente() {
        return foneCelularCliente;
    }

    public void setFoneCelularCliente(String foneCelularCliente) {
        this.foneCelularCliente = foneCelularCliente;
    }

    public Evento convertToEvento(){
        Evento e = new Evento();
        e.setAno(this.ano);
        e.setDia(this.dia);
        e.setHora(this.hora);
        e.setIdCliente(this.cliente);
        e.setIdDentista(this.dentista);
        e.setMes(this.mes);
        e.setMinutos(this.minuto);
        return e;
    }
    
}
