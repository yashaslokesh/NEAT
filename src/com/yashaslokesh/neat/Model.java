package com.yashaslokesh.neat;

public class Model {
	
	private int population, specGenerationCutoff, specMinimumNetworksForChamp;
	private double c1, c2, c3, speciationThreshold, connGeneWeightMutationRate, connGeneUniformMutationProb, connGeneRandomMutationProb;
	private double inheritedDisableProb, offspringWithoutCrossoverRate, interSpecMatingRate, newNodeProb, newLinkProb;
	
	/* Referred to https://dzone.com/articles/design-patterns-the-builder-pattern */
	public static class Builder {
		/* These parameters taken from pages 111-112 of Evolutionary Computation, Volume 10, Number 2. */
		private int population, specGenerationCutoff, specMinimumNetworksForChamp;
		private double c1, c2, c3, speciationThreshold, connGeneWeightMutationRate, connGeneUniformMutationProb, connGeneRandomMutationProb;
		private double inheritedDisableProb, offspringWithoutCrossoverRate, interSpecMatingRate, newNodeProb, newLinkProb;
		
		/* Initializes with default values */
		public Builder() {
			this.population = 150;
			this.specGenerationCutoff = 15;
			this.specMinimumNetworksForChamp = 5;
			this.c1 = 1.0;
			this.c2 = 1.0;
			this.c3 = 0.4;
			this.speciationThreshold = 3.0;
			this.connGeneWeightMutationRate = 0.80;
			this.connGeneUniformMutationProb = 0.90;
			this.connGeneRandomMutationProb = 0.10;
			this.inheritedDisableProb = 0.75;
			this.offspringWithoutCrossoverRate = 0.25;
			this.interSpecMatingRate = 0.001;
			this.newNodeProb = 0.03;
			this.newLinkProb = 0.05;
		}
		
		/* We return the Builder class each time, so the caller can use a fluent interface 
		 * to build an object of type Model, only configuring the values they wish.
		 */
		public Builder withPopulation(int population) {
			this.population = population;
			return this;
		}
		
		public Builder withSpecGenerationCutoff(int specGenerationCutoff) {
			this.specGenerationCutoff = specGenerationCutoff;
			return this;
		}
		
		public Builder withSpecMinimumNetworksForChamp(int specMinimumNetworksForChamp) {
			this.specMinimumNetworksForChamp = specMinimumNetworksForChamp;
			return this;
		}
		
		public Builder setC1(double c1) {
			this.c1 = c1;
			return this;
		}
		
		public Builder setC2(double c2) {
			this.c2 = c2;
			return this;
		}
		
		public Builder setC3(double c3) {
			this.c3 = c3;
			return this;
		}
		
		public Builder withSpeciationThreshold(double speciationThreshold) {
			this.speciationThreshold = speciationThreshold;
			return this;
		}
		
		public Builder withConnGeneWeightMutationRate(double connGeneWeightMutationRate) {
			this.connGeneWeightMutationRate = connGeneWeightMutationRate;
			return this;
		}
		
		public Builder withConnGeneUniformMutationProb(double connGeneUniformMutationProb) {
			this.connGeneUniformMutationProb = connGeneUniformMutationProb;
			this.connGeneRandomMutationProb = 1.0 - connGeneUniformMutationProb;
			return this;
		}
		
		public Builder withConnGeneRandomMutationProb(double connGeneRandomMutationProb) {
			this.connGeneRandomMutationProb = connGeneRandomMutationProb;
			this.connGeneUniformMutationProb = 1.0 - connGeneRandomMutationProb;
			return this;
		}
		
		public Builder withInheritedDisableProb(double inheritedDisableProb) {
			this.inheritedDisableProb = inheritedDisableProb;
			return this;
		}
		
		public Builder withOffspringWithoutCrossoverRate(double offspringWithoutCrossoverRate) {
			this.offspringWithoutCrossoverRate = offspringWithoutCrossoverRate;
			return this;
		}
		
		public Builder withInterSpecMatingRate(double interSpecMatingRate) {
			this.interSpecMatingRate = interSpecMatingRate;
			return this;
		}
		
		public Builder withNewNodeProb(double newNodeProb) {
			this.newNodeProb = newNodeProb;
			return this;
		}
		
		public Builder withNewLinkProb(double newLinkProb) {
			this.newLinkProb = newLinkProb;
			return this;
		}
		
		/* Mostly generated with python code:
		 * var_list = var_list = 'population, specGenerationCutoff, specMinimumNetworksForChamp'.split(', ')
		 * var_list += 'c1, c2, c3, speciationThreshold, connGeneWeightMutationRate, connGeneUniformMutationProb, connGeneRandomMutationProb'.split(', ')
		 * var_list += 'inheritedDisableProb, offspringWithoutCrossoverRate, interSpecMatingRate, newNodeProb, newLinkProb'.split(', ')
		 * 
		 * print('\n'.join(f'model.{i} = this.{i};' for i in var_list))
		 */
		public Model build() {
			Model model = new Model();
			model.population = this.population;
			model.specGenerationCutoff = this.specGenerationCutoff;
			model.specMinimumNetworksForChamp = this.specMinimumNetworksForChamp;
			model.c1 = this.c1;
			model.c2 = this.c2;
			model.c3 = this.c3;
			model.speciationThreshold = this.speciationThreshold;
			model.connGeneWeightMutationRate = this.connGeneWeightMutationRate;
			model.connGeneUniformMutationProb = this.connGeneUniformMutationProb;
			model.connGeneRandomMutationProb = this.connGeneRandomMutationProb;
			model.inheritedDisableProb = this.inheritedDisableProb;
			model.offspringWithoutCrossoverRate = this.offspringWithoutCrossoverRate;
			model.interSpecMatingRate = this.interSpecMatingRate;
			model.newNodeProb = this.newNodeProb;
			model.newLinkProb = this.newLinkProb;
			
			return model;
		}
		
	}
	
	private Model() {
		
	}
	
	
	
}
