
import Model.Paciente;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Paciente paciente1;
        try (Scanner entrada = new Scanner(System.in)) {
            paciente1 = new Paciente("Leandro Nascimento", "02007159171", true);
            paciente1.cadastrar();
            paciente1.internar();
            paciente1.setPossuiAlergia(true);
            paciente1.setPossuiDiabetes(false);
            paciente1.setPossuiPressAlta(true);
            System.out.println("\n===== INÍCIO DA AFERIÇÃO =====");
            System.out.println("Entre com a Frequencia Cardiaca do paciente");
            int frqCardiaca = entrada.nextInt();
            paciente1.setFrqCardiaca(frqCardiaca);
            System.out.println("Entre com a Saturação do paciente");
            int saturation = entrada.nextInt();
            paciente1.setSaturation(saturation);
            System.out.println("Entre com a Frequencia Respiratoria");
            int frqRespiratoria = entrada.nextInt();
            paciente1.setFrqRespiratoria(frqRespiratoria);
            System.out.println(" Entre com a Pressão Arterial Sistolica");
            int pressSistolica = entrada.nextInt();
            paciente1.setPressSistolica(pressSistolica);
            System.out.println("Entre com a Pressão Arterial Diastólica");
            int pressDiastolica = entrada.nextInt();
            paciente1.setPressDiastolica(pressDiastolica);
            paciente1.setPam((pressSistolica +2 * pressDiastolica)/3);
            System.out.println("Pressão Medica calculada automaticamente: " + paciente1.getPam());
            System.out.println("Entre com a Temperatura");
            float temperatura = entrada.nextFloat();
            paciente1.setTemperatura(temperatura);
        }


        paciente1.aferirSinaisVitais();
        System.out.println("\n===== RESULTADOS =====");

        
        



    }
}