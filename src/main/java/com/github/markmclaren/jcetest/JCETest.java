package com.github.markmclaren.jcetest;

import javax.crypto.Cipher;

/*
 * Taken from https://gist.github.com/evaryont/6786915
 *
 * which itself was inspired by:
 *
 * https://stackoverflow.com/questions/11538746/check-for-jce-unlimited-strength-jurisdiction-policy-files
 *
 */
public class JCETest {

  public static void main(String[] args) {
    try {
      int maxKeyLen = Cipher.getMaxAllowedKeyLength("AES");
      System.out.println("Max Key length: " + maxKeyLen);
      if (maxKeyLen > 128) {
        System.out.println("JCE Unlimted Strength Jurisdiction Policy files are installed");
      }
    } catch (Exception e) {
      System.out.println("Drain bramage :(");
    }
  }

}
