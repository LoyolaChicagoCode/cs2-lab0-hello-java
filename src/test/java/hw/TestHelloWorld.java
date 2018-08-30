package hw;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestHelloWorld {

  private HelloWorld fixture;

  @Before
  public void setUp() throws Exception {
    fixture = new HelloWorld();
  }

  @After
  public void tearDown() throws Exception {
    fixture = null;
  }

  @Test
  public void getMessage() { // this test works out of the box -> GREEN
    assertNotNull(fixture);
    assertEquals("hello world", fixture.getMessage());
  }

  @Test
  public void getYear() { // this test is OK but fails -> ORANGE
    // fix HelloWorld.java to make it pass!
    assertNotNull(fixture);
    assertEquals(2018, fixture.getYear());
  }

  @Test
  public void getMessage2() { // this test itself is broken - fix it!
    // it produces an error before being able to test the assertion -> RED
    final HelloWorld[] fixtures = new HelloWorld[] {fixture};
    final String actual = fixtures[1].getMessage();
    assertEquals("hello world", actual);
  }
}
