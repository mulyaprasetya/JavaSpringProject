package com.xsispra.service;

import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xsispra.repo.BiodataRepository;

@Service
@Transactional
public class BiodataService {

	@Autowired
	private BiodataRepository bdr;
	
	public List<Map<String, Object>>getDataProfile(Long id){
		return bdr.dataProfile(id);
	}
	
}
