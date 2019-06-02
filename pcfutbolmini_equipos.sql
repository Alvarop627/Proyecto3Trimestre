-- MySQL dump 10.13  Distrib 8.0.16, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: pcfutbolmini
-- ------------------------------------------------------
-- Server version	8.0.16

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
-- Table structure for table `equipos`
--

DROP TABLE IF EXISTS `equipos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `equipos` (
  `nombre` varchar(40) NOT NULL,
  `puntos` int(3) DEFAULT NULL,
  `gf` int(3) DEFAULT NULL,
  `gc` int(3) DEFAULT NULL,
  `pj` int(2) DEFAULT NULL,
  `victorias` int(2) DEFAULT NULL,
  `empates` int(2) DEFAULT NULL,
  `derrotas` int(2) DEFAULT NULL,
  `division` varchar(40) DEFAULT NULL,
  `miEquipo` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`nombre`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `equipos`
--

LOCK TABLES `equipos` WRITE;
/*!40000 ALTER TABLE `equipos` DISABLE KEYS */;
INSERT INTO `equipos` VALUES ('Aston Birras',16,21,30,18,4,4,10,'Segunda Division',0),('Bayern de los caidos',31,28,22,18,9,4,5,'Tercera Division',0),('Blackvodk Rovers',34,29,13,18,10,4,4,'Primera Division',0),('CSKA La Ropa',23,19,23,18,6,5,7,'Segunda Division',0),('Deportivo Trago Corto',44,38,12,18,14,2,2,'Primera Division',0),('Drink Team',24,19,20,18,6,6,6,'Segunda Division',0),('Esfinter de Milan',18,21,29,18,5,3,10,'Primera Division',0),('Estrella Coja',6,9,35,18,1,3,14,'Tercera Division',0),('Hannover Ná',24,22,21,18,6,6,6,'Primera Division',0),('Harto de Berlin',33,29,14,18,10,3,5,'Segunda Division',0),('Kentucky Fried Football',17,19,25,18,4,5,9,'Tercera Division',0),('Lisiados FC',39,36,14,18,12,3,3,'Segunda Division',0),('Maccabi de Levantar',17,31,38,18,4,5,9,'Primera Division',0),('Mambo FC',49,40,7,18,16,1,1,'Segunda Division',0),('Muppet',20,22,26,18,5,5,8,'Tercera Division',0),('Newpi',26,27,26,18,7,5,6,'Tercera Division',0),('Nottingham Prisa',38,33,21,18,11,5,2,'Primera Division',0),('PES United',8,14,45,18,2,2,14,'Tercera Division',0),('Rayo Vayacaño',24,27,27,18,6,6,6,'Tercera Division',0),('Real Barril',31,26,16,18,9,4,5,'Segunda Division',0),('Real Suciedad',9,13,39,18,2,3,13,'Segunda Division',0),('Recreativo de Juerga',30,31,25,18,9,3,6,'Primera Division',0),('River Fake',17,20,37,18,4,5,9,'Tercera Division',0),('San Francis',20,20,29,18,5,5,8,'Tercera Division',0),('Schalke Temeto',8,11,32,18,1,5,12,'Tercera Division',0),('Spartak de reir',20,15,26,18,6,2,10,'Segunda Division',0),('Steagua de Grifo',18,22,31,18,4,6,8,'Primera Division',0),('Vater de Munich',33,27,14,18,10,3,5,'Primera Division',0),('Vodka Juniors',47,39,12,18,15,2,1,'Primera Division',0),('Werder Efilón',27,22,21,18,8,3,7,'Segunda Division',0);
/*!40000 ALTER TABLE `equipos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-06-03  0:40:46
