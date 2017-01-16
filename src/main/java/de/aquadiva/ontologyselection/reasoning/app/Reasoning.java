package de.aquadiva.ontologyselection.reasoning.app;

import org.apache.tapestry5.ioc.Registry;
import org.apache.tapestry5.ioc.RegistryBuilder;

import de.aquadiva.ontologyselection.base.data.IOntology;
import de.aquadiva.ontologyselection.base.services.IConstantOntologyScorer;
import de.aquadiva.ontologyselection.reasoning.services.OSReasoningModule;
import de.aquadiva.ontologyselection.reasoning.services.ReasoningChain;

public class Reasoning {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		Registry registry = RegistryBuilder.buildAndStartupRegistry(OSReasoningModule.class);
		IConstantOntologyScorer reasoningChain = registry.getService(IConstantOntologyScorer.class, ReasoningChain.class);
		reasoningChain.score((IOntology) null);
	}
}
