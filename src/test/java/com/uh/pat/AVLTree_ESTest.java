/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 10 23:27:22 GMT 2022
 */

package com.uh.pat;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.uh.pat.AVLTree;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AVLTree_ESTest extends AVLTree_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete((-30));
      aVLTree0.delete(3387);
      aVLTree0.delete(0);
      aVLTree0.insert(0);
      aVLTree0.height();
      aVLTree0.insert(3387);
      aVLTree0.delete(0);
      aVLTree0.delete(0);
      aVLTree0.insert((-30));
      aVLTree0.delete(0);
      aVLTree0.insert(1);
      aVLTree0.delete(0);
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      AVLTree.Node aVLTree_Node1 = aVLTree_Node0.right;
      aVLTree0.insert((-3611));
      aVLTree0.insert((-4));
      aVLTree0.delete(1);
      aVLTree0.insert(0);
      aVLTree0.insert(1);
      aVLTree0.find(1273);
      aVLTree0.getBalance(aVLTree_Node0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      int int0 = 1900;
      aVLTree0.insert(1900);
      aVLTree0.insert(0);
      aVLTree0.delete(1);
      aVLTree0.insert((-1441));
      aVLTree0.delete((-1441));
      aVLTree0.height();
      AVLTree.Node aVLTree_Node0 = aVLTree0.find(0);
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      int int1 = 0;
      aVLTree_Node0.key = 1;
      aVLTree_Node0.height = 0;
      aVLTree_Node0.right = aVLTree_Node1;
      aVLTree_Node1.key = 0;
      aVLTree_Node0.key = 1;
      aVLTree_Node0.left = aVLTree_Node1;
      aVLTree_Node0.key = 1;
      // Undeclared exception!
      aVLTree0.delete(1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete(163);
      AVLTree.Node aVLTree_Node0 = aVLTree0.new Node(1);
      aVLTree0.insert(1);
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      AVLTree.Node aVLTree_Node2 = aVLTree_Node1.left;
      aVLTree_Node0.right = null;
      aVLTree_Node0.left = aVLTree_Node1;
      int int0 = (-4014);
      aVLTree0.insert((-4014));
      aVLTree0.delete((-809));
      aVLTree0.getBalance(aVLTree_Node0);
      aVLTree_Node1.key = 0;
      aVLTree0.height();
      aVLTree0.getBalance(aVLTree_Node0);
      // Undeclared exception!
      try { 
        aVLTree0.insert(0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // duplicate Key!
         //
         verifyException("com.uh.pat.AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      int int0 = 0;
      aVLTree0.delete(0);
      int int1 = 0;
      aVLTree0.insert(0);
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      aVLTree_Node1.right = aVLTree_Node0;
      aVLTree0.getBalance(aVLTree_Node1);
      // Undeclared exception!
      aVLTree0.find(1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete(223);
      aVLTree0.insert(241);
      aVLTree0.insert(1750);
      aVLTree0.find(241);
      // Undeclared exception!
      try { 
        aVLTree0.insert(241);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // duplicate Key!
         //
         verifyException("com.uh.pat.AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete(0);
      aVLTree0.insert(0);
      aVLTree0.delete(0);
      aVLTree0.getRoot();
      aVLTree0.insert((-1));
      aVLTree0.insert(0);
      aVLTree0.insert(2545);
      // Undeclared exception!
      try { 
        aVLTree0.insert((-1));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // duplicate Key!
         //
         verifyException("com.uh.pat.AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-5181));
      aVLTree0.delete(0);
      aVLTree0.height();
      aVLTree0.height();
      aVLTree0.getRoot();
      aVLTree0.height();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      AVLTree.Node aVLTree_Node0 = aVLTree0.new Node(883);
      aVLTree0.getBalance(aVLTree_Node0);
      aVLTree0.getBalance(aVLTree_Node0);
      aVLTree0.getRoot();
      aVLTree0.find(0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete(0);
      AVLTree aVLTree1 = new AVLTree();
      aVLTree0.insert(0);
      aVLTree1.find(3256);
      aVLTree0.getBalance((AVLTree.Node) null);
      aVLTree1.height();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(0);
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      aVLTree0.insert(108);
      aVLTree0.getBalance(aVLTree_Node0);
      aVLTree0.height();
      aVLTree0.getRoot();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete(0);
      aVLTree0.delete((-1120));
      aVLTree0.getRoot();
      aVLTree0.find(0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      int int0 = 0;
      aVLTree0.insert(0);
      int int1 = 1694;
      aVLTree0.insert(1694);
      aVLTree0.delete(0);
      int int2 = 1;
      aVLTree0.insert(1);
      aVLTree0.delete(0);
      // Undeclared exception!
      try { 
        aVLTree0.delete(1694);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.uh.pat.AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete(1023);
      aVLTree0.delete(1023);
      aVLTree0.delete((-956));
      aVLTree0.find(1023);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.getRoot();
      aVLTree0.getBalance((AVLTree.Node) null);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(1);
      aVLTree0.insert(1960);
      aVLTree0.delete(1);
      aVLTree0.delete(2005);
      aVLTree0.insert(1);
      aVLTree0.insert(0);
      aVLTree0.delete(1);
      aVLTree0.getRoot();
      aVLTree0.delete(2005);
      aVLTree0.getRoot();
      aVLTree0.insert(1);
      aVLTree0.delete(1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(1);
      aVLTree0.insert((-2835));
      aVLTree0.height();
      aVLTree0.find((-2353));
      aVLTree0.getRoot();
      aVLTree0.getRoot();
      aVLTree0.insert(0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(0);
      aVLTree0.insert((-260));
      aVLTree0.height();
      AVLTree.Node aVLTree_Node0 = aVLTree0.find((-260));
      aVLTree0.getBalance(aVLTree_Node0);
      aVLTree0.find(1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete((-176));
      aVLTree0.delete(2709);
      aVLTree0.delete(2709);
      int int0 = (-3386);
      aVLTree0.insert((-3386));
      int int1 = 598;
      aVLTree0.insert(598);
      aVLTree0.insert(0);
      aVLTree0.delete(2709);
      aVLTree0.delete(1496);
      // Undeclared exception!
      try { 
        aVLTree0.insert((-3386));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // duplicate Key!
         //
         verifyException("com.uh.pat.AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-115));
      aVLTree0.find(0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-1565));
      aVLTree0.find((-1565));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(1078);
      int int0 = 0;
      aVLTree0.delete((-1915));
      aVLTree0.delete(0);
      aVLTree0.getBalance((AVLTree.Node) null);
      aVLTree0.delete(0);
      int int1 = 294;
      int int2 = (-643);
      aVLTree0.insert((-643));
      // Undeclared exception!
      try { 
        aVLTree0.insert((-643));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // duplicate Key!
         //
         verifyException("com.uh.pat.AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertEquals((-1), aVLTree0.height());
      assertNotNull(aVLTree0);
      
      int int0 = 1889;
      aVLTree0.insert(0);
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.delete(1);
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.insert((-1441));
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.delete((-1441));
      assertEquals(0, aVLTree0.height());
      
      int int1 = aVLTree0.height();
      assertFalse(int1 == int0);
      assertEquals(0, int1);
      assertEquals(0, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.find(0);
      assertEquals(0, aVLTree0.height());
      assertNotNull(aVLTree_Node0);
      
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      assertSame(aVLTree_Node1, aVLTree_Node0);
      assertEquals(0, aVLTree0.height());
      assertNotNull(aVLTree_Node1);
      
      int int2 = 0;
      aVLTree_Node0.key = 1;
      assertEquals(0, aVLTree0.height());
      
      aVLTree_Node0.height = 0;
      assertEquals(0, aVLTree0.height());
      
      aVLTree_Node0.right = aVLTree_Node1;
      assertEquals(0, aVLTree0.height());
      
      aVLTree_Node1.key = 0;
      assertEquals(0, aVLTree0.height());
      
      aVLTree_Node0.key = 0;
      assertEquals(0, aVLTree0.height());
      
      aVLTree_Node0.left = aVLTree_Node1;
      assertEquals(0, aVLTree0.height());
      
      // Undeclared exception!
      aVLTree0.delete(0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertEquals((-1), aVLTree0.height());
      assertNotNull(aVLTree0);
      
      aVLTree0.delete(1085);
      assertEquals((-1), aVLTree0.height());
      
      int int0 = aVLTree0.height();
      assertEquals((-1), int0);
      assertEquals((-1), aVLTree0.height());
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.find((-1));
      assertEquals((-1), aVLTree0.height());
      assertNull(aVLTree_Node0);
      
      AVLTree.Node aVLTree_Node1 = aVLTree0.find(0);
      assertEquals((-1), aVLTree0.height());
      assertNull(aVLTree_Node1);
      
      aVLTree0.delete((-1));
      assertEquals((-1), aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertEquals((-1), aVLTree0.height());
      assertNotNull(aVLTree0);
      
      aVLTree0.delete((-1294));
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.insert(0);
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.delete(0);
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.delete(0);
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.insert((-2620));
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.insert(0);
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.delete((-1065));
      assertEquals(1, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.new Node(0);
      assertEquals(1, aVLTree0.height());
      assertNotNull(aVLTree_Node0);
      
      aVLTree0.delete(1879);
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.insert((-2402));
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.insert((-1294));
      assertEquals(2, aVLTree0.height());
      
      aVLTree0.delete(1976);
      assertEquals(2, aVLTree0.height());
      
      aVLTree0.delete((-1294));
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.delete(2097);
      assertEquals(1, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      assertFalse(aVLTree_Node1.equals((Object)aVLTree_Node0));
      assertNotSame(aVLTree_Node1, aVLTree_Node0);
      assertEquals(1, aVLTree0.height());
      assertNotNull(aVLTree_Node1);
      
      AVLTree.Node aVLTree_Node2 = aVLTree0.getRoot();
      assertFalse(aVLTree_Node2.equals((Object)aVLTree_Node0));
      assertSame(aVLTree_Node2, aVLTree_Node1);
      assertNotSame(aVLTree_Node2, aVLTree_Node0);
      assertEquals(1, aVLTree0.height());
      assertNotNull(aVLTree_Node2);
      
      // Undeclared exception!
      try { 
        aVLTree0.insert(0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // duplicate Key!
         //
         verifyException("com.uh.pat.AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete((-30));
      aVLTree0.delete(3387);
      aVLTree0.delete(0);
      aVLTree0.insert(0);
      aVLTree0.height();
      aVLTree0.insert(3387);
      aVLTree0.delete(0);
      aVLTree0.delete(0);
      aVLTree0.insert((-30));
      aVLTree0.delete(0);
      int int0 = 0;
      aVLTree0.insert(0);
      aVLTree0.delete(0);
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      AVLTree.Node aVLTree_Node1 = aVLTree_Node0.right;
      aVLTree_Node0.right = null;
      aVLTree0.insert((-3611));
      aVLTree0.insert(0);
      aVLTree0.delete(1);
      // Undeclared exception!
      try { 
        aVLTree0.insert(0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // duplicate Key!
         //
         verifyException("com.uh.pat.AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(0);
      aVLTree0.delete(931);
      aVLTree0.insert(883);
      aVLTree0.insert(931);
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      aVLTree_Node0.key = 931;
      aVLTree_Node0.height = (-3076);
      aVLTree_Node0.key = 3173;
      AVLTree.Node aVLTree_Node1 = aVLTree0.new Node(1236);
      aVLTree_Node0.left = aVLTree_Node1;
      aVLTree0.height();
      aVLTree0.getBalance(aVLTree_Node0);
      AVLTree.Node aVLTree_Node2 = aVLTree0.new Node(0);
      aVLTree0.getRoot();
      aVLTree0.insert(0);
      aVLTree0.find(931);
      aVLTree0.getRoot();
      aVLTree0.insert((-1));
      assertEquals(2, aVLTree0.height());
  }
}
