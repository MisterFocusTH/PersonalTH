package com.sayamphoo.th_personal_id

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test fun verifyThatNumberIsInValid() {
        var isValid: Boolean = false
        THIDCardCheck("1234567891234").checkPersonalIdTHai(object : THIDCardCheck.SetOnVerificationStatus {
            override fun onVerifiedStatusSuccess() {
                isValid = true
            }
            override fun onVerifiedStatusFailed() {
                isValid = false
            }
        })
        assertFalse("valid number must be InValid : ", isValid)
    }

    @Test fun verifyThatNumberIsInValidTwo() {
        var isValid: Boolean = false
        THIDCardCheck("381345983755").checkPersonalIdTHai(object : THIDCardCheck.SetOnVerificationStatus {
            override fun onVerifiedStatusSuccess() {
                isValid = true
            }
            override fun onVerifiedStatusFailed() {
                isValid = false
            }
        })
        assertFalse("valid number must be InValid : ", isValid)
    }

    @Test fun verifyThatNumberIsValid() {
        var isValid: Boolean = false
        THIDCardCheck("7659645159620").checkPersonalIdTHai(object : THIDCardCheck.SetOnVerificationStatus {
            override fun onVerifiedStatusSuccess() {
                isValid = true
            }
            override fun onVerifiedStatusFailed() {
                isValid = false
            }
        })
        assertTrue("valid number must be Valid : ", isValid)
    }
}