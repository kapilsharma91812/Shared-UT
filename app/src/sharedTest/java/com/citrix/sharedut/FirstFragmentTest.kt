package com.citrix.sharedut

import android.os.Bundle
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.*
import org.junit.runner.RunWith
import org.junit.*

@RunWith(AndroidJUnit4::class)
class FirstFragmentTest {

    @Before
    fun setUp() {
    }

    @Test
    fun xyz() {
        val scenario = launchFragmentInContainer<FirstFragment>()
        onView(withId(R.id.textview_first)).check(matches(withText("Hello first fragment")))
    }
}