package org.udea.proint1.ms.producto_backend.dao;


import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.udea.proint1.ms.producto_backend.dto.Product;

//con Spring Data JPA una entidad DAO que extienda de CrudRepository 
// obtiene por defecto los siguientes metodos save, delete, deleteAll, findOne y findAll.
@Transactional
public interface ProductDAO extends CrudRepository<Product, Long> {
	
	// No es necesario implementar el metodo, spring jpa lo hace  siempre y cuando
	// el nombre del parametro coincida con un atributo de product
	// para mas detalles ver:
	// http://docs.spring.io/spring-data/data-jpa/docs/current/reference/html/#jpa.query-methods.query-creation
	public Product findByCode(String code);

}

