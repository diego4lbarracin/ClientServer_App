package com.clientserver;

import java.io.IOException;
import java.io.PrintWriter;
import org.bson.Document;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ServerServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // URI de conexión a MongoDB (cambia localhost si usas MongoDB Atlas)
    private static final String MONGO_URI = "mongodb+srv://jaltamiranda1871:tablet146@cluster0.r5s2w.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
    private static final String DATABASE_NAME = "jaltamiranda1871";
    private static final String COLLECTION_NAME = "clientes";

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Obtener los datos del formulario
        String tipoDocumento = request.getParameter("tipo-documento");
        String numero = request.getParameter("numero");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String fechaNacimiento = request.getParameter("fecha-nacimiento");
        String codigoPais = request.getParameter("codigo-pais");
        String telefono = request.getParameter("telefono");

        if (tipoDocumento == null || numero == null || nombre == null || apellido == null ||
                fechaNacimiento == null || codigoPais == null || telefono == null) {
            out.println("<h2>Error: Todos los campos son obligatorios.</h2>");
            return;
        }

        try (MongoClient mongoClient = MongoClients.create(MONGO_URI)) {
            // Conectar a la base de datos y obtener la colección
            MongoDatabase database = mongoClient.getDatabase(DATABASE_NAME);
            MongoCollection<Document> collection = database.getCollection(COLLECTION_NAME);

            // Crear documento con los datos del formulario
            Document cliente = new Document("tipo_documento", tipoDocumento)
                    .append("numero", numero)
                    .append("nombre", nombre)
                    .append("apellido", apellido)
                    .append("fecha_nacimiento", fechaNacimiento)
                    .append("codigo_pais", codigoPais)
                    .append("telefono", telefono);

            // Insertar en la colección
            collection.insertOne(cliente);

            // Responder al cliente con HTML
            out.println("<html><body>");
            out.println("<h2>Registro exitoso en MongoDB</h2>");
            out.println("<a href='index.html'>Volver al formulario</a>");
            out.println("</body></html>");

        } catch (Exception e) {
            e.printStackTrace();
            out.println("<h2>Error en la base de datos</h2>");
        }
    }
}