package com.sayamphoo.th_personal_id

import org.junit.Test
import org.junit.Assert.*

class NewUnitTest {

    @Test
    fun verifyThisNumberIsNotValid() {
        assertEquals(false, TestHelper().runIDCardVerifier("123456789101112"))
    }

    @Test
    fun verifyThisNumberIsNull() {
        assertEquals(false, TestHelper().runIDCardVerifier(""))
    }

    @Test
    fun verifyThisNumberISValid() {
        assertEquals(true, TestHelper().runIDCardVerifier("1100703565645"))
    }
}