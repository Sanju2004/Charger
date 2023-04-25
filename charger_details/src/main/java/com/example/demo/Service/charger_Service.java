package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.charger_Model;
import com.example.demo.Repository.charger_Repository;

@Service
public class charger_Service {
	
	@Autowired
	 public charger_Repository cr;
	
	public List<charger_Model> getvalue()
	{
		return cr.findAll();
	}
	public charger_Model postvalue(charger_Model n) {
		return cr.save(n);
	}
	public charger_Model updatevalue(charger_Model r) {
		return cr.saveAndFlush(r);
	}


}
