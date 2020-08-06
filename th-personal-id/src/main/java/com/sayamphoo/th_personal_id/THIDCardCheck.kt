package com.sayamphoo.th_personal_id


class THIDCardCheck(private var identificationNumber: String) {
    private var mIdentificationNumber: SetOnVerificationStatus? = null
    private var mBase = 1000000000000L
    private var mMain = 0
    private var mSum = 0

    private var IDNumber: Long = 0

    private fun checkIdentificationNumber() {
        if (identificationNumber.length != 13 || identificationNumber.length < 13) {
            mIdentificationNumber?.onVerifiedStatusFailed()
        } else {
            IDNumber = identificationNumber.toLong()
            cardIDCheck()
        }
    }

    private fun cardIDCheck() {

        for (i in 13 downTo 2) {
            mMain = (IDNumber / mBase).toInt()
            mSum += (mMain * i)
            IDNumber = (IDNumber % mBase)
            mBase = (mBase / 10)
        }

        val bit: Long = ((11 - (mSum % 11)) % 10).toLong()

        if (bit == IDNumber) {
            mIdentificationNumber?.onVerifiedStatusSuccess()
        } else {
            mIdentificationNumber?.onVerifiedStatusFailed()
        }
    }

    fun checkPersonalID(cardIDCheck: SetOnVerificationStatus) {
        mIdentificationNumber = cardIDCheck
        checkIdentificationNumber()
    }

    interface SetOnVerificationStatus {
        fun onVerifiedStatusFailed()
        fun onVerifiedStatusSuccess()
    }
}
