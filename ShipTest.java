package Subject;



import java.util.ArrayList;



public class ShipTest {
	public static void main(String[] args) {
		ArrayList<Ship> arrLists = new ArrayList<Ship> ();

		arrLists.add(new Boat("Boat01", 500));
		arrLists.add(new Cruise("Cruise01", 1000));

		System.out.println("shipName"+"\t"+"fuelTank");
		System.out.println("----------------------------------");
		for (int i = 0; i < arrLists.size(); i++) {
			String shipName = arrLists.get(i).getShipName();
			int fuelTank = arrLists.get(i).getFuelTank();
			System.out.printf("%-12s\t%d%n", shipName, fuelTank);
		}
		System.out.println("");
		System.out.println("10운항");
		for(int i=0; i<arrLists.size(); i++){
			arrLists.get(i).sail(10);
		}
		System.out.printf("%-12s\5%-12s%n", "shipName", "fuelTank");
		System.out.println("----------------------------------");
		for (int i = 0; i < arrLists.size(); i++) {
			String shipName = arrLists.get(i).getShipName();
			int fuelTank = arrLists.get(i).getFuelTank();
			System.out.printf("%-12s\t%d%n", shipName, fuelTank);
		}
		System.out.println("");

		System.out.println("5주유");
		for(int i=0; i<arrLists.size(); i++){
			arrLists.get(i).refuel(5);
		}
		System.out.println("shipName"+"\t"+"fuelTank");
		System.out.println("----------------------------------");
		for (int i = 0; i < arrLists.size(); i++) {
			String shipName = arrLists.get(i).getShipName();
			int fuelTank = arrLists.get(i).getFuelTank();
			System.out.printf("%-12s\t%d%n", shipName, fuelTank);
		}
	}
}