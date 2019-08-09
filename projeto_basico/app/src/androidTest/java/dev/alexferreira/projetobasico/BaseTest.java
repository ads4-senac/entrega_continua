package dev.alexferreira.projetobasico;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.RootMatchers;
import android.support.test.espresso.matcher.ViewMatchers;
import android.view.View;

import org.hamcrest.CoreMatchers;

public abstract class BaseTest {

    protected void isToastShowedWithThatText(String text, View decorView) {
        Espresso.onView(ViewMatchers.withText(text)).inRoot(
                RootMatchers.withDecorView(CoreMatchers.not(CoreMatchers.is(decorView)))
        ).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}
