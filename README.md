# RNG Service

## Introduction

I've been playing with Kotlin at work for a small utility that only needs to be run a few times. Since others should never need to look at or run the code again, I took the opportunity to learn something new. Turns out I really like Kotlin, so I wanted to play a bit more with it.

This service simply generates some random numbers and returns them as plain text or JSON, depending on the URL.

## Running

After cloning the repository, build the code:

```
gradle build
```

Your new Spring Boot service will be in `build/libs` and can be run with the following:

```
java -jar build/libs/rng-service-0.0.1-SNAPSHOT.jar
```

## License

Released under the [MIT License](http://rnelson.mit-license.org).
