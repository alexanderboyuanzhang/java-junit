package com.boyuanzhang.junit5;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.*;

public class JUnit5Sample1Test {

	@BeforeAll
	static void beforeAll() {
		System.out.println("**--- Executed once before all test methods in this class ---**");
	}

	@BeforeEach
	void beforeEach() {
		System.out.println("**--- Executed before each test method in this class ---**");
	}

	@Test
	void testMethod1() {
		System.out.println("**--- Test method1 executed ---**");
	}

	@DisplayName("Test method2 with condition")
	@Test
	void testMethod2() {
		System.out.println("**--- Test method2 executed ---**");
	}

	@Test
	@Disabled("implementation pending")
	void testMethod3() {
		System.out.println("**--- Test method3 executed ---**");
	}

	@AfterEach
	void afterEach() {
		System.out.println("**--- Executed after each test method in this class ---**");
	}

	@AfterAll
	static void afterAll() {
		System.out.println("**--- Executed once after all test methods in this class ---**");
	}

	@Test
	void testAssertEqual() {
		assertEquals("ABC", "ABC");
		assertEquals(20, 20, "optional assertion message");
		assertEquals(2 + 2, 4);
	}

	@Test
	void testAssertFalse() {
		assertFalse("FirstName".length() == 10);
		assertFalse(10 > 20, "assertion message");
	}

	@Test
	void testAssertNull() {
		String str1 = null;
		String str2 = "abc";
		assertNull(str1);
		assertNotNull(str2);
	}

	@Test
	void testAssertAll() {
		String str1 = "abc";
		String str2 = "pqr";
		String str3 = "xyz";
		assertAll("numbers", () -> assertEquals(str1, "abc"), () -> assertEquals(str2, "pqr"),
				() -> assertEquals(str3, "xyz"));
		// uncomment below code and understand each assert execution
		/*
		 * assertAll("numbers", () -> assertEquals(str1,"abc"), () ->
		 * assertEquals(str2,"pqr1"), () -> assertEquals(str3,"xyz1") );
		 */
	}

	@Test
	void testAssertTrue() {
		assertTrue("FirstName".startsWith("F"));
//	 assertTrue(10  {
//	      throw new IllegalArgumentException("Illegal Argument Exception occured");
//	 });
//	 assertEquals("Illegal Argument Exception occured", exception.getMessage());
	}

}
