/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;
import Model.Cliente;
import java.util.List;
/**
 *
 * @author mike
 */
public class iClienteDAO {
     public int insertar(Cliente c);
     public List<Cliente> buscar(String nombres, int inicio, int registrosPorPagina);
     
     public int totalRegistros(String nombres, int inicio, int registrosPorPagina);
     public Cliente obtenerPorId(int id);
     public int actualizar(Cliente c);
     public int eliminar(int id);
}
