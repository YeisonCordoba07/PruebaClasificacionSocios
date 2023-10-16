-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema PruebaClasificacionSocios
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema PruebaClasificacionSocios
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `PruebaClasificacionSocios` DEFAULT CHARACTER SET utf8 ;
USE `PruebaClasificacionSocios` ;

-- -----------------------------------------------------
-- Table `PruebaClasificacionSocios`.`Ciudad`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `PruebaClasificacionSocios`.`Ciudad` ;

CREATE TABLE IF NOT EXISTS `PruebaClasificacionSocios`.`Ciudad` (
  `codigo_postal` INT NOT NULL,
  `nombre` VARCHAR(30) NULL,
  `porcentaje_agregado` FLOAT NULL,
  PRIMARY KEY (`codigo_postal`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `PruebaClasificacionSocios`.`Socio`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `PruebaClasificacionSocios`.`Socio` ;

CREATE TABLE IF NOT EXISTS `PruebaClasificacionSocios`.`Socio` (
  `cedula` INT NOT NULL,
  `nombre` VARCHAR(30) NOT NULL,
  `ciudad` INT NULL,
  `usuario` VARCHAR(45) NULL,
  `clave` VARCHAR(45) NOT NULL,
  `numero_de_servicios` INT NULL,
  `promedio_de_calificacion` FLOAT NULL,
  `numero_de_amonestaciones` INT NULL,
  `numero_de_felicitaciones` INT NULL,
  PRIMARY KEY (`cedula`),
  INDEX `fk_Socio_Ciudad1_idx` (`ciudad` ASC) VISIBLE,
  CONSTRAINT `fk_Socio_Ciudad1`
    FOREIGN KEY (`ciudad`)
    REFERENCES `PruebaClasificacionSocios`.`Ciudad` (`codigo_postal`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `PruebaClasificacionSocios`.`Vehiculo`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `PruebaClasificacionSocios`.`Vehiculo` ;

CREATE TABLE IF NOT EXISTS `PruebaClasificacionSocios`.`Vehiculo` (
  `matricula` VARCHAR(6) NOT NULL,
  `cedula_socio` INT NOT NULL,
  `tipo_vehiculo` VARCHAR(45) NOT NULL,
  `capacidad` INT NOT NULL,
  `porcentaje_agregado` FLOAT NULL,
  PRIMARY KEY (`matricula`),
  INDEX `fk_Vehiculo_Socio_idx` (`cedula_socio` ASC) VISIBLE,
  CONSTRAINT `fk_Vehiculo_Socio`
    FOREIGN KEY (`cedula_socio`)
    REFERENCES `PruebaClasificacionSocios`.`Socio` (`cedula`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `PruebaClasificacionSocios`.`Ciudad`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `PruebaClasificacionSocios`.`Ciudad` ;

CREATE TABLE IF NOT EXISTS `PruebaClasificacionSocios`.`Ciudad` (
  `codigo_postal` INT NOT NULL,
  `nombre` VARCHAR(30) NULL,
  `porcentaje_agregado` FLOAT NULL,
  PRIMARY KEY (`codigo_postal`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `PruebaClasificacionSocios`.`Servicio`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `PruebaClasificacionSocios`.`Servicio` ;

CREATE TABLE IF NOT EXISTS `PruebaClasificacionSocios`.`Servicio` (
  `id_servicio` INT NOT NULL,
  `cedula_socio` INT NOT NULL,
  `cedula_cliente` INT NOT NULL,
  `fecha_servicio` DATE NULL,
  `valor_servicio` FLOAT NOT NULL,
  `calificacion_servicio` FLOAT NULL,
  `origen` VARCHAR(45) NOT NULL,
  `destino` VARCHAR(45) NOT NULL,
  `id_ciudad` INT NOT NULL,
  PRIMARY KEY (`id_servicio`),
  INDEX `fk_Servicio_Ciudad1_idx` (`id_ciudad` ASC) VISIBLE,
  INDEX `fk_Servicio_Socio1_idx` (`cedula_socio` ASC) VISIBLE,
  CONSTRAINT `fk_Servicio_Ciudad1`
    FOREIGN KEY (`id_ciudad`)
    REFERENCES `PruebaClasificacionSocios`.`Ciudad` (`codigo_postal`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Servicio_Socio1`
    FOREIGN KEY (`cedula_socio`)
    REFERENCES `PruebaClasificacionSocios`.`Socio` (`cedula`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
