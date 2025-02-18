<!DOCTYPE html>
<html lang="en" >
<head>
    <meta charset="UTF-8">
    <title>Arquitectura 1</title>
    <link rel="stylesheet" href="./style.css">

</head>
<body>
<header>
    <nav class="navbar">
        <div class="logo">Register</div>
        <ul class="nav-links">
            <li><a href="#">Inicio</a></li>
            <li><a href="#">Registrar</a></li>
            <li><a href="#">Contacto</a></li>
        </ul>
        <button class="btn-theme">Salir</button>
    </nav>
</header>

<!-- FORMULARIO -->
<section class="form-container">
    <img src="image-removebg-preview.png" alt="Decoración Izquierda" class="decoracion img-left">
    <div class="form-box">
        <h2>Registrar cliente</h2>
        <p>Ingresa los datos:</p>

        <form id="form-registro" action="ServerServlet" method="POST">
            <label for="tipo-documento">Tipo de Documento</label>
            <select id="tipo-documento" name="tipo-documento" required>
                <option value="disabled selected" >Selecciona una opción</option>
                <option value="cedula-ciudadania">Cédula de Ciudadanía</option>
                <option value="cedula-extranjeria">Cédula de Extranjería</option>
                <option value="tarjeta-identidad">Tarjeta de Identidad</option>
                <option value="pasaporte">Pasaporte</option>
            </select>

            <label for="numero">Número de Documento</label>
            <input type="text" id="numero" name="numero" placeholder="1.0XX.0XX.5XX" required>

            <label for="nombre">Nombre</label>
            <input type="text" id="nombre" name="nombre" placeholder="Timmy" required>

            <label for="apellido">Apellido</label>
            <input type="text" id="apellido" name="apellido" placeholder="Turner" required>

            <label for="fecha-nacimiento">Fecha de Nacimiento</label>
            <input type="date" id="fecha-nacimiento" name="fecha-nacimiento" required>

            <label for="telefono">Número de Teléfono</label>
            <div class="telefono-container">
                <select id="codigo-pais" name="codigo-pais" required>
                    <option value="+57">+57 (Colombia)</option>
                    <option value="+1">+1 (USA)</option>
                    <option value="+34">+34 (España)</option>
                    <option value="+52">+52 (México)</option>
                    <option value="+54">+54 (Argentina)</option>
                    <option value="+55">+55 (Brasil)</option>
                    <option value="+593">+593 (Ecuador)</option>
                    <option value="+51">+51 (Perú)</option>
                    <option value="+502">+502 (Guatemala)</option>
                    <option value="+503">+503 (El Salvador)</option>
                    <option value="+504">+504 (Honduras)</option>
                    <option value="+505">+505 (Nicaragua)</option>
                    <option value="+506">+506 (Costa Rica)</option>
                    <option value="+507">+507 (Panamá)</option>
                    <option value="+58">+58 (Venezuela)</option>
                </select>

                <input type="tel" id="telefono" name="telefono" placeholder="Ej. 3001234567" required>
            </div>

            <button type="submit" class="btn-registrar">Registrar</button>
        </form>

        <a href="#" class="login-link">Ya tengo cuenta</a>
    </div>
    <img src="image-removebg-preview.png" alt="Decoración Derecha" class="decoracion img-right">
</section>

<footer>
    <div class="footer-content">
        <p>Calle 45 #7-15, Bogotá, Colombia</p>
        <p>&copy; 2024 Register Inc. • Privacy • Terms • Sitemap</p>
    </div>
</footer>
<script  src="./script.js"></script>

</body>
</html>
