package com.subrata.rdbms.normalization;
/**
 * Database normalization Rules.
 * 
 * @author Subrata Saha.
 *
 */
public class NormalizationRules {

	/*
	 
	Candidate Key – A Candidate Key can be any column or a combination of columns that can qualify as unique key in database. 
	There can be multiple Candidate Keys in one table. Each Candidate Key can qualify as Primary Key.

	Primary Key – A Primary Key is a column or a combination of columns that uniquely identify a record. 
	Only one Candidate Key can be Primary Key.
	 
	1NF:
	---
	As per First Normal Form, no two Rows of data must contain repeating group of information 
	i.e each set of column must have a unique value, such that multiple columns cannot be used 
	to fetch the same row. Each table should be organized into rows, 
	and each row should have a primary key that distinguishes it as unique. 
	
	First Normal Form, any row must not have a column in which more than one value is saved, like separated with commas. 
	Rather than that, we must separate such data into multiple rows. No repeating groups.
	
	2nd NF :
	-------
	As per the Second Normal Form there must not be any partial dependency of any column on primary key. 
	It means that for a table that has concatenated primary key, each column in the table that is not part 
	of the primary key must depend upon the entire concatenated key for its existence. If any column depends 
	only on one part of the concatenated key, then the table fails <b>Second normal form</b>.</p>
	
	3rd NF:
	-------
	Third Normal form</b> applies that every non-prime attribute of table must be dependent on primary key. 
	The transitive functional dependency should be removed from the table. 
	
	BCNF :
	------
	BCNF is an extension of Third Normal Form in strict way. BCNF states that
    For any non-trivial functional dependency, X → A, then X must be a super-key.
    
    Table1 = Stu_ID  Stu_Name Zip
    Table2 = Zip City
    
    Stu_ID is super-key in Student_Detail relation and Zip is super-key in ZipCodes relation. So,
    Stu_ID → Stu_Name, Zip
    And
    Zip → City

	Confirms, that both relations are in BCNF.


	*/
	
}
