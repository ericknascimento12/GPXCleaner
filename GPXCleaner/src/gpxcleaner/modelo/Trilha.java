/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpxcleaner.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author labccet
 */
public class Trilha {

    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    private List <Segmento> segmentos;
    
    public Trilha(String nome) {
        this.nome = nome;
        this.segmentos = new ArrayList <Segmento>();    
    }    
    
    public Trilha(){
        this(""); // ENCADEAMENTO DE CONSTRUTORES
    }
   
   public void adicionaSegmento (Segmento segmento){
     segmentos.add(segmento);
   } 
   
   public Segmento pegaSegmentoIndice (int indice){
       return segmentos.get(indice);
   }
   
   public Segmento adicionaSegmento(){
       Segmento segmento = new Segmento();
       segmentos.add(segmento);
       return segmento;
   }
   
   public void removeSegmento(int indice){
       segmentos.remove(indice);
   }
   
   public Iterable<Segmento> getSegmentos(){
       return segmentos;
   }
   
   
    
}
   