-- Insertar datos en la tabla `Ciudad`
INSERT INTO `Ciudad` (`codigo_postal`, `nombre`, `porcentaje_agregado`) VALUES
(12345, 'Ciudad Ejemplo', 5.5),
(54321, 'Otra Ciudad', 4.2);

-- Insertar datos en la tabla `Socio`
INSERT INTO `Socio` (`cedula`, `nombre`, `ciudad`, `usuario`, `clave`, `numero_de_servicios`, `promedio_de_calificacion`, `numero_de_amonestaciones`, `numero_de_felicitaciones`) VALUES
(123456789, 'Juan Pérez', 12345, 'juanperez123', 'clave123', 5, 4.7, 2, 3),
(987654321, 'María López', 54321, 'marialopez456', 'clave456', 10, 4.2, 1, 5);


-- Insertar datos en la tabla `Vehiculo`
INSERT INTO `Vehiculo` (`matricula`, `cedula_socio`, `tipo_vehiculo`, `capacidad`, `porcentaje_agregado`) VALUES
('ABC123', 123456789, 'Sedán', 4, 6.5),
('XYZ789', 987654321, 'SUV', 7, 8.2);

-- Insertar datos en la tabla `Servicio`
INSERT INTO `Servicio` (`id_servicio`, `cedula_socio`, `cedula_cliente`, `fecha_servicio`, `valor_servicio`, `calificacion_servicio`, `origen`, `destino`, `id_ciudad`) VALUES
(1, 123456789, 987654321, '2023-10-15', 50.0, 4.8, 'Origen 1', 'Destino 1', 12345),
(2, 987654321, 123456789, '2023-10-14', 60.0, 4.5, 'Origen 2', 'Destino 2', 54321);
