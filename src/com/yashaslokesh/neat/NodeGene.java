package com.yashaslokesh.neat;

public class NodeGene {
	/* Each node has a unique number associated with it. It is also designated as
	 * a sensor, output, or hidden node. 
	 */
	
	private float value;
	private NodeType type;
	private int num;
	
	static int nodeCount = 0;
	
	public NodeGene(NodeType type) {
		this.type = type;
		this.num = nodeCount++;
	}
	
	/**
	 * @return the value
	 */
	public float getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(float value) {
		this.value = value;
	}
}
