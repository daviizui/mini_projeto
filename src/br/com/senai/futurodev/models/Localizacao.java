package br.com.senai.futurodev.models;

public class Localizacao {
    private int id;
    private String coordenadasGeagraficas;
    private int idAreaVerde;

    public Localizacao(int id, String coordenadasGeagraficas, int idAreaVerde) {
        this.id = id;
        this.coordenadasGeagraficas = coordenadasGeagraficas;
        this.idAreaVerde = idAreaVerde;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCoordenadasGeagraficas() {
        return coordenadasGeagraficas;
    }

    public void setCoordenadasGeagraficas(String coordenadasGeagraficas) {
        this.coordenadasGeagraficas = coordenadasGeagraficas;
    }

    public int getIdAreaVerde() {
        return idAreaVerde;
    }

    public void setIdAreaVerde(int idAreaVerde) {
        this.idAreaVerde = idAreaVerde;
    }

    @Override
    public String toString() {
        return "Localizacao: {" +
                "id: " + id +
                ", coordenadasGeagraficas: " + coordenadasGeagraficas +
                ", idAreaVerde: " + idAreaVerde +
                '}';
    }
}
