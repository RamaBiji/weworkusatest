class Customer{
private long id;
private String name;
private long phoneNo;
private String address;
<getters> and <setters>
public Customer(long id, String name, long phoneNo,String address){
this.id = id;
this.name = name;
this.phoneNo= phoneNo;
this.address = address;
}
Public void printDetails(){
return “id : “+this.id+ “ name :”+ this.name+” phone: “+this.phoneNo+” address: “+ this.address;
} }
Public static void main(String [] args){
Customer cust = new Customer(10L,”FirstName”,90000000L,”City,State,Country”); String details = cust.printDetails(); System.out.println(details);
}