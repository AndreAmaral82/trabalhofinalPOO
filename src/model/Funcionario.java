/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.swing.JOptionPane;

/**
 *
 * @author claudio.silva
 */
public class Funcionario extends Empresa {

    public int id;
    public String nome;
    private int registro;
    protected String texto;
    public static int auxRegistro;

    public Funcionario() {

    }

    public Funcionario(String nome, String funcao,
            String departamento, int registro) {
        this.nome = nome;
        this.cargo = funcao;
        this.departamento = departamento;
        this.registro = registro;

    }

    public Funcionario(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
      public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

      public String getCargo() {
        return cargo;
    }

    public void setCargo(String funcao) {
        this.cargo = funcao;
    }
      public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
    @Override
    public String imprimir() {
        String texto = "Nome: " + this.nome
                + "\nCargo: " + this.cargo
                + "\nDepartamento: " + this.departamento
                + "\nProtocolo de Cadastro: " + this.registro;
        JOptionPane.showMessageDialog(null, texto);
        return texto;

    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro() {
        this.registro = auxRegistro;
    }

    public static int gerarRegistro() {
        auxRegistro = (int) (Math.random() * 1000 + 1);
        return auxRegistro;
    }

}
