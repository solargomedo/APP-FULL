# Level-UP

## Descripción

Level-UP es una aplicación móvil orientada al mundo gamer, diseñada como una tienda digital para la venta de:

- Juegos de mesa  
- Videojuegos  
- Mouse gamer  
- Teclados gamer  
- Audífonos  
- Ropa temática gamer  

El objetivo de la aplicación es ofrecer una experiencia de compra moderna, intuitiva y enfocada en la comunidad gamer.

---

## Integrantes

- Solange Argomedo  
- Cristian Pizarro  

---

## Funcionalidades principales

- Registro de usuarios  
- Inicio de sesión    
- Edición de perfil  
- Roles de usuario:
  - Cliente
  - Invitado
- Catálogo de productos gamers  
- Carrito de compras  
- Formularios con validaciones visuales  
- Animaciones y transiciones  
- Acceso a recursos nativos del dispositivo:
  - Galería
- Persistencia de datos local  
- Conexión con backend propio mediante microservicios  

---

## Tecnologías utilizadas

### Aplicación móvil
- Kotlin  
- Jetpack Compose  
- Arquitectura MVVM  
- Retrofit  
- Room / DataStore  

### Backend
- Spring Boot  
- Java  
- API REST  

### Pruebas unitarias
- JUnit  
- MockK / Kotest  

---

## APIs utilizadas

### API externa

- Nombre: (completar, por ejemplo OpenWeather, RAWG, REST Countries)  
- Tipo: REST  

### Microservicios propios

| Método | Endpoint              | Descripción              |
|--------|------------------------|--------------------------|
| GET    | /api/products          | Listar productos         |
| POST   | /api/products          | Crear producto           |
| PUT    | /api/products/{id}     | Actualizar producto      |
| DELETE | /api/products/{id}     | Eliminar producto        |

| Método | Endpoint              | Descripción              |
|--------|------------------------|--------------------------|
| POST   | /api/auth/login        | Inicio de sesión         |
| POST   | /api/auth/register     | Registro de usuarios     |

---

## Persistencia de datos

- Local: Room / DataStore  
- Remota: Base de datos del backend mediante microservicios  

---

## APK firmado

Ubicación del archivo APK:

```bash
/apk/app-release.apk
