/**
 * httpbin
 * An unofficial OpenAPI definition for [httpbin.org](https://httpbin.org).
 *
 * The version of the OpenAPI document: 1.0-oas3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.api

import org.openapitools.client.model.InlineResponse2004
import org.openapitools.client.model.InlineResponse2005
import org.openapitools.client.core._
import alias._
import sttp.client._
import sttp.model.Method

object AuthApi {

  def apply(baseUrl: String = "https://httpbin.org")(implicit serializer: SttpSerializer) = new AuthApi(baseUrl)
}

class AuthApi(baseUrl: String)(implicit serializer: SttpSerializer) {

  import Helpers._
  import serializer._

  /**
   * Expected answers:
   *   code 200 : InlineResponse2004 (OK)
   *   code 401 :  (Unauthorized (The username and password used for Basic auth do not match those in the URL path.))
   *              Headers :
   *                Www-Authenticate - 
   * 
   * Available security schemes:
   *   basicAuth (http)
   * 
   * @param user Username. Use the same username in the path AND for authorization.
   * @param password Password. Use the same password in the path AND for authorization.
   */
  def basicAuthUserPasswordGet(user: String, password: String)(implicit basicAuth: BasicCredentials): ApiRequestT[InlineResponse2004] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/basic-auth/${user}/${password}")
      .contentType("application/json")
      .auth.withCredentials(basicAuth.user, basicAuth.password)
      .response(asJson[InlineResponse2004])

  /**
   * Expected answers:
   *   code 200 : InlineResponse2005 (Authorized)
   *   code 404 :  (Unauthorized)
   * 
   * Available security schemes:
   *   bearerAuth (http)
   */
  def bearerGet()(implicit bearerToken: BearerToken): ApiRequestT[InlineResponse2005] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/bearer")
      .contentType("application/json")
      .auth.bearer(bearerToken.token)
      .response(asJson[InlineResponse2005])

  /**
   * Returns 404 Not Found unless the request is authenticated.
   * 
   * Expected answers:
   *   code 200 : InlineResponse2004 (OK)
   *   code 404 :  (Unautorized (the username and password used for Basic auth do not match those in the URL path.))
   * 
   * Available security schemes:
   *   basicAuth (http)
   * 
   * @param user Username. Use the same username in the path AND for authorization.
   * @param password Password. Use the same password in the path AND for authorization.
   */
  def hiddenBasicAuthUserPasswordGet(user: String, password: String)(implicit basicAuth: BasicCredentials): ApiRequestT[InlineResponse2004] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/hidden-basic-auth/${user}/${password}")
      .contentType("application/json")
      .auth.withCredentials(basicAuth.user, basicAuth.password)
      .response(asJson[InlineResponse2004])

}

