/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;
 
import java.util.List;
import Modelo.Ciudad;

/**
 *
 * @author LAB-2
 */
 public interface CiudadService {
    
    public void crear(Ciudad ciudad);
    public Ciudad buscarPorCodigo(int codigo);
    public Ciudad buscarPorNombre(String nombre);
    public List<Ciudad> listar();
    
   
}   

