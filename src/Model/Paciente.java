package Model;

public class Paciente extends Pessoa{
   // Alergias e comorbidades do Paciente
    boolean possuiAlergia;
    boolean possuiDiabetes;
    boolean possuiPressAlta;
    int id;

    //sinais vitais
    int frqCardiaca;
    int frqRespiratoria;
    int pressSistolica;
    int pressDiastolica;
    int pam;
    int Saturation;
    float temperatura;

    
    public Paciente(String nome, String cpf, boolean cadastroAtivo) {
        super(nome, cpf, cadastroAtivo);
        
    }


    public boolean isPossuiAlergia() {
        return possuiAlergia;
    }


    public void setPossuiAlergia(boolean possuiAlergia) {
        this.possuiAlergia = possuiAlergia;
    }


    public boolean isPossuiDiabetes() {
        return possuiDiabetes;
    }


    public void setPossuiDiabetes(boolean possuiDiabetes) {
        this.possuiDiabetes = possuiDiabetes;
    }


    public boolean isPossuiPressAlta() {
        return possuiPressAlta;
    }


    public void setPossuiPressAlta(boolean possuiPressAlta) {
        this.possuiPressAlta = possuiPressAlta;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public int getFrqCardiaca() {
        return frqCardiaca;
    }


    public void setFrqCardiaca(int frqCardiaca) {
        this.frqCardiaca = frqCardiaca;
    }


    public int getFrqRespiratoria() {
        return frqRespiratoria;
    }


    public void setFrqRespiratoria(int frqRespiratoria) {
        this.frqRespiratoria = frqRespiratoria;
    }


    public int getPressSistolica() {
        return pressSistolica;
    }


    public void setPressSistolica(int pressSistolica) {
        this.pressSistolica = pressSistolica;
    }


    public int getPressDiastolica() {
        return pressDiastolica;
    }


    public void setPressDiastolica(int pressDiastolica) {
        this.pressDiastolica = pressDiastolica;
    }


    public int getPam() {
        return pam;
    }


    public void setPam(int pam) {
        this.pam = pam;
    }


    public int getSaturation() {
        return Saturation;
    }


    public void setSaturation(int saturation) {
        Saturation = saturation;
    }


    public float getTemperatura() {
        return temperatura;
    }


    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    //Medotodos da Classe
    //internação: O paciente só interna se o cadastro estiver ativo
    public void internar() {
        if (isCadastroAtivo()) {
            System.out.println("Paciente " + getNome() + " foi internado com sucesso!");
        } else {
            System.out.println("Erro: paciente " + getNome() + " não possui cadastro ativo. Faça o cadastro antes da internação.");
        }
    }
    public void aferirSinaisVitais() {
    System.out.println("==== Aferição de Sinais Vitais do Paciente: " + getNome() + " ====");

    // Frequência cardíaca
    if(frqCardiaca < 50 || frqCardiaca >100){
        System.out.println("[  ] - ALERTA - Frequencia Cardiaca alterada");
    }else{
        System.out.println("Frequencia Cardiaca normal");
    }

    // Frequência respiratória
    if(frqRespiratoria < 12) {
        System.out.println("[ ALERTA] - Paciente com BRADIPNEIA");
        System.out.println("Frequencia Respiratoria: " + frqRespiratoria);
        if(Saturation < 85){System.out.println("[  ]Checar Saturação novamente");}
        
    }
    if(frqRespiratoria >20){
        System.out.println("[ALERTA] - Paciente TAQUIPNEICO");
        System.out.println("Frequencia Respiratoria: " + frqRespiratoria);
        if(Saturation < 85){System.out.println("[  ]Checar Saturação novamente");}
        
    }

    // Pressão arterial
    if(pressSistolica > 140 || pressDiastolica > 90) {
        System.out.println("ALERTA: Pressão alta detectada (" + pressSistolica + "/" + pressDiastolica + " mmHg)");
        if(possuiPressAlta) {
            System.out.println("Observação: Paciente possui histórico de hipertensão");
        }
    } else if(pressSistolica < 90 || pressDiastolica < 60) {
        System.out.println("ALERTA: Pressão baixa detectada (" + pressSistolica + "/" + pressDiastolica + " mmHg)");
    }

    // PAM
    pam = (int)((pressSistolica + 2 * pressDiastolica) / 3.0);
    System.out.println("Pressão Arterial Média (PAM): " + pam + " mmHg");

    // Saturação
    if(Saturation < 95) {
        System.out.println("ALERTA: Saturação baixa (" + Saturation + "%)");
    }

    // Temperatura
    if(temperatura > 37.5) {
        System.out.println("ALERTA: Febre detectada (" + temperatura + "°C)");
    } else if(temperatura < 36) {
        System.out.println("ALERTA: Hipotermia detectada (" + temperatura + "°C)");
    }

    // Alertas específicos para diabetes
    if(possuiDiabetes) {
        // Para exemplo, vamos supor que você tenha um método ou variável glicose
        // if(glicose < 70) { System.out.println("ALERTA: Hipoglicemia detectada (" + glicose + " mg/dL)"); }
    }

    // Alertas de alergia
    // Para exemplo, vamos supor que você tenha variáveis tipoAlergia e dor
    // if(dor && possuiAlergia && "dipirona".equalsIgnoreCase(tipoAlergia)) {
    //     System.out.println("ALERTA: Paciente alérgico à dipirona! Evitar administração de analgésicos padrão.");
    // }

    System.out.println("==== Fim da aferição ====\n");
}


    
}
   