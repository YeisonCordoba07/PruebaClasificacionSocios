  -- Insertar datos en la tabla Ciudad
INSERT INTO Ciudad (codigo_postal, nombre, porcentaje_agregado) VALUES (12345, 'Ciudad A', 10.5);
INSERT INTO Ciudad (codigo_postal, nombre, porcentaje_agregado) VALUES(54321, 'Ciudad B', 8.2);
INSERT INTO Ciudad (codigo_postal, nombre, porcentaje_agregado) VALUES    (67890, 'Ciudad C', 12.8);
INSERT INTO Ciudad (codigo_postal, nombre, porcentaje_agregado) VALUES(98765, 'Ciudad D', 9.3);
INSERT INTO Ciudad (codigo_postal, nombre, porcentaje_agregado) VALUES(23456, 'Ciudad E', 11.0);
INSERT INTO Ciudad (codigo_postal, nombre, porcentaje_agregado) VALUES(34567, 'Ciudad F', 7.6);

select * from Ciudad;
  -- Insertar datos en la tabla Socio
INSERT INTO Socio (cedula, nombre, ciudad, usuario, clave, numero_de_servicios, promedio_de_calificacion, numero_de_amonestaciones, numero_de_felicitaciones) VALUES
    (1000, 'Juan Perez', 12345, 'juanperez123', 'clave123', 5, 4.2, 2, 3);
INSERT INTO Socio (cedula, nombre, ciudad, usuario, clave, numero_de_servicios, promedio_de_calificacion, numero_de_amonestaciones, numero_de_felicitaciones) VALUES
    (2000, 'Ana Rodriguez', 54321, 'anarodriguez', 'clave456', 8, 3.8, 1, 5);
INSERT INTO Socio (cedula, nombre, ciudad, usuario, clave, numero_de_servicios, promedio_de_calificacion, numero_de_amonestaciones, numero_de_felicitaciones) VALUES
    (3000, 'Pedro Gomez', 67890, 'pedrogomez', 'clave789', 4, 4.0, 0, 2);
INSERT INTO Socio (cedula, nombre, ciudad, usuario, clave, numero_de_servicios, promedio_de_calificacion, numero_de_amonestaciones, numero_de_felicitaciones) VALUES
    (4000, 'María Sánchez', 98765, 'mariasanchez', 'clave111', 10, 4.5, 1, 6);
INSERT INTO Socio (cedula, nombre, ciudad, usuario, clave, numero_de_servicios, promedio_de_calificacion, numero_de_amonestaciones, numero_de_felicitaciones) VALUES
    (5000, 'Luis Ramirez', 23456, 'luisramirez', 'clave222', 6, 4.1, 3, 4);
INSERT INTO Socio (cedula, nombre, ciudad, usuario, clave, numero_de_servicios, promedio_de_calificacion, numero_de_amonestaciones, numero_de_felicitaciones) VALUES
    (6000, 'Laura Martinez', 34567, 'lauramartinez', 'clave333', 7, 4.3, 1, 4);

select * from Socio;
  
  -- Insertar datos en la tabla Vehiculo
INSERT INTO Vehiculo (matricula, cedula_socio, tipo_vehiculo, capacidad, porcentaje_agregado) VALUES 
    ('ABC123', 1000, 'Automóvil', 5, 5.0);
INSERT INTO Vehiculo (matricula, cedula_socio, tipo_vehiculo, capacidad, porcentaje_agregado) VALUES 
    ('XYZ789', 2000, 'Camioneta', 7, 4.5);
INSERT INTO Vehiculo (matricula, cedula_socio, tipo_vehiculo, capacidad, porcentaje_agregado) VALUES
    ('DEF456', 3000, 'Motocicleta', 2, 4.2);
INSERT INTO Vehiculo (matricula, cedula_socio, tipo_vehiculo, capacidad, porcentaje_agregado) VALUES 
    ('GHI789', 4000, 'Automóvil', 4, 4.9);
INSERT INTO Vehiculo (matricula, cedula_socio, tipo_vehiculo, capacidad, porcentaje_agregado) VALUES
    ('JKL321', 5000, 'Camioneta', 6, 4.7);
INSERT INTO Vehiculo (matricula, cedula_socio, tipo_vehiculo, capacidad, porcentaje_agregado) VALUES
    ('MNO987', 6000, 'Motocicleta', 2, 4.0);
    
select * from vehiculo;


-- Insertar datos en la tabla Servicio
INSERT INTO Servicio (id_servicio, cedula_socio, cedula_cliente, fecha_servicio, valor_servicio, calificacion_servicio, origen, destino, id_ciudad) VALUES
    (1, 1000, 101, '2023-01-10', 500, 48, 'Origen A', 'Destino B', 12345);
INSERT INTO Servicio (id_servicio, cedula_socio, cedula_cliente, fecha_servicio, valor_servicio, calificacion_servicio, origen, destino, id_ciudad) VALUES
    (2, 2000, 102, '2023-01-15', 75.0, 3.9, 'Origen C', 'Destino D', 54321);
INSERT INTO Servicio (id_servicio, cedula_socio, cedula_cliente, fecha_servicio, valor_servicio, calificacion_servicio, origen, destino, id_ciudad) VALUES
    (3, 3000, 103, '2023-01-20', 30.0, 4.2, 'Origen E', 'Destino F', 67890);
INSERT INTO Servicio (id_servicio, cedula_socio, cedula_cliente, fecha_servicio, valor_servicio, calificacion_servicio, origen, destino, id_ciudad) VALUES
    (4, 4000, 104, '2023-01-25', 90.0, 4.6, 'Origen G', 'Destino H', 98765);
INSERT INTO Servicio (id_servicio, cedula_socio, cedula_cliente, fecha_servicio, valor_servicio, calificacion_servicio, origen, destino, id_ciudad) VALUES
    (5, 5000, 105, '2023-02-01', 60.0, 4.4, 'Origen I', 'Destino J', 23456);
INSERT INTO Servicio (id_servicio, cedula_socio, cedula_cliente, fecha_servicio, valor_servicio, calificacion_servicio, origen, destino, id_ciudad) VALUES
    (6, 6000, 106, '2023-02-05', 40.0, 3.7, 'Origen K', 'Destino L', 34567);

select * from Servicio;
