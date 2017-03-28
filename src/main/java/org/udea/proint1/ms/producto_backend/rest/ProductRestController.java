package org.udea.proint1.ms.producto_backend.rest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import org.udea.proint1.ms.producto_backend.dto.Product;
import org.udea.proint1.ms.producto_backend.dao.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.apache.log4j.*;


@Controller
public class ProductRestController {
	static Logger logger = Logger.getLogger("Mi traza:");
	
	@Autowired
	ProductDAO productDAO;
	
	@RequestMapping("/find")
	@ResponseBody
	public Product getProduct( String code) {
		logger.info("Metodo Find, Buscando producto con code: "+code);
		Product product = new Product();
		product = productDAO.findByCode(code);
		return product;
	
	}
	
	@RequestMapping (method = RequestMethod.POST, value ="/save")
	@ResponseBody
	public String setProduct( @RequestBody Product product) {
		logger.info("Metodo save, guardando producto con code: "+product.getCode());
		productDAO.save(product);
		return "Done!";
	
	}
}
