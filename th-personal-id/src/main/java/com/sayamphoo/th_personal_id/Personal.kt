package com.sayamphoo.th_personal_id


class Personal(private var idPersonal: Long) {
    private var mPersonalIdTh: setPersonalIdTH? = null
    private var mBase = 1000000000000L
    private var mMain = 0
    private var mSum = 0

    private fun personal() {
        if (idPersonal.toString().length == 13) {
            personalCheck()
        } else {
            mPersonalIdTh!!.statusPersonal(false)
        }
    }

    private fun personalCheck() {

        for (i in 13 downTo 2) {
            mMain = (idPersonal / mBase).toInt()
            mSum += (mMain * i)
            idPersonal = (idPersonal % mBase)
            mBase = (mBase / 10)
        }

        val bit: Long = ((11 - (mSum % 11)) % 10).toLong()

        if (bit == idPersonal) {
            mPersonalIdTh!!.statusPersonal(true)
        } else {
            mPersonalIdTh!!.statusPersonal(false)
        }
    }

    fun checkPersonalIdTHai(personalIdTh: setPersonalIdTH) {
        mPersonalIdTh = personalIdTh
        personal()
    }

    interface setPersonalIdTH {
        fun statusPersonal(status: Boolean)
    }
}
