package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true); }
    @Test
    public void emptyStringTest(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("")); }
    @Test
    public void startingLeftBracket(){

        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void TestPairOfBracketsMidString(){

        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }
    @Test
    public void HasInvertedBracket(){

        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void TestStartWithClosingBracket(){

        assertFalse(BalancedBrackets.hasBalancedBrackets("][]"));
    }
    @Test
    public void onlyBracketsReturnsTrue()
    {assertTrue(BalancedBrackets.hasBalancedBrackets("[]")); }
    @Test
    public void twoBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));}
    @Test
    public void BracketsWithBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));}
    @Test
    public void BracketsOfBracketsWitheBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]][]")); }
    @Test
    public void towTripleBracketsWithBracketReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[][]]]")); }
    @Test
    public void equalBracketsWithPizzaReturnsTure() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[pizza]]")); }
    @Test
    public void BracketsWithHiReturnsTrue() {

        assertTrue(BalancedBrackets.hasBalancedBrackets("[Hi]"));
    }





}
