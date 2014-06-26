package com.subrata.rdbms.querysyntax;
/**
 * Some common sql queries to be used in real time.
 * 
 * @author Subrata Saha.
 *
 */
public class CommonSQLQueries {
 /*
 =====================================================
 (GROUPBY AND HAVING):
 -------------------
 Select d.deptName DepartmentName , avg(e.bytes_consumed) AVG_BYTES_CONSUMED 
   from DEPARTMENT d , EMPLOYEE e
   where d.id = e.dept_id
   GROUPBY d.deptName
   HAVING avg(e.bytes_consumed) > 100
   
  INTERSECT :
  ---------
	SELECT * FROM EMPLOYEE WHERE ID IN (2, 3, 5)
	INTERSECT
	SELECT * FROM EMPLOYEE WHERE ID IN (1, 2, 4, 5)
	
	Result : All the result from Id 2 and 5
	
  UNION :
  -------

	SELECT * FROM EMPLOYEE WHERE ID = 5
	UNION 
	SELECT * FROM EMPLOYEE WHERE ID = 6
 
    Result : don't need any condition , simply merger the result.So all the records from Id 5 and 6 in tabular format.
    
  MINUS:
  -----

	SELECT * FROM EMPLOYEE
	MINUS
	SELECT * FROM EMPLOYEE WHERE ID > 2
	
	Result : Will show only first 2 records assuming id starting from 1.
	
  Select first 5 records from a table :
  -------------------------------------
  In Oracle,
   SELECT *  FROM EMP WHERE ROWNUM <= 5;

  In SQL Server,
  SELECT TOP 5 * FROM EMP;

  iN mYsql :
  SELECT * FROM emp LIMIT 5
  
  How to assign auto generated number without hitting the database (i.e with out creating sequence) for multiple user getting created :
  -------------------------------------------------------------------------------------------------------------------------------------
  Make a segment of numbers like 1-50 , 51-100, etc and try assigning them to user thread and later on sync it with database.
 
 =====================================================
 */
}
