package com.codewars;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


@DisplayName("Writing assertions for exceptions")
class VowelsTestJava {

    @Test
    @DisplayName("Should throw an exception that has the correct message")
    void testcase1() {
        assertEquals(5, VowelsJava.getCount("abracadabra"));
    }
}
