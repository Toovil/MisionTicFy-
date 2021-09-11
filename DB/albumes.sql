CREATE TABLE `album` (
  `id` int NOT NULL AUTO_INCREMENT,
  `numero_canciones` int NOT NULL,
  `rating` decimal(2,1) NOT NULL,
  `producto_id` int NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `FK_producto_id_album` FOREIGN KEY (`producto_id`) REFERENCES `producto` (`id`)
);

INSERT INTO `producto` (`nombre`, `precio`, `genero`, `autor_id`)
VALUES ('X 100pre', 20000, 'Trap', 6);
INSERT INTO `album` (`numero_canciones`, `rating`, `producto_id`)
VALUES (13, 9.5,  6);

INSERT INTO `producto` (`nombre`, `precio`, `genero`, `autor_id`)
VALUES ('Historias tristes para dormir bien', 10000, 'Post-punk', 7);
INSERT INTO `album` (`numero_canciones`, `rating`, `producto_id`)
VALUES (5, 9,  7);

INSERT INTO `producto` (`nombre`, `precio`, `genero`, `autor_id`)
VALUES ('Purpose', 40000, 'Pop', 4);
INSERT INTO `album` (`numero_canciones`, `rating`, `producto_id`)
VALUES (18, 9.3,  8);

INSERT INTO `producto` (`nombre`, `precio`, `genero`, `autor_id`)
VALUES ('Living Things', 25000, 'Rock alternativo', 8);
INSERT INTO `album` (`numero_canciones`, `rating`, `producto_id`)
VALUES (8, 9.8,  9);

INSERT INTO `producto` (`nombre`, `precio`, `genero`, `autor_id`)
VALUES ('Vida', 26500, 'Rap', 9);
INSERT INTO `album` (`numero_canciones`, `rating`, `producto_id`)
VALUES (13, 9.9,  10);