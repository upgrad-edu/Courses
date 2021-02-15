public class itemNotFoundException extends Throwable {
    public itemNotFoundException(String itemName) {
        super(itemName);
    }
}
