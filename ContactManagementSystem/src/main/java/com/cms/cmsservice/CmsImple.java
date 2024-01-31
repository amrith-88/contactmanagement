package com.cms.cmsservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.cmsentity.ManagementSystem;
import com.cms.cmsrepo.ContactRepo;
@Service
public class CmsImple implements CmsService {
	
	@Autowired
	private ContactRepo repo;

	@Override
	public ManagementSystem createContact(ManagementSystem mgmt) {

		return repo.save(mgmt);
	}

	@Override
	public List<ManagementSystem> createAllContacts(List<ManagementSystem> mgmt) {

		return repo.saveAll(mgmt);
	}
	@Override
	public List<ManagementSystem> readAll() {

		return repo.findAll();
	}

	@Override
	public String deleteMgmt(String phoneNumber) {
		repo.deleteContact(phoneNumber);
		return phoneNumber+"This contact has been deleted";
	}


}
