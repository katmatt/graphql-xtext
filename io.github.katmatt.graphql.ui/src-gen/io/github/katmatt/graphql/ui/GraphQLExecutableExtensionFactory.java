/*
 * generated by Xtext 2.23.0
 */
package io.github.katmatt.graphql.ui;

import com.google.inject.Injector;
import io.github.katmatt.graphql.ui.internal.GraphqlActivator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class GraphQLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(GraphqlActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		GraphqlActivator activator = GraphqlActivator.getInstance();
		return activator != null ? activator.getInjector(GraphqlActivator.IO_GITHUB_KATMATT_GRAPHQL_GRAPHQL) : null;
	}

}
