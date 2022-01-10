DROP TABLE IF EXISTS drink CASCADE;
CREATE TABLE `drink` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `age` bigint DEFAULT NULL,
  `brand` varchar(255) NOT NULL,
  `colour` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
);