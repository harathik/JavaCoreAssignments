import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ParkedCarList {
	Parking parking;
	ParkedCarList(){
		parking = new Parking(3,4,20);
		parking.initMap();	
	}
	int addNewCar(CarOwner car){
		
		Set parkingSet = parking.parkingSlot.entrySet();
		Iterator itr = parkingSet.iterator();
		int token = 0;
		while(itr.hasNext()){
			
			Map.Entry slot = (Map.Entry)itr.next();
			if(slot.getValue()==null){
				
				parking.parkingSlot.put((Integer) slot.getKey(), car);
				token =  (int) slot.getKey();
				break;
			}
		}
		return token;
	}
	
	void removeCar(int token){
		parking.parkingSlot.put(token, null);
		int floor = Math.floorDiv(token, 80)+1;
		int section = Math.floorDiv(token, 20) % 4+1;
		System.out.println("Removed car from floor "+floor+", section "+section+".");
	}
	
	void getParkedLocation(int token){
		
		CarOwner owner = parking.parkingSlot.get(token);
		if(owner!=null){
			int floor = Math.floorDiv(token, 80)+1;
			int section = Math.floorDiv(token, 20) % 4+1;
			System.out.println("Hello "+owner.getName()+", your car is parked on floor "+floor
					+", section "+section+".");
		} else {
			System.out.println("Parking is empty");
		}
	}
}
	