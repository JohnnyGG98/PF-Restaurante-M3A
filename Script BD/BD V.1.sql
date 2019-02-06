/*
Scrip Lina 
*/
--Proveedor
CREATE TABLE "proveedor"(
	"id_proveedor" serial NOT NULL, 
	"ruc" character varying(13) NOT NULL,
	"nombre" character varying(30) NOT NULL, 
	"direccion" character varying(50) NOT NULL, 
	"telefono" character varying(15) NOT NULL, 
	"proveedor_elim" boolean NOT NULL DEFAULT 'false', 
	CONSTRAINT proveedor_pk PRIMARY KEY ("id_proveedor")
) WITH (OIDS = FALSE); 

--Facturas_Compra
CREATE TABLE "facturas_compra"(
	"id_factura_compra" serial NOT NULL, 
	"id_proveedor" Integer NOT NULL,
	"id_empleado" Integer NOT NULL, 
	"fecha" Date NOT NULL, 
	"hora" Time NOT NULL, 
	"total" numeric(5, 2) NOT NULL, 
	"numfactura" Integer NOT NULL, 
	"factura_compra_elim" Boolean NOT NULL DEFAULT 'false', 
	"ruc_proveedor" character varying(13) NOT NULL, 
	"nombre_proveedor" character varying(30) NOT NULL, 
	"direccion_proveedor" character varying(50) NOT NULL, 
	"telefono_proveedor" character varying(13) NOT NULL, 
	CONSTRAINT factura_compra_pk PRIMARY KEY ("id_factura_compra")
) WITH (OIDS = FALSE); 

--Stock
CREATE TABLE "stock"(
	"id_stock" serial NOT NULL, 
	"id_producto" Integer NOT NULL, 
	"cantidad" Integer NOT NULL, 
	CONSTRAINT stock_pk PRIMARY KEY ("id_stock")
) WITH (OIDS = FALSE); 

--Perecibles
CREATE TABLE "perecibles"(
	"id_perecible" serial NOT NULL, 
	"id_stock" Integer NOT NULL,
	"fecha_elaboracion" Date NOT NULL, 
	"fecha_caducidad" Date NOT NULL, 
	CONSTRAINT perecible_pk PRIMARY KEY ("id_perecible")
) WITH (OIDS = FALSE); 

--Categoria
CREATE TABLE "categoria"(
	"id_categoria" serial NOT NULL, 
	"nombre" character varying(30) NOT NULL,
	"categoria_elim" Boolean NOT NULL DEFAULT 'false', 
	CONSTRAINT categoria_pk PRIMARY KEY ("id_categoria")
) WITH (OIDS = FALSE); 

--Productos
CREATE TABLE "productos"(
	"id_producto" serial NOT NULL, 
	"id_categoria" Integer NOT NULL,
	"nombre" character varying(30) NOT NULL, 
	"costo" numeric(5, 2) NOT NULL, 
	"precio" numeric(5, 2) NOT NULL,
	"producto_elim" Boolean NOT NULL DEFAULT 'false', 
	"tipo_producto" character varying(10) NOT NULL, 
	CONSTRAINT producto_pk PRIMARY KEY ("id_producto")
) WITH (OIDS = FALSE); 

--Contratos
CREATE TABLE "contratos"(
	"id_contrato" serial NOT NULL, 
	"id_empleado" Integer NOT NULL,
	"salario" numeric(5, 2) NOT NULL, 
	"hora_entrada" Time NOT NULL, 
	"hora_salida" Time NOT NULL,
	"fecha_contrato" Date NOT NULL, 
	"fecha_modificacion" Date NOT NULL, 
	"dias" Integer NOT NULL, 
	"tipo_jornada" character varying(10) NOT NULL, 
	"contrato_elim" BOOLEAN NOT NULL DEFAULT 'false',
	CONSTRAINT contrato_pk PRIMARY KEY ("id_contrato")
) WITH (OIDS = FALSE); 

--Historial_Salario
CREATE TABLE "historial_salario"(
	"id_historial_salario" serial NOT NULL, 
	"id_contrato" Integer NOT NULL,
	"salario" numeric(5, 2) NOT NULL, 
	"fecha_registro" Date NOT NULL, 
	CONSTRAINT historial_salario_pk PRIMARY KEY ("id_historial_salario")
) WITH (OIDS = FALSE); 

