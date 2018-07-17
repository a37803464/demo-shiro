package com.example.demoshiro;

import java.util.Random;

/**
 * @author Win
 * @create 2018-07-13 16:49
 */
public class Test {
  /** 测试方法 */
  public static void main(String[] args) {
    Random random = new Random();
    int a = 0;
    int buy = 0;
    int hold = 0;
    int notBuy = 0;
    System.out.println("==============听天由命==============");
    for (int i = 0; i < 100; i++) {
      a = random.nextInt(99);
      if (a <= 33) {
        notBuy++;
      } else if (a <= 66) {
        hold++;
      } else {
        buy++;
      }
    }
    System.out.println("==============上天旨意==============");
    int max = notBuy;
    String message = "不买！";
    System.out.println(buy + "," + hold + "," + notBuy);

    if (hold == max || buy == max) {
      message = "再来一次！";
    }

    if (buy > max && buy !=    max) {
      max = buy;
      message = "买了！";
    }
    if (hold > max && buy != max) {
      max = hold;
      message = "等等再买！";
    }

    System.out.println(message);
  }
}
