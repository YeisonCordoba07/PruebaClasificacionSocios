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
  PRIMARY KEY (`cedula`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `PruebaClasificacionSocios`.`Grupo`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `PruebaClasificacionSocios`.`Grupo` ;

CREATE TABLE IF NOT EXISTS `PruebaClasificacionSocios`.`Grupo` (
  `id_grupo` INT NOT NULL AUTO_INCREMENT,
  `nombre_grupo` VARCHAR(45) NULL,
  `descripcion` VARCHAR(45) NULL,
  `criterio` VARCHAR(45) NULL,
  `valor_criterio` INT NULL,
  PRIMARY KEY (`id_grupo`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `PruebaClasificacionSocios`.`GrupoSocio`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `PruebaClasificacionSocios`.`GrupoSocio` ;

CREATE TABLE IF NOT EXISTS `PruebaClasificacionSocios`.`GrupoSocio` (
  `id_socio_grupo` INT NOT NULL AUTO_INCREMENT,
  `id_grupo` INT NULL,
  `id_socio` INT NOT NULL,
  PRIMARY KEY (`id_socio_grupo`),
  INDEX `fk_GrupoSocio_Grupo_idx` (`id_grupo` ASC) VISIBLE,
  INDEX `fk_GrupoSocio_Socio1_idx` (`id_socio` ASC) VISIBLE,
  CONSTRAINT `fk_GrupoSocio_Grupo`
    FOREIGN KEY (`id_grupo`)
    REFERENCES `PruebaClasificacionSocios`.`Grupo` (`id_grupo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_GrupoSocio_Socio1`
    FOREIGN KEY (`id_socio`)
    REFERENCES `PruebaClasificacionSocios`.`Socio` (`cedula`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
