package com.yashaslokesh.neat;

public class ConnectionGene {
	
	private NodeGene in;
	private NodeGene out;
	private float weight;
	private boolean enabled;
	private int num;

	static int innovationNumber = 0;
	
	/**
	 * @param in
	 * @param out
	 * @param weight
	 * @param enabled
	 * @param innovationNum
	 */
	public ConnectionGene(NodeGene in, NodeGene out, float weight, boolean enabled) {
		super();
		this.in = in;
		this.out = out;
		this.weight = weight;
		this.enabled = enabled;
		this.num = innovationNumber;
		
		innovationNumber++;
	}

	/**
	 * @return the weight
	 */
	public float getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(float weight) {
		this.weight = weight;
	}

	/**
	 * @return the enabled
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * @param enabled the enabled to set
	 */
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * @return the in
	 */
	public NodeGene getIn() {
		return in;
	}

	/**
	 * @return the out
	 */
	public NodeGene getOut() {
		return out;
	}

	/**
	 * @return the innovationNum
	 */
	public int getNum() {
		return num;
	}
}
