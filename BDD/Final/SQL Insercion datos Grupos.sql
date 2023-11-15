INSERT INTO `PruebaClasificacionSocios`.`Socio` 
(`cedula`, `nombre`, `ciudad`, `usuario`, `clave`, `numero_de_servicios`, `promedio_de_calificacion`, `numero_de_amonestaciones`, `numero_de_felicitaciones`) 
VALUES
(1000, 'Juan Perez', 1, 'juan123', 'clave123', 10, 4.5, 2, 3),
(2000, 'Maria Rodriguez', 2, 'maria456', 'clave456', 8, 3.8, 1, 2),
(3000, 'Carlos Gomez', 1, 'carlos789', 'clave789', 12, 4.0, 0, 5),
(4000, 'Ana Martinez', 3, 'ana101', 'clave101', 15, 4.2, 3, 4),
(5000, 'Pedro Lopez', 2, 'pedro202', 'clave202', 20, 4.8, 1, 6),
(6000, 'Laura Herrera', 1, 'laura303', 'clave303', 18, 4.7, 2, 7),
(7000, 'Miguel Torres', 3, 'miguel404', 'clave404', 14, 4.1, 1, 3);

-- Insertar datos en la tabla Grupo
INSERT INTO `PruebaClasificacionSocios`.`Grupo` 
(`nombre_grupo`, `descripcion`, `criterio`, `valor_criterio`) 
VALUES
('Grupo A', 'Grupo de alto rendimiento', 'Número de servicios', 15),
('Grupo B', 'Grupo intermedio', 'Promedio de calificación', 4),
('Grupo C', 'Grupo principiante', 'Número de felicitaciones', 5),
('Grupo D', 'Grupo avanzado', 'Número de amonestaciones', 2),
('Grupo E', 'Grupo élite', 'Número de servicios', 18),
('Grupo F', 'Grupo estándar', 'Promedio de calificación', 4),
('Grupo G', 'Grupo de prueba', 'Número de felicitaciones', 3);


-- Insertar datos en la tabla GrupoSocio
INSERT INTO `PruebaClasificacionSocios`.`GrupoSocio` 
(`id_grupo`, `id_socio`) 
VALUES
(1, 1000),(1, 2000),(1, 3000),(1, 4000),
(2, 2000),(2, 3000),(2, 5000),(2, 7000),
(3, 3000),(3, 6000),
(4, 4000),(4, 5000),(4, 4000),
(5, 5000),
(6, 6000),(6, 5000),(6, 4000),(6, 3000),(6, 2000),(6, 1000), (6, 7000),
(7, 7000);

select * from socio;
select * from grupo;
select * from gruposocio;
