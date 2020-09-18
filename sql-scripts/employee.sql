CREATE DATABASE  IF NOT EXISTS `newvision-employee`;

use `newvision-employee`;

drop table if exists `employee`;

create table `employee`(
		`id` int(11) NOT NULL AUTO_INCREMENT,
		`first_name` varchar(45) DEFAULT NULL,
		`last_name` varchar(45) DEFAULT NULL,
		`address` varchar(150) DEFAULT NULL,
		`dob` date DEFAULT NULL,
		`mobileno` bigint(20) DEFAULT NULL,
		PRIMARY KEY (`id`)
		);

INSERT INTO `employee` VALUES
		(1,'Shreyas', 'Bhargava', 'Shivaji Nagar, Pune', '1988-05-21', 8899665544),
		(2,'Rohit', 'Sengar', 'Adarsh Nagar, Bhopal', '1995-11-28', 9865326598),
		(3,'Amey', 'Nagapure', 'Anand Nagar, Delhi', '1999-06-24', 7845128956),
		(4,'Harshad', 'Solanki', 'Camp Road, Amravati', '1998-05-02', 8956231245);


