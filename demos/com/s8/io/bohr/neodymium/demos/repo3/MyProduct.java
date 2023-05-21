package com.s8.io.bohr.neodymium.demos.repo3;

import com.s8.io.bohr.atom.annotations.S8Field;
import com.s8.io.bohr.atom.annotations.S8ObjectType;
import com.s8.io.bohr.neodymium.object.NdObject;


/**
 * This is PUBLIC object
 * 
 * @author pierreconvert
 *
 */
@S8ObjectType(name = "product")
public class MyProduct extends NdObject {


	@S8Field(name = "description")
	public String description;
	
	
	@S8Field(name = "stock")
	public MyItemStock stock;
	

	/**
	 * 
	 * @param shell
	 */
	public MyProduct() {
		super();
	}
	
}
