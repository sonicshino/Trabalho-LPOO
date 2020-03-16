/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class Livro {
    private String codigo, titulo, categoria;
    private double valorCompra, valorVenda;
 
 public Livro(){
    
}   
 public double calcularVenda(){
     return valorCompra * 1.5;
 }
 
 public Livro(String codigo, String titulo, String categoria, double valorCompra){
     this.codigo = codigo;
     this.titulo = titulo;
     this.categoria = categoria;
     this.valorCompra = valorCompra;
     this.valorVenda = calcularVenda();
 } 
 public String getCodigo(){
     return codigo;
 }
 public void setCodigo(String codigo){
     this.codigo = codigo;
 }
 public String getTitulo(){
     return titulo;
 }
 public void setTitulo(String titulo){
     this.titulo = titulo;
 }
 public String getCategoria(){
     return categoria;
 }
 public void setCategoria(String categoria){
     this.categoria = categoria;
 }
 public double getValorCompra(){
     return valorCompra;
 }
 public void setValorCompra(double compra){
     this.valorCompra = compra;
 }
 public double getValorVenda(){
     return calcularVenda();
 }
 public void setValorVenda(){
     this.valorVenda = calcularVenda();
 }
}
