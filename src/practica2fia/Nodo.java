/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2fia;

import java.util.ArrayList;

/**
 *
 * @author victor
 */
public class Nodo {

    int f;
    int g;
    int h;
    int x, y;
    
    Nodo padre;
    ArrayList<Nodo> hijos;

    public Nodo(int _x, int _y, Nodo _padre){
        padre = _padre;
        if (padre == null) {
            g = 0;
        } else{
            g = padre.g + 1;
        }
    }

    public void generarHijos(int [][] mundo) {
        if (mundo[x+1][y] == 0) { // Arriba
            hijos.add(new Nodo(x+1, y, this));
        }
        if (mundo[x-1][y] == 0) { // Abajo
            hijos.add(new Nodo(x-1, y, this));
        }
        if (mundo[x][y+1] == 0) { // Derecha
            hijos.add(new Nodo(x, y+1, this));
        }
        if (mundo[x][y-1] == 0) { // Izquierda
            hijos.add(new Nodo(x, y-1, this));
        }
        
    }
    
    
    
}
