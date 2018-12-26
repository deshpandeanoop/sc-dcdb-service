package com.sc.dcdb.controller;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	@PostMapping("/domainconcepts")
	public DcItem createDomainConcept(@RequestBody DcItem item) {
		return dcdbService.createDomainConcept(item);
	}
	@PutMapping("/domainconcepts")
	public Response updateDomainConceptDetail(@RequestBody DcItem item) {
		if (dcdbService.updateDomainConceptDetail(item)) {
			return Response.ok().build();
		} else {
			return Response.status(Status.BAD_REQUEST).build();
		}
	}
}
