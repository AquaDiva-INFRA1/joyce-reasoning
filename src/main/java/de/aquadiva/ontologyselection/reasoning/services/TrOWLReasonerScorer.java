package de.aquadiva.ontologyselection.reasoning.services;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.slf4j.Logger;

import de.aquadiva.joyce.base.data.IOntology;
import de.aquadiva.joyce.base.data.IOntologySet;
import de.aquadiva.joyce.base.services.IConstantOntologyScorer;

public class TrOWLReasonerScorer implements IConstantOntologyScorer {

	private Logger log;

	@Retention(RetentionPolicy.RUNTIME)
	public @interface TrOWLReasoner {
		//
	}
	
	public TrOWLReasonerScorer(Logger log) {
		this.log = log;
		
	}
	
	public void score(IOntology o) {
		log.info("Running {}", getClass().getSimpleName());
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
