package com.panpan.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.panpan.admin.interfaceservice.TestInterface;
import com.panpan.admin.mapper.TestMapper;

@Service
public class TestMapperImpl implements TestInterface {

	@Autowired
	private TestMapper testMapper;
	@Override
	public String queryCurrentDate() {
		
		return testMapper.queryCurrentDate();
	}

}
