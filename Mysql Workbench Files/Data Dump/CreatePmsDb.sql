CREATE DATABASE  IF NOT EXISTS `pmsdb` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `pmsdb`;
-- MySQL dump 10.13  Distrib 8.0.13, for Win64 (x86_64)
--
-- Host: localhost    Database: pmsdb
-- ------------------------------------------------------
-- Server version	8.0.13

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `actionitems`
--

DROP TABLE IF EXISTS `actionitems`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `actionitems` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `description` varchar(500) DEFAULT NULL,
  `dateCreated` date NOT NULL,
  `dateAssigned` date NOT NULL,
  `expectedCompletionDate` date NOT NULL,
  `actualCompletionDate` date DEFAULT NULL,
  `status` varchar(50) NOT NULL,
  `statusDescription` varchar(500) DEFAULT NULL,
  `issue_ID` int(10) unsigned NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `actionitem_FK_issue` (`issue_ID`),
  CONSTRAINT `actionitem_FK_issue` FOREIGN KEY (`issue_ID`) REFERENCES `issues` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `daysavailable`
--

DROP TABLE IF EXISTS `daysavailable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `daysavailable` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `date` date NOT NULL,
  `startTime` time DEFAULT NULL,
  `endTime` time DEFAULT NULL,
  `resource_ID` int(10) unsigned NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `dayavailable_FK_resource` (`resource_ID`),
  CONSTRAINT `dayavailable_FK_resource` FOREIGN KEY (`resource_ID`) REFERENCES `resources` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `decisions`
--

DROP TABLE IF EXISTS `decisions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `decisions` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `description` varchar(500) DEFAULT NULL,
  `priority` varchar(50) NOT NULL,
  `impact` varchar(50) NOT NULL,
  `status` varchar(50) NOT NULL,
  `dateCreated` date NOT NULL,
  `dateNeeded` date DEFAULT NULL,
  `dateMade` date DEFAULT NULL,
  `noteDate` date DEFAULT NULL,
  `updateDate` date DEFAULT NULL,
  `expectedCompletionDate` date NOT NULL,
  `actualCompletionDate` date DEFAULT NULL,
  `issue_ID` int(10) unsigned NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk_decisions_issues1_idx` (`issue_ID`),
  CONSTRAINT `decision_FK_issue` FOREIGN KEY (`issue_ID`) REFERENCES `issues` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `deliverables`
--

DROP TABLE IF EXISTS `deliverables`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `deliverables` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `description` varchar(500) NOT NULL,
  `dueDate` date NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=79 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `issues`
--

DROP TABLE IF EXISTS `issues`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `issues` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `description` varchar(500) DEFAULT NULL,
  `priority` varchar(50) NOT NULL,
  `severity` varchar(50) NOT NULL,
  `status` varchar(50) NOT NULL,
  `statusDescription` varchar(500) DEFAULT NULL,
  `dateRaised` date NOT NULL,
  `dateAssigned` date NOT NULL,
  `expectedCompletionDate` date NOT NULL,
  `actualCompletionDate` date DEFAULT NULL,
  `updateDate` date DEFAULT NULL,
  `task_ID` int(10) unsigned NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk_issues_tasks1_idx` (`task_ID`),
  CONSTRAINT `issue_FK_task` FOREIGN KEY (`task_ID`) REFERENCES `tasks` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `meetingnotes`
--

DROP TABLE IF EXISTS `meetingnotes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `meetingnotes` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `note` varchar(500) NOT NULL,
  `decisions_ID` int(10) unsigned NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `meetingnote_FK_decision` (`decisions_ID`),
  CONSTRAINT `meetingnote_FK_decision` FOREIGN KEY (`decisions_ID`) REFERENCES `decisions` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `pageref`
--

DROP TABLE IF EXISTS `pageref`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `pageref` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `pageNumber` int(10) unsigned NOT NULL DEFAULT '1',
  `paragraph` int(10) unsigned NOT NULL DEFAULT '1',
  `isSourceLocation` tinyint(3) unsigned NOT NULL DEFAULT '0' COMMENT 'False = This is mapping to a client reference variable in the Requirements Java object.\nTrue = This is mapping to a source location variable in the Requirements Java object.',
  `requirement_ID` int(10) unsigned NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `pageref_FK_requirement` (`requirement_ID`),
  CONSTRAINT `pageref_FK_requirement` FOREIGN KEY (`requirement_ID`) REFERENCES `requirements` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `referencedocs`
--

DROP TABLE IF EXISTS `referencedocs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `referencedocs` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `decision_ID` int(10) unsigned NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk_referencedocs_decisions1_idx` (`decision_ID`),
  CONSTRAINT `referencedoc_FK_decision` FOREIGN KEY (`decision_ID`) REFERENCES `decisions` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `requirements`
--

DROP TABLE IF EXISTS `requirements`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `requirements` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `reqText` varchar(500) DEFAULT NULL,
  `sourceDoc` varchar(50) NOT NULL,
  `deliverable_ID` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk_requirements_deliverables1_idx` (`deliverable_ID`),
  CONSTRAINT `requirement_FK_deliverable` FOREIGN KEY (`deliverable_ID`) REFERENCES `deliverables` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `resources`
--

DROP TABLE IF EXISTS `resources`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `resources` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `title` varchar(50) NOT NULL,
  `payRate` decimal(13,4) NOT NULL,
  `actionitem_ID` int(10) unsigned DEFAULT NULL,
  `decisions_ID` int(10) unsigned DEFAULT NULL,
  `task_ID` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk_resources_actionitems1_idx` (`actionitem_ID`),
  KEY `fk_resources_decisions1_idx` (`decisions_ID`),
  KEY `fk_resources_tasks1_idx` (`task_ID`),
  CONSTRAINT `resource_FK_actionitem` FOREIGN KEY (`actionitem_ID`) REFERENCES `actionitems` (`id`),
  CONSTRAINT `resource_FK_decision` FOREIGN KEY (`decisions_ID`) REFERENCES `decisions` (`id`),
  CONSTRAINT `resource_FK_task` FOREIGN KEY (`task_ID`) REFERENCES `tasks` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `skills`
--

DROP TABLE IF EXISTS `skills`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `skills` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `skill` varchar(50) NOT NULL,
  `levelOfSkill` varchar(50) NOT NULL,
  `resource_ID` int(10) unsigned NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `skill_FK_resource` (`resource_ID`),
  CONSTRAINT `skill_FK_resource` FOREIGN KEY (`resource_ID`) REFERENCES `resources` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tasks`
--

DROP TABLE IF EXISTS `tasks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tasks` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `description` varchar(500) DEFAULT NULL,
  `expectedStartDate` date NOT NULL,
  `expectedEndDate` date NOT NULL,
  `actualEndDate` date DEFAULT NULL,
  `actualStartDate` date DEFAULT NULL,
  `expectedDuration` float unsigned NOT NULL,
  `actualDuration` float unsigned DEFAULT NULL,
  `expectedEffort` float unsigned NOT NULL,
  `actualEffort` float unsigned DEFAULT NULL,
  `completedEffort` float unsigned DEFAULT NULL,
  `percentComplete` float unsigned NOT NULL DEFAULT '0',
  `deliverable_ID` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk_tasks_deliverables1_idx` (`deliverable_ID`),
  CONSTRAINT `task_FK_deliverable` FOREIGN KEY (`deliverable_ID`) REFERENCES `deliverables` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-12-09 22:57:19
