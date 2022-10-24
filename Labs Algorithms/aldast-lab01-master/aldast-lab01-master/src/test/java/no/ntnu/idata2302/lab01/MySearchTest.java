package no.ntnu.idata2302.lab01;

import static junit.framework.TestCase.assertTrue;

import java.util.Arrays;
import java.util.List;
import no.ntnu.idata2302.lab01.search.MySearch;
import org.junit.Test;

public class MySearchTest {

  @Test
  public void findNothingWhenNoMatchExists(){
    List<String> corpus = Arrays.asList(new String[]{
        "AABBCC",
        "AABB",
        "BBCC"
    });
    MySearch sut = new MySearch(corpus);
    List<String> result = sut.run("ZZ");
    assertTrue(result.isEmpty());
  }
}
