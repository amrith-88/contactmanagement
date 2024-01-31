package com.cms.cmscontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cms.cmsentity.ManagementSystem;
import com.cms.cmsservice.CmsService;

@RestController
public class CmsController {
	
	@Autowired
	private CmsService service;

	@PostMapping("/createContact")
	public ManagementSystem createContact(@RequestBody ManagementSystem mgmt) {
		return service.createContact(mgmt);

	}

	@PostMapping("/createAllContacts")
	public List<ManagementSystem> createAllContacts(@RequestBody List<ManagementSystem> mgmt) {
		return service.createAllContacts(mgmt);

	}
	
	@GetMapping("/getAll")
	public List<ManagementSystem> getAll()
	{
		return service.readAll();
		
	}

	@DeleteMapping("/deleteContact/{phoneNumber}")
	public String deleteContact(@PathVariable String phoneNumber) {
		return service.deleteMgmt(phoneNumber);

	}
}
