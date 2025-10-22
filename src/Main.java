
import Model.Mews;
import Model.Pessoa;
import Model.SinaisVitais;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pessoa paciente1 = new Pessoa("Leandro Nacimento", "1112", "02007159171");
        System.out.println(paciente1.getNome());
        paciente1.mostrarPaciente();
        SinaisVitais ssvv1 = new SinaisVitais();
        ssvv1.aferirSinaisVitais();
        paciente1.mostrarPaciente();
        ssvv1.mostrarSinais();
        Mews mews1 = new Mews(ssvv1);
        mews1.calcularMews();
        mews1.mostrarMews();

    



    }
}