--Registro_Asistencias
CREATE TABLE "registro_asistencias"(
	"id_registro_asistencia" serial NOT NULL, 
	"id_empleado" Integer NOT NULL,
	"hora_entrada" time NOT NULL, 
	"hora_salida" time NOT NULL,
	"dia" character varying(10) NOT NULL, 
	"fecha" Date NOT NULL, 
	"horas_trabajo" Integer NOT NULL, 
	CONSTRAINT registro_asistencia_pk PRIMARY KEY ("id_registro_asistencia")
) WITH (OIDS = FALSE); 

--Pagos
CREATE TABLE "pagos"(
	"id_pago" serial NOT NULL, 
	"id_empleado" Integer NOT NULL, 
	"fecha_pago" Date NOT NULL, 
	"salario_pagar" numeric(5, 2) NOT NULL,
	"tipo_pago" character varying(25) NOT NULL, 
	"observacion" character varying(50) NOT NULL, 
	"descuento" numeric(5, 2) NOT NULL, 
	"horas_trabajo_mes" Integer NOT NULL, 
	"numero_faltas" Integer NOT NULL,
	"salario_normal" numeric(5, 2) NOT NULL, 
	CONSTRAINT pago_pk PRIMARY KEY ("id_pago")
) WITH (OIDS = FALSE); 



--Script Paola 
CREATE TABLE "historial_caja"(
	"id_historial_caja" serial NOT NULL, 
	"id_empleado" integer NOT NULL,
	"id_caja" integer NOT NULL, 
	"fecha" date NOT NULL, 
	"hora_abre" time NOT NULL, 
	"hora_cierra" time NOT NULL,
	"dinero_abre" numeric(5, 2) NOT NULL, 
	"dinero_cierra" numeric(5, 2) NOT NULL, 
	"diferencia_dinero" numeric(5, 2) NOT NULL, 
	CONSTRAINT historial_caja_pk PRIMARY KEY ("id_historial_caja")
) WITH (OIDS = FALSE); 

CREATE TABLE "pedidos"(
	"id_pedido" serial NOT NULL, 
	"id_factura" integer NOT NULL,
	"direccion_entrega" character varying(50) NOT NULL, 
	CONSTRAINT pedido_pk PRIMARY KEY ("id_pedido")
) WITH (OIDS = FALSE); 


CREATE TABLE "entregas"(
	"id_entrega" serial NOT NULL, 
	"id_empleado" integer NOT NULL,
	"id_pedido" integer NOT NULL, 
	"fecha_entrega" date NOT NULL, 
	"hora_entrega" time NOT NULL,
	"estado_entrega" BOOLEAN NOT NULL DEFAULT 'false',	
	CONSTRAINT entrega_pk PRIMARY KEY ("id_entrega")
) WITH (OIDS = FALSE); 

CREATE TABLE "cajas"(
	"id_caja" serial NOT NULL, 
	"numero_caja" integer NOT NULL, 
	"caja_elim" BOOLEAN NOT NULL DEFAULT 'false',
	CONSTRAINT caja_pk PRIMARY KEY ("id_caja")
) WITH (OIDS = FALSE); 

CREATE TABLE "ordenes"(
	"id_orden" serial NOT NULL, 
	"id_mesa" integer NOT NULL, 
	"id_empleado" integer NOT NULL,
	"id_factura" integer NOT NULL,
	"orden_elim" BOOLEAN NOT NULL DEFAULT 'false',
	CONSTRAINT ordene_pk PRIMARY KEY ("id_orden")
) WITH (OIDS = FALSE); 

CREATE TABLE "temporada_anio"(
	"id_temporada_anio" serial NOT NULL, 
	"nombre_temporada" character varying(30) NOT NULL,
	"fecha_inicio" date NOT NULL, 
	"fecha_fin" date NOT NULL,
	"temporada_anio_elim" BOOLEAN NOT NULL DEFAULT 'false',
	CONSTRAINT temporada_anio_pk PRIMARY KEY ("id_temporada_anio")
) WITH (OIDS = FALSE); 

CREATE TABLE "ingredientes"(
	"id_ingrediente" serial NOT NULL, 
	"id_plato" integer NOT NULL,
	"id_producto" integer NOT NULL, 
	"cantidad_necesaria" integer NOT NULL,
	"medida" numeric NOT NULL,
	"costo_ingrediente" numeric(5, 2) NOT NULL,
	"ingrediente_elim" BOOLEAN NOT NULL DEFAULT 'false',
	CONSTRAINT ingrediente_pk PRIMARY KEY ("id_ingrediente")
) WITH (OIDS = FALSE); 

