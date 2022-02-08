package Classes;

public class Calculo {
    
    private Double x;
    private Double y;
    private Double media;  
    
    //Contrutor vazio

  public Calculo() {

  }

//Construtor com parametros

  public Calculo(double x, double y) {

    this.media = (x + y) / 2;

  }

  public double calcularMedia(double x, double y) {

    return this.media = (x + y) / 2;

  }

  public double getMedia() {

    return media;

  }

} 
    
