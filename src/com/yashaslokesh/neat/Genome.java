package com.yashaslokesh.neat;

import java.util.ArrayList;
import java.util.Random;

public class Genome {
	
	// ArrayList allows fast lookup
	private ArrayList<NodeGene> nodes;
	private ArrayList<ConnectionGene> connections;
	private Random random;
	
	public Genome(int inputs, int outputs, long seed) {
		random = new Random(seed);
		
		nodes = new ArrayList<NodeGene>();
		nodes.add(new NodeGene(NodeType.INPUT));
		for (int i = 0; i < inputs; i++) {
			nodes.add(new NodeGene(NodeType.INPUT));
		}
		
		for (int i = 0; i < outputs; i++) {
			nodes.add(new NodeGene(NodeType.OUTPUT));
		}
		
		// 5 inputs to 1 output requires 5 connections, 5 inputs to 2 outputs requires 5 for each, so 10, etc. etc.
		int num_connections = inputs * outputs;
		
		for (int i = 0; i < inputs; i++) {
			for (int j = inputs; j < inputs + outputs; j++) {
				
			}
		}
		
		
	}
	
}
