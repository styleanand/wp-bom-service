package org.wrokprocess.bomservice.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.wrokprocess.bomservice.model.BillOfMaterial;
 
public interface BillOfMaterialRepository extends CrudRepository<BillOfMaterial, Long> {
	List<BillOfMaterial> findById(int id);
}