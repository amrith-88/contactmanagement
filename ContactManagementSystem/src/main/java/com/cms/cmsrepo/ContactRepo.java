package com.cms.cmsrepo;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.cms.cmsentity.ManagementSystem;

@Repository
public interface ContactRepo extends JpaRepository<ManagementSystem, Integer>{
public ManagementSystem deleteContact(String phoneNumber);
public ManagementSystem findByContact(String phoneNumber);
}
