package com.example.aplicacion_servicios_log.model;

public class Servicio {
    private String Servicio_id;
    private String Nombre;

    public Servicio() {

    }

    public Servicio(String servicio_id, String nombre, String imagen, String descripcion, String pais, String precio, String discount, Double coordenadaX, Double coordenadaY, String telefono, String estado, String categoriaID) {
        Servicio_id = servicio_id;
        Nombre = nombre;
        Imagen = imagen;
        Descripcion = descripcion;
        Pais = pais;
        Precio = precio;
        Discount = discount;
        CoordenadaX = coordenadaX;
        CoordenadaY = coordenadaY;
        Telefono = telefono;
        Estado = estado;
        CategoriaID = categoriaID;
    }

    private String Imagen;
    private String Descripcion;
    private String Pais;
    private String Precio;
    private String Discount;
    private Double CoordenadaX;
    private Double CoordenadaY;
    private String Telefono;
    private String Estado;
    private String CategoriaID;

    public String getServicio_id() {
        return Servicio_id;
    }

    public void setServicio_id(String servicio_id) {
        Servicio_id = servicio_id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String imagen) {
        Imagen = imagen;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        Pais = pais;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String precio) {
        Precio = precio;
    }

    public String getDiscount() {
        return Discount;
    }

    public void setDiscount(String discount) {
        Discount = discount;
    }

    public Double getCoordenadaX() {
        return CoordenadaX;
    }

    public void setCoordenadaX(Double coordenadaX) {
        CoordenadaX = coordenadaX;
    }

    public Double getCoordenadaY() {
        return CoordenadaY;
    }

    public void setCoordenadaY(Double coordenadaY) {
        CoordenadaY = coordenadaY;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public String getCategoriaID() {
        return CategoriaID;
    }

    public void setCategoriaID(String categoriaID) {
        CategoriaID = categoriaID;
    }

    @Override
    public String toString() {
        return Nombre;
    }

}
