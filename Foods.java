

public class Foods {

    String name;
    double price;
    double discount;

    // Hàm khởi tạo tr với tên clas
    public Foods(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    // Hiển thị thông tin món ăn, của thầy hiệu là nối chuỗi
    public void ShowInfo() {
        System.out.println("Food name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Discount: " + discount);
        System.out.println("Real price: " + RealPrice());
    }

    // Tính giá sau giảm
    public double RealPrice() {
        return price - (price * discount);
    }
}
