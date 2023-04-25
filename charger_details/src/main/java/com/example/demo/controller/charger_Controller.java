package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.charger_Model;
import com.example.demo.Service.charger_Service;

@RestController
public class charger_Controller {
		@Autowired
		public charger_Service cs;
		
		@GetMapping("/get")
		public List<charger_Model> getdata()
		
		{
			return cs.getvalue();
		}
		@PostMapping("/post")
		public charger_Model postdata( @RequestBody charger_Model c)
		{
			return cs.postvalue(c);
		}
		@PutMapping("/update")
		public charger_Model updatedata(@RequestBody  charger_Model v)
		{
			return cs.updatevalue(v);
		}
}
