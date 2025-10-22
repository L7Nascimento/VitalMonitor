package Model;

public class Mews {
    private int mews = 0;
    private SinaisVitais sinais;
    
    public Mews(SinaisVitais sinaisVitais){
        this.sinais = sinaisVitais;
        this.mews = 0;

    }
    public void calcularMews(){
        mews = 0;
        int fc = sinais.getFc();
        int fr = sinais.getFr();
        double temp = sinais.getTemp();
        int pas = sinais.getPas();
        int pad = sinais.getPad();

         // Frequência cardíaca
        if (fc <= 50 || fc >= 100) mews += 1;

        // Frequência respiratória
        if (fr <= 15 || fr >= 20) mews += 1;

        // Temperatura
        if (temp <= 35 || temp >= 38) mews += 1;

        // Pressão arterial sistólica
        if (pas <= 90) mews += 1;

    }
    public void mostrarMews(){
        switch (mews) {
            case 0:
            System.out.println("MEWS 0");
                
                break;
            case 1:
            System.out.println("Informe o enfermeiro - Revise os Sinais a cada 6 horas");
            System.out.println("Score Mews:  " + mews);
                break;
            case 2:
            System.out.println("Informe o enfermeiro - Revise os Sinais a cada 3 horas");
            System.out.println("Score Mews:  " + mews);
                break;
            case 3:
            System.out.println("Informe o enfermeiro - Revise os Sinais a cada 1 horas");
            System.out.println("Score Mews:  " + mews);
                break;
            case 4:
            System.out.println("Informe o enfermeiro - Revise os Sinais a cada 30 minutos");
            System.out.println("Score Mews:  " + mews);
                break;
            case 5:
            System.out.println("Chame o enfermeiro para avaliação urgente");
            System.out.println("Score Mews:  " + mews);
                break;

            default:
                throw new AssertionError();
            
        }
    }



}
