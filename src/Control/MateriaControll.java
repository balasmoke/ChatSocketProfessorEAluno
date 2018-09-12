package Control;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Materia;
import model.Usuario;

public class MateriaControll {
    
     public void insert(Materia mat){
        String query = "INSERT INTO materia (materia_nome) VALUES (?)";
        MySql.executeQuery(query, mat.getMateria_nome());
    }
     
     public void delete(int id){
        String query = "DELETE FROM materia WHERE materia_id=?";
        MySql.executeQuery(query,id);
     }
     
     public ArrayList select (){
        return buscasCadastros("SELECT * FROM materia");
    }
    
    private ArrayList buscasCadastros (String query){
        ArrayList <Materia> lista = new ArrayList<>();
        ResultSet rs = null;
        rs = MySql.getResultSet(query);
        try {
            while (rs.next()) {
                Materia a = new Materia(rs.getInt("materia_id")
                        , rs.getString("materia_nome"));                
                lista.add(a);
            }
            rs.close();
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return lista;
    }
     
     public void delete(String cpf){
         
     }
     
}
