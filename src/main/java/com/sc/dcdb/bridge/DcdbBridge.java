package com.sc.dcdb.bridge;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.sc.dcdb.ibridge.IDcdbBridge;
import com.sc.dcdb.model.DcItem;
import com.sc.dcdb.model.DcLock;
import com.sc.dcdb.repository.DcItemRepository;
import com.sc.dcdb.repository.DcLockRepository;
@Component
@Transactional
public class DcdbBridge implements IDcdbBridge{
	private final DcItemRepository dcItemRepository;
	private final DcLockRepository dcLockRepository;
	public DcdbBridge(DcItemRepository dcItemRepository,DcLockRepository dcLockRepository) {
		this.dcItemRepository = dcItemRepository;
		this.dcLockRepository = dcLockRepository;
	}
	@Override
	public DcItem createDcItem(DcItem item) {
		item = dcItemRepository.save(item);
		dcLockRepository.save(new DcLock(item.getId()));
		return item;
	}
	@Override
	public boolean updateDcItemDetail(DcItem item) {
		dcItemRepository.save(item);
		dcLockRepository.deleteByItemId(item.getId());
		return true;
	}
}
