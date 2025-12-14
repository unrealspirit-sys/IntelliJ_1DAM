# Proyecto IntelliJ - Programación DAM

Este proyecto contiene todos los ejercicios y prácticas de programación Java del curso DAM.

## 📁 Estructura del Proyecto

```
src/
├── ambitos/          - Ejercicios de ámbitos de variables
├── basico/           - Ejemplos básicos (Hola Mundo, etc.)
├── bucles/           - Ejercicios de bucles (for, while, do-while)
├── clases/           - Ejercicios de Programación Orientada a Objetos
│   ├── coche/        - Clase Coche
│   ├── libro/        - Clase Libro
│   ├── persona/      - Clase Persona
│   └── personaje/    - Clase Personaje
├── ejercicios/       - Ejercicios de Microsoft Teams
│   ├── asteriscos/   - Ejercicios con asteriscos
│   ├── fechas/       - Ejercicios por fecha (15, 16, 17 Nov)
│   ├── media/        - Cálculo de nota media (con y sin OOP)
│   ├── notas/        - Ejercicios de notas
│   └── numeros/      - Ejercicios con números
├── excepciones/      - Manejo de excepciones
├── fundamentos/      - Fundamentos de Java (Scanner, bucles, etc.)
├── traza/            - Ejercicios de traza
└── utils/            - Utilidades (cálculos, IVA, área y perímetro)
```

## 🎯 Organización por Temas

