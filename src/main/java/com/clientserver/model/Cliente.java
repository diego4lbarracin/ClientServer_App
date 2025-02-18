package com.clientserver.model;

public class Cliente {
    private String tipoDocumento;
    private String numero;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String codigoPais;
    private String telefono;

    // Constructor vacío (necesario para algunos frameworks)
    public Cliente() {}

    public Cliente(String tipoDocumento, String numero, String nombre, String apellido, String fechaNacimiento, String codigoPais, String telefono) {
        this.tipoDocumento = tipoDocumento;
        this.numero = numero;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.codigoPais = codigoPais;
        this.telefono = telefono;
    }

    // Getters y Setters
    public String getTipoDocumento() { return tipoDocumento; }
    public void setTipoDocumento(String tipoDocumento) { this.tipoDocumento = tipoDocumento; }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(String fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    public String getCodigoPais() { return codigoPais; }
    public void setCodigoPais(String codigoPais) { this.codigoPais = codigoPais; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
}
