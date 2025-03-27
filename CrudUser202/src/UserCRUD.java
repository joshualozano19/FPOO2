/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author lozan
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class UserCRUD {
    private Connection conexion;
    
    public UserCRUD(){
        conexion = ConexionMySQL.conectar();
    }
    public boolean crearUsuario(String nom, String cor, String contra){
        
        String sqlInsert = "Insert into usuarios(nombre,correo,contrasena) VALUES (?,?,?)";
    try{
        PreparedStatement ps = conexion.prepareStatement(sqlInsert);
        ps.setString(1,nom);
        ps.setString(2,cor);
        ps.setString(3,contra);
        return ps.executeUpdate()>0;
    }catch(SQLException e){
        System.out.println("Error al intentar Insertar: "+e.getMessage());
        return false;
    }
  }//Fin del insert 
    public ResultSet obtenerUsuarioPorid(int id){
        String selectSQL = "select * from usuarios where Id = ?";
        try{
            PreparedStatement ps = conexion.prepareStatement(selectSQL);
            ps.setInt(1,id);
            return ps.executeQuery();
        }
        
        catch(SQLException e){
            System.out.println("Error al inetntar Consultar: "+e.getMessage());
            return null;
        }
        
    }//Fin de obtener Usuario por id
    
    public ResultSet obtenerTodos(){
        String sqlTodos = "SELECT * FROM usuarios ";
        
        try{
            PreparedStatement ps = conexion.prepareStatement(sqlTodos);
            return ps.executeQuery();
        }
        catch(SQLException w ){
            System.out.println("Error al consultar"+w.getMessage());
            return null;
        }
    }
}