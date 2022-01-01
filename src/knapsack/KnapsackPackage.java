/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knapsack;

/**
 *
 * @author pin2
 */
public class KnapsackPackage {
    private int weight;
	private int value;
	private Double cost;
        private String name;
	
	public KnapsackPackage(int weight, int value,String name) {
		super();
		
		this.weight = weight;
		this.value = value;
		this.cost = new Double(value / weight);
                this.name= name;
	}

	public int getWeight() {
		return weight;
	}

	public int getValue() {
		return value;
	}

	public Double getCost() {
		return cost;
	}
        public String getName() {
		return name;
	}

}
