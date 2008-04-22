
/*                     __                                               *\
**     ________ ___   / /  ___     Scala API                            **
**    / __/ __// _ | / /  / _ |    (c) 2002-2008, LAMP/EPFL             **
**  __\ \/ /__/ __ |/ /__/ __ |    http://scala-lang.org/               **
** /____/\___/_/ |_/____/_/ | |                                         **
**                          |/                                          **
\*                                                                      */

// $Id$

// generated by genprod on Tue Apr 22 16:52:19 CEST 2008  (with extra methods)

package scala

/** Tuple2 is the canonical representation of a @see Product2
 *
 */
case class Tuple2[+T1, +T2](_1:T1, _2:T2)
  extends Product2[T1, T2]  {

   override def toString() = {
     val sb = new StringBuilder
     sb.append('(').append(_1).append(',').append(_2).append(')')
     sb.toString
   }

  /** Swap the elements of the tuple */
  def swap: Tuple2[T2,T1] = Tuple2(_2, _1)

}
