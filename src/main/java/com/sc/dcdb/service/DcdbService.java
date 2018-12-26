package com.sc.dcdb.service;

import org.springframework.stereotype.Service;

import com.sc.dcdb.bridge.DcdbBridge;
import com.sc.dcdb.iservice.IDcdbService;
import com.sc.dcdb.model.DcItem;
@Service
public class DcdbService implements IDcdbService{
	private final DcdbBridge dcdbBridge;
	public DcdbService(DcdbBridge dcdbBridge) {
		this.dcdbBridge = dcdbBridge;
	}
	@Override
	public DcItem createDomainConcept(DcItem item) {
		return dcdbBridge.createDcItem(item);
	}
	@Override
	public boolean updateDomainConceptDetail(DcItem item) {
		return dcdbBridge.updateDcItemDetail(item);
	}
}
