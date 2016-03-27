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
public class Segmento {
    private List<Ponto> pontos; // LISTA DE PONTOS
    // CAMPO FINAL ATRIBUI VALOR APENAS UMA VEZ.
    // LISTA É ABSTRATO; O IDEAL É TRABALHAR COM COISAS MAIS ABASTRATAS
        
    public Segmento(){
        this.pontos = new ArrayList<Ponto>();
    }
    
    public void adicionaPonto(double latitude, double longitude, double elevacao, String tempo) {
        pontos.add(new Ponto(latitude, longitude, elevacao, tempo));
    }
    
     public void adicionaPonto(Ponto ponto) {
        pontos.add(ponto);
    }
     
    public int contaPontos(){
        return pontos.size();
    }
    
    public Ponto pegaPontoIndice(int indice){
        return pontos.get(indice);
    }
    
    public Iterable<Ponto> getPontos(){ // OBJETO QUE FUNCIONA COMO UMA LISTA SÓ PRA LEITURA.
        return pontos;
    } 
    
    public void removePonto(int indice)
    {
        pontos.remove(indice);
    }
     
}
