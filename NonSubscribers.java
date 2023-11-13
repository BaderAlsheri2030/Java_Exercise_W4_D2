public class NonSubscribers extends Passenger {
    private Car c;
    private boolean discountCoupon;

    public NonSubscribers() {
    }

    public NonSubscribers(boolean discountCoupon) {
        this.discountCoupon = discountCoupon;
    }

    public NonSubscribers(String name, String id, boolean discountCoupon) {
        super(name, id);
        this.discountCoupon = discountCoupon;
    }

    public NonSubscribers(String name, String id, Car reservedCar, double tripCost, boolean discountCoupon) {
        super(name, id, reservedCar, tripCost);
        this.discountCoupon = discountCoupon;
    }

    public boolean isDiscountCoupon() {
        return discountCoupon;
    }

    public void setDiscountCoupon(boolean discountCoupon) {
        this.discountCoupon = discountCoupon;
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
        if (isDiscountCoupon()) {
            setTripCost(reservedCar.getFixedRoute().getTripPrice() - (reservedCar.getFixedRoute().getTripPrice() * 0.10));
            return getTripCost();
        }
        setTripCost(reservedCar.getFixedRoute().getTripPrice());
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
