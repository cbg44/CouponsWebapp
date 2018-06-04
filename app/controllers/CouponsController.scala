package controllers
import javax.inject._
import play.api.mvc.{AbstractController, ControllerComponents}
import services.{Coupon, MongoHandler}

@Singleton
class CouponsController @Inject()(cc: ControllerComponents) extends AbstractController(cc)  {

  def act:String={
    val mongo:MongoHandler =new MongoHandler();
    val coupon1:Coupon=new Coupon("","","","","");
    val coupon2:Coupon=new Coupon("","","","","");
    val coupon3:Coupon=new Coupon("","","","","");
    val coupon4:Coupon=new Coupon("","","","","");

    mongo.removeAll();
    mongo.insert(coupon1);
    mongo.insert(coupon2);
    mongo.insert(coupon3);
    mongo.insert(coupon4);
    mongo.count().toString()
  }
  def cop = Action { Ok(act) }

}