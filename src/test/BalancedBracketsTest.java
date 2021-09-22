package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    //Test for only brackets
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    //Test for empty string
    @Test
    public void EmptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    //test for mixed brackets and letters
    @Test
    public void mixedBracketsAndLetterReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    //testing completed bracket both wrong and correct way
    @Test
    public void frontCompletedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]Launch[Code]"));
    }

    //test for mixed letter and brackets in wrong direction
    @Test
    public void wrongBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    //testing uncompleted single bracket
    @Test
    public void uncompletedBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    //testing completed bracket in wrong direction
    @Test
    public void uncompletedLetterBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void uncompletedBracketLetter() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    //test bracket enclosed in other bracket correctly and letters
    @Test
    public void BracketEnclosedInBracketCorrectly(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[test[[bracket]][](parenthesis)]"));
    }

    //test bracket enclosed in other bracket incorrectly and letters
    @Test
    public void BracketEnclosedInBracketInCorrectly(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[test[bracket]][](parenthesis)]"));
    }

    //testing string with other type bracket
    @Test
    public void OnlyLetterWithOtherTypeBracket(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("(parenthesis)"));
    }
}