CREATE TABLE "mesas"(
	"id_mesa" serial NOT NULL, 
	"numero_mesa" integer NOT NULL, 
	"numero_sillas" integer NOT NULL,  
	"estado_mesa" BOOLEAN NOT NULL DEFAULT 'true',
	"mesa_elim" BOOLEAN NOT NULL DEFAULT 'false',	
	CONSTRAINT mesa_pk PRIMARY KEY ("id_mesa")
) WITH (OIDS = FALSE);

CREATE TABLE "menu"(
	"id_menu" serial NOT NULL, 
	"id_producto" integer NOT NULL,
	"id_plato" integer NOT NULL,
	"categoria" character varying(30) NOT NULL,
	"precio_venta" numeric(5, 2) NOT NULL,
	"tiene_iva" boolean NOT null default 'false',
	"foto" bytea,
	"menu_elim" BOOLEAN NOT NULL DEFAULT 'false',
	CONSTRAINT menu_pk PRIMARY KEY ("id_menu")
) WITH (OIDS = FALSE); 

CREATE TABLE "platos"(
	"id_plato" serial NOT NULL, 
	"id_temporada_anio" integer NOT NULL, 
	"nombre_plato" character varying(30) NOT NULL,
	"precio_plato" numeric(5, 2) NOT NULL, 
	"costo_plato" numeric(5, 2) NOT NULL, 
	"calificacion_plato"  character varying(30) NOT NULL,
	"descripcion_plato" TEXT NOT NULL,
	"plato_elim" boolean NOT null default 'false',
	CONSTRAINT plato_pk PRIMARY KEY ("id_plato")
) WITH (OIDS = FALSE); 


--Script Dannes  

CREATE TABLE "personas"(
"id_persona" serial NOT NULL,
"id_tipo_persona" integer NOT NULL,
"cedula" character varying(10) NOT NULL,
"nombre" character varying(30) NOT NULL,
"apellido" character varying(30) NOT NULL,
"fecha_nacimiento" DATE,
"direccion" character varying(30) NOT NULL,
"correo" character varying(30) NOT NULL,
"telefono" character varying(10) NOT NULL,
"sexo" character varying(1) NOT NULL,
"persona_elim" BOOLEAN NOT NULL DEFAULT 'false',
CONSTRAINT persona_pk PRIMARY KEY ("id_persona")
) WITH(OIDS = FALSE);


CREATE TABLE "calificaciones_plato"(
"id_calificacion_plato" serial NOT NULL,
"id_persona" integer NOT NULL,
"id_plato" integer NOT NULL,
"numero_estrellas" integer NOT NULL,
CONSTRAINT calificacion_plato_pk PRIMARY KEY ("id_calificacion_plato")
) WITH(OIDS = FALSE);


CREATE TABLE "calificaciones_empleado"(
"id_calificacion_empleado" serial NOT NULL,
"id_persona" integer NOT NULL,
"id_empleado" integer NOT NULL,
"calificacion" integer NOT NULL,
CONSTRAINT calificacion_persona_pk PRIMARY KEY ("id_calificacion_empleado")
) WITH(OIDS = FALSE);


CREATE TABLE "tipo_persona"(
"id_tipo_persona" serial NOT NULL,
"tipo_persona" integer NOT NULL,
CONSTRAINT tipo_persona_pk PRIMARY KEY ("id_tipo_persona")
) WITH(OIDS = FALSE);


CREATE TABLE "calificacion_mesero"(
"id_calificacion_mesero" serial NOT NULL,
"id_empleado" integer NOT NULL,
"numero_estrellas" integer NOT NULL,
CONSTRAINT calificacion_mesero_pk PRIMARY KEY ("id_calificacion_mesero")
) WITH(OIDS = FALSE);


CREATE TABLE "usuarios"(
"id_usuario" serial NOT NULL,
"id_persona" integer NOT NULL,
"username" character varying(30) NOT NULL,
"clave" character varying(30) NOT NULL,
"usuario_elim" BOOLEAN NOT NULL DEFAULT 'false',
CONSTRAINT usuario_pk PRIMARY KEY ("id_usuario")
) WITH(OIDS = FALSE);

CREATE TABLE "reportes_mensuales"(
"id_reporte_mensual" serial NOT NULL,
"id_usuario" integer NOT NULL,
"fecha_reporte" DATE,
"ingresos" numeric(5, 2) NOT NULL,
"egresos" numeric(5, 2) NOT NULL,
"diferencia" numeric(5, 2) NOT NULL,
"reporte_mensual_elim" boolean DEFAULT 'false',
CONSTRAINT reporte_mensual_pk PRIMARY KEY ("id_reporte_mensual")
) WITH(OIDS = FALSE);


