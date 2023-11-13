public class Subscribers extends Passenger {
    private Car c;

    public Subscribers() {
    }

    public Subscribers(String name, String id) {
        super(name, id);
    }

    public Subscribers(String name, String id, Car reservedCar, double tripCost) {
        super(name, id, reservedCar, tripCost);
    }

    @Override
    double reserveCarToPassenger(Car reservedCar) {
        this.c = reservedCar;
        try {
            if (reservedCar.getMaxPassengers() == 0) {
                throw new Exception("Max Passengers cannot be equal to zero");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        setTripCost((reservedCar.getFixedRoute().getTripPrice() - (reservedCar.getFixedRoute().getTripPrice() * 0.50)));

        return getTripCost();
    }

    @Override
    void displayInformation() {
        System.out.println(
                "Name: " + getName() +
                        " ID: " + getId() +
                        " Car Code: " + c.getCode() +
                        " Trip cost: " + getTripCost());
    }


}
