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
    Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> App.lookupCity(6));
  }

  @Test
  void lookupCityShouldThrowArrayIndexOutOfBoundsExceptionAssertJ() {
    org.assertj.core.api.Assertions.assertThatThrownBy(() -> App.lookupCity(6))
        .isInstanceOf(ArrayIndexOutOfBoundsException.class)
        .hasMessage("Index 6 out of bounds for length 6");
  }
}