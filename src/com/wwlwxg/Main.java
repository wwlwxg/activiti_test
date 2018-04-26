package com.wwlwxg;

import static org.junit.Assert.assertNotNull;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RepositoryService;
import org.junit.Test;

public class Main {
	@Test
	public void main() {
		ProcessEngine pe = ProcessEngines.getDefaultProcessEngine();
		RepositoryService rs = pe.getRepositoryService();
		assertNotNull(pe);
	}
}
