package bo.com.offercruz.entidades;
// Generated 13-oct-2014 18:48:07 by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Detallecontenido generated by hbm2java
 */
public class Detallecontenido  implements java.io.Serializable {


     private Integer id;
     private Oferta oferta;
     private Contenido contenido;
     private Date fechaAsignacion;
     private Double precioUnitarioOferta;
     private int tipoOfertaDetalleContenido;
     private Set<Detallesolicitud> detallesolicituds = new HashSet<Detallesolicitud>(0);

    public Detallecontenido() {
    }

	
    public Detallecontenido(Oferta oferta, Contenido contenido, Date fechaAsignacion, int tipoOfertaDetalleContenido) {
        this.oferta = oferta;
        this.contenido = contenido;
        this.fechaAsignacion = fechaAsignacion;
        this.tipoOfertaDetalleContenido = tipoOfertaDetalleContenido;
    }
    public Detallecontenido(Oferta oferta, Contenido contenido, Date fechaAsignacion, Double precioUnitarioOferta, int tipoOfertaDetalleContenido, Set<Detallesolicitud> detallesolicituds) {
       this.oferta = oferta;
       this.contenido = contenido;
       this.fechaAsignacion = fechaAsignacion;
       this.precioUnitarioOferta = precioUnitarioOferta;
       this.tipoOfertaDetalleContenido = tipoOfertaDetalleContenido;
       this.detallesolicituds = detallesolicituds;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Oferta getOferta() {
        return this.oferta;
    }
    
    public void setOferta(Oferta oferta) {
        this.oferta = oferta;
    }
    public Contenido getContenido() {
        return this.contenido;
    }
    
    public void setContenido(Contenido contenido) {
        this.contenido = contenido;
    }
    public Date getFechaAsignacion() {
        return this.fechaAsignacion;
    }
    
    public void setFechaAsignacion(Date fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }
    public Double getPrecioUnitarioOferta() {
        return this.precioUnitarioOferta;
    }
    
    public void setPrecioUnitarioOferta(Double precioUnitarioOferta) {
        this.precioUnitarioOferta = precioUnitarioOferta;
    }
    public int getTipoOfertaDetalleContenido() {
        return this.tipoOfertaDetalleContenido;
    }
    
    public void setTipoOfertaDetalleContenido(int tipoOfertaDetalleContenido) {
        this.tipoOfertaDetalleContenido = tipoOfertaDetalleContenido;
    }
    public Set<Detallesolicitud> getDetallesolicituds() {
        return this.detallesolicituds;
    }
    
    public void setDetallesolicituds(Set<Detallesolicitud> detallesolicituds) {
        this.detallesolicituds = detallesolicituds;
    }




}


