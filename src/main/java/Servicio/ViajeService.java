/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import java.util.List;
import Modelo.Viaje;

/**
 *
 * @author LAB-2
 */
public interface ViajeService {

    public void crear(Viaje viaje);

    public List<Viaje> listar();
}
