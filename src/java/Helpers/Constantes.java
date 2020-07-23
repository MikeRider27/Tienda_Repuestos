/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helpers;

/**
 *
 * @author mike
 */
public class Constantes {
    final int NRO_REGISTROS_POR_PAGINA[];

    public Constantes() {
        this.NRO_REGISTROS_POR_PAGINA = new int[]{5, 10, 15, 20, 25,30};
    }

    public int[] getNRO_REGISTROS_POR_PAGINA() {
        return NRO_REGISTROS_POR_PAGINA;
    }
}
