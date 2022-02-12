package com.modernweb.backend.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.modernweb.backend.demo.entity.DemoEntity;

@RepositoryRestResource(collectionResourceRel = "demo" ,path = "demo")
public interface DemoRepository extends JpaRepository<DemoEntity,Long>{
	public List<DemoEntity> findByDemocode(String demoCode);
	

}
