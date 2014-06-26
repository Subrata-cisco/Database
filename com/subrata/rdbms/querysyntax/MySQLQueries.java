package com.subrata.rdbms.querysyntax;
/**
 * 
 * @author Subrata Saha.
 *
 */
public class MySQLQueries {
 /*
 =======================================================
 
 Create Table :
 --------------
 CREATE TABLE tutorials_tbl(
    tutorial_id INT NOT NULL AUTO_INCREMENT,
    tutorial_title VARCHAR(100) NOT NULL,
    tutorial_author VARCHAR(40) NOT NULL,
    submission_date DATE,
    PRIMARY KEY ( tutorial_id )
    );
 
 Insert :
 --------
 INSERT INTO tutorials_tbl 
     (tutorial_title, tutorial_author, submission_date)
     VALUES
     ("Learn PHP", "John Poul", NOW());
     
 Update :
 --------
 UPDATE tutorials_tbl 
     SET tutorial_title='Learning JAVA' 
     WHERE tutorial_id=3;
     
 Delete :
 --------
 DELETE FROM tutorials_tbl WHERE tutorial_id=3;
 
 Index :
 -------
 A database index is a data structure that improves the speed of operations in a table. 
 Indexes can be created using one or more columns, providing the basis for both rapid 
 random lookups and efficient ordering of access to records.
 
 CREATE UNIQUE INDEX index_name
 ON table_name ( column1, column2);
 
 ALTER TABLE table_name ADD INDEX (cindex_name);
 
 ALTER TABLE table_name DROP INDEX (cindex_name);
 
 
 =======================================================
 */
}
