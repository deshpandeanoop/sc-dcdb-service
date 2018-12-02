package com.sc.dcdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sc.dcdb.model.DcItem;

public interface DcItemRepository extends JpaRepository<DcItem, Long>{
}
