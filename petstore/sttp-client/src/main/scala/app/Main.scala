package app

import org.openapitools.client.api.PetApi
import org.openapitools.client.core.SttpSerializer
import org.openapitools.client.model.Pet
import sttp.client.HttpURLConnectionBackend

object Main {
  def main(args: Array[String]): Unit = {
    implicit val backend = HttpURLConnectionBackend()
    implicit val serializer = new SttpSerializer()

    val petApi = PetApi()
    val req = petApi.addPet(Pet(name = "Latte", photoUrls = Seq.empty))

    val res = req.send()

    println(res)
  }
}
