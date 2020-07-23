/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;
import DAO.ClienteDAO;
import Interfaces.iClienteLogica;
import Model.Cliente;
import java.util.List;
/**
 *
 * @author mike
 */
public class ClienteLogic {
  private ClienteDAO clienteDAO;

    @Override
    public int insertar(Cliente cliente) {
        clienteDAO = new ClienteDAO();
        return clienteDAO.insertar(cliente);
    }

    @Override
    public List<Cliente> buscar(String nombres, int inicio, int registrosPorPagina) {
        clienteDAO = new ClienteDAO();
        return clienteDAO.buscar(nombres, inicio, registrosPorPagina);
    }

    @Override
    public int totalRegistros(String nombres, int inicio, int registrosPorPagina) {
        clienteDAO = new ClienteDAO();
        return clienteDAO.totalRegistros(nombres, inicio, registrosPorPagina);
    }
    
    @Override
    public Cliente obtenerPorId(int id) {
        clienteDAO = new ClienteDAO();
        return clienteDAO.obtenerPorId(id);
    }

    @Override
    public int actualizar(Cliente cliente) {
        clienteDAO = new ClienteDAO();
        return clienteDAO.actualizar(cliente);
    }

    @Override
    public int eliminar(int id) {
        clienteDAO = new ClienteDAO();
        return clienteDAO.eliminar(id);
    }
}
