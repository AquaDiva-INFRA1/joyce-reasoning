package de.aquadiva.ontologyselection.reasoning.app;

import org.apache.tapestry5.ioc.Registry;
import org.apache.tapestry5.ioc.RegistryBuilder;

import de.aquadiva.joyce.base.data.IOntology;
import de.aquadiva.joyce.base.services.IConstantOntologyScorer;
import de.aquadiva.ontologyselection.reasoning.services.JoyceReasoningModule;
import de.aquadiva.ontologyselection.reasoning.services.ReasoningChain;

public class Reasoning {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		Registry registry = RegistryBuilder.buildAndStartupRegistry(JoyceReasoningModule.class);
		IConstantOntologyScorer reasoningChain = registry.getService(IConstantOntologyScorer.class, ReasoningChain.class);
		reasoningChain.score((IOntology) null);
	}
}
