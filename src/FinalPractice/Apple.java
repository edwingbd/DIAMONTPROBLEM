package FinalPractice;

public class Apple {
	public Apple(String color, Integer weight) {
		super();
		this.color = color;
		this.weight = weight;
	}
	private String color;
	private Integer weight;
	
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "apple's Color "+color+ " " + weight+" grams \r";
	}
}
