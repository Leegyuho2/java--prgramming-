package Subject;

import java.util.HashMap;

public class CarTest {

	public static void main(String[] args) {

		HashMap <String, Object>map = new HashMap<String, Object>();

		L1 car1 = new L1();
		car1.setName("Shorty");
		car1.setEngineSize("1500");
		car1.setOilTank(50);
		car1.setOilSize(20);
		car1.setDistance(0);

		map.put("1", car1);

		L2 car2 = new L2();
		car2.setName("Cruse");
		car2.setEngineSize("2000");
		car2.setOilTank(70);
		car2.setOilSize(35);
		car2.setDistance(0);

		map.put("2", car2);

		L3 car3 = new L3();
		car3.setName("Oska");
		car3.setEngineSize("3000");
		car3.setOilTank(80);
		car3.setOilSize(40);
		car3.setDistance(0);

		map.put("3", car3);

		L4 car4 = new L4();
		car4.setName("Phantom");
		car4.setEngineSize("5000");
		car4.setOilTank(100);
		car4.setOilSize(50);
		car4.setDistance(0);

		map.put("4", car4);



		System.out.println("vehicleName" + "\tengineSize"+ "\toilTank" +  "\t\toilSize" + "\t\tdistance");
		System.out.println("----------------------------------------------------------------------------");

		for (int i = 1; i < 5; i++) {
			System.out.println(map.get(""+i));
		}

		System.out.println();
		System.out.println("25 주유");
		System.out.println("vehicleName" + "\tengineSize"+ "\toilTank" +  "\t\toilSize" + "\t\tdistance");
		System.out.println("----------------------------------------------------------------------------");

		for (int i = 1; i < 5; i++) {
			((Car)map.get(i+"")).setOil(25);
		}

		for (int i = 1; i < 5; i++) {
			System.out.println(map.get(""+i));
		}

		System.out.println();
		System.out.println("80 주행");
		System.out.println("vehicleName" + "\tengineSize"+ "\toilTank" +  "\t\toilSize" + "\t\tdistance" + "\ttemperature");
		System.out.println("----------------------------------------------------------------------------------------------");

		for (int i = 1; i < 5; i++) {
			((Car)map.get(i+"")).go(80);
		}

		for (int i = 1; i <= 4; i++) {
			String start = i+"";
			System.out.print(map.get(start));

			switch(start) {
			case "1":
				System.out.println(((L1)map.get(start)).getTempGage());
				break;
			case "2":
				System.out.println(((L2)map.get(start)).getTempGage());
				break;
			case "3":
				System.out.println(((L3)map.get(start)).getTempGage());
				break;
			case "4":
				System.out.println(((L4)map.get(start)).getTempGage());
				break;

			}
		}
	}

}
