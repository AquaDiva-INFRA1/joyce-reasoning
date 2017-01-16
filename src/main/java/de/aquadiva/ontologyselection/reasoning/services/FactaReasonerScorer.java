package de.aquadiva.ontologyselection.reasoning.services;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;

import org.slf4j.Logger;

import de.aquadiva.ontologyselection.base.data.IOntology;
import de.aquadiva.ontologyselection.base.data.IOntologySet;
import de.aquadiva.ontologyselection.base.services.IConstantOntologyScorer;

public class FactaReasonerScorer implements IConstantOntologyScorer {

	private Logger log;

	@Retention(RetentionPolicy.RUNTIME)
	public @interface FactaReasoner {
		//
	}
	
	public FactaReasonerScorer(Logger log) {
		this.log = log;
		
	}
	
	public void score(IOntology o) {
		log.info("Running {}", getClass().getSimpleName());
		Map<String, String> m = null;
		m.get("hallo");
	}

	@Override
	public void score(IOntologySet s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Double getScoreAdded(IOntologySet s, IOntology o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getScoreRemoved(IOntologySet s, IOntology o) {
		// TODO Auto-generated method stub
		return null;
	}

}
