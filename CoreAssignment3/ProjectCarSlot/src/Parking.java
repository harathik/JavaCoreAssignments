import java.util.*;

class Parking{
	int floors;
	int section;
	int capacity;
	public LinkedHashMap<Integer, CarOwner> parkingSlot = new LinkedHashMap<Integer, CarOwner>();
	
	public Parking(int floors, int section, int capacity) {
		this.floors = floors;
		this.section = section;
		this.capacity = capacity;
	}

	public int getTotalCapacity(){
		return floors*section*capacity;
	}
	
	public void initMap(){
		for(int i=0;i<getTotalCapacity();i++){
			parkingSlot.put(i, null);
		}
	}
public static void main(String args[]){
		
		ParkedCarList carList = new ParkedCarList();
		Scanner scanner = new Scanner(System.in);
		int choice;
		while(true){
			System.out.println("-Car Parking-");
			System.out.println("1. Add Car");
			System.out.println("2. Show car location");
			System.out.println("3. Remove car");
			choice = scanner.nextInt();
			switch(choice){
			case 1:
				System.out.println("Enter your name");
				String name = scanner.next();
				String carModel = "Tesla s6";
				int carNo = 123;
				long mobileNo = 123;
				String address = "Vasant Vihar, Delhi";
				
				CarOwner car = new CarOwner(name, carModel, carNo, mobileNo, address);
				int token = carList.addNewCar(car);
				System.out.println("Car is parked, your token is : "+token);
				System.out.println("Thankyou");
				break;
			case 2:
				System.out.println("Please provide your token");
				int userToken = scanner.nextInt();
				carList.getParkedLocation(userToken);
				break;
			case 3:
				System.out.println("Please provide your token");
				int userToken1 = scanner.nextInt();
				carList.removeCar(userToken1);
				break;
			default:
				System.exit(0);
			}
			
		}
		
		
	}
}