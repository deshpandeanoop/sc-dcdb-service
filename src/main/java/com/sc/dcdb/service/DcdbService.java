package com.sc.dcdb.service;

import org.springframework.stereotype.Service;

import com.sc.dcdb.iservice.IDcdbService;
import com.sc.dcdb.model.DcItem;
import com.sc.dcdb.repository.DcItemRepository;
@Service
public class DcdbService implements IDcdbService{
	private final DcItemRepository dcItemRepository;
	public DcdbService(DcItemRepository dcItemRepository) {
		this.dcItemRepository = dcItemRepository;
	}
	@Override
	public DcItem createDomainConcept(DcItem item) {
		return dcItemRepository.save(item);
	}
}
