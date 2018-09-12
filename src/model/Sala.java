package model;

public class Sala {
    private int idSala;
    private int porta;
    private int idMateria;
    private String cpfProfessor;

    public Sala() {
    }

    public Sala(int idSala, int porta, int idMateria, String cpfProfessor) {
        this.idSala = idSala;
        this.porta = porta;
        this.idMateria = idMateria;
        this.cpfProfessor = cpfProfessor;
    }

    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public int getPorta() {
        return porta;
    }

    public void setPorta(int porta) {
        this.porta = porta;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getCpfProfessor() {
        return cpfProfessor;
    }

    public void setCpfProfessor(String cpfProfessor) {
        this.cpfProfessor = cpfProfessor;
    }
    
}