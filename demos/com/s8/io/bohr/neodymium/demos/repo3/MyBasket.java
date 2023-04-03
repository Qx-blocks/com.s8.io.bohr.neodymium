package com.s8.io.bohr.neodymium.demos.repo3;

import java.util.ArrayList;
import java.util.List;

import com.s8.io.bohr.atom.annotations.S8Field;
import com.s8.io.bohr.atom.annotations.S8ObjectType;
import com.s8.io.bohr.neodymium.object.NdObject;


/**
 * 
 * 
 * 
 * 
 * @author Pierre Convert
 * Copyright (C) 2022, Pierre Convert. All rights reserved.
 * 
 * 
 */
@S8ObjectType(name = "Basket")
public class MyBasket extends NdObject {

	
	public @S8Field(name = "picks") List<MyPick> picks;
	

	public MyBasket() {
		super();
		this.picks = new ArrayList<MyPick>();
	}
	
	
	
}
