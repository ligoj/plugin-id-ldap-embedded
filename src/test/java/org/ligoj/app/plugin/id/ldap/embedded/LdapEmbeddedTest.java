package org.ligoj.app.plugin.id.ldap.embedded;

import javax.transaction.Transactional;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.ligoj.app.AbstractAppTest;
import org.ligoj.app.model.Node;
import org.ligoj.app.model.ParameterValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Test class of {@link LdapEmbeddedResource}
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/META-INF/spring/application-context-test.xml")
@Rollback
@Transactional
public class LdapEmbeddedTest extends AbstractAppTest {

	@Autowired
	private LdapEmbeddedResource resource;

	@Test
	public void getKey() {
		Assert.assertEquals("feature:id:ldap:embedded", resource.getKey());
	}

	@Test
	public void getInstalledEntities() {
		Assert.assertTrue(resource.getInstalledEntities().contains(Node.class));
		Assert.assertTrue(resource.getInstalledEntities().contains(ParameterValue.class));
	}
}
