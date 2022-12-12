/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import java.util.ArrayList;
import java.util.List;
import Modelo.Viaje;

/**
 *
 * @author LAB-2
 */
public class ViajeServiceImpl implements ViajeService{

    private static List<Viaje> viajeList = new ArrayList<>();

    @Override
    public void crear(Viaje viaje) {
  
        this.viajeList.add(viaje);
    }

    @Override
    public List<Viaje> listar() {
        return this.viajeList;
    }
    
}
