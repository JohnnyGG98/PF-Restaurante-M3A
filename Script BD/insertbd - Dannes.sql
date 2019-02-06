-- tipo_persona

INSERT INTO tipo_persona(
tipo_persona
)
VALUES('Empleado');

INSERT INTO tipo_persona(
tipo_persona
)
VALUES('Cliente');


INSERT INTO tipo_persona(
tipo_persona
)
VALUES('Administrador');



--personas
--1=empleado
--2=cliente
--3=administrador
INSERT INTO personas (
id_tipo_persona,cedula,nombre,apellido,fecha_nacimiento,direccion,correo,telefono,sexo,persona_elim)
VALUES(1,'0001','Ana', 'Gonzales', '1999/12/11','El vecino','a@gmail.com', 'F',false);

INSERT INTO personas (
id_tipo_persona,cedula,nombre,apellido,fecha_nacimiento,direccion,correo,telefono,sexo,persona_elim)
VALUES(1,'0002','Pedro', 'Gomez', '1997/15/09','Totoracocha','p@gmail.com', 'M',false);

INSERT INTO personas (
id_tipo_persona,cedula,nombre,apellido,fecha_nacimiento,direccion,correo,telefono,sexo,persona_elim)
VALUES(2,'0003','Erik', 'Torres', '1996/26/08','El Vergel','erik@gmail.com', 'M',false);

INSERT INTO personas (
id_tipo_persona,cedula,nombre,apellido,fecha_nacimiento,direccion,correo,telefono,sexo,persona_elim)
VALUES(2,'0004','Manuel', 'Tacuri', '1996/24/11','San Sebastian','manuel@gmail.com', 'M',false);


INSERT INTO personas (
id_tipo_persona,cedula,nombre,apellido,fecha_nacimiento,direccion,correo,telefono,sexo,persona_elim)
VALUES(3,'0004','Jessica', 'Torres', '1995/28/12','Monay','jessy@gmail.com', 'F',false);


INSERT INTO personas (
id_tipo_persona,cedula,nombre,apellido,fecha_nacimiento,direccion,correo,telefono,sexo,persona_elim)
VALUES(1,'0006','Juan', 'Torres', '1994/23/12','Monay','juan@gmail.com', 'M',false);

//calificaciones_plato

INSERT INTO calificaciones_plato(
id_persona,id_plato,numero_estrellas
)
VALUES(3,1,4);

INSERT INTO calificaciones_plato(
id_persona,id_plato,numero_estrellas
)
VALUES(3,2,5);

INSERT INTO calificaciones_plato(
id_persona,id_plato,numero_estrellas
)
VALUES(4,2,4);

INSERT INTO calificaciones_plato(
id_persona,id_plato,numero_estrellas
)
VALUES(4,3,5);

INSERT INTO calificaciones_plato(
id_persona,id_plato,numero_estrellas
)
VALUES(4,4,5);

--calificaciones_empleado

INSERT INTO calificaciones_empleado(
id_persona,id_empleado,calificacion
)
VALUES(3,1,4);

INSERT INTO calificaciones_empleado(
id_persona,id_empleado,calificacion
)
VALUES(4,2,5);

INSERT INTO calificaciones_empleado(
id_persona,id_empleado,calificacion
)
VALUES(3,1,5);

INSERT INTO calificaciones_empleado(
id_persona,id_empleado,calificacion
)
VALUES(3,2,4);

INSERT INTO calificaciones_empleado(
id_persona,id_empleado,calificacion
)
VALUES(4,1,2);

--usuarios
INSERT INTO usuarios(id_persona,username,clave,usuario_elim)
VALUES (1,'Useruno',bytea(md5('useruno')),false);

INSERT INTO usuarios(id_persona,username,clave,usuario_elim)
VALUES (2,'Userdos',bytea(md5('userdos')),false);

INSERT INTO usuarios(id_persona,username,clave,usuario_elim)
VALUES (5,'Usertres',bytea(md5('usertres')),false);

INSERT INTO usuarios(id_persona,username,clave,usuario_elim)
VALUES (6,'Usercuatro',bytea(md5('usercuatro')),false);

