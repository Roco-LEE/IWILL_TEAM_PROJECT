package com.itwill.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.hibernate.type.descriptor.java.LocalDateJavaType;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.itwill.ApplicationTests;
import com.itwill.entity.Statistic;

class StatisticRepositoryTest extends ApplicationTests{
	@Autowired
	StatisticRepository statisticRepository;

	@Test
	void test() throws ParseException {
		System.out.println("됐다" + statisticRepository.countTotRevenueAt("20231016"));
	}
	

}
