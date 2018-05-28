package com.dt56.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dt56.mapper.BizMapper;

import com.dt56.service.BizService;


@Service
public class BizServiceImpl implements BizService{
	@Autowired
	private BizMapper bizMapper;
	

	public BizMapper getBizMapper() {
		return bizMapper;
	}


	public void setBizMapper(BizMapper bizMapper) {
		this.bizMapper = bizMapper;
	}


	

}
