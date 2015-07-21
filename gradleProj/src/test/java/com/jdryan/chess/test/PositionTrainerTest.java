package com.jdryan.chess.test;

import org.junit.Test;

import com.jdryan.chess.position.trainer.PositionTrainer;

import static org.junit.Assert.*;


public class PositionTrainerTest {
   
	@Test 
    public void testpositionTrainerMethod() {
		PositionTrainer classUnderTest = new PositionTrainer();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.exampleTestMethod());
    }
}
