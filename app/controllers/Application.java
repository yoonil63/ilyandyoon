package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
  
    public static Result index() {
        return ok(index.render());
    }
 
    public static Result index2() {
        return ok(wedding.render());
    }  
    
    public static Result index3() {
        return ok(trip.render());
    }  

    public static Result index4() {
        return ok(accomodation.render());
    }  
    
    public static Result index5() {
        return ok(information.render());
    }   
    
}