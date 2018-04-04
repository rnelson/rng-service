package me.rnelson.learn.kotlin.rng.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.Random

@RestController
@RequestMapping("/generate")
class RandomController {
   private val r = Random()

   @GetMapping("/int")
   fun getInt(): Int {
      return r.nextInt()
   }

   @GetMapping("/float")
   fun getFloat(): Float {
      return r.nextFloat()
   }

   @GetMapping("/double")
   fun getDouble(): Double {
      return r.nextDouble()
   }

   @GetMapping("/int/{max}")
   fun getIntMax(@PathVariable max: Int): Int {
      return r.nextInt(max)
   }

   @GetMapping("/seeded/int/{seed}")
   fun getSeededInt(@PathVariable seed: Long): Int {
      val seededRandom = Random(seed)
      return seededRandom.nextInt()
   }

   @GetMapping("/seeded/float/{seed}")
   fun getSeededFloat(@PathVariable seed: Long): Float {
      val seededRandom = Random(seed)
      return seededRandom.nextFloat()
   }

   @GetMapping("/seeded/double/{seed}")
   fun getSeededDouble(@PathVariable seed: Long): Double {
      val seededRandom = Random(seed)
      return seededRandom.nextDouble()
   }
}