# AddressBookJava

## Resumen Ejecutivo

**Descripción:**  
Aplicación de libreta de direcciones desarrollada en Java que permite agregar, buscar, editar y eliminar contactos, con persistencia de datos y arquitectura modular.

**Problema identificado:**  
La gestión de contactos en pequeñas empresas o usuarios individuales suele realizarse de forma manual o dispersa, provocando pérdida de información y baja productividad.

**Solución:**  
Proporcionar una aplicación ligera, centralizada y fácil de usar, que guarde los datos de forma segura y permita su mantenimiento, con soporte para futuras mejoras.

**Arquitectura:**  
- **Capa de presentación:** Interfaz de usuario en Java Swing.  
- **Capa de lógica:** Servicios y validaciones para operaciones CRUD.  
- **Persistencia:** Archivos CSV (por defecto) o base de datos futura.  
- **Integración continua:** GitHub Actions para compilación y empaquetado automático.

---

## Tabla de Contenidos
1. [Requerimientos](#requerimientos)
2. [Instalación](#instalación)
3. [Configuración](#configuración)
4. [Uso](#uso)
5. [Contribución](#contribución)
6. [Roadmap](#roadmap)
7. [Documentación Adicional](#documentación-adicional)

---

## Requerimientos
**Servidores de aplicación:**  
No requiere servidor para ejecución local. Opcionalmente se puede empaquetar como WAR para Tomcat o Payara.

**Servidores web:**  
No aplica para versión JAR.

**Bases de datos:**  
Por defecto usa archivos CSV.  
Futuro: soporte para MySQL o PostgreSQL.

**Paquetes adicionales:**  
Ninguno fuera de la JDK estándar.

**Versión de Java:**  
Java JDK 17 o superior.

---

## Instalación

**Instalar ambiente de desarrollo:**
```bash
git clone https://github.com/Ceciliaalvarezmontiel/AddressBookJava.git
cd AddressBookJava
mvn clean package

![CI](https://github.com/Ceciliaalvarezmontiel/AddressBookJava/actions/workflows/java-ci.yml/badge.svg)

Descarga rápida
JAR listo para usar: https://github.com/Ceciliaalvarezmontiel/AddressBookJava/releases/download/v1.0.0/AddressBook-v1.0.0.jar