CREATE TABLE "historial_ingreso"(
"id_historial_ingreso" serial NOT NULL,
"id_usuario" integer NOT NULL,
"fecha_ingreso" DATE,
"hora_ingreso" DATE,
CONSTRAINT historial_ingreso_pk PRIMARY KEY ("id_historial_ingreso")
) WITH(OIDS = FALSE);


CREATE TABLE "empleados"(
"id_empleado" serial NOT NULL,
"id_usuario" integer NOT NULL,
"id_cargo" integer NOT NULL,
"foto_empleado" bytea, 
"empleado_elim" BOOLEAN NOT NULL DEFAULT 'false', 
CONSTRAINT empleado_pk PRIMARY KEY ("id_empleado")
) WITH(OIDS = FALSE);


CREATE TABLE "cargos"(
"id_cargo" serial NOT NULL,
"cargo" character varying(30) NOT NULL,
"cargo_elim" boolean,
CONSTRAINT cargos_pk PRIMARY KEY ("id_cargo")
) WITH(OIDS = FALSE);

--Scrip Johnny   
CREATE TABLE "facturas"(
	"id_factura" serial NOT NULL, 
	"id_historial_caja" integer NOT NULL, 
	"id_persona" integer NOT NULL, 
	"numero_factura" character varying(15) NOT NULL, 
	"forma_pago" character varying(20) NOT NULL, 
	"total" numeric(5, 2) NOT NULL, 
	"fecha_factura" date NOT NULL, 
	"hora_factura" time NOT NULL, 
	"subtotal_iva" numeric(5, 2) NOT NULL, 
	"subtotal_sin_iva" numeric(5, 2) NOT NULL, 
	"subtotal" numeric(5, 2) NOT NULL, 
	"iva" numeric(5, 2) NOT NULL, 
	"nombre" character varying(30) NOT NULL, 
	"apellido" character varying(30) NOT NULL, 
	"direccion" character varying(100) NOT NULL, 
	"correo" character varying(50) NOT NULL, 
	"telefono" character varying(10) NOT NULL, 
	"propina" numeric(5, 2) NOT NULL,
	"factura_elim" BOOLEAN NOT NULL DEFAULT 'false',
	CONSTRAINT factura_pk PRIMARY KEY ("id_factura")
) WITH (OIDS = FALSE); 

CREATE TABLE "detalle_factura"(
	"id_detalle_factura" serial NOT NULL, 
	"id_factura" integer NOT NULL, 
	"id_menu" integer NOT NULL, 
	"cantidad" integer NOT NULL, 
	"precio_unitario" numeric(5, 2) NOT NULL, 
	"precio_total" numeric(5, 2) NOT NULL, 
	"nombre_plato" character varying(30) NOT NULL, 
	"descripcion_plato" character varying(100) NOT NULL, 
	CONSTRAINT detalle_factura_pk PRIMARY KEY ("id_detalle_factura")
) WITH (OIDS = FALSE); 

CREATE TABLE "detalle_factura_compra"(
	"id_detalle_factura_compra" serial NOT NULL, 
	"id_factura_compra" integer NOT NULL, 
	"id_producto" integer NOT NULL, 
	"cantidad" integer NOT NULL, 
	"precio_unitario" numeric(5, 2) NOT NULL, 
	"precio_total" numeric(5, 2) NOT NULL, 
	"nombre_producto" character varying(30) NOT NULL, 
	CONSTRAINT detalle_factura_compra_pk PRIMARY KEY ("id_detalle_factura_compra")
) WITH (OIDS = FALSE); 


--Comenzamos con todas las foraneas  

ALTER TABLE "calificaciones_empleado" 
ADD CONSTRAINT "calificacion_empleado_fk0"
FOREIGN KEY ("id_persona") REFERENCES 
"personas"("id_persona") ON UPDATE CASCADE 
ON DELETE CASCADE; 

ALTER TABLE "calificaciones_empleado" 
ADD CONSTRAINT "calificacion_empleado_fk1"
FOREIGN KEY ("id_empleado") REFERENCES 
"empleados"("id_empleado") ON UPDATE CASCADE 
ON DELETE CASCADE; 


