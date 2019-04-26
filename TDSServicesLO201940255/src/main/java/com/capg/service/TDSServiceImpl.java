package com.capg.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.capg.dao.TDSDao;
import com.capg.model.Details;
@Component("tds")
@Repository
@ComponentScan("com")
public class TDSServiceImpl implements TDSService{
@Autowired
TDSDao tdsao;
public Details getByPid(int pId) {
		// TODO Auto-generated method stub
		return tdsao.getByPid(pId);
	}

}
