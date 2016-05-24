package com.trainologic.training.maven;

/**
 * Created by Omri at 28/04/14 15:53
 */
public interface IntegerCalculationAPI {
  /**
   * Adds two signed integers
   * @param a an integer
   * @param b an integer
   * @return the sum
   * @throws ArithmeticException if the result is above MAX_INTEGER
   */
  int add(int a,int b) throws ArithmeticException;;

  /**
   * Subtracts two signed integers
   * @param a an integer
   * @param b an integer
   * @return the difference
   * @throws ArithmeticException if the result is below -MAX_INTEGER
   */
  int substract(int a,int b) throws ArithmeticException;

  /**
   * Multiplies two signed integers
   * @param a an integer
   * @param b an integer
   * @return the product
   * @throws ArithmeticException if the result is above MAX_INTEGER or below -MAX_INTEGER
   */
  int multiply(int a,int b) throws ArithmeticException;

  /**
   * Divides a signed integer by another signed integer
   * @param a an integer
   * @param b an integer
   * @return the quotient
   * @throws ArithmeticException b is 0
   */
  int divide(int a,int b) throws ArithmeticException;

}
