package golden.token;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;

public final class deToken_ {
  public DecodedJWT deToken(String token) {
    DecodedJWT jwt = null;
    try {
      JWTVerifier verifier = JWT.require(Algorithm.HMAC256("mysecret"))
        .withIssuer(new String[] { "auth0" }).build();
      jwt = verifier.verify(token);
    } catch (JWTDecodeException e) {
      e.printStackTrace();
    } catch (JWTVerificationException exception) {
      exception.printStackTrace();
    } catch (IllegalArgumentException e) {
      e.printStackTrace();
    } 
    System.out.print("======" + jwt + "======");
    return jwt;
  }
}
