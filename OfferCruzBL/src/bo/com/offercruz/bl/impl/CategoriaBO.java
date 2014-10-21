/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.com.offercruz.bl.impl;

import bo.com.offercruz.bl.contratos.ICategoriaBO;
import bo.com.offercruz.bl.excepticiones.BusinessExceptionMessage;
import bo.com.offercruz.dal.contrato.ICategoriaDAO;
import bo.com.offercruz.entidades.Categoria;
import bo.com.offercruz.enums.TipoOferta;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Ernesto
 */
public class CategoriaBO extends ObjetoNegocioGenerico<Categoria, Integer, ICategoriaDAO> implements ICategoriaBO {

    @Override
    ICategoriaDAO getObjetoDAO() {
        return getDaoManager().getCategoriaDAO();
    }

    @Override
    protected void validar(Categoria entity) {
        //Nombre
        boolean nombreValido = true;
        if (isNullOrEmpty(entity.getNombre())) {
            appendException(new BusinessExceptionMessage("El nombre es un campo requerido.", "nombre"));
            nombreValido = false;
        } else if (entity.getNombre().trim().length() > 50) {
            appendException(new BusinessExceptionMessage("El nombre no puede tener más de 50 carácteres", "nombre"));
            nombreValido = false;
        }
        if (nombreValido) {
            Categoria cate = getObjetoDAO().obtenerPorNombre(entity.getNombre(), entity.getId());
            if (cate != null) {
                appendException(new BusinessExceptionMessage("La categoria '" + entity.getNombre() + "' ya existe.", "nombre"));
            }
            if (entity.getId() > 0) {
                if (!getObjetoDAO().checkId(entity.getId())) {
                    appendException(new BusinessExceptionMessage("La categoria con Id  '" + entity.getId() + "' no existe.", "id"));
                }
            }
        }
    }

    @Override
    protected void preInsertar(Categoria entidad) {
        entidad.setEstado(1);
        entidad.setFechaCreacion(new Date());
        entidad.setFechaModificacion(new Date());
    }

    @Override
    public List<Categoria> obtenerTodasbyTipo(TipoOferta tipoOferta) {
        return ejecutarEnTransaccion(() -> getObjetoDAO().obtenerTodasbyTipo(tipoOferta));
    }

}
