package pue.edu.notesrestapi.configuration.backFront;

public class Pages {

    private String pageNotFound = "<!DOCTYPE html>\n" +
            "<html lang=\"en\">\n" +
            "<head>\n" +
            "  <meta charset=\"UTF-8\">\n" +
            "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
            "  <title>Error 404 - Página no encontrada</title>\n" +
            "  <style>\n" +
            "    body {\n" +
            "      margin: 0;\n" +
            "      padding: 0;\n" +
            "      font-family: Arial, sans-serif;\n" +
            "      background-color: #f7f7f7;\n" +
            "      color: #333333;\n" +
            "      text-align: center;\n" +
            "    }\n" +
            "\n" +
            "    .container {\n" +
            "      width: 80%;\n" +
            "      margin: auto;\n" +
            "      padding: 50px 0;\n" +
            "    }\n" +
            "\n" +
            "    h1 {\n" +
            "      font-size: 3rem;\n" +
            "      margin-bottom: 20px;\n" +
            "    }\n" +
            "\n" +
            "    p {\n" +
            "      font-size: 1.2rem;\n" +
            "      margin-bottom: 30px;\n" +
            "    }\n" +
            "\n" +
            "    img {\n" +
            "      width: 50%;\n" +
            "      max-width: 300px;\n" +
            "      margin-bottom: 30px;\n" +
            "    }\n" +
            "\n" +
            "    a {\n" +
            "      color: #007bff;\n" +
            "      text-decoration: none;\n" +
            "    }\n" +
            "\n" +
            "    a:hover {\n" +
            "      text-decoration: underline;\n" +
            "    }\n" +
            "  </style>\n" +
            "</head>\n" +
            "<body>\n" +
            "\n" +
            "<div class=\"container\">\n" +
            "  <img src=\"https://example.com/spiral_logo.png\" alt=\"Logo de Spiral\">\n" +
            "  <h1>¡Oops! La página que buscas no ha sido encontrada</h1>\n" +
            "  <p>Lo sentimos, parece que te has perdido en el universo de Spiral. Pero no te preocupes, puedes <a href=\"/\">volver a nuestra página de inicio</a> para encontrar lo que buscas.</p>\n" +
            "</div>\n" +
            "\n" +
            "</body>\n" +
            "</html>\n";
    public static String defaultPage = "<!DOCTYPE html>\\n\" +\n" +
            "                \"<html lang=\\\"en\\\">\\n\" +\n" +
            "                \"<head>\\n\" +\n" +
            "                \"  <meta charset=\\\"UTF-8\\\">\\n\" +\n" +
            "                \"  <meta name=\\\"viewport\\\" content=\\\"width=device-width, initial-scale=1.0\\\">\\n\" +\n" +
            "                \"  <title>Página de Inicio</title>\\n\" +\n" +
            "                \"  <style>\\n\" +\n" +
            "                \"    body {\\n\" +\n" +
            "                \"      margin: 0;\\n\" +\n" +
            "                \"      padding: 0;\\n\" +\n" +
            "                \"      font-family: Arial, sans-serif;\\n\" +\n" +
            "                \"      background: linear-gradient(to bottom, #000000, #333333);\\n\" +\n" +
            "                \"      color: #ffffff;\\n\" +\n" +
            "                \"    }\\n\" +\n" +
            "                \"\\n\" +\n" +
            "                \"    .container {\\n\" +\n" +
            "                \"      width: 80%;\\n\" +\n" +
            "                \"      margin: auto;\\n\" +\n" +
            "                \"      text-align: center;\\n\" +\n" +
            "                \"      padding: 50px 0;\\n\" +\n" +
            "                \"    }\\n\" +\n" +
            "                \"\\n\" +\n" +
            "                \"    h1 {\\n\" +\n" +
            "                \"      font-size: 2.5rem;\\n\" +\n" +
            "                \"    }\\n\" +\n" +
            "                \"\\n\" +\n" +
            "                \"    p {\\n\" +\n" +
            "                \"      font-size: 1.2rem;\\n\" +\n" +
            "                \"    }\\n\" +\n" +
            "                \"  </style>\\n\" +\n" +
            "                \"</head>\\n\" +\n" +
            "                \"<body>\\n\" +\n" +
            "                \"\\n\" +\n" +
            "                \"<div class=\\\"container\\\">\\n\" +\n" +
            "                \"  <h1>Bienvenido a Spiral</h1>\\n\" +\n" +
            "                \"  <p>¡Explora nuestro increíble contenido!</p>\\n\" +\n" +
            "                \"</div>\\n\" +\n" +
            "                \"\\n\" +\n" +
            "                \"</body>\\n\" +\n" +
            "                \"</html>\\n";

    public String getPageNotFound() {
        return pageNotFound;
    }
}
