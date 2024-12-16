package ref.ex;

public class ProductOrderMain2 {

    public static void main(String[] args) {
//        아래 주석은 내가 작성한 코드
//        ProductOrder productOrder1 = createOrder("두부", 2000, 2);
//        ProductOrder productOrder2 = createOrder("김치", 5000, 1);
//        ProductOrder productOrder3 = createOrder("콜라", 1500, 2);

//        ProductOrder[] productOrders = {productOrder1, productOrder2, productOrder3};

        ProductOrder[] productOrders = new ProductOrder[3];
        productOrders[0] = createOrder("두부", 2000, 2);
        productOrders[1] = createOrder("김치", 5000, 1);
        productOrders[2] = createOrder("콜라", 1500, 2);
        printOrders(productOrders);

        int totalAmount = getTotalAmount(productOrders);
        System.out.println("총 결제 금액: " + totalAmount);
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;

        return order;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder productOrder : orders) {
            System.out.println("상품명: " + productOrder.productName + ", 가격: " + productOrder.price + ", 수량: " + productOrder.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int total = 0;
        for (ProductOrder productOrder : orders) {
            total += productOrder.price * productOrder.quantity;
        }
        return total;
    }
}
