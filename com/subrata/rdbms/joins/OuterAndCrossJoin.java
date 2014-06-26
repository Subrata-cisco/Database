package com.subrata.rdbms.joins;
/**
 * Outer join returns the non-matching records along with matching records from both the tables.
 * 1. LEFT OUTER JOIN.
 * 2. RIGHT OUTER JOIN.
 * 3. FULL OUTER JOIN.
 * @author Subrata Saha.
 *
 */
public class OuterAndCrossJoin {
  /*
  ===============================================================
		  LEFT OUTER JOIN :
		  1. All the records from the left hand side table.
		  2. and NULL from right hand side table.
		  
		  Syntax : 
		  Select t1.a ,t1.b, t2.c, t2.d from Table1 t1 LEFT OUTER JOIN Table2 t2 on t1.no = t2.id
		  
		  
		  UI : (Table1 | Table 2)  [Note :: 'yes' means Present , 'No' means Not present]
		  yes  yes | yes yes
		  yes  yes | yes yes
		  yes  yes | No  No
		  yes  yes | No  No
		  
		  
		  RIGHT OUTER JOIN :
		  1. All the records from the right hand side table.
		  2. and NULL from left hand side table.
		  
		  Syntax : 
		  Select t1.a ,t1.b, t2.c, t2.d from Table1 t1 RIGHT OUTER JOIN Table2 t2 on t1.no = t2.id
		  
		  
		  UI : (Table1 | Table 2)
		  yes  yes | yes yes
		  yes  yes | yes yes
		  No  No | yes  yes
		  No  No | yes  yes
		  
		  
		  FULL OUTER JOIN :
		  1. All the matching and non matching records from both the tables.
		  
		  Syntax : 
		  Select t1.a ,t1.b, t2.c, t2.d from Table1 t1 FULL OUTER JOIN Table2 t2 on t1.no = t2.id
		  
		  
		  UI : (Table1 | Table 2)
		  yes  yes | yes yes
		  yes  yes | yes yes
		  yes  yes | No  No
		  yes  yes | No  No
		  No  No   | yes  yes
		  No  No   | yes  yes
		  
		  CROSS JOIN :
		  1. All the cross result from both table.
		  
		  Syntax : 
		  Select a ,b, f,g  from Table1 t1 CROSS JOIN Table2 t2 
		  
		  e.g
		   T1 :  a , b , c , d [2 row data]
		   T2 :  e,  f , g     [3 row data]
		   
		  UI :
		    a1 , b1 , f1, g1
		    a2 , b2 , f1, g1
		    a1 , b1 , f2, g2
		    a2 , b2 , f2, g2
		    a1 , b1 , f3, g3
		    a2 , b2 , f3, g3
		  
  ===============================================================
  */
}
