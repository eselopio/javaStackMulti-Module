-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 14-03-2016 a las 04:43:41
-- Versión del servidor: 5.6.20
-- Versión de PHP: 5.5.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `tododb`
--
CREATE DATABASE IF NOT EXISTS `tododb` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `tododb`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `todotable`
--

DROP TABLE IF EXISTS `todotable`;
CREATE TABLE IF NOT EXISTS `todotable` (
`codigo` int(11) NOT NULL,
  `descripcion` varchar(15) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=9 ;

--
-- Volcado de datos para la tabla `todotable`
--

INSERT INTO `todotable` (`codigo`, `descripcion`) VALUES
(1, 'hola'),
(2, 'Segundo'),
(3, 'Tercero'),
(4, 'Cuarto'),
(5, 'Quinto');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `todotable`
--
ALTER TABLE `todotable`
 ADD PRIMARY KEY (`codigo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `todotable`
--
ALTER TABLE `todotable`
MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
