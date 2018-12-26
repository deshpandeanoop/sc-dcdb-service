package com.sc.dcdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sc.dcdb.model.DcLock;

public interface DcLockRepository extends JpaRepository<DcLock, Long> {
	public void deleteByItemId(long itemId);
	public DcLock findByItemId(long itemId);
}
