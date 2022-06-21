package hello.core.order;

public class Order {
    private Long memeberId;
    private String itemNane;
    private int itemPrice;
    private int discountPrice;

    public Order(Long memeberId, String itemNane, int itemPrice, int discountPrice) {
        this.memeberId = memeberId;
        this.itemNane = itemNane;
        this.itemPrice = itemPrice;
        this.discountPrice = discountPrice;
    }

    public int calculatePrice(){
        return itemPrice - discountPrice;
    }

    public Long getMemeberId() {
        return memeberId;
    }

    public String getItemNane() {
        return itemNane;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public int getDiscountPrice() {
        return discountPrice;
    }

    public void setMemeberId(Long memeberId) {
        this.memeberId = memeberId;
    }

    public void setItemNane(String itemNane) {
        this.itemNane = itemNane;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public void setDiscountPrice(int discountPrice) {
        this.discountPrice = discountPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "memeberId=" + memeberId +
                ", itemNane='" + itemNane + '\'' +
                ", itemPrice=" + itemPrice +
                ", discountPrice=" + discountPrice +
                '}';
    }
}