ALTER TABLE "historial_ingreso" 
ADD CONSTRAINT "historial_ingreso_fk0"
FOREIGN KEY ("id_usuario") REFERENCES 
"usuarios"("id_usuario") ON UPDATE CASCADE 
ON DELETE CASCADE; 


ALTER TABLE "calificacion_mesero" 
ADD CONSTRAINT "calificacion_mesero_fk0"
FOREIGN KEY ("id_empleado") REFERENCES 
"empleados"("id_empleado") ON UPDATE CASCADE 
ON DELETE CASCADE; 


ALTER TABLE "entregas" 
ADD CONSTRAINT "entrega_fk0"
FOREIGN KEY ("id_empleado") REFERENCES 
"empleados"("id_empleado") ON UPDATE CASCADE 
ON DELETE CASCADE; 

ALTER TABLE "entregas" 
ADD CONSTRAINT "entrega_fk1"
FOREIGN KEY ("id_pedido") REFERENCES 
"pedidos"("id_pedido") ON UPDATE CASCADE 
ON DELETE CASCADE; 


ALTER TABLE "calificaciones_plato" 
ADD CONSTRAINT "calificacion_plato_fk0"
FOREIGN KEY ("id_persona") REFERENCES 
"personas"("id_persona") ON UPDATE CASCADE 
ON DELETE CASCADE; 

ALTER TABLE "calificaciones_plato" 
ADD CONSTRAINT "calificacion_plato_fk1"
FOREIGN KEY ("id_plato") REFERENCES 
"platos"("id_plato") ON UPDATE CASCADE 
ON DELETE CASCADE; 


ALTER TABLE "personas" 
ADD CONSTRAINT "persona_fk0"
FOREIGN KEY ("id_tipo_persona") REFERENCES 
"tipo_persona"("id_tipo_persona") ON UPDATE CASCADE 
ON DELETE CASCADE;


ALTER TABLE "usuarios" 
ADD CONSTRAINT "usuario_fk0"
FOREIGN KEY ("id_persona") REFERENCES 
"personas"("id_persona") ON UPDATE CASCADE 
ON DELETE CASCADE;


ALTER TABLE "empleados" 
ADD CONSTRAINT "empleado_fk0"
FOREIGN KEY ("id_usuario") REFERENCES 
"usuarios"("id_usuario") ON UPDATE CASCADE 
ON DELETE CASCADE;


ALTER TABLE "ordenes" 
ADD CONSTRAINT "ordenes_fk0"
FOREIGN KEY ("id_mesa") REFERENCES 
"mesas"("id_mesa") ON UPDATE CASCADE 
ON DELETE CASCADE;

ALTER TABLE "ordenes" 
ADD CONSTRAINT "ordenes_fk1"
FOREIGN KEY ("id_empleado") REFERENCES 
"empleados"("id_empleado") ON UPDATE CASCADE 
ON DELETE CASCADE;

ALTER TABLE "ordenes" 
ADD CONSTRAINT "ordenes_fk2"
FOREIGN KEY ("id_factura") REFERENCES 
"facturas"("id_factura") ON UPDATE CASCADE 
ON DELETE CASCADE;


ALTER TABLE "historial_caja" 
ADD CONSTRAINT "historial_caja_fk0"
FOREIGN KEY ("id_empleado") REFERENCES 
"empleados"("id_empleado") ON UPDATE CASCADE 
ON DELETE CASCADE;

ALTER TABLE "historial_caja" 
ADD CONSTRAINT "historial_caja_fk1"
FOREIGN KEY ("id_caja") REFERENCES 
"cajas"("id_caja") ON UPDATE CASCADE 
ON DELETE CASCADE;


ALTER TABLE "facturas" 
ADD CONSTRAINT "factura_fk0"
FOREIGN KEY ("id_historial_caja") REFERENCES 
"historial_caja"("id_historial_caja") ON UPDATE CASCADE 
ON DELETE CASCADE;

ALTER TABLE "facturas" 
ADD CONSTRAINT "factura_fk1"
FOREIGN KEY ("id_persona") REFERENCES 
"personas"("id_persona") ON UPDATE CASCADE 
ON DELETE CASCADE;


ALTER TABLE "reportes_mensuales" 
ADD CONSTRAINT "reporte_mensual_fk0"
FOREIGN KEY ("id_usuario") REFERENCES 
"usuarios"("id_usuario") ON UPDATE CASCADE 
ON DELETE CASCADE;


ALTER TABLE "historial_salario" 
ADD CONSTRAINT "historial_salario_fk0"
FOREIGN KEY ("id_contrato") REFERENCES 
"contratos"("id_contrato") ON UPDATE CASCADE 
ON DELETE CASCADE;


