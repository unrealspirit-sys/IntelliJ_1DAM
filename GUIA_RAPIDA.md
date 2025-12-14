# 📝 Guía Rápida: Añadir Archivos Java

## 🎯 Flujo de Trabajo Rápido

```
1. Decidir categoría → 2. Crear carpeta (si necesario) → 3. Crear archivo .java → 4. Declarar package
```

---

## 📂 Categorías Disponibles

| Tipo de Código | Carpeta | Ejemplo de Package |
|----------------|---------|-------------------|
| 🎓 Ejercicio básico | `src/basico/` | `package basico;` |
| 🔄 Bucles | `src/bucles/` | `package bucles;` |
| 🏗️ Clase POO | `src/clases/nombre/` | `package clases.nombre;` |
| 📚 Ejercicio Teams | `src/ejercicios/tema/` | `package ejercicios.tema;` |
| ⚠️ Excepciones | `src/excepciones/` | `package excepciones;` |
| 📖 Fundamentos | `src/fundamentos/` | `package fundamentos;` |
| 🛠️ Utilidades | `src/utils/` | `package utils;` |

---

## ⚡ Método Rápido en IntelliJ

### Crear Nueva Clase POO (Ejemplo: Empleado)

1. **Click derecho** en `src/clases/`
2. **New → Package** → Escribe `empleado`
3. **Click derecho** en `clases.empleado`
4. **New → Java Class** → Escribe `Empleado`
5. ✅ IntelliJ añade automáticamente: `package clases.empleado;`

### Crear Ejercicio Nuevo (Ejemplo: Arrays)

1. **Click derecho** en `src/ejercicios/`
2. **New → Package** → Escribe `arrays`
3. **Click derecho** en `ejercicios.arrays`
4. **New → Java Class** → Escribe `ManipularArrays`
5. ✅ IntelliJ añade automáticamente: `package ejercicios.arrays;`

---

## 🎨 Plantillas de Código

### Plantilla: Nueva Clase POO

```java
package clases.NOMBRE_CLASE;

public class NOMBRE_CLASE {
    // Atributos
    private String atributo1;
    private int atributo2;
    
    // Constructor
    public NOMBRE_CLASE(String atributo1, int atributo2) {
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
    }
    
    // Getters y Setters
    public String getAtributo1() {
        return atributo1;
    }
    
    public void setAtributo1(String atributo1) {
        this.atributo1 = atributo1;
    }
    
    // toString
    @Override
    public String toString() {
        return "NOMBRE_CLASE{" +
                "atributo1='" + atributo1 + '\'' +
                ", atributo2=" + atributo2 +
                '}';
    }
}
```

### Plantilla: Main de Prueba

```java
package clases.NOMBRE_CLASE;

public class Main {
    public static void main(String[] args) {
        NOMBRE_CLASE obj = new NOMBRE_CLASE("valor1", 123);
        System.out.println(obj);
    }
}
```

### Plantilla: Ejercicio con Scanner

```java
package ejercicios.TEMA;

import java.util.Scanner;

public class NombreEjercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un valor: ");
        int valor = sc.nextInt();
        
        // Tu código aquí
        
        sc.close();
    }
}
```

### Plantilla: Utilidad Estática

```java
package utils;

public class NombreUtilidad {
    
    public static TipoRetorno metodoUtilidad(TipoParametro param) {
        // Tu código aquí
        return resultado;
    }
}
```

---

## 🔗 Usar Clases de Otros Paquetes

### Importar y Usar

```java
package ejercicios.arrays;

// Importar clases necesarias
import clases.persona.Persona;
import utils.Validador;
import java.util.ArrayList;

public class EjemploImports {
    public static void main(String[] args) {
        // Usar clase importada
        Persona p = new Persona("Juan", "12345678A");
        
        // Usar utilidad importada
        boolean valido = Validador.esDNIValido("12345678A");
        
        // Usar clase de Java
        ArrayList<String> lista = new ArrayList<>();
    }
}
```

---

## ✅ Checklist Antes de Ejecutar

- [ ] El archivo está dentro de `src/`
- [ ] La declaración `package` coincide con la ruta
- [ ] Los imports están correctos (si los hay)
- [ ] El nombre de la clase coincide con el nombre del archivo
- [ ] La carpeta `src/` está marcada como "Sources Root" en IntelliJ

---

## 🚨 Errores Comunes y Soluciones

| Error | Causa | Solución |
|-------|-------|----------|
| `package does not exist` | Import incorrecto | Verifica que el paquete existe y el nombre es correcto |
| `class is public, should be declared in a file named...` | Nombre de archivo ≠ nombre de clase | Renombra el archivo para que coincida |
| `package ... does not match the expected package` | Package incorrecto | Cambia la declaración `package` para que coincida con la ruta |
| No aparece el icono de ejecutar | No hay método `main` | Añade: `public static void main(String[] args) {}` |

---

## 💡 Consejos Pro

1. **Usa IntelliJ para crear archivos** → Añade automáticamente el package correcto
2. **Agrupa archivos relacionados** → Más fácil de encontrar y mantener
3. **Nombres descriptivos** → `CalcularNotaMedia` mejor que `Ejercicio1`
4. **Un Main por carpeta** → Evita confusión al ejecutar
5. **Utils para código reutilizable** → No dupliques código

---

## 📍 Ejemplos de Rutas Correctas

✅ **CORRECTO:**
```
src/clases/empleado/Empleado.java          → package clases.empleado;
src/ejercicios/arrays/OrdenarArray.java    → package ejercicios.arrays;
src/utils/Calculadora.java                 → package utils;
```

❌ **INCORRECTO:**
```
clases/empleado/Empleado.java              → Falta src/
src/Empleado.java                          → Falta organización
src/clases/Empleado.java                   → Falta subcarpeta
```

---

**¡Guarda esta guía para consultarla cuando añadas nuevos archivos!** 📌
