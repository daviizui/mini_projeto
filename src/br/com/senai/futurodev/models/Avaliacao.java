package br.com.senai.futurodev.models;

public class Avaliacao {
    private int id;
    private int quantidadeArvora;
    private int qualidadeAr;
    private int ausenciaPoluicaoSonora;
    private int coletaResiduos;
    private int chegarTransportPublico;
    private int idAreaVerde;

    public Avaliacao( int quantidadeArvora, int qualidadeAr, int ausenciaPoluicaoSonora, int coletaResiduos, int chegarTransportPublico) {
        this.quantidadeArvora = quantidadeArvora;
        this.qualidadeAr = qualidadeAr;
        this.ausenciaPoluicaoSonora = ausenciaPoluicaoSonora;
        this.coletaResiduos = coletaResiduos;
        this.chegarTransportPublico = chegarTransportPublico;
    }

    public Avaliacao() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidadeArvora() {
        return quantidadeArvora;
    }

    public void setQuantidadeArvora(int quantidadeArvora) {
        this.quantidadeArvora = quantidadeArvora;
    }

    public int getQualidadeAr() {
        return qualidadeAr;
    }

    public void setQualidadeAr(int qualidadeAr) {
        this.qualidadeAr = qualidadeAr;
    }

    public int getAusenciaPoluicaoSonora() {
        return ausenciaPoluicaoSonora;
    }

    public void setAusenciaPoluicaoSonora(int ausenciaPoluicaoSonora) {
        this.ausenciaPoluicaoSonora = ausenciaPoluicaoSonora;
    }

    public int getColetaResiduos() {
        return coletaResiduos;
    }

    public void setColetaResiduos(int coletaResiduos) {
        this.coletaResiduos = coletaResiduos;
    }

    public int getChegarTransportPublico() {
        return chegarTransportPublico;
    }

    public void setChegarTransportPublico(int chegarTransportPublico) {
        this.chegarTransportPublico = chegarTransportPublico;
    }

    public int getIdAreaVerde() {
        return idAreaVerde;
    }

    public void setIdAreaVerde(int idAreaVerde) {
        this.idAreaVerde = idAreaVerde;
    }

    public double mediaTodosCriterios(){
        return (double) (this.ausenciaPoluicaoSonora + this.chegarTransportPublico + this.coletaResiduos + this.qualidadeAr + this.quantidadeArvora) / 5;
    }

    @Override
    public String toString() {
        return "Avaliacao: {" +
                "id: " + id +
                ", quantidadeArvora: " + quantidadeArvora +
                ", qualidadeAr: " + qualidadeAr +
                ", ausenciaPoluicaoSonora: " + ausenciaPoluicaoSonora +
                ", coletaResiduos: " + coletaResiduos +
                ", chegarTransportPublico: " + chegarTransportPublico +
                ", idAreaVerde: " + idAreaVerde +
                '}';
    }
}
