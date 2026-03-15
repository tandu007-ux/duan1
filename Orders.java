public class Orders {

    Customers cus;
    Foods[] list_foods;

    // Hàm khởi tạo
    public Orders(Customers cus, Foods[] list_foods) {
        this.cus = cus;
        this.list_foods = list_foods;
    }

    // Tính tổng tiền đơn hàng
    public double SumPrice() {

        double sum = 0;

        for (int i = 0; i < list_foods.length; i++) {
            sum += list_foods[i].RealPrice();
        }

        return sum;
    }
}