package br.senac.go.espressotest;

import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

	@Rule
	public ActivityTestRule<MainActivity> activityRule =
			new ActivityTestRule<>(MainActivity.class);

	@Test
	public void useAppContext() {
		// Context of the app under test.
		Context appContext = InstrumentationRegistry.getTargetContext();

		assertEquals("br.senac.go.espressotest", appContext.getPackageName());
	}

	@Test
	public void whenClickBotao_showToast() {
		Espresso.onView(ViewMatchers.withId(R.id.bt_exemplo)).perform(ViewActions.click());
	}

	@Test
	public void whenStart_showTextHello() {
		Espresso.onView(ViewMatchers.withId(R.id.tv_hello)).check(ViewAssertions.matches(ViewMatchers.withText("Hello World!")));
	}
}
