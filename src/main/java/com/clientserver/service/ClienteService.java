package com.clientserver.service;

import com.clientserver.dao.ClienteDAO;
import com.clientserver.model.Cliente;

public class ClienteService {
    private ClienteDAO clienteDAO;

    public ClienteService() {
        this.clienteDAO = new ClienteDAO();
    }

    public void registrarCliente(String tipoDocumento, String numero, String nombre, String apellido, String fechaNacimiento, String codigoPais, String telefono) {
        Cliente cliente = new Cliente(tipoDocumento, numero, nombre, apellido, fechaNacimiento, codigoPais, telefono);
        clienteDAO.insertarCliente(cliente);
    }
}
