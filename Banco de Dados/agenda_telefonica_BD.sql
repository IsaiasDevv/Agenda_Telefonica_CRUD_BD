-- MySQL dump 10.13  Distrib 8.0.46, for Win64 (x86_64)
--
-- Host: localhost    Database: agenda_telefonica
-- ------------------------------------------------------
-- Server version	8.0.46

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `contatos`
--

DROP TABLE IF EXISTS `contatos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `contatos` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `telefone` varchar(20) NOT NULL,
  `email` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contatos`
--

LOCK TABLES `contatos` WRITE;
/*!40000 ALTER TABLE `contatos` DISABLE KEYS */;
INSERT INTO `contatos` VALUES (1,'Ana Paula Silva','(62)99111-1001','ana.silva@email.com'),(2,'Bruno Oliveira','(62)99111-1002','bruno.oliveira@email.com'),(3,'Carlos Henrique Souza','(62)99111-1003','carlos.souza@email.com'),(4,'Daniela Martins','(62)99111-1004','daniela.martins@email.com'),(5,'Eduardo Ferreira','(62)99111-1005','eduardo.ferreira@email.com'),(6,'Fernanda Costa','(62)99111-1006','fernanda.costa@email.com'),(7,'Gabriel Almeida','(62)99111-1007','gabriel.almeida@email.com'),(8,'Helena Rodrigues','(62)99111-1008','helena.rodrigues@email.com'),(9,'Igor Barbosa','(62)99111-1009','igor.barbosa@email.com'),(10,'Juliana Pereira','(62)99111-1010','juliana.pereira@email.com'),(11,'Lucas Gomes','(62)99111-1011','lucas.gomes@email.com'),(12,'Mariana Carvalho','(62)99111-1012','mariana.carvalho@email.com'),(13,'Nicolas Santos','(62)99111-1013','nicolas.santos@email.com'),(14,'Patricia Lima','(62)99111-1014','patricia.lima@email.com'),(15,'Rafael Mendes','(62)99111-1015','rafael.mendes@email.com'),(16,'Sabrina Rocha','(62)99111-1016','sabrina.rocha@email.com'),(17,'Thiago Castro','(62)99111-1017','thiago.castro@email.com'),(18,'Vanessa Araujo','(62)99111-1018','vanessa.araujo@email.com'),(19,'Wellington Dias','(62)99111-1019','wellington.dias@email.com'),(20,'Yasmin Fernandes','(62)99111-1020','yasmin.fernandes@email.com');
/*!40000 ALTER TABLE `contatos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2026-06-16 12:11:38
