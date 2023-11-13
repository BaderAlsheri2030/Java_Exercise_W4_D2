import java.util.ArrayList;
import java.util.List;

 public class Main {
    public static void main(String[] args) {
 Route route1 = new Route("Riyadh","Jeddah",1200);
 Route route2 = new Route("Riyadh","Dammam",500);

 Car car1 = new Car("123445",5);
 car1.setFixedRoute(route1);
 Car car2 = new Car("654321",2);
 car2.setFixedRoute(route2);

 Passenger p1 = new Subscribers("bader","1104566");
 Passenger p2 = new NonSubscribers("Khaled","11032456",true);

 p1.reserveCarToPassenger(car1);
 p2.reserveCarToPassenger(car2);

 List<Passenger> passengers = new ArrayList<>();
 passengers.add(p1);
 passengers.add(p2);

for (Passenger p: passengers) {
    p.displayInformation();
}




    }
}