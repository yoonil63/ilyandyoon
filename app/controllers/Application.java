package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
  
    public static Result index() {
        return ok(index.render());
    }
 
    public static Result index2() {
        return ok(index2.render());
    }  
    
    public static Result index3() {
        return ok(index3.render());
    }  

    public static Result index4() {
        return ok(index4.render());
    }  
    
    public static Result index5() {
        return ok(index5.render());
    }   
    
}