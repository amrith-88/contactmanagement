package com.cms.cmsservice;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cms.cmsentity.ManagementSystem;

@Service
public interface CmsService {
	public ManagementSystem createContact(ManagementSystem mgmt);

	public List<ManagementSystem> createAllContacts(List<ManagementSystem> mgmt);

	public List<ManagementSystem> readAll();

	public String deleteMgmt(String phoneNumber);
}
