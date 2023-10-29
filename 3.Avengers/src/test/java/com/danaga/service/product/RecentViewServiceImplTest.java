package com.danaga.service.product;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import com.danaga.dto.product.RecentViewDto;
import com.danaga.entity.RecentView;

import jakarta.transaction.Transactional;
@SpringBootTest
class RecentViewServiceImplTest {
	@Autowired
	private RecentViewService service;
	@Test
	@Disabled
	void testAddRecentView() {
		service.addRecentView(RecentViewDto.builder().memberId(4L).optionSetId(2L).build());
	}
	@Transactional
	@Rollback(false)
	@Test
	@Disabled
	void testRemoveMyRecentViews() {
		service.removeMyRecentViews(1L);
	}

	@Transactional
	@Rollback(false)
	@Test
	@Disabled
	void testRemoveRecentView() {
		service.removeRecentView(RecentViewDto.builder()
				.memberId(2L)
				.optionSetId(1L)
				.build());
	}

	@Test
	void testMyAllRecentViews() {
		service.myAllRecentViews(3L);
	}

}
