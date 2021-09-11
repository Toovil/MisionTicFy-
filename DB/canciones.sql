
CREATE TABLE `cancion` (
  `id` int NOT NULL AUTO_INCREMENT,
  `duracion` int NOT NULL,
  `tiene_colaboracion` boolean NOT NULL,
  `producto_id` int NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `FK_producto_id` FOREIGN KEY (`producto_id`) REFERENCES `producto` (`id`)
);

INSERT INTO `producto` (`nombre`, `precio`, `genero`, `autor_id`)
VALUES ('Honey, no estás', 1500, 'Pop', 1);
INSERT INTO `cancion` (`duracion`, `tiene_colaboracion`, `producto_id`)
VALUES (270, FALSE,  1);

INSERT INTO `producto` (`nombre`, `precio`, `genero`, `autor_id`)
VALUES ('Love', 3000, 'Rock', 2);
INSERT INTO `cancion` (`duracion`, `tiene_colaboracion`, `producto_id`)
VALUES (120, FALSE,  2);

INSERT INTO `producto` (`nombre`, `precio`, `genero`, `autor_id`)
VALUES ('Roi', 2000, 'Electropop', 3);
INSERT INTO `cancion` (`duracion`, `tiene_colaboracion`, `producto_id`)
VALUES (260, FALSE,  3);

INSERT INTO `producto` (`nombre`, `precio`, `genero`, `autor_id`)
VALUES ('Stay', 5000, 'Pop', 4);
INSERT INTO `cancion` (`duracion`, `tiene_colaboracion`, `producto_id`)
VALUES (157, TRUE,  4);

INSERT INTO `producto` (`nombre`, `precio`, `genero`, `autor_id`)
VALUES ('Favorito', 2500, 'Pop latino', 5);
INSERT INTO `cancion` (`duracion`, `tiene_colaboracion`, `producto_id`)
VALUES (210, FALSE,  5);