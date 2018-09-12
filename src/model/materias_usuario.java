package model;

public class materias_usuario {
    private int materias_usuario_idUsuario;
    private int materias_usuario_idMateria;

    public materias_usuario() {
    }

    public materias_usuario(int materias_usuario_idUsuario, int materias_usuario_idMateria) {
        this.materias_usuario_idUsuario = materias_usuario_idUsuario;
        this.materias_usuario_idMateria = materias_usuario_idMateria;
    }

    public int getMaterias_usuario_idUsuario() {
        return materias_usuario_idUsuario;
    }

    public void setMaterias_usuario_idUsuario(int materias_usuario_idUsuario) {
        this.materias_usuario_idUsuario = materias_usuario_idUsuario;
    }

    public int getMaterias_usuario_idMateria() {
        return materias_usuario_idMateria;
    }

    public void setMaterias_usuario_idMateria(int materias_usuario_idMateria) {
        this.materias_usuario_idMateria = materias_usuario_idMateria;
    }
    
}