package com.example.zadanie03

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest
{
    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun firstTest()
    {
        onView(withId(R.id.textView)).check(matches(withText("")))
        onView(withId(R.id.button1)).check(matches(withText("1")))
        onView(withId(R.id.button2)).check(matches(withText("2")))
        onView(withId(R.id.buttonPlus)).check(matches(withText("+")))
        onView(withId(R.id.buttonResult)).check(matches(withText("=")))
        onView(withId(R.id.button1)).perform(click())
        onView(withId(R.id.textView)).check(matches(withText("1")))
        onView(withId(R.id.buttonPlus)).perform(click())
        onView(withId(R.id.textView)).check(matches(withText("1+")))
        onView(withId(R.id.button2)).perform(click())
        onView(withId(R.id.textView)).check(matches(withText("1+2")))
        onView(withId(R.id.buttonResult)).perform(click())
        onView(withId(R.id.textView)).check(matches(withText("3")))
    }
    fun secondTest()
    {
        onView(withId(R.id.textView)).check(matches(withText("")))
        onView(withId(R.id.button3)).check(matches(withText("3")))
        onView(withId(R.id.button4)).check(matches(withText("4")))
        onView(withId(R.id.buttonMinus)).check(matches(withText("-")))
        onView(withId(R.id.buttonResult)).check(matches(withText("=")))
        onView(withId(R.id.button3)).perform(click())
        onView(withId(R.id.textView)).check(matches(withText("3")))
        onView(withId(R.id.buttonMinus)).perform(click())
        onView(withId(R.id.textView)).check(matches(withText("3-")))
        onView(withId(R.id.button4)).perform(click())
        onView(withId(R.id.textView)).check(matches(withText("3-4")))
        onView(withId(R.id.buttonResult)).perform(click())
        onView(withId(R.id.textView)).check(matches(withText("-1")))
    }
    fun thirdTest()
    {
        onView(withId(R.id.textView)).check(matches(withText("")))
        onView(withId(R.id.button5)).check(matches(withText("5")))
        onView(withId(R.id.button6)).check(matches(withText("6")))
        onView(withId(R.id.buttonMultiply)).check(matches(withText("*")))
        onView(withId(R.id.buttonResult)).check(matches(withText("=")))
        onView(withId(R.id.button5)).perform(click())
        onView(withId(R.id.textView)).check(matches(withText("5")))
        onView(withId(R.id.buttonMultiply)).perform(click())
        onView(withId(R.id.textView)).check(matches(withText("5*")))
        onView(withId(R.id.button6)).perform(click())
        onView(withId(R.id.textView)).check(matches(withText("5*6")))
        onView(withId(R.id.buttonResult)).perform(click())
        onView(withId(R.id.textView)).check(matches(withText("30")))
    }
    fun fourthTest()
    {
        onView(withId(R.id.textView)).check(matches(withText("")))
        onView(withId(R.id.button9)).check(matches(withText("9")))
        onView(withId(R.id.button3)).check(matches(withText("3")))
        onView(withId(R.id.buttonDiv)).check(matches(withText("/")))
        onView(withId(R.id.buttonResult)).check(matches(withText("=")))
        onView(withId(R.id.button9)).perform(click())
        onView(withId(R.id.textView)).check(matches(withText("9")))
        onView(withId(R.id.buttonDiv)).perform(click())
        onView(withId(R.id.textView)).check(matches(withText("9/")))
        onView(withId(R.id.button3)).perform(click())
        onView(withId(R.id.textView)).check(matches(withText("9/3")))
        onView(withId(R.id.buttonResult)).perform(click())
        onView(withId(R.id.textView)).check(matches(withText("3")))
    }

    fun fifthTest()
    {
        onView(withId(R.id.textView)).check(matches(withText("")))
        onView(withId(R.id.button7)).check(matches(withText("7")))
        onView(withId(R.id.button8)).check(matches(withText("8")))
        onView(withId(R.id.buttonDot)).check(matches(withText(".")))
        onView(withId(R.id.button7)).perform(click())
        onView(withId(R.id.textView)).check(matches(withText("7")))
        onView(withId(R.id.buttonDot)).perform(click())
        onView(withId(R.id.textView)).check(matches(withText("7.")))
        onView(withId(R.id.button8)).perform(click())
        onView(withId(R.id.textView)).check(matches(withText("7.8")))
    }
}