/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpxcleaner.modelo;

/**
 *
 * @author labccet
 */
public class Ponto {

    private double latitude;
    private double longitude;
    private double elevacao;
    private String tempo; // datas em Java joda.time
    
      
    // DATA OBJECT = GUARDAR INFORMAÇÕES E SÃO PEQUENOS COM POUCOS ATRIBUTOS
    //CONSTRUTOR INICIALIZADOR
    
    public Ponto(double latitude, double longitude, double elevacao, String tempo){
        this.latitude = latitude;
        this.longitude = longitude;
        this.elevacao = elevacao;
        this.tempo = tempo;    
    }
    
    
    public Ponto(){
        this(0.0, 0.0,0.0,""); // CHAMA O CONSTRUTOR PRINCIPAL - ENCADEAMENTO DE CONSTRUTORES
    }
      
    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getElevacao() {
        return elevacao;
    }

    public String getTempo() {
        return tempo;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setElevacao(double elevacao) {
        this.elevacao = elevacao;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }
    
}
