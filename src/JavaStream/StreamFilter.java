package JavaStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.Streams;

public class StreamFilter {
	
	@Test
	public void javasteam() {
		ArrayList<String> name= new ArrayList<String>();
		name.add("Abhishek");
		name.add("tommy");
		name.add("tommy");
		name.add("App");
		name.add("Arjun");
		
		Long a= name.stream().filter(s->s.startsWith("A")).count();
		System.out.println(a);
	
	
	Long d=Stream.of("Abhishek","tommy","tommy","App","Arjun").filter(s->
	{
		s.startsWith("A");
		return true;
	}).count();
	
	System.out.println(d);
	//name.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
	name.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
	}
	
	@Test
	public void StreamMap() {
		ArrayList<String> name= new ArrayList<String>();
		name.add("rock");
		name.add("andriod");
		name.add("ios");
		
		
		//print letter which having last letter "a" with uppercase
		Stream.of("Abhishek","tommy","tommya","Appa","Arjun").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).
		forEach(s->System.out.println(s));
		
		//print letter which having first letter "a" with uppercase and sorted
		List<String> names1= Arrays.asList("Azhishek","tommy","tommya","Appa","Arjun");
		names1.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//Merge two diffrent streams
		Stream<String> newstream= Streams.concat(name.stream(),names1.stream());
		boolean flag=newstream.anyMatch(s->s.equalsIgnoreCase("Appa"));
		System.out.println(flag);
		Assert.assertTrue(flag);

	}
	
	@Test
	public void Streamcollect() {
		List<String> collection = Stream.of("Abhishek","tommy","tommya","Appa","Arjun").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).
				collect(Collectors.toList());
		System.out.println(collection.get(1));
		//print unique number
		//print sorted number
		List<Integer> values = Arrays.asList(3,2,2,4,7,8,5,6,5,9);
		values.stream().distinct().sorted().forEach(s->System.out.println(s));
		
		List<Integer> li= values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(0));
		
	}
}
