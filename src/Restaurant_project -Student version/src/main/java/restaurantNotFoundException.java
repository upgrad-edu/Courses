public class restaurantNotFoundException extends Throwable {
    public restaurantNotFoundException(String restaurantName) {
        super(restaurantName);
    }
}
