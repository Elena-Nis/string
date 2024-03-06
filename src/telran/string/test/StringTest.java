package telran.string.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringTest {

	@Test
	@DisplayName("test of the method concat")
	void concatTest() {
		String hello = "Hello";
		
		assertEquals("Hello World!!!", hello.concat(" World").concat("!!!"));
		//assertTrue(hello.concat(" World").concat("!!!").equals("Hello World!!!"));
	}
	@Test
	void containsTest() {
		String hello = "Hello";
	    assertTrue( hello.contains("ell"));
		assertFalse( hello.contains("elo"));
	}
	@Test
	void compareToTest () {
		String str1="Hello World!";
		String str2="Hello";
		assertEquals(7,str1.compareTo(str2));
		String str3="Hello";
		String str4="Hello World!";
		assertEquals(-7,str3.compareTo(str4));
		String str5="Hello";
		String str6="Hello";
		assertEquals(0,str5.compareTo(str6));
		String str7="";
		String str8="Hello";
		assertEquals(-5,str7.compareTo(str8));
		String str9="hello";
		String str10="Hello";
		assertEquals(0,str9.compareTo(str10));
		String str11="helllo";
		String str12="hello";
		assertEquals(1,str11.compareTo(str12));
	}

}
