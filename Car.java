public class Car {
    private String code;
    private Route fixedRoute;
    private int maxPassengers;

    public Car(){

    }

    public Car(String code, int maxPassengers) {
        this.code = code;
        this.maxPassengers = maxPassengers;
    }

    public Car(String code, Route fixedRoute, int maxPassengers) {
        this.code = code;
        this.fixedRoute = fixedRoute;
        this.maxPassengers = maxPassengers;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Route getFixedRoute() {
        return fixedRoute;
    }

    public void setFixedRoute(Route fixedRoute) {
        this.fixedRoute = fixedRoute;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }
}
