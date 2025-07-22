# Round Robin Algorithm Simulator

## Descripción

Este proyecto implementa un simulador del algoritmo de planificación de procesos Round Robin desarrollado en Java. El simulador cuenta con una interfaz gráfica de usuario construida con Java Swing que permite visualizar y analizar el comportamiento del algoritmo de manera interactiva.

## Características

- Interfaz gráfica intuitiva para la entrada de datos de procesos
- Simulación completa del algoritmo Round Robin
- Cálculo automático de tiempos de espera, proceso y finalización
- Visualización de resultados en tablas organizadas
- Cálculo del tiempo promedio de espera del sistema

## Funcionalidades

### Entrada de Datos
- Configuración del quantum de tiempo
- Registro de procesos con sus respectivas ráfagas de CPU
- Validación de datos de entrada

### Simulación
- Ejecución paso a paso del algoritmo Round Robin
- Manejo de colas circulares de procesos
- Gestión de procesos que requieren múltiples ciclos de ejecución

### Resultados
- Tabla de resultados detallada con:
  - Número de proceso
  - Tiempo de salida
  - Tiempo de llegada
  - Tiempo total de proceso
  - Tiempo de espera
- Cálculo del tiempo promedio de espera del sistema

## Requisitos del Sistema

- Java Development Kit (JDK) 8 o superior
- Sistema operativo compatible con Java Swing

## Estructura del Proyecto

```
src/
├── robin/
│   ├── Robin.java          # Clase principal
│   ├── Proceso.java        # Interfaz gráfica y lógica del algoritmo
│   ├── Proceso.form        # Diseño de la interfaz (NetBeans)
│   └── Procesos.java       # Modelo de datos para procesos
build/
└── classes/               # Archivos compilados
```

## Compilación y Ejecución

### Compilación
```bash
javac -d build/classes -sourcepath src src/robin/*.java
```

### Ejecución
```bash
java -cp build/classes robin.Robin
```

## Uso del Simulador

1. **Configurar Quantum**: Ingrese el valor del quantum de tiempo
2. **Añadir Procesos**: 
   - Ingrese la ráfaga de CPU para cada proceso
   - Haga clic en "Añadir" para registrar el proceso
3. **Ejecutar Simulación**: Haga clic en "Iniciar" para ejecutar el algoritmo
4. **Visualizar Resultados**: Los resultados se mostrarán en la tabla de la derecha

## Algoritmo Round Robin

El algoritmo Round Robin es una técnica de planificación de procesos que asigna a cada proceso un tiempo fijo de ejecución (quantum) en forma circular. Cuando un proceso agota su quantum, es movido al final de la cola y se ejecuta el siguiente proceso.

### Características del Algoritmo
- Planificación circular equitativa
- Tiempo de respuesta predecible
- Adecuado para sistemas de tiempo compartido
- Previene la inanición de procesos

## Autor

Proyecto desarrollado como parte de un curso universitario de Sistemas Operativos.
