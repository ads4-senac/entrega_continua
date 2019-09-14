package dev.alexferreira.projetobasico;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.intent.rule.IntentsTestRule;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import dev.alexferreira.projetobasico.main.MainActivity;

import static junit.framework.Assert.assertEquals;

/**
 * Instrumentation test,which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest extends BaseTest {

    public @Rule
    IntentsTestRule<MainActivity> intent = new IntentsTestRule<MainActivity>(MainActivity.class, true, true);

    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.alex.projetobasico", appContext.getPackageName());
    }

    @Test
    public void whenStart_clickInMenuFilme_showToast() throws Exception {
        Espresso.onView(ViewMatchers.withId(R.id.buttonMovie)).perform(ViewActions.click());
        isToastShowedWithThatText("Texto esperado", intent.getActivity().getWindow().getDecorView());
    }
}
