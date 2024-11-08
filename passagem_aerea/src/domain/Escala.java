package domain;

public class Escala {

    private ProgramacaoVoo programacaoVoo;

    private Passagem passagem;

    private String poltrona;

    public Escala(ProgramacaoVoo programacaoVoo, Passagem passagem, String poltrona) {
        this.programacaoVoo = programacaoVoo;
        this.passagem = passagem;
        this.poltrona = poltrona;
    }

    public ProgramacaoVoo getProgramacaoVoo() {
        return programacaoVoo;
    }

    public void setProgramacaoVoo(ProgramacaoVoo programacaoVoo) {
        this.programacaoVoo = programacaoVoo;
    }

    public Passagem getPassagem() {
        return passagem;
    }

    public void setPassagem(Passagem passagem) {
        this.passagem = passagem;
    }

    public String getPoltrona() {
        return poltrona;
    }

    public void setPoltrona(String poltrona) {
        this.poltrona = poltrona;
    }

    

}
