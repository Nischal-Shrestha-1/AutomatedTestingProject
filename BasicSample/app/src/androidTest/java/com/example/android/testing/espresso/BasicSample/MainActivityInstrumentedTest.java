package com.example.android.testing.espresso.BasicSample;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.MediumTest;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import com.example.android.testing.espresso.BasicSample.MainActivity;

@RunWith(AndroidJUnit4.class)
@MediumTest
public class MainActivityInstrumentedTest {

    @Rule
    public ActivityTestRule<MainActivity> activityRule =
            new ActivityTestRule<>(MainActivity.class); 

            @Test
    public void testTextViewContent() {
        onView(withId(R.id.textToBeChanged))
                .check(matches(withText("Hello World"))); 
    }

    @Test
    public void testChangeTextButton() {
        
        onView(withId(R.id.editTextUserInput)) 
                .perform(typeText("123"));

        onView(withId(R.id.changeTextBt)) 
                .perform(click());
        onView(withId(R.id.textToBeChanged))
                .check(matches(withText("123")));
    }
}