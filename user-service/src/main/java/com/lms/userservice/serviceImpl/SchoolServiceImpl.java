package com.lms.userservice.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.userservice.entity.Schools;
import com.lms.userservice.repository.SchoolRepository;
import com.lms.userservice.service.SchoolService;

@Service
public class SchoolServiceImpl implements SchoolService {

	@Autowired
	private SchoolRepository schoolRepo;
	@Override
	public void save(Schools schools) {
		schoolRepo.save(schools);
		
	}

}
