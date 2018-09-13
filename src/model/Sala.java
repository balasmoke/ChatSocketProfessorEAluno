package model;

public class Sala {
    private int idSala;
    private int porta;
    private int idMateria;
    private String cpfProfessor;
    private String ip;

    public Sala() {
    }

    public Sala(int idSala, int porta, int idMateria, String cpfProfessor, String ip) {
        this.idSala = idSala;
        this.porta = porta;
        this.idMateria = idMateria;
        this.cpfProfessor = cpfProfessor;
        this.ip = ip;
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

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }    
}