package com.sayamphoo.th_personal_id

class TestHelper {

    fun runIDCardVerifier(identificationNumber: String): Boolean {
        var isValid: Boolean = false
        THIDCardCheck(identificationNumber).checkPersonalID(object : THIDCardCheck.SetOnVerificationStatus {
            override fun onVerifiedStatusFailed() {
                isValid = false
            }

            override fun onVerifiedStatusSuccess() {
                isValid = true
            }
        });
        return isValid
    }
}