/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author Lugue
 */
public class Resta implements Calculo{

    @Override
    public double calcular(double x, double y) {
        double r = x-y;
        return r;
    }
    
}
