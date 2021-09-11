CREATE TABLE `producto` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `precio` int NOT NULL,
  `genero` varchar(45) NOT NULL,
  `autor_id` int NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `FK_autor_id` FOREIGN KEY (`autor_id`) REFERENCES `autor` (`id`)
);