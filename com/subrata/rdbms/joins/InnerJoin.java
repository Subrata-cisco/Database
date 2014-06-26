package com.subrata.rdbms.joins;
/**
 * Inner join returns rows when there is at least one match in both tables.
 * 
 * 1) You can do inner join from different table.
 * 2) Self Join [or inner join with the same table itself] is often very useful to convert a hierarchical structure into a flat structure.
 * 
 * @author Subrata Saha.
 *
 */
public class InnerJoin {
    /*
     =====================================================================
     Getting the hierarchical data.
	 create table EMPLOYEES
     (		
    		EmpID    char(4)         unique Not null,
    		Ename    varchar(10),
    		Job      varchar(9),
    		MGR      char(4),
    		Hiredate date,
    		Salary   decimal(7,2),
    		Comm     decimal(7,2),
    		DeptNo   char(2)         not null,
    		Primary key(EmpID)
     );

	Select distinct e.Ename EmployeeName , m.EName ManagerName
	   from EMPLOYEES e
	   INNER JOIN EMPLOYEES m on e.MGR = m.EmpID order by m.Ename;
	
	Select distinct e.Ename EmployeeName , m.EName ManagerName
	   from EMPLOYEES e , EMPLOYEES m
	   where e.MGR = m.EmpID
	======================================================================
	
	 */
	
}
