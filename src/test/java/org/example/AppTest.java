package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppTest {

  @Test
  void lookupCityShouldSucceedIfValidData() {
    Assertions.assertDoesNotThrow(() -> App.lookupCity(0));
  }

  @Test
  void lookupCityShouldThrowArrayIndexOutOfBoundsException() {
    Throwable throwable = Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> App.lookupCity(6));
    Assertions.assertEquals("Index 6 out of bounds for length 6", throwable.getMessage());
  }

  @Test
  void lookupCityShouldThrowArrayIndexOutOfBoundsExceptionAssertJ() {
    org.assertj.core.api.Assertions.assertThatThrownBy(() -> App.lookupCity(10))
        .isInstanceOf(ArrayIndexOutOfBoundsException.class)
        .hasMessage("Index 10 out of bounds for length 6");
  }
}