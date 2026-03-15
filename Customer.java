public  class Customer {

    String name;
    String phone;
    String address;

    public Customer (String _name, String _phone , String _address)   {

        this.name = _name;
        this.phone = _phone;
        this.address = _address;

    }
    public void Showinfo()  {
        System.out.println("name:"+this.name+"phone:"+this.name+"address");
    }

}