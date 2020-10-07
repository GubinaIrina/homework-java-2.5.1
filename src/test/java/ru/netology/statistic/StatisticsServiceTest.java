package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest<current_max> {

  @Test
  void findMax() {
    StatisticsService service = new StatisticsService();

    long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
    long expected = 12;
    long actual = service.findMax(incomesInBillions);
    assertEquals(expected, actual);
  }
  @Test
  void findMax1() {
    StatisticsService service = new StatisticsService();
    long[] incomes = {5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
    long current_max = service.findMax(incomes);
    System.out.println(current_max);

      }
}