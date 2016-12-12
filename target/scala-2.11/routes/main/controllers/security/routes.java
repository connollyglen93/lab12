
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Glen/Desktop/test/play-crud6-image-upload/conf/routes
// @DATE:Mon Dec 12 11:56:01 GMT 2016

package controllers.security;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.security.ReverseLoginController LoginController = new controllers.security.ReverseLoginController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.security.javascript.ReverseLoginController LoginController = new controllers.security.javascript.ReverseLoginController(RoutesPrefix.byNamePrefix());
  }

}
