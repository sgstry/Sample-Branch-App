package com.fitbod.fitbod.main

import android.app.Application
import io.branch.referral.Branch

/** Base application for the app. */
class MainApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        Branch.disableTestMode()
        Branch.getAutoInstance(this)
    }
}