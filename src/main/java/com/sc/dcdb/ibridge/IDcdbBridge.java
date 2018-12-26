package com.sc.dcdb.ibridge;

import com.sc.dcdb.model.DcItem;

public interface IDcdbBridge {
public DcItem createDcItem(DcItem item);
public boolean updateDcItemDetail(DcItem item);
}
