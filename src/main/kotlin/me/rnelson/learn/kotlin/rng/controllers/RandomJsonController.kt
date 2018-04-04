package me.rnelson.learn.kotlin.rng.controllers

import me.rnelson.learn.kotlin.rng.models.RandomValue
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.Random

@RestController
@RequestMapping("/generatejson")
class RandomJsonController {
   private val r = Random()

   @GetMapping("/int")
   fun getInt(): RandomValue {
      val value = r.nextInt()
      return RandomValue(value, 0f, 0.0, value.toString(), "integer")
   }

   @GetMapping("/float")
   fun getFloat(): RandomValue {
      val value = r.nextFloat()
      return RandomValue(0, value, 0.0, value.toString(), "floatingPoint")
   }

   @GetMapping("/double")
   fun getDouble(): RandomValue {
      val value = r.nextDouble()
      return RandomValue(0, 0f, value, value.toString(), "doublePrecision")
   }

   @GetMapping("/int/{max}")
   fun getIntMax(@PathVariable max: Int): RandomValue {
      val value = r.nextInt(max)
      return RandomValue(value, 0f, 0.0, value.toString(), "integer")
   }

   @GetMapping("/seeded/int/{seed}")
   fun getSeededInt(@PathVariable seed: Long): RandomValue {
      val seededRandom = Random(seed)
      val value = seededRandom.nextInt()
      return RandomValue(value, 0f, 0.0, value.toString(), "integer")
   }

   @GetMapping("/seeded/float/{seed}")
   fun getSeededFloat(@PathVariable seed: Long): RandomValue {
      val seededRandom = Random(seed)
      val value = seededRandom.nextFloat()
      return RandomValue(0, value, 0.0, value.toString(), "integer")
   }

   @GetMapping("/seeded/double/{seed}")
   fun getSeededDouble(@PathVariable seed: Long): RandomValue {
      val seededRandom = Random(seed)
      val value = seededRandom.nextDouble()
      return RandomValue(0, 0f, value, value.toString(), "integer")
   }
}