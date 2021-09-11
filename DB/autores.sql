create schema producto;
use producto;
DROP TABLE IF EXISTS `album`;
DROP TABLE IF EXISTS `cancion`;
DROP TABLE IF EXISTS `producto`;
DROP TABLE IF EXISTS `autor`;

CREATE TABLE `autor` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `nacionalidad` VARCHAR(45) NOT NULL,
  `tipo` ENUM('Solista', 'Grupo') DEFAULT "Solista",
  PRIMARY KEY (`id`));

INSERT INTO `autor` (`nombre`, `nacionalidad`, `tipo`)
VALUES ('Bratty', 'Mexicana', 'Solista');

INSERT INTO `autor` (`nombre`, `nacionalidad`, `tipo`)
VALUES ('Zoé', 'Mexicana', 'Grupo');

INSERT INTO `autor` (`nombre`, `nacionalidad`, `tipo`)
VALUES ('VIDEOCLUB', 'Francesa', 'Grupo');

INSERT INTO `autor` (`nombre`, `nacionalidad`, `tipo`)
VALUES ('Justin Bieber', 'Canadiense', 'Solista');

INSERT INTO `autor` (`nombre`, `nacionalidad`, `tipo`)
VALUES ('Camilo', 'Colombiana', 'Solista');

INSERT INTO `autor` (`nombre`, `nacionalidad`, `tipo`)
VALUES ('Bad Bunny', 'Puertorriqueño', 'Solista');

INSERT INTO `autor` (`nombre`, `nacionalidad`, `tipo`)
VALUES ('Depresión Sonora', 'Española', 'Grupo');

INSERT INTO `autor` (`nombre`, `nacionalidad`, `tipo`)
VALUES ('Linkin Park', 'Estadounidense', 'Grupo');

INSERT INTO `autor` (`nombre`, `nacionalidad`, `tipo`)
VALUES ('Canserbero', 'Venezolana ', 'Solista');