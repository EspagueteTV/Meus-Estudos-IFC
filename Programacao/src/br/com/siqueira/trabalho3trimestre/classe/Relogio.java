package br.com.siqueira.trabalho3trimestre.classe;

public class Relogio {

    protected int hora;
    protected int minuto;
    protected int segundo;

    /* Construtores */
    public Relogio() {
        setHora(0);
        setMinuto(0);
        setSegundo(0);
    }

    public Relogio(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    /* Métodos da Classe */

    public void ajustarHorario(int segundo, int minuto, int hora){
        if(segundo > -1 && segundo < 60){
            setSegundo(segundo);
        }else{
            System.out.println("Não foi possível ajustar os Segundos, o valor informado não estava entre 0 e 59.");
        }

        if(minuto > -1 && minuto < 60){
            setMinuto(minuto);
        }else{
            System.out.println("Não foi possível ajustar os Minutos, o valor informado não estava entre 0 e 59.");
        }

        if(hora > -1 && hora < 23){
            setHora(hora);
        }else{
            System.out.println("Não foi possível ajustar a Hora, o valor informaddo não estava entre 0 e 23");
        }
    }

    public String horarioAtual() {
        return (getHora() + ":" + getMinuto() + ":" + getSegundo());
    }

    public void incrementar() {
        if (this.segundo < 59) {
            this.segundo++;
        } else if (this.minuto < 59) {
            this.segundo = 0;
            this.minuto += 1;
        } else if (this.hora < 23) {
            this.segundo = 0;
            this.minuto = 0;
            this.hora += 1;
        } else {
            this.segundo = 0;
            this.minuto = 0;
            this.hora = 0;
        }
        System.out.println(horarioAtual());
    }

    public void incrementar(int segundo) {

        if ((this.segundo + segundo) < 60) {
            this.segundo += segundo;
        } else{
             this.segundo = Math.abs(60 - (this.segundo + segundo));

            if (this.minuto < 59) {
                this.minuto += 1;
            } else if (this.hora < 23) {
                this.minuto = 0;
                this.hora += 1;
            } else {
                this.minuto = 0;
                this.hora = 0;
            }
        }
        System.out.println(horarioAtual());

    }

    public void incrementar(int segundo, int minuto){
        incrementar(segundo);
        if((this.minuto + minuto) < 59){
            this.minuto += minuto;
        }else {
            this.minuto = Math.abs(60 - (this.minuto + minuto));

            if (this.hora < 23) {
                this.hora += 1;
            } else {
                this.hora = 0;
            }
        }
        System.out.println(horarioAtual());
    }

    public void incrementar(int segundo, int minuto, int hora){
        incrementar(segundo, minuto);
        if((this.hora + hora) < 24){
            this.hora += hora;
        }else{
            this.hora = Math.abs((this.hora + hora) - 24);
        }
        System.out.println(horarioAtual());
    }

    public void decrementar() {
        if (this.segundo > 0) {
            this.segundo--;
        } else if (this.minuto > 0) {
            this.segundo = 59;
            this.minuto -= 1;
        } else if (this.hora > 0) {
            this.segundo = 59;
            this.minuto = 59;
            this.hora -= 1;
        } else {
            this.segundo = 59;
            this.minuto = 59;
            this.hora = 23;
        }

        System.out.println(horarioAtual());

    }

    public void decrementar(int segundo) {

        if ((this.segundo - segundo) > -1) {
            this.segundo -= segundo;
        } else{
            this.segundo = Math.abs(60 + (this.segundo - segundo));

            if (this.minuto > 0) {
                this.minuto -= 1;
            } else if (this.hora > 0) {
                this.minuto = 59;
                this.hora -= 1;
            } else {
                this.minuto = 59;
                this.hora = 23;
            }
        }
        System.out.println(horarioAtual());

    }

    public void decrementar(int segundo, int minuto){
        decrementar(segundo);
        if((this.minuto - minuto) > -1){
            this.minuto -= minuto;
        }else{
            this.minuto = (60 + (this.minuto - minuto));
            if(this.hora > 0){
                this.hora --;
            }else{
                this.hora = 23;
            }
        }
        System.out.println(horarioAtual());
    }

    public void decrementar(int segundo, int minuto, int hora){
        decrementar(segundo, minuto);
        if((this.hora - hora) > -1){
            this.hora -= hora;
        }else{
            this.hora = Math.abs(24 + (this.hora - hora));
        }
        System.out.println(horarioAtual());
    }

    /* Métodos getter e setter */
    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public int getHora() {
        return this.hora;
    }

    public int getMinuto() {
        return this.minuto;
    }

    public int getSegundo() {
        return this.segundo;
    }
}
