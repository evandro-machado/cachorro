package com.hoteldog.hoteldog;

public class Cachorro {

    private int id;
    private String nome;
    private String porte; //poderia ser int? SIM!!
    private String raca; //poderia ser int? SIM!!
//    private char sexo; //poderia ser int? SIM!!


    public Cachorro() {
    }

    public Cachorro(int id, String nome, String porte, String raca) {
        this.id = id;
        this.nome = nome;
        this.porte = porte;
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", porte='" + porte + '\'' +
                ", raca='" + raca + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
