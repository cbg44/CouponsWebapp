package services;
import org.bson.Document;

public class Coupon {
    String title;
    String location;
    String price;
    String description;
    String imgURL;

    public Coupon(String title, String location, String description, String price, String imgURL) {
        this.title = title;
        this.location = location;
        this.description = description;
        this.price = price;
        this.imgURL = imgURL;
    }

    public Document fetchData(){
        return new Document("title",title).append("location",location).append("price",price).append("description",description).append("imgURL", imgURL);
    }

}
