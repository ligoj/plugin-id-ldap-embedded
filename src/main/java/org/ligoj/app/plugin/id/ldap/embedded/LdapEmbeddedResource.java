package org.ligoj.app.plugin.id.ldap.embedded;

import java.util.Arrays;
import java.util.List;

import org.ligoj.app.api.FeaturePlugin;
import org.ligoj.app.model.Node;
import org.ligoj.app.model.ParameterValue;
import org.springframework.stereotype.Component;

/**
 * A feature adding an embedded server node for LDAP.
 */
@Component
public class LdapEmbeddedResource implements FeaturePlugin {

	@Override
	public String getKey() {
		return "service:id:ldap:embedded";
	}

	@Override
	public List<Class<?>> getInstalledEntities() {
		// Add node configuration during the install
		return Arrays.asList(Node.class, ParameterValue.class);
	}

}
