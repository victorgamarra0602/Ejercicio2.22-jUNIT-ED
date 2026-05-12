# Ejercicio 1.2 - JUnit - Entornos de Desarrollo

## Descripción
Proyecto Maven en Java que implementa la clase `GeneradorIp` para generar direcciones IP aleatorias válidas, junto con su clase de test `GeneradorIpTest` usando JUnit 5.

## Estructura del proyecto
```
Ejercicio1-2-jUNIT-ED/
└── src/
    ├── main/java/org/cuatrovientos/ed/
    │   └── GeneradorIp.java
    └── test/java/org/cuatrovientos/ed/
        └── GeneradorIpTest.java
```

## Métodos implementados

| Método | Descripción |
|--------|-------------|
| `generarNumero(int min, int max)` | Devuelve un número aleatorio entre min y max |
| `generarIp()` | Devuelve una dirección IP aleatoria válida usando el método anterior |

## Reglas de la IP generada
- Cada octeto está entre 0 y 254
- El primer octeto **nunca es 0**
- El último octeto **nunca es 0**

## Tests

| Test | Descripción |
|------|-------------|
| `testGenerarNumero` | Ejecuta el método 1000 veces comprobando que el resultado está entre 0 y 254 |
| `testGenerarIp` | Ejecuta el método 1000 veces comprobando que la IP no empieza ni termina en 0 |

Resultado: ✅ 2/2 tests pasados

## Tecnologías
- Java 17
- Maven
- JUnit 5.10.2
- Eclipse IDE
