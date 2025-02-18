package com.clientserver.controller;

import com.clientserver.service.ClienteService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ClienteServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private ClienteService clienteService;

    @Override
    public void init() throws ServletException {
        clienteService = new ClienteService();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            // Obtener los datos del formulario
            String tipoDocumento = request.getParameter("tipo-documento");
            String numero = request.getParameter("numero");
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            String fechaNacimiento = request.getParameter("fecha-nacimiento");
            String codigoPais = request.getParameter("codigo-pais");
            String telefono = request.getParameter("telefono");

            // Guardar en la base de datos
            clienteService.registrarCliente(tipoDocumento, numero, nombre, apellido, fechaNacimiento, codigoPais, telefono);

            // Responder al cliente
            out.println("<html><body>");
            out.println("<h2>Registro exitoso en MongoDB</h2>");
            out.println("<a href='http://localhost:8080/ClientServerApplication_war_exploded/'>Volver al formulario</a>");
            out.println("</body></html>");
        } catch (Exception e) {
            e.printStackTrace();
            out.println("<h2>Error en la base de datos</h2>");
        }
    }
}

