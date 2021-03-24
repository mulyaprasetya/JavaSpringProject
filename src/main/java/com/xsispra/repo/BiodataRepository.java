package com.xsispra.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.xsispra.model.BiodataModel;


public interface BiodataRepository extends JpaRepository<BiodataModel, Long> {
	
	@Query(value = "select * from m_biodata where id=?1", nativeQuery=true)
	List<Map<String, Object>>dataProfile(Long id);

}
