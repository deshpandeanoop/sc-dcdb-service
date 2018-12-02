package com.sc.dcdb.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sc.dcdb.iservice.IDcdbService;
import com.sc.dcdb.model.DcItem;

@RestController
public class DcdbController {
	private final IDcdbService dcdbService;
	public DcdbController(IDcdbService dcdbService) {
		this.dcdbService = dcdbService;
	}
	@PostMapping("/concept")
	public DcItem createDomainConcept(@RequestBody DcItem item) {
		return dcdbService.createDomainConcept(item);
	}

}
