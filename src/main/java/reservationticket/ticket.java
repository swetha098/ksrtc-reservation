package reservationticket;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ticket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		reserve bus1 = new reserve("B001","KSRTC Swift","Sasi",247,LocalTime.of(10,30),LocalTime.of(16,0));
		reserve bus2 = new reserve("B002","KSRTC Swift Delux","Abu",500,LocalTime.of(16,30),LocalTime.of(20,30));
		reserve bus3 = new reserve("B003","KSRTC Super Delux","Kodiyan",800,LocalTime.of(21,0),LocalTime.of(01,0));
		
		Scanner n = new Scanner(System.in);
		System.out.println("Enter source : ");
		String source = n.next();
		System.out.println("Enter destination : ");
		String dest = n.next();
		
		List<reserve> busdet = Arrays.asList(bus1,bus2,bus3);
		busdet.stream().forEachOrdered(System.out::println);
		
		System.out.println("Choose a bus via bus : ");
		String id = n.next();
		
		//String idd;
		
		List<reserve> fil = busdet.stream().filter(t->id.equalsIgnoreCase(t.getBusid())).toList();
		
		fil.forEach(t->System.out.println(t));
		
		
	}

}
