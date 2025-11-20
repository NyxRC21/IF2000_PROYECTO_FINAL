Sistema de Reservación de Tiquetes Aéreos

## Descripción del Proyecto
Este proyecto es una aplicación básica de simulación para la reservación de tiquetes aéreos, desarrollada en Java utilizando programación orientada a objetos (OOP). Permite seleccionar vuelos según origen y destino, elegir clase (ejecutiva o económica), verificar disponibilidad y generar tiquetes y facturas. Cada avión tiene una capacidad limitada de 4 espacios (2 ejecutiva, 2 económica), facilitando la simulación de reservas.

El propósito principal es demostrar conceptos básicos de programación como clases, objetos, métodos, validaciones condicionales y manejo de interfaces gráficas con Swing (librerías nativas de Java/NetBeans). Es un proyecto educativo y sencillo, ideal para aprender OOP sin dependencias externas complejas.

### Funcionalidades Principales
- Selección de origen, destino y fecha del vuelo.
- Ingreso de datos del pasajero (nombre e ID).
- Elección de clase (ejecutiva o económica).
- Validación de disponibilidad de asientos.
- Generación automática de tiquete y factura.
- Interfaz gráfica visual con colores y tooltips para mejor usabilidad.
- Mensajes de error para validaciones (campos vacíos, origen = destino, formato de fecha).

## Requisitos
- **JDK**: Versión 8 o superior (recomendado JDK 11+ para compatibilidad con NetBeans).
- **Entorno de Desarrollo**: NetBeans IDE (incluye Swing por defecto; no se requieren librerías externas descargables).
- **Sistema Operativo**: Compatible con Windows, macOS o Linux (cualquier SO que soporte Java).

## Instalación y Ejecución
1. **Descarga o Clona el Proyecto**:
   - Crea un nuevo proyecto Java en NetBeans: Archivo > Nuevo Proyecto > Java Application.
   - Copia los archivos de código fuente a las carpetas correspondientes (ver Estructura de Archivos abajo).

2. **Compilación**:
   - Abre el proyecto en NetBeans.
   - Haz clic derecho en el proyecto > Limpiar y Construir (Clean and Build). Esto compilará todas las clases.

3. **Ejecución**:
   - Ejecuta la clase principal `InterfazBoleteria.java` (ubicada en el paquete `UI`).
   - En NetBeans: Haz clic derecho en `InterfazBoleteria.java` > Ejecutar Archivo (Run File).
   - La interfaz gráfica se abrirá automáticamente. Selecciona opciones, ingresa datos y haz clic en "Reservar Vuelo".

4. **Pruebas**:
   - Prueba reservas: Selecciona origen/destino/fecha, ingresa pasajero y clase. Verifica mensajes de éxito/error.
   - Llena asientos: Reserva 2 en ejecutiva; la tercera fallará por falta de disponibilidad.
   - Validaciones: Intenta reservar con campos vacíos o origen = destino.

## Estructura de Archivos
reservacion/
├── Clases/
│   ├── Avion.java          # Clase para manejar capacidad de asientos
│   ├── Vuelo.java          # Clase para representar un vuelo
│   ├── Pasajero.java       # Clase para datos del pasajero
│   ├── Tiquete.java        # Clase para generar el tiquete
│   ├── Factura.java        # Clase para generar la factura
│   └── Reservacion.java    # Clase para lógica de reserva
└── UI/
    └── InterfazBoleteria.java  # Clase principal con interfaz gráfica (Swing)

- **Paquetes**: `Clases` para lógica de negocio, `UI` para la interfaz.
- **Archivos Principales**: Todo el código está en estos archivos; no hay bases de datos ni archivos externos.

## Uso de la Aplicación
1. **Inicio**: Al ejecutar, aparece la ventana principal con campos para seleccionar vuelo y datos del pasajero.
2. **Selección de Vuelo**: Elige origen y destino de listas desplegables. Usa el spinner de fecha para seleccionar día/mes/año.
3. **Datos del Pasajero**: Ingresa nombre e ID en los campos de texto.
4. **Clase**: Selecciona "Ejecutiva" o "Económica".
5. **Reserva**: Haz clic en "Reservar Vuelo". Si es exitosa, verás el tiquete y factura en la área de salida. Si hay error, se muestra en rojo.
6. **Reinicio**: Cierra y vuelve a ejecutar para nuevas reservas (no se guardan entre sesiones).

## Autor
Daniel Ríos y Crisbel Madrigal
