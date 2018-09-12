/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Sala;
import model.Usuario;

/**
 *
 * @author gmsil
 */
public class SalaControll {

    public void insert(Sala sala) {
        String query = "INSERT INTO sala (porta,idMateria,cpfProfessor) VALUES (?,?,?)";
        MySql.executeQuery(query, sala.getPorta(),sala.getIdMateria(),sala.getCpfProfessor());
    }

    public ArrayList select() {
        return buscasCadastros("SELECT * FROM sala");
    }
    
    public ArrayList selectMateria(int materia) {
        return buscasCadastros("SELECT * FROM sala WHERE idMateria='"+materia+"'");
    }

    public void delete(int porta) {
        String query = "DELETE FROM sala WHERE porta=?";
        MySql.executeQuery(query,porta);
    }
    
    private ArrayList buscasCadastros (String query){
        ArrayList <Sala> lista = new ArrayList<>();
        ResultSet rs = null;
        rs = MySql.getResultSet(query);
        try {
            while (rs.next()) {
                Sala a = new Sala(rs.getInt("idSala")
                        , rs.getInt("porta"), rs.getInt("idMateria")
                        , rs.getString("cpfProfessor"));                
                lista.add(a);
            }
            rs.close();
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return lista;
    }
}
