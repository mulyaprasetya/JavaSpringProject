package com.xsispra.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xsispra.service.BiodataService;

@RestController
@RequestMapping("api/profile")
public class ProfileControllerRest {

	@Autowired
	private BiodataService bs;
	
	@GetMapping(value = "dataProfile/{id}")
	public List<Map<String, Object>>getDataProfile(@PathVariable Long id){
		List<Map<String, Object>>getDataProfile=bs.getDataProfile(id);
		return getDataProfile;
	}

}
