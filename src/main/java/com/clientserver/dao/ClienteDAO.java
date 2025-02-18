package com.clientserver.dao;

import com.clientserver.model.Cliente;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

public class ClienteDAO {
    private static final String COLLECTION_NAME = "clientes";

    public void insertarCliente(Cliente cliente) {
        MongoCollection<Document> collection = MongoDBConnection.getDatabase().getCollection(COLLECTION_NAME);

        Document doc = new Document("tipo_documento", cliente.getTipoDocumento())
                .append("numero", cliente.getNumero())
                .append("nombre", cliente.getNombre())
                .append("apellido", cliente.getApellido())
                .append("fecha_nacimiento", cliente.getFechaNacimiento())
                .append("codigo_pais", cliente.getCodigoPais())
                .append("telefono", cliente.getTelefono());

        collection.insertOne(doc);
    }
}