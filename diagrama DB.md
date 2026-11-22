base de datos carniceria yare



usuarios

* id
* nombre
* apellido
* rol
* teléfono
* estado
* documento
* contrasena





proveedores

* id\_proveedor
* nombre
* apellido
* teléfono
* dirección
* producto



ventas

* fecha\_venta
* tipo\_carne
* precio
* total
* método de pago



Detalle de ventas

* id\_detalle	INT (PK)	Identificador del detalle
* id\_venta	INT (FK)	Venta relacionada
* id\_producto	INT (FK)	Producto vendido
* cantidad	DECIMAL	Cantidad vendida en kilogramos
* precio\_unitario	DECIMAL	Precio por kilogramo
* subtotal	DECIMAL	Valor del producto vendido



productos

* id\_producto	INT (PK)	Identificador del producto
* nombre	VARCHAR	Nombre del producto
* tipo\_carne	VARCHAR	Tipo de carne
* precio\_kg	DECIMAL	Precio por kilogramo
* cantidad\_stock	DECIMAL	Cantidad disponible
* estado	VARCHAR	Disponible o agotado



categorías

* id\_categoria	INT (PK)	Identificador único de la categoría
* nombre	VARCHAR(50)	Nombre de la categoría
* descripcion	VARCHAR(150)	Descripción de la categoría
* estado	VARCHAR(20)	Estado de la categoría (Activa/Inactiva)





