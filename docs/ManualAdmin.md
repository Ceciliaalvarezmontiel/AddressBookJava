# Manual del Administrador – AddressBookJava

## Ubicación de datos
Por defecto: ./data/contacts.csv (configurable en config.properties).

## Respaldo y restauración
1. Cierra la app.
2. Copia data/contacts.csv a una carpeta con fecha.
3. Para restaurar, reemplaza el archivo.

## Actualización
1. Descarga el último JAR desde Releases.
2. Sustituye el anterior.
3. Ejecuta normalmente.

## Monitoreo CI/CD
- Revisa la pestaña Actions (workflow Java CI).
- Si falla, abre un Issue con los logs del job.

## Seguridad
- Mantén el CSV en carpeta privada.
- Restringe accesos al repositorio.
