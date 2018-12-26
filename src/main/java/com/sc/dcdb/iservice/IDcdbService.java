package com.sc.dcdb.iservice;

import com.sc.dcdb.model.DcItem;

public interface IDcdbService {
	public DcItem createDomainConcept(DcItem item);
	public boolean updateDomainConceptDetail(DcItem item);
}
