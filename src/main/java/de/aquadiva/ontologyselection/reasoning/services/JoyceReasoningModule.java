package de.aquadiva.ontologyselection.reasoning.services;

import java.util.List;

import org.apache.tapestry5.ioc.OrderedConfiguration;
import org.apache.tapestry5.ioc.ServiceBinder;
import org.apache.tapestry5.ioc.annotations.Marker;
import org.apache.tapestry5.ioc.services.ChainBuilder;

import de.aquadiva.joyce.base.services.IConstantOntologyScorer;
import de.aquadiva.ontologyselection.reasoning.services.FactaReasonerScorer.FactaReasoner;
import de.aquadiva.ontologyselection.reasoning.services.HermitReasonerScorer.HermitReasoner;
import de.aquadiva.ontologyselection.reasoning.services.PelletReasonerScorer.PelletReasoner;
import de.aquadiva.ontologyselection.reasoning.services.TrOWLReasonerScorer.TrOWLReasoner;

public class JoyceReasoningModule {

	private ChainBuilder chainBuilder;

	public JoyceReasoningModule(ChainBuilder chainBuilder) {
		this.chainBuilder = chainBuilder;
	}

	@SuppressWarnings("unchecked")
	public static void bind(ServiceBinder binder) {
		binder.bind(IConstantOntologyScorer.class, FactaReasonerScorer.class).withMarker(FactaReasoner.class)
				.withSimpleId();
		binder.bind(IConstantOntologyScorer.class, HermitReasonerScorer.class).withMarker(HermitReasoner.class).withSimpleId();
		binder.bind(IConstantOntologyScorer.class, PelletReasonerScorer.class).withMarker(PelletReasoner.class)
				.withSimpleId();
		binder.bind(IConstantOntologyScorer.class, TrOWLReasonerScorer.class).withMarker(TrOWLReasoner.class)
				.withSimpleId();
	}

	@Marker(ReasoningChain.class)
	public IConstantOntologyScorer buildReasonerScoringChain(List<IConstantOntologyScorer> reasonerScorers) {
		return chainBuilder.build(IConstantOntologyScorer.class, reasonerScorers);
	}

	public void contributeReasonerScoringChain(OrderedConfiguration<IConstantOntologyScorer> configuration,
			@FactaReasoner IConstantOntologyScorer factaScorer, @HermitReasoner IConstantOntologyScorer hermitScorer, @PelletReasoner IConstantOntologyScorer pelletScorer,
			@TrOWLReasoner IConstantOntologyScorer trowlScorer) {
//		configuration.add(FactaReasoner.class.getSimpleName(), factaScorer);
//		configuration.add(HermitReasoner.class.getSimpleName(), hermitScorer);
		// TODO for time and simplicity reasons we only stick to pellet for the WWW paper; should be extended then
		configuration.add(PelletReasoner.class.getSimpleName(), pelletScorer);
//		configuration.add(TrOWLReasoner.class.getSimpleName(), trowlScorer);
	}

}
