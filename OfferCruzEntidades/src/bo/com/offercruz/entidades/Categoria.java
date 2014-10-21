package bo.com.offercruz.entidades;
// Generated 13-oct-2014 18:48:07 by Hibernate Tools 3.6.0


import bo.com.offercruz.enums.TipoOferta;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Categoria generated by hbm2java
 */
public class Categoria  implements java.io.Serializable {


     private int id;
     private String nombre;
     private int tipo;     
     private int estado;
     private Date fechaCreacion;
     private Date fechaModificacion;
     private Set<Categoriaempresa> categoriaempresas = new HashSet<Categoriaempresa>(0);
     private Set<Oferta> ofertas = new HashSet<Oferta>(0);

    public Categoria() {
    }

	
    public Categoria(int id, String nombre, int tipo, TipoOferta estado, Date fechaCreacion, Date fechaModificacion) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.estado = estado.ordinal();
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
    }
    public Categoria(int id, String nombre, int tipo, TipoOferta estado, Date fechaCreacion, Date fechaModificacion, Set<Categoriaempresa> categoriaempresas, Set<Oferta> ofertas) {
       this.id = id;
       this.nombre = nombre;
       this.tipo = tipo;
       this.estado = estado.ordinal();
       this.fechaCreacion = fechaCreacion;
       this.fechaModificacion = fechaModificacion;
       this.categoriaempresas = categoriaempresas;
       this.ofertas = ofertas;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getTipo() {
        return this.tipo;
    }
    
    public TipoOferta getTipoOferta(){
        return TipoOferta.values()[tipo];
    }
    
    public void setTipoOferta(TipoOferta tipo){
        this.tipo = tipo.ordinal();
    }
    
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    public int getEstado() {
        return this.estado;
    }
    
    public void setEstado(int estado) {
        this.estado = estado;
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
    public Set<Categoriaempresa> getCategoriaempresas() {
        return this.categoriaempresas;
    }
    
    public void setCategoriaempresas(Set<Categoriaempresa> categoriaempresas) {
        this.categoriaempresas = categoriaempresas;
    }
    public Set<Oferta> getOfertas() {
        return this.ofertas;
    }
    
    public void setOfertas(Set<Oferta> ofertas) {
        this.ofertas = ofertas;
    }




}


