import org.junit.Test;
import static org.junit.Assert.assertTrue;
import java.util.Arrays;

class TestDFS{
  DFS.Node test1;


  public TestDFS(){
    test1 = new DFS.Node("A");
    test1.addChild("B").addChild("C");
    test1.children.get(0).addChild("D");
  }
  @Test
  public void Testcase1(){
    String [] expected = {"A", "B", "D", "C"};
    List<String> inputArray = new ArrayList<String>();
    assertTrue(compare(test1.depthFirstSearch(inputArray), expected));
  }

}
