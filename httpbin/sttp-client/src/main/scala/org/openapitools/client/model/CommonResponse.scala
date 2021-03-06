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
package org.openapitools.client.model

import java.net.URI
import org.openapitools.client.core.ApiModel

  /**
   * Response returned by `/get`
   */
case class CommonResponse(
  /* Query string parameters specified in the request URL. */
  args: Map[String, String],
  /* Headers (standard or custom) used in the request. Some typical headers are:   - Accept   - Accept-Encoding   - Content-Length   - Content-Type   - Host   - Origin   - Referred   - User-Agent  */
  headers: Map[String, String],
  /* The origin IP from which the request was made. */
  origin: String,
  /* The endpoint URL to which the request was made. */
  url: URI
) extends ApiModel


