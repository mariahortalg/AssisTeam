-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Historial clinico`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Historial clinico` (
  `edad` INT NOT NULL COMMENT '',
  `peso` INT NULL COMMENT '',
  `altura` INT NULL COMMENT '',
  `alergias` VARCHAR(45) NULL COMMENT '',
  `grupo sanguineo` VARCHAR(45) NULL COMMENT '',
  `donante de organos` VARCHAR(45) NULL COMMENT '',
  `medicacion` VARCHAR(45) NULL COMMENT '',
  `discapacidad` VARCHAR(45) NULL COMMENT '',
  `porcentaje de movilidad` VARCHAR(45) NULL COMMENT '',
  `antecedentes medicos` VARCHAR(45) NULL COMMENT '',
  PRIMARY KEY (`edad`)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Servicio`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Servicio` (
  `idServicio` INT NOT NULL COMMENT '',
  `nombre` VARCHAR(45) NULL COMMENT '',
  `descripcion` VARCHAR(45) NULL COMMENT '',
  PRIMARY KEY (`idServicio`)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Usuario` (
  `idUsuario` INT NOT NULL COMMENT '',
  `nombre` VARCHAR(45) NULL COMMENT '',
  `apellido1` VARCHAR(45) NULL COMMENT '',
  `apellido2` VARCHAR(45) NULL COMMENT '',
  `telefono` INT NULL COMMENT '',
  `direccion` VARCHAR(45) NULL COMMENT '',
  `contactoEmergencia1` VARCHAR(45) NULL COMMENT '',
  `contactoEmergencia2` VARCHAR(45) NULL COMMENT '',
  `Historial clinico_edad` INT NOT NULL COMMENT '',
  `Servicio_idServicio` INT NOT NULL COMMENT '',
  PRIMARY KEY (`idUsuario`)  COMMENT '',
  INDEX `fk_Usuario_Historial clinico1_idx` (`Historial clinico_edad` ASC)  COMMENT '',
  INDEX `fk_Usuario_Servicio1_idx` (`Servicio_idServicio` ASC)  COMMENT '',
  CONSTRAINT `fk_Usuario_Historial clinico1`
    FOREIGN KEY (`Historial clinico_edad`)
    REFERENCES `mydb`.`Historial clinico` (`edad`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Usuario_Servicio1`
    FOREIGN KEY (`Servicio_idServicio`)
    REFERENCES `mydb`.`Servicio` (`idServicio`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`AssisTeam`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`AssisTeam` (
  `listaUsuarios` INT NOT NULL COMMENT '',
  `listaServicios` VARCHAR(45) NULL COMMENT '',
  `Usuario_idUsuario` INT NOT NULL COMMENT '',
  `Servicio_idServicio` INT NOT NULL COMMENT '',
  PRIMARY KEY (`listaUsuarios`)  COMMENT '',
  INDEX `fk_AssisTeam_Usuario_idx` (`Usuario_idUsuario` ASC)  COMMENT '',
  INDEX `fk_AssisTeam_Servicio1_idx` (`Servicio_idServicio` ASC)  COMMENT '',
  CONSTRAINT `fk_AssisTeam_Usuario`
    FOREIGN KEY (`Usuario_idUsuario`)
    REFERENCES `mydb`.`Usuario` (`idUsuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_AssisTeam_Servicio1`
    FOREIGN KEY (`Servicio_idServicio`)
    REFERENCES `mydb`.`Servicio` (`idServicio`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Evento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Evento` (
  `idEvento` INT NOT NULL COMMENT '',
  `nombre` VARCHAR(45) NULL COMMENT '',
  `descripcion` VARCHAR(45) NULL COMMENT '',
  `Usuario_idUsuario` INT NOT NULL COMMENT '',
  PRIMARY KEY (`idEvento`, `Usuario_idUsuario`)  COMMENT '',
  INDEX `fk_Evento_Usuario1_idx` (`Usuario_idUsuario` ASC)  COMMENT '',
  CONSTRAINT `fk_Evento_Usuario1`
    FOREIGN KEY (`Usuario_idUsuario`)
    REFERENCES `mydb`.`Usuario` (`idUsuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Fecha`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Fecha` (
  `dia` INT NOT NULL COMMENT '',
  `mes` INT NULL COMMENT '',
  `anho` INT NULL COMMENT '',
  `Evento_idEvento` INT NOT NULL COMMENT '',
  PRIMARY KEY (`dia`)  COMMENT '',
  INDEX `fk_Fecha_Evento1_idx` (`Evento_idEvento` ASC)  COMMENT '',
  CONSTRAINT `fk_Fecha_Evento1`
    FOREIGN KEY (`Evento_idEvento`)
    REFERENCES `mydb`.`Evento` (`idEvento`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Modalidad`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Modalidad` (
  `idModalidad` INT NOT NULL COMMENT '',
  `descripcion` VARCHAR(45) NULL COMMENT '',
  `Servicio_idServicio` INT NOT NULL COMMENT '',
  PRIMARY KEY (`idModalidad`)  COMMENT '',
  INDEX `fk_Modalidad_Servicio1_idx` (`Servicio_idServicio` ASC)  COMMENT '',
  CONSTRAINT `fk_Modalidad_Servicio1`
    FOREIGN KEY (`Servicio_idServicio`)
    REFERENCES `mydb`.`Servicio` (`idServicio`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
