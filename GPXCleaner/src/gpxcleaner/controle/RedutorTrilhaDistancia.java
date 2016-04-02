/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpxcleaner.controle;

import gpxcleaner.modelo.Ponto;
import gpxcleaner.modelo.Segmento;
import gpxcleaner.modelo.Trilha;

/**
 *
 * Classe responsável pelo algoritmo de redução de trilha por distância máxima
 * 
 * @author labccet
 */




public class RedutorTrilhaDistancia 
{  
    
    
    
    public Trilha executa(Trilha trilha, double distanciaMaxima)
    {
            Trilha trilhaUnica = juntaSegmentosTrilha(trilha);
     
            calculaErroRemocaoPontos(trilhaUnica);
            
        
        
        
        
// Selecione  o ponto  com a menor distância  de remoção

// Próxima aula
//Próxima aula
    
    
    
    
/*Enquanto a distância  de remoção  do ponto  for menor  do que a distância máxima 
// que foi recebida como parâmetro,
//Remova o ponto 
//Se o ponto anterior a ele não for o extremo da trilha, recalcule sua distância de remoção 
//Se o ponto posterior a ele não for o extremo da trilha, recalcule sua distância de remoção
// Selecione  o ponto  com a menor distância  de remoção

*/
        
        return null;     
        
    }
    private Trilha juntaSegmentosTrilha(Trilha trilha) 
    {
        Segmento segmentoJunto = new Segmento();
        
        for(Segmento segmento : trilha.getSegmentos()){ // Percorre a trilha e junta os segmentos
             for (Ponto ponto : segmento.getPontos()){
                 segmentoJunto.adicionaPonto(ponto);
             }
        }
        
        Trilha saida = new Trilha(); // nomeia a trilha. 
        saida.setNome(trilha.getNome());
        saida.adicionaSegmento(segmentoJunto);
        return saida;  
    }
    
    
    // Calcula o erro de remoção de cada ponto, exceto os extremos.
    
    private void calculaErroRemocaoPontos (Trilha trilhaUnica)
    {
        
        Segmento segmento = trilhaUnica.pegaSegmentoIndice(0);
        int quantidadePontos = segmento.contaPontos();
             
        
        for (int i=1; i < quantidadePontos - 1; i++){
            Ponto pontoAnterior = segmento.pegaPontoIndice(i-1);
            Ponto pontoAtual = segmento.pegaPontoIndice(i);
            Ponto pontoPosterior = segmento.pegaPontoIndice(i+1);
            
            double erro = calculaErroRemocao(pontoAnterior, pontoAtual, pontoPosterior);
            pontoAtual.setErroRemocao(erro);
            
        }  
        
    }

    
    private double calculaErroRemocao(Ponto anterior, Ponto atual, Ponto posterior)
    {
        return 0.0; 
    
    }
    
    
   
    
}
