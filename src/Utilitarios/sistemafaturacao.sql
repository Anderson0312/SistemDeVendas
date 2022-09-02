-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 25-Ago-2022 às 21:29
-- Versão do servidor: 10.4.22-MariaDB
-- versão do PHP: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `sistemafaturacao`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `clientes`
--

CREATE TABLE `clientes` (
  `idCliente` varchar(10) NOT NULL,
  `nome` varchar(30) NOT NULL,
  `sNome` varchar(30) NOT NULL,
  `endereco` varchar(50) NOT NULL,
  `email` varchar(100) NOT NULL,
  `telefone` varchar(30) NOT NULL,
  `cidade` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `clientes`
--

INSERT INTO `clientes` (`idCliente`, `nome`, `sNome`, `endereco`, `email`, `telefone`, `cidade`) VALUES
('1', 'anderson', 'moura', 'rua monjolos', 'andersonmoura812@gmail.com', '2198949431', 1),
('2', 'luis', 'moura', 'rua monjolos', 'wadawdawd@gmail.com', '2100000000', 2);

-- --------------------------------------------------------

--
-- Estrutura da tabela `detalhesfatura`
--

CREATE TABLE `detalhesfatura` (
  `idFatura` int(11) NOT NULL,
  `idLinha` int(11) NOT NULL,
  `idProduto` varchar(12) NOT NULL,
  `descricao` varchar(50) NOT NULL,
  `preco` int(11) NOT NULL,
  `quantidade` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `fatura`
--

CREATE TABLE `fatura` (
  `idFatura` int(11) NOT NULL,
  `idCliente` varchar(10) NOT NULL,
  `data` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `produtos`
--

CREATE TABLE `produtos` (
  `idProduto` varchar(12) NOT NULL,
  `descricao` varchar(50) NOT NULL,
  `preco` int(11) NOT NULL,
  `imposto` int(11) NOT NULL,
  `anotacao` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `produtos`
--

INSERT INTO `produtos` (`idProduto`, `descricao`, `preco`, `imposto`, `anotacao`) VALUES
('1', 'refrigerante', 20, 1, 'refrigerante em litro'),
('2', 'carne', 50, 1, 'carne bovina');

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuarios`
--

CREATE TABLE `usuarios` (
  `idUsuario` varchar(10) NOT NULL,
  `nome` varchar(30) NOT NULL,
  `sobreNome` varchar(30) NOT NULL,
  `senha` varchar(10) NOT NULL,
  `idPerfil` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `usuarios`
--

INSERT INTO `usuarios` (`idUsuario`, `nome`, `sobreNome`, `senha`, `idPerfil`) VALUES
('and123', 'anderson', 'moura', '123', 1),
('and1234', 'andersonM', 'nascimento', '123', 2);

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`idCliente`);

--
-- Índices para tabela `detalhesfatura`
--
ALTER TABLE `detalhesfatura`
  ADD PRIMARY KEY (`idFatura`,`idLinha`);

--
-- Índices para tabela `fatura`
--
ALTER TABLE `fatura`
  ADD PRIMARY KEY (`idFatura`);

--
-- Índices para tabela `produtos`
--
ALTER TABLE `produtos`
  ADD PRIMARY KEY (`idProduto`);

--
-- Índices para tabela `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`idUsuario`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
