/*******************************************************************************
 * Copyright (c) 2006 IBM Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package recurse;

import java.util.Collection;
import java.util.Iterator;

/**
 * @author sfink
 *
 * A simple exercise in recursive data structures.
 */
public class NList implements Collection {

  final int value;
  final NList next;
  
  public NList(int value) {
    this.value = value;
    if (value > 0) {
      this.next = new NList(value - 1);
    } else {
      this.next = null;
    }
  }


  public static void main(String[] args) {
    new NList(100);
  }

  /* (non-Javadoc)
   * @see java.util.Collection#size()
   */
  public int size() {
    // TODO Auto-generated method stub
    return 0;
  }

  /* (non-Javadoc)
   * @see java.util.Collection#isEmpty()
   */
  public boolean isEmpty() {
    // TODO Auto-generated method stub
    return false;
  }

  /* (non-Javadoc)
   * @see java.util.Collection#contains(java.lang.Object)
   */
  public boolean contains(Object o) {
    // TODO Auto-generated method stub
    return false;
  }

  /* (non-Javadoc)
   * @see java.util.Collection#iterator()
   */
  public Iterator iterator() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see java.util.Collection#toArray()
   */
  public Object[] toArray() {
    // TODO Auto-generated method stub
    return null;
  }


  /* (non-Javadoc)
   * @see java.util.Collection#add(java.lang.Object)
   */
  public boolean add(Object o) {
    // TODO Auto-generated method stub
    return false;
  }

  /* (non-Javadoc)
   * @see java.util.Collection#remove(java.lang.Object)
   */
  public boolean remove(Object o) {
    // TODO Auto-generated method stub
    return false;
  }

  /* (non-Javadoc)
   * @see java.util.Collection#containsAll(java.util.Collection)
   */
  public boolean containsAll(Collection c) {
    // TODO Auto-generated method stub
    return false;
  }

  /* (non-Javadoc)
   * @see java.util.Collection#addAll(java.util.Collection)
   */
  public boolean addAll(Collection c) {
    // TODO Auto-generated method stub
    return false;
  }

  /* (non-Javadoc)
   * @see java.util.Collection#removeAll(java.util.Collection)
   */
  public boolean removeAll(Collection c) {
    // TODO Auto-generated method stub
    return false;
  }

  /* (non-Javadoc)
   * @see java.util.Collection#retainAll(java.util.Collection)
   */
  public boolean retainAll(Collection c) {
    // TODO Auto-generated method stub
    return false;
  }

  /* (non-Javadoc)
   * @see java.util.Collection#clear()
   */
  public void clear() {
    // TODO Auto-generated method stub
    
  }


  public Object[] toArray(Object[] a) {
    // TODO Auto-generated method stub
    return null;
  }
}
