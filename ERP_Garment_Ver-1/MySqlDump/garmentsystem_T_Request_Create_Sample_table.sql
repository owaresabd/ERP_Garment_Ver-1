-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: itp2016ver1fdgd.cht0bvbob1wj.us-west-2.rds.amazonaws.com    Database: garmentsystem
-- ------------------------------------------------------
-- Server version	5.6.27-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `T_Request_Create_Sample_table`
--

DROP TABLE IF EXISTS `T_Request_Create_Sample_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `T_Request_Create_Sample_table` (
  `SampleId` varchar(50) NOT NULL,
  `SampleName` varchar(50) NOT NULL,
  `StyleId` varchar(45) NOT NULL,
  `StyleDesc` varchar(250) NOT NULL,
  `SampleType` varchar(45) NOT NULL,
  `SampleGroup` varchar(45) NOT NULL,
  `SampleSize` varchar(45) NOT NULL,
  `SampleDesigner` varchar(45) NOT NULL,
  `NumberOfSamples` varchar(45) NOT NULL,
  `SampleGivenTo` varchar(45) NOT NULL,
  PRIMARY KEY (`SampleId`),
  UNIQUE KEY `SampleId_UNIQUE` (`SampleId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `T_Request_Create_Sample_table`
--

LOCK TABLES `T_Request_Create_Sample_table` WRITE;
/*!40000 ALTER TABLE `T_Request_Create_Sample_table` DISABLE KEYS */;
/*!40000 ALTER TABLE `T_Request_Create_Sample_table` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-03-04 12:05:25
