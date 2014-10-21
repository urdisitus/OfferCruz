package bo.com.offercruz.entidades;
// Generated 13-oct-2014 18:48:07 by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Imagen generated by hbm2java
 */
public class Imagen  implements java.io.Serializable {


     private Integer id;
     private String nombre;
     private Integer ancho;
     private Integer alto;
     private Date fechaCreacion;
     private Date fechaModificacion;
     private int estado;
     private String imagenFisica;
     private Set<Imagencontenido> imagencontenidos = new HashSet<Imagencontenido>(0);
     private Set<Oferta> ofertas = new HashSet<Oferta>(0);
     private Set<Empresa> empresas = new HashSet<Empresa>(0);
     private Set<Cliente> clientes = new HashSet<Cliente>(0);

    public Imagen() {
    }

	
    public Imagen(String nombre, Date fechaCreacion, Date fechaModificacion, int estado, String imagenFisica) {
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        this.estado = estado;
        this.imagenFisica = imagenFisica;
    }
    public Imagen(String nombre, Integer ancho, Integer alto, Date fechaCreacion, Date fechaModificacion, int estado, String imagenFisica, Set<Imagencontenido> imagencontenidos, Set<Oferta> ofertas, Set<Empresa> empresas, Set<Cliente> clientes) {
       this.nombre = nombre;
       this.ancho = ancho;
       this.alto = alto;
       this.fechaCreacion = fechaCreacion;
       this.fechaModificacion = fechaModificacion;
       this.estado = estado;
       this.imagenFisica = imagenFisica;
       this.imagencontenidos = imagencontenidos;
       this.ofertas = ofertas;
       this.empresas = empresas;
       this.clientes = clientes;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getAncho() {
        return this.ancho;
    }
    
    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }
    public Integer getAlto() {
        return this.alto;
    }
    
    public void setAlto(Integer alto) {
        this.alto = alto;
    }
    public Date getFechaCreacion() {
        return this.fechaCreacion;
    }
    
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    public Date getFechaModificacion() {
        return this.fechaModificacion;
    }
    
    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }
    public int getEstado() {
        return this.estado;
    }
    
    public void setEstado(int estado) {
        this.estado = estado;
    }
    public String getImagenFisica() {
        return this.imagenFisica;
    }
    
    public void setImagenFisica(String imagenFisica) {
        this.imagenFisica = imagenFisica;
    }
    public Set<Imagencontenido> getImagencontenidos() {
        return this.imagencontenidos;
    }
    
    public void setImagencontenidos(Set<Imagencontenido> imagencontenidos) {
        this.imagencontenidos = imagencontenidos;
    }
    public Set<Oferta> getOfertas() {
        return this.ofertas;
    }
    
    public void setOfertas(Set<Oferta> ofertas) {
        this.ofertas = ofertas;
    }
    public Set<Empresa> getEmpresas() {
        return this.empresas;
    }
    
    public void setEmpresas(Set<Empresa> empresas) {
        this.empresas = empresas;
    }
    public Set<Cliente> getClientes() {
        return this.clientes;
    }
    
    public void setClientes(Set<Cliente> clientes) {
        this.clientes = clientes;
    }




}


