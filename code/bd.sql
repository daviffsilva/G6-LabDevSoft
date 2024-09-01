-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS mydb ;

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS mydb DEFAULT CHARACTER SET utf8 ;
USE mydb ;

-- -----------------------------------------------------
-- Table Disciplina
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Disciplina (
  codigo VARCHAR(255) NOT NULL,
  nome VARCHAR(255) NOT NULL,
  creditos INT NOT NULL,
  PRIMARY KEY (codigo))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table Curso
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Curso (
  idCurso INT NOT NULL,
  nome VARCHAR(45) NOT NULL,
  numeroDeCreditos INT NOT NULL,
  Disciplina_codigo VARCHAR(255) NOT NULL,
  PRIMARY KEY (idCurso),
    FOREIGN KEY (Disciplina_codigo)
    REFERENCES Disciplina (codigo)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table usuario
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS usuario (
  idUsuario VARCHAR(45) NOT NULL,
  login VARCHAR(255) NOT NULL,
  email VARCHAR(255) NOT NULL,
  senha VARCHAR(255) NOT NULL,
  PRIMARY KEY (idUsuario))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table aluno
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS aluno (
  matricula INT NOT NULL,
  Disciplina_codigo VARCHAR(255) NOT NULL,
  usuario_idUsuario VARCHAR(45) NOT NULL,
  PRIMARY KEY (matricula),
    FOREIGN KEY (Disciplina_codigo)
    REFERENCES Disciplina (codigo)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
    FOREIGN KEY (usuario_idUsuario)
    REFERENCES usuario (idUsuario)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table professor
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS professor (
  nome VARCHAR(255) NOT NULL,
  usuario_idUsuario VARCHAR(45) NOT NULL,
  PRIMARY KEY (usuario_idUsuario),
    FOREIGN KEY (usuario_idUsuario)
    REFERENCES usuario (idUsuario)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table turma
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS turma (
  codigo VARCHAR(255) NOT NULL,
  nome VARCHAR(255) NOT NULL,
  numeroDeAlunos INT NOT NULL,
  professor_usuario_idUsuario VARCHAR(45) NOT NULL,
  PRIMARY KEY (codigo),
    FOREIGN KEY (professor_usuario_idUsuario)
    REFERENCES professor (usuario_idUsuario)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table statusDisciplina
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS statusDisciplina (
  MATRICULA_ABERTA VARCHAR(255) NULL,
  CANCELADA VARCHAR(255) NULL,
  INICIADA VARCHAR(255) NULL,
  TERMINADA VARCHAR(45) NULL,
  Disciplina_codigo VARCHAR(255) NOT NULL,
    FOREIGN KEY (Disciplina_codigo)
    REFERENCES Disciplina (codigo)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table semestre
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS semestre (
  ano INT NOT NULL,
  periodo INT NOT NULL,
  semestrecol VARCHAR(45) NULL)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table mydb.semestre
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS mydb.semestre (
  ano INT NOT NULL,
  periodo INT NOT NULL,
  curriculo_idcurriculo INT NOT NULL,
    FOREIGN KEY (curriculo_idcurriculo)
    REFERENCES mydb.curriculo (idcurriculo))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table mydb.curriculo
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS mydb.curriculo (
  idcurriculo INT NOT NULL,
  Disciplina_codigo VARCHAR(255) NOT NULL,
  PRIMARY KEY (idcurriculo),
    FOREIGN KEY (Disciplina_codigo)
    REFERENCES mydb.Disciplina (codigo))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table aluno_has_turma
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS aluno_has_turma (
  aluno_matricula INT NOT NULL,
  turma_codigo VARCHAR(255) NOT NULL,
  PRIMARY KEY (aluno_matricula, turma_codigo),
    FOREIGN KEY (aluno_matricula)
    REFERENCES aluno (matricula)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
    FOREIGN KEY (turma_codigo)
    REFERENCES turma (codigo)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB