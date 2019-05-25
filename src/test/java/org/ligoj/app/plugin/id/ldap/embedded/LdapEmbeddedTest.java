package org.ligoj.app.plugin.id.ldap.embedded;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.ligoj.app.AbstractAppTest;
import org.ligoj.app.model.Node;
import org.ligoj.app.model.ParameterValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * Test class of {@link LdapEmbeddedResource}
 */
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "classpath:/META-INF/spring/application-context-test.xml")
@Rollback
@Transactional
class LdapEmbeddedTest extends AbstractAppTest {

	@Autowired
	private LdapEmbeddedResource resource;

	@Test
	void getKey() {
		Assertions.assertEquals("service:id:ldap:embedded", resource.getKey());
	}

	@Test
	void getInstalledEntities() {
		Assertions.assertTrue(resource.getInstalledEntities().contains(Node.class));
		Assertions.assertTrue(resource.getInstalledEntities().contains(ParameterValue.class));
	}
}
