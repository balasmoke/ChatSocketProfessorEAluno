package Control;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Usuario;

public class UsuarioControll {
    
     public void insert(Usuario user){
        String query = "INSERT INTO usuario (usuario_nome,usuario_cpf,usuario_senha,usuario_login,usuario_tipo) VALUES (?,?,?,?,?)";
        MySql.executeQuery(query, user.getUsuario_nome(),user.getUsuario_cpf(),user.getUsuario_senha(),user.getUsuario_login(),user.getUsuario_tipo());
    }
     public void update(Usuario user){
        //UPDATE usuario SET usuario_nome='Tiago' , usuario_senha='root' , usuario_login='root' ,usuario_tipo='1' WHERE usuario_cpf='tiago'
        String query = "UPDATE usuario SET usuario_nome=? , usuario_senha=? , usuario_login=? ,usuario_tipo=? WHERE usuario_cpf=?";
        MySql.executeQuery(query, user.getUsuario_nome(),user.getUsuario_senha(),user.getUsuario_login(),user.getUsuario_tipo(),user.getUsuario_cpf());
     }
     
     public void delete(String cpf){
        String query = "DELETE FROM usuario WHERE usuario_cpf=?";
        MySql.executeQuery(query,cpf);
     }
     
     public ArrayList select (){
        return buscasCadastros("SELECT * FROM usuario");
    }
    
    private ArrayList buscasCadastros (String query){
        ArrayList <Usuario> lista = new ArrayList<>();
        ResultSet rs = null;
        rs = MySql.getResultSet(query);
        try {
            while (rs.next()) {
                Usuario a = new Usuario(rs.getString("usuario_nome")
                        , rs.getString("usuario_cpf"), rs.getString("usuario_senha")
                        , rs.getString("usuario_login"), rs.getString("usuario_tipo"));                
                lista.add(a);
            }
            rs.close();
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return lista;
    }
     
}
