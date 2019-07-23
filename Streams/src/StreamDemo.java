import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;

import javax.sound.sampled.LineListener;

import org.graalvm.compiler.lir.LIRInstruction.Use;

public class StreamDemo {

	
	public static void main(String[] args)
	{
		List<Integer>list =new ArrayList<Integer>();
		list.add(22);
		list.add(44);
		list.add(77);
		list.add(null);
		list.add(33);
		list.add(21);
		list.add(99);
		list.add(null);
		list.add(55);
		list.add(66);
		System.out.println(list);
		//Filter
		System.out.println(list.stream().filter(x->x%2==0).collect(Collectors.toList()));
		//Map
		System.out.println(list.stream().map(x->x+1).collect(Collectors.toList()));
		System.out.println(list.stream().map(x->x*x).collect(Collectors.toList()));
		//Java 9 and abv

		System.out.println(list.stream().takeWhile(x->x%2==0).collect(Collectors.toList()));
		System.out.println(list.stream().dropWhile(x->x%2==0).collect(Collectors.toList()));
		//stream.iterate
		//Stream.iterate(1,x->x+1).forEach(System.out::println);
		Stream.iterate(1,x->x<100,x->x+1).forEach(System.out::println);
		Stream.iterate(1,x->x+1).limit(20).forEach(System.out::println);
		//FlatMap
//		List l1=list.stream().flatMap(e->Stream.ofNullable(e)).collect(Collectors.toList());
//		System.out.println(l1);
		
	}
}