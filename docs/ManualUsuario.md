# Manual del Usuario – AddressBookJava

## Objetivo
Gestionar contactos (crear, buscar, editar, eliminar) desde una app Java.

## Requisitos
- Java JDK 17+ (probado con 24)
- Ejecutar con doble clic o desde terminal.

## Instalación y ejecución
1. Descargar el JAR desde Releases (o compilar con Maven).
2. Ejecutar:
   java -jar target/*.jar

## Uso básico
1. Agregar contacto con nombre, teléfono y correo.
2. Buscar por nombre o teléfono.
3. Editar o eliminar un contacto existente.
4. Guardar antes de cerrar.

## Solución de problemas
- No abre el JAR: verifica con `java -version`.
- No guarda datos: revisa permisos y la ruta en `config.properties`.
- Caracteres raros: abre el CSV en UTF-8.
