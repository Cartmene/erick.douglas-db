/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package erickdouglas.chan;






public class SalaDeAula {
   int id;
   String professor;
   String nome;
   SalaDeAula(int id, String professor, String nome){
       this.id=id;
       this.nome=nome;
       this.professor=professor;
   }
  SalaDeAula(){
  }
   void alteraNome(String nome){
   this.nome=nome;
}
   String recuperaNome(){
   return nome;
   }
           
   
   
   
   
    void imprimeDados(){
        System.out.println("Nome: " + nome + "\n" + "ID: " + id +"\n" + "Professor: " + professor);
    }
    
    
    
    
}
