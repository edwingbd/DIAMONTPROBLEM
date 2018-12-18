package FinalPractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class client {

	public static void main(String[] args) {
		
		List<Apple> inventory = new ArrayList<Apple>();
		inventory.add(new Apple("Red", 100));
		inventory.add(new Apple("Red", 10));
		inventory.add(new Apple("Red", 70));
		inventory.add(new Apple("Red", 110));
		inventory.add(new Apple("Red", 900));
		inventory.add(new Apple("Red", 1000));
		inventory.add(new Apple("Red", 1300));
		inventory.add(new Apple("Red", 1330));
		inventory.add(new Apple("Red", 133200));
		inventory.add(new Apple("Green", 100));
		inventory.add(new Apple("Green", 10));
		inventory.add(new Apple("Green", 70));
		inventory.add(new Apple("Green", 110));
		inventory.add(new Apple("Green", 900));
		inventory.add(new Apple("Red", 11000));
		inventory.add(new Apple("Red", 13100));
		inventory.add(new Apple("Red", 13310));
		inventory.add(new Apple("Red", 1332100));		
		System.out.println(inventory.stream().map(e->e.toString()).collect(Collectors.toList()) );
		List<Apple> lstRedEspecial = inventory.stream()
				.filter(e->e.getWeight()>100)
				.filter(e->e.getColor() == "Red")
				.collect(Collectors.toList());
		System.out.println("NOW"+lstRedEspecial.stream().map(e->e.toString()).collect(Collectors.toList()) );
		List<Apple> lstRedEspecial10 = inventory.stream()
				.filter(e->e.getWeight()>100)
				.filter(e->e.getColor() == "Red").limit(10)
				.sorted((a,b)->b.getWeight()-a.getWeight())
				.limit(10)
				.collect(Collectors.toList());
		System.out.println("10"+lstRedEspecial10.stream().map(e->e.toString()).collect(Collectors.toList()) );
		lstRedEspecial10 = lambdaLybrary.APPLES_FILTERED_ORDER_LIMIT.apply(inventory,"asf",3,3);// .APPLES_FILTERED_ORDER_LIMIT(inventory,"Green",100,5);
		System.out.println("FourFunctional"+ lambdaLybrary.APPLES_FILTERED_ORDER_LIMIT.apply(inventory,"Green",(Integer) 100,(Integer) 5).stream().map(e->e.toString()).collect(Collectors.toList()) );
	}

	public static final FourFunctional<List<Apple>,String,Integer,Integer,List<Apple>> APPLES_100_GREEN = 
			(lstApple,strColor,intQuantity,intWeight) -> lstApple.stream()
			.filter(e->e.getWeight()>intWeight)
			.filter(e->e.getColor() == strColor).limit(intQuantity)
			.sorted((a,b)->b.getWeight()-a.getWeight())
			.collect(Collectors.toList());

}
