  public abstract class Passenger {
    private String name;
    private String id;
    private Car reservedCar;

    //no discount on tripcost
    private double tripCost;

    public Passenger() {
    }

    public Passenger(String name, String id) {
        this.name = name;
        this.id = id;
    }

      public Passenger(String name, String id, Car reservedCar, double tripCost) {
          this.name = name;
          this.id = id;
          this.reservedCar = reservedCar;
          this.tripCost = tripCost;
      }

      public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getReservedCar() {
        return reservedCar;
    }

    public void setReservedCar(Car reservedCar) {
        this.reservedCar = reservedCar;
    }

    public double getTripCost() {
        return tripCost;
    }

    public void setTripCost(double tripCost) {
        this.tripCost = tripCost;
    }

    abstract double reserveCarToPassenger(Car reservedCar);

    abstract void displayInformation();

}