### Conceptos Básicos
- **basico/** - Primeros pasos con Java
- **bucles/** - Estructuras de control iterativas
- **ambitos/** - Ámbitos y visibilidad de variables

### Programación Orientada a Objetos
- **clases/** - Diferentes ejemplos de clases y objetos
  - Libro: Sistema de gestión de libros
  - Persona: Datos personales y métodos
  - Coche: Características y comportamiento
  - Personaje: Atributos de personajes

### Ejercicios Prácticos
- **ejercicios/** - Ejercicios de Teams organizados por tema
  - asteriscos: Patrones con asteriscos
  - notas: Cálculo y validación de notas
  - numeros: Operaciones con números
  - media: Cálculo de media de notas (OOP y sin OOP)
  - fechas: Ejercicios clasificados por fecha

### Conceptos Avanzados
- **excepciones/** - Try-catch y manejo de errores
- **fundamentos/** - Scanner, entrada de datos, etc.
- **utils/** - Funciones de utilidad reutilizables

## 🚀 Cómo Usar Este Proyecto en IntelliJ IDEA

1. **Abrir el proyecto:**
   - File → Open → Selecciona la carpeta del proyecto

2. **Marcar src como Sources Root:**
   - Click derecho en la carpeta `src`
   - Mark Directory as → Sources Root

3. **Ejecutar un archivo Main:**
   - Navega al archivo que contiene el método `main()`
   - Click derecho → Run 'NombreClase.main()'

## 📝 Convenciones de Nombres

- **Paquetes:** Minúsculas, nombres descriptivos (ej: `clases.libro`, `ejercicios.media`)
- **Clases:** PascalCase (ej: `Libro`, `Persona`, `Main`)
- **Archivos:** Coinciden con el nombre de la clase

## ✅ Ventajas de Esta Estructura

- ✨ **Rutas cortas:** Máximo 3-4 niveles de profundidad
- 📦 **Fácil de copiar:** Compatible con límites de ruta de Windows
- 🔍 **Fácil de navegar:** Organización lógica por temas
- 🎓 **Educativa:** Estructura clara para aprendizaje

## 📌 Notas Importantes

- Esta estructura reemplaza la organización anterior con múltiples proyectos separados
- Todos los archivos mantienen su funcionalidad original
- Los paquetes se han simplificado para evitar rutas largas
- Compatible con copiar a pendrives sin problemas de longitud de ruta

---

## ➕ Cómo Añadir Nuevos Archivos Java

### Paso 1: Decidir la Categoría

Primero, identifica a qué categoría pertenece tu nuevo archivo:

- **Ejercicio básico** → `src/basico/`
- **Ejercicio de bucles** → `src/bucles/`
- **Nueva clase POO** → `src/clases/nombre_clase/`
- **Ejercicio de Teams** → `src/ejercicios/tema/`
- **Manejo de excepciones** → `src/excepciones/`
- **Fundamentos (Scanner, etc.)** → `src/fundamentos/`
- **Función de utilidad** → `src/utils/`

### Paso 2: Crear la Carpeta (si es necesario)

**Opción A: Usar IntelliJ IDEA**
1. Click derecho en la carpeta padre (ej: `src/clases/`)
2. New → Package
3. Escribe el nombre (ej: `empleado`)

**Opción B: Crear manualmente**
```powershell
# Ejemplo: Nueva clase Empleado
New-Item -ItemType Directory -Path "src\clases\empleado"
```

### Paso 3: Crear el Archivo Java

**En IntelliJ IDEA:**
1. Click derecho en la carpeta destino
2. New → Java Class
3. Escribe el nombre de la clase
4. IntelliJ añadirá automáticamente el `package` correcto

**Ejemplo de archivo creado:**
```java
package clases.empleado;

public class Empleado {
    // Tu código aquí
}
```

### Paso 4: Declarar el Paquete Correcto

La declaración `package` debe coincidir con la ruta desde `src/`:

| Ubicación del archivo | Declaración package |
|----------------------|---------------------|
| `src/clases/empleado/Empleado.java` | `package clases.empleado;` |
| `src/ejercicios/arrays/ArrayMain.java` | `package ejercicios.arrays;` |
| `src/utils/Calculadora.java` | `package utils;` |
| `src/basico/HolaMundo.java` | `package basico;` |

### Paso 5: Usar Imports si es Necesario

Si necesitas usar clases de otros paquetes:

```java
package ejercicios.arrays;

import clases.persona.Persona;  // Importar clase de otro paquete
import utils.Calculadora;        // Importar utilidad

public class ArrayMain {
    public static void main(String[] args) {
        Persona p = new Persona("Juan", "12345678A");
        // ...
    }
}
```

---

## 📋 Ejemplos Prácticos

### Ejemplo 1: Añadir una Nueva Clase "Empleado"

```bash
# 1. Crear carpeta
src/clases/empleado/

# 2. Crear archivos
src/clases/empleado/Empleado.java
src/clases/empleado/Main.java
```

**Empleado.java:**
```java
package clases.empleado;

public class Empleado {
    private String nombre;
    private double salario;
    
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
    
    // Getters y setters...
}
```

**Main.java:**
```java
package clases.empleado;

public class Main {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Ana", 2000.0);
        System.out.println(e1);
    }
}
```

### Ejemplo 2: Añadir Ejercicio de Arrays

```bash
# 1. Crear carpeta
src/ejercicios/arrays/

# 2. Crear archivo
src/ejercicios/arrays/ManipularArrays.java
```

**ManipularArrays.java:**
```java
package ejercicios.arrays;

import java.util.Arrays;

public class ManipularArrays {
    public static void main(String[] args) {
        int[] numeros = {5, 2, 8, 1, 9};
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
    }
}
```

### Ejemplo 3: Añadir Utilidad Reutilizable

```bash
# Crear archivo directamente en utils
src/utils/Validador.java
```

**Validador.java:**
```java
package utils;

public class Validador {
    public static boolean esEmailValido(String email) {
        return email != null && email.contains("@");
    }
    
    public static boolean esDNIValido(String dni) {
        return dni != null && dni.length() == 9;
    }
}
```

**Usar en otro archivo:**
```java
package clases.persona;

import utils.Validador;  // Importar la utilidad

public class Main {
    public static void main(String[] args) {
        String email = "test@example.com";
        if (Validador.esEmailValido(email)) {
            System.out.println("Email válido");
        }
    }
}
```

---

## 🎯 Reglas de Oro

1. **Mantén la estructura plana:** Máximo 3-4 niveles de carpetas
2. **Nombres descriptivos:** Usa nombres que indiquen claramente el contenido
3. **Un tema por carpeta:** Agrupa archivos relacionados juntos
4. **Package = ruta:** La declaración `package` siempre coincide con la ruta desde `src/`
5. **Minúsculas en paquetes:** Los nombres de paquetes siempre en minúsculas
6. **PascalCase en clases:** Los nombres de clases empiezan con mayúscula

---

## ❓ Preguntas Frecuentes

**P: ¿Puedo crear subcarpetas dentro de ejercicios?**  
R: Sí, pero mantén máximo 1 nivel adicional. Ejemplo: `src/ejercicios/arrays/ordenacion/`

**P: ¿Dónde pongo ejercicios de exámenes?**  
R: Crea `src/examenes/` y organiza por fecha: `src/examenes/diciembre2025/`

**P: ¿Puedo tener varios Main.java?**  
R: Sí, siempre que estén en paquetes diferentes. Cada uno es independiente.

**P: ¿Qué hago si un archivo usa clases de varios paquetes?**  
R: Usa múltiples imports:
```java
import clases.persona.Persona;
import clases.coche.Coche;
import utils.Validador;
```

---

**Última actualización:** Diciembre 2025
