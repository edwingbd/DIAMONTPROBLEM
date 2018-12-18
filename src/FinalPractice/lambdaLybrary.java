package FinalPractice;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class lambdaLybrary {
	public static final  FourFunctional<List<Apple>,String, Integer, Integer ,List<Apple>> APPLES_FILTERED_ORDER_LIMIT = 
			(list,strColor, intWeigt,intQuantity) -> list.stream()
													.filter(e->e.getColor()==strColor)
													.filter(e->e.getWeight()>intWeigt)
													//.sorted(Comparator.comparingInt(Apple::getWeight()))
													.sorted((a,b)->b.getWeight()-a.getWeight())
													.limit(intQuantity)
													.collect(Collectors.toList());
			
	public static final  TriFunctional<List<Apple>,String, Integer,List<Apple>> APPLES_FILTERED_ORDER_LIMIT10 = 
			(list,strColor, intWeigt) -> list.stream()
													.filter(e->e.getColor()==strColor)
													.filter(e->e.getWeight()>intWeigt)
													//.sorted(Comparator.comparingInt(Apple::getWeight()))
													.sorted((a,b)->b.getWeight()-a.getWeight())
													.limit(10)
													.collect(Collectors.toList());
			
	public static final TriFunctional<List<Apple>, String, Double, List<Apple>> RED_SPECIALS 
			= (list, colorStr, weight) 
			    -> list.stream()
			      .filter(a -> (a.getColor()==colorStr ))
			       .filter(a -> (a.getWeight() > weight))
			       .collect(Collectors.toList());

}