ALTER TABLE "contratos" 
ADD CONSTRAINT "contrato_fk0"
FOREIGN KEY ("id_empleado") REFERENCES 
"empleados"("id_empleado") ON UPDATE CASCADE 
ON DELETE CASCADE;


ALTER TABLE "menu" 
ADD CONSTRAINT "menu_fk0"
FOREIGN KEY ("id_producto") REFERENCES 
"productos"("id_producto") ON UPDATE CASCADE 
ON DELETE CASCADE;

ALTER TABLE "menu" 
ADD CONSTRAINT "menu_fk1"
FOREIGN KEY ("id_plato") REFERENCES 
"platos"("id_plato") ON UPDATE CASCADE 
ON DELETE CASCADE;


ALTER TABLE "platos" 
ADD CONSTRAINT "plato_fk0"
FOREIGN KEY ("id_temporada_anio") REFERENCES 
"temporada_anio"("id_temporada_anio") ON UPDATE CASCADE 
ON DELETE CASCADE;


ALTER TABLE "detalle_factura" 
ADD CONSTRAINT "detalle_factura_fk0"
FOREIGN KEY ("id_factura") REFERENCES 
"facturas"("id_factura") ON UPDATE CASCADE 
ON DELETE CASCADE;

ALTER TABLE "detalle_factura" 
ADD CONSTRAINT "detalle_factura_fk1"
FOREIGN KEY ("id_menu") REFERENCES 
"menu"("id_menu") ON UPDATE CASCADE 
ON DELETE CASCADE;


ALTER TABLE "ingredientes" 
ADD CONSTRAINT "ingrediente_fk0"
FOREIGN KEY ("id_plato") REFERENCES 
"platos"("id_plato") ON UPDATE CASCADE 
ON DELETE CASCADE;

ALTER TABLE "ingredientes" 
ADD CONSTRAINT "ingrediente_fk1"
FOREIGN KEY ("id_producto") REFERENCES 
"productos"("id_producto") ON UPDATE CASCADE 
ON DELETE CASCADE;


ALTER TABLE "registro_asistencias" 
ADD CONSTRAINT "registro_asistencia_fk0"
FOREIGN KEY ("id_empleado") REFERENCES 
"empleados"("id_empleado") ON UPDATE CASCADE 
ON DELETE CASCADE;


ALTER TABLE "pagos" 
ADD CONSTRAINT "pago_fk0"
FOREIGN KEY ("id_empleado") REFERENCES 
"empleados"("id_empleado") ON UPDATE CASCADE 
ON DELETE CASCADE;


ALTER TABLE "stock" 
ADD CONSTRAINT "stock_fk0"
FOREIGN KEY ("id_producto") REFERENCES 
"productos"("id_producto") ON UPDATE CASCADE 
ON DELETE CASCADE;


ALTER TABLE "perecibles" 
ADD CONSTRAINT "perecible_fk0"
FOREIGN KEY ("id_stock") REFERENCES 
"stock"("id_stock") ON UPDATE CASCADE 
ON DELETE CASCADE;


ALTER TABLE "facturas_compra" 
ADD CONSTRAINT "factura_compra_fk0"
FOREIGN KEY ("id_proveedor") REFERENCES 
"proveedor"("id_proveedor") ON UPDATE CASCADE 
ON DELETE CASCADE;

ALTER TABLE "facturas_compra" 
ADD CONSTRAINT "factura_compra_fk1"
FOREIGN KEY ("id_empleado") REFERENCES 
"empleados"("id_empleado") ON UPDATE CASCADE 
ON DELETE CASCADE;


ALTER TABLE "productos" 
ADD CONSTRAINT "producto_fk0"
FOREIGN KEY ("id_categoria") REFERENCES 
"categoria"("id_categoria") ON UPDATE CASCADE 
ON DELETE CASCADE;


ALTER TABLE "detalle_factura_compra" 
ADD CONSTRAINT "detalle_factura_compra_fk0"
FOREIGN KEY ("id_factura_compra") REFERENCES 
"facturas_compra"("id_factura_compra") ON UPDATE CASCADE 
ON DELETE CASCADE;

ALTER TABLE "detalle_factura_compra" 
ADD CONSTRAINT "detalle_factura_compra_fk1"
FOREIGN KEY ("id_producto") REFERENCES 
"productos"("id_producto") ON UPDATE CASCADE 
ON DELETE CASCADE;