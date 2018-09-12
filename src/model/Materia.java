package model;

public class Materia {
    private int materia_id;
    private String materia_nome;

    public Materia() {
    }

    public Materia(int materia_id, String materia_nome) {
        this.materia_id = materia_id;
        this.materia_nome = materia_nome;
    }

    public int getMateria_id() {
        return materia_id;
    }

    public void setMateria_id(int materia_id) {
        this.materia_id = materia_id;
    }

    public String getMateria_nome() {
        return materia_nome;
    }

    public void setMateria_nome(String materia_nome) {
        this.materia_nome = materia_nome;
    }
    
    
}