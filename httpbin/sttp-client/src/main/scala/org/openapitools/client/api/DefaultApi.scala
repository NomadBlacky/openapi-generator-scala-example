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

import org.openapitools.client.model.InlineResponse2001
import org.openapitools.client.model.InlineResponse2002
import org.openapitools.client.model.InlineResponse2003
import org.openapitools.client.core._
import alias._
import sttp.client._
import sttp.model.Method

object DefaultApi {

  def apply(baseUrl: String = "https://httpbin.org")(implicit serializer: SttpSerializer) = new DefaultApi(baseUrl)
}

class DefaultApi(baseUrl: String)(implicit serializer: SttpSerializer) {

  import Helpers._
  import serializer._

  /**
   * Expected answers:
   *   code 200 :  (Neigher If-Modified-Since nor If-None-Match header is provided)
   *   code 304 :  (If-Modified-Since or If-None-Match header is provided)
   * 
   * @param ifModifiedSince For testing purposes this header accepts any value. (???) See also https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/If-Modified-Since 
   * @param ifNoneMatch For testing purposes this header accepts any value. (???) See also https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/If-None-Match 
   */
  def cacheGet(ifModifiedSince: Option[String] = None, ifNoneMatch: Option[String] = None): ApiRequestT[Unit] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/cache")
      .contentType("application/json")
      .header("If-Modified-Since", ifModifiedSince)
      .header("If-None-Match", ifNoneMatch)
      .response(asJson[Unit])

  /**
   * Expected answers:
   *   code 200 :  (OK)
   * 
   * @param `n` Response delay, in seconds.
   */
  def delayNGet(`n`: Int): ApiRequestT[Unit] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/delay/${n}")
      .contentType("application/json")
      .response(asJson[Unit])

  /**
   * Expected answers:
   *   code 200 : InlineResponse2003 (OK)
   */
  def headersGet(): ApiRequestT[InlineResponse2003] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/headers")
      .contentType("application/json")
      .response(asJson[InlineResponse2003])

  /**
   * Expected answers:
   *   code 200 :  (OK)
   */
  def htmlGet(): ApiRequestT[Unit] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/html")
      .contentType("application/json")
      .response(asJson[Unit])

  /**
   * Expected answers:
   *   code 200 : InlineResponse2001 (OK)
   */
  def ipGet(): ApiRequestT[InlineResponse2001] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/ip")
      .contentType("application/json")
      .response(asJson[InlineResponse2001])

  /**
   * Expected answers:
   *   code 200 : InlineResponse2002 (OK)
   */
  def userAgentGet(): ApiRequestT[InlineResponse2002] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/user-agent")
      .contentType("application/json")
      .response(asJson[InlineResponse2002])

  /**
   * Expected answers:
   *   code 200 :  (OK)
   */
  def xmlGet(): ApiRequestT[Unit] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/xml")
      .contentType("application/json")
      .response(asJson[Unit])

}
