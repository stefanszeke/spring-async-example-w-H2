package com.example.springasync.config;

import com.github.javafaker.Faker;

public class MyUtil {
  
  private static final Faker faker = Faker.instance();

  public static Faker faker() {
    return faker;
  }

  public static void SleepFor(int seconds) {
    try {
      Thread.sleep(seconds * 1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
