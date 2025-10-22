package Model;
import java.util.Scanner;

public class SinaisVitais {
    Scanner sc = new Scanner(System.in);
    



    private int fc;  // frequência cardíaca
    private int fr;  // frequência respiratória
    private int pas; // pressão arterial sistólica
    private int pad; // pressão arterial diastólica
    private double temp;
    private int pam;
    
   

    // Construtor
    public SinaisVitais(){

    }
    public SinaisVitais(int fc, int fr, int pas, int pad, double temp) {
    this.fc = fc;
    this.fr = fr;
    this.pas = pas;
    this.pad = pad;
    this.temp = temp;
}

        // Getters
    public int getFc() { return fc; }
    public int getFr() { return fr; }
    public double getTemp() { return temp; }
    public int getPad() {return pad;}
    public int getPas() {return pas;}
    public int getPam() {return pam;}
    

    // Setters
    public void setFc(int fc) { this.fc = fc; }
    public void setTemp(double temp) { this.temp = temp; }
    public void setPas(int pas){this.pas = pas;}
    public void setPad(int pad){this.pad = pad;}
    public void setPam(int pam){this.pam = pam;}
    

    public void aferirSinaisVitais(){
        System.out.println("Entre com a Frequencia Cardíaca");
        fc = sc.nextInt();
        System.out.println("Entre com a Frequencia Respiratoria");
        fr = sc.nextInt();
        System.out.println("Entre com a Temperatura - Use ponto ao inves de virgula");
        temp = sc.nextDouble();
        System.out.println("Entre com a Pressão Sistolica - A maior Pressão");
        pas = sc.nextInt();
        System.out.println("Entre com a Pressão Diastolica - a menor Pressão");
        pad = sc.nextInt();
        pam = (pas + (2*pad))/3;

    }
    public void mostrarSinais() {
    System.out.println("----- Sinais Vitais -----");
    System.out.println("Frequência Cardíaca: " + fc + (fc < 50 || fc > 100 ? " (Alterada)" : " (Normal)"));
    System.out.println("Frequência Respiratória: " + fr + (fr < 15 || fr > 20 ? " (Alterada)" : " (Normal)"));
    System.out.println("Pressão Arterial Sistólica: " + pas);
    System.out.println("Pressão Arterial Diastólica: " + pad);
    System.out.println("Pressão Arterial Média: " + getPam());
    System.out.println("Temperatura: " + temp);
}


}