/*
INSERT INTO usuarios(id_persona,username,clave,usuario_elim)
VALUES (1,'Usercinco','usercinco',false);
*/

--cargos

INSERT INTO cargos(cargo,cargo_elim)
VALUES('Cajero',false);

INSERT INTO cargos(cargo,cargo_elim)
VALUES('Repartidor',false);

INSERT INTO cargos(cargo,cargo_elim)
VALUES('Mesero',false);

INSERT INTO cargos(cargo,cargo_elim)
VALUES('Cocinero',true;

INSERT INTO cargos(cargo,cargo_elim)
VALUES('Recepcionista',false);


--empleados

INSERT INTO empleados(
id_usuario,id_cargo,foto_empleado,empleado_elim
)
VALUES(1,1,null,false);

INSERT INTO empleados(
id_usuario,id_cargo,foto_empleado,empleado_elim
)
VALUES(2,3,null,false);




INSERT INTO empleados(
id_usuario,id_cargo,foto_empleado,empleado_elim
)
VALUES(4,2,null,false);
/*
INSERT INTO empleados(
id_usuario,id_cargo,foto_empleado,empleado_elim
)
VALUES(?,?,null,false);

INSERT INTO empleados(
id_empleado,id_usuario,id_cargo,foto_empleado,empleado_elim
)
VALUES(?,?,?,null,false);

*/

--calificacion_mesero

INSERT INTO calificacion_mesero(
id_empleado,numero_estrellas
);
VALUES(2,3);

/*
INSERT INTO calificacion_mesero(
id_empleado,numero_estrellas
);
VALUES(2,5);

INSERT INTO calificacion_mesero(
id_empleado,numero_estrellas
);
VALUES(2,4);

INSERT INTO calificacion_mesero(
id_empleado,numero_estrellas
);
VALUES(2,4);

INSERT INTO calificacion_mesero(
id_empleado,numero_estrellas
);
VALUES(2,4);
*/

--cajas
INSERT INTO cajas(
numero_caja,caja_elim
)
VALUES(01,false);

INSERT INTO cajas(
numero_caja,caja_elim
)
VALUES(02,false);

INSERT INTO cajas(
numero_caja,caja_elim
)
VALUES(03,false);


INSERT INTO cajas(
numero_caja,caja_elim
)
VALUES(04,false);

INSERT INTO cajas(
numero_caja,caja_elim
)
VALUES(05,false);

--historial_caja

INSERT INTO historial_caja(
id_empleado,id_caja,fecha,hora_abre,hora_cierra,dinero_abre,dinero_cierra,diferencia
)
VALUES(1,1,'2018/17/08','09:00:33','21:01:33',310,620,310);

INSERT INTO historial_caja(
id_empleado,id_caja,fecha,hora_abre,hora_cierra,dinero_abre,dinero_cierra,diferencia
)
VALUES(1,2,'2018/23/07','09:00:33','21:01:33',310,720,410);


INSERT INTO historial_caja(
id_empleado,id_caja,fecha,hora_abre,hora_cierra,dinero_abre,dinero_cierra,diferencia
)
VALUES(1,3,'2018/21/06','09:00:33','21:01:33',310,820,510);

INSERT INTO historial_caja(
id_empleado,id_caja,fecha,hora_abre,hora_cierra,dinero_abre,dinero_cierra,diferencia
)
VALUES(1,4,'2018/21/06','09:00:33','21:01:33',310,810,500);

INSERT INTO historial_caja(
id_empleado,id_caja,fecha,hora_abre,hora_cierra,dinero_abre,dinero_cierra,diferencia
)
VALUES(1,5,'2018/21/07','09:00:25','21:01:33',310,830,520);


--reportes_mensuales

INSERT INTO reportes_mensuales(
id_usuario,fecha_reporte,ingresos,egresos,diferencia,reporte_mensual_elim)
VALUES(3,'2019/23/02',1230,900,230,false);

INSERT INTO reportes_mensuales(
id_usuario,fecha_reporte,ingresos,egresos,diferencia,reporte_mensual_elim)
VALUES(3,'2018/27/11',4000,1500,2500,false);


INSERT INTO reportes_mensuales(
id_usuario,fecha_reporte,ingresos,egresos,diferencia,reporte_mensual_elim)
VALUES(3,'2018/22/12',4200,2000,2200,false);

INSERT INTO reportes_mensuales(
id_usuario,fecha_reporte,ingresos,egresos,diferencia,reporte_mensual_elim)
VALUES(3,'2018/24/08',2400,2300,100,false);

INSERT INTO reportes_mensuales(
id_usuario,fecha_reporte,ingresos,egresos,diferencia,reporte_mensual_elim)
VALUES(3,'2018/24/08',2000,3000,1000,false);

--reportes historial_ingreso


INSERT INTO historial_ingreso(
id_usuario,fecha_ingreso,hora_ingreso
)
VALUES(1,'2018/27/11','09:53:23');


INSERT INTO historial_ingreso(
id_usuario,fecha_ingreso,hora_ingreso
)
VALUES(2,'2018/22/12','11:12:05');


INSERT INTO historial_ingreso(
id_usuario,fecha_ingreso,hora_ingreso
)
VALUES(3,'2019/23/02','09:36:23');


INSERT INTO historial_ingreso(
id_usuario,fecha_ingreso,hora_ingreso
)
VALUES(1,'2018/19/03','11:38:34');


INSERT INTO historial_ingreso(
id_usuario,fecha_ingreso,hora_ingreso
)
VALUES(2,'2019/02/02','12:35:55');



--pedidos
INSERT INTO pedidos(id_factura,id_caja,direccion_entrega)
VALUES(1,1,'El vecino');

INSERT INTO pedidos(id_factura,id_caja,direccion_entrega)
VALUES(2,2,'Totoracocha');

INSERT INTO pedidos(id_factura,id_caja,direccion_entrega)
VALUES(3,3,'El Vergel');

/*
INSERT INTO pedidos(id_factura,id_caja,direccion_entrega)
VALUES(4,4,'San Sebastian');


INSERT INTO pedidos(id_factura,id_caja,direccion_entrega)
VALUES(5,5,'Monay');
*/

--entregas

INSERT INTO entregas(
id_empleado,id_pedido,fecha_entrega,hora_entrega,estado_entrega
)
VALUES(3,1,'2019/23/02','09:36:23',true);

INSERT INTO entregas(
,id_empleado,id_pedido,fecha_entrega,hora_entrega,estado_entrega
)
VALUES(3,2,'2018/27/06','20:38:43',true);

INSERT INTO entregas(
id_empleado,id_pedido,fecha_entrega,hora_entrega,estado_entrega
)
VALUES(3,3,'2019/23/02','11:12:23',true);


/*
INSERT INTO entregas(
id_empleado,id_pedido,fecha_entrega,hora_entrega,estado_entrega
)
VALUES(3,?,'2018/24/08','11:36:46',false);

INSERT INTO entregas(
id_empleado,id_pedido,fecha_entrega,hora_entrega,estado_entrega
)
VALUES(3,?,'2018/25/08','10:33:56',true);
*/


--menu


INSERT INTO menu (
id_producto,id_plato,categoria,precio_venta,tiene_iva,foto,menu_elim)
)
VALUES(1,5,'plato',2.50,false,null,true);

INSERT INTO menu (
id_producto,id_plato,categoria,precio_venta,tiene_iva,foto,menu_elim)
)
VALUES(2,4,'bebida',3.50,true,null,false);

INSERT INTO menu (
id_producto,id_plato,categoria,precio_venta,tiene_iva,foto,menu_elim)
)
VALUES(3,3,'plato',1.50,false,null,false);

INSERT INTO menu (
id_producto,id_plato,categoria,precio_venta,tiene_iva,foto,menu_elim)
)
VALUES(4,2,'bebida',2.50,true,null,false);

INSERT INTO menu (
id_producto,id_plato,categoria,precio_venta,tiene_iva,foto,menu_elim)
)
VALUES(5,1,'plato',1.50,false,null,false);
	
