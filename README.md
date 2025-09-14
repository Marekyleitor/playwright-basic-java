# Proyecto básico de automatización con Playwright implementado en Java
Ideado para iniciarse a aprender a usar Playwright y/o ejecutar un test sencillo de algún flujo de alguna página web.

## 🔧 Herramientas Principales
✨ CodeGen: Generador de código integrado que ayuda a aprender los selectores y comandos básicos
⚙️ Configuración Simple: Setup mínimo requerido para empezar a automatizar
📚 Documentación Básica: Guías paso a paso para principiantes

## 📊 Características
✅ Implementación en Java
✅ Estructura modular y fácil de entender
✅ Ejemplos comentados
✅ Integración con CodeGen para aprendizaje práctico

## 📚 Cómo Usar
1️⃣ Clona el repositorio
2️⃣ Instala las dependencias necesarias
3️⃣ Usa CodeGen para generar tus primeros comandos
4️⃣ Modifica y expande los ejemplos según tus necesidades

### Activación de CodeGen
Para iniciar CodeGen y comenzar a generar código automáticamente:
```bash
mvn exec:java -e -D exec.mainClass=com.microsoft.playwright.CLI -D exec.args="codegen"
```
o para ejecutarlo y abrir el browser en una página específica, por ejemplo Google.
```bash
mvn exec:java -D exec.mainClass=com.microsoft.playwright.CLI -D exec.args="codegen https://ejemplo.com"
```
Este comando abrirá una ventana del navegador con la interfaz de CodeGen donde podrás:
✨ Seleccionar elementos en la página
⚡ Generar código automáticamente
📝 Editar y probar el código generado
🔄 Refinar los selectores

## 🎯 Objetivo
Facilitar el aprendizaje de Playwright mediante ejemplos prácticos y código generado automáticamente. Ideal para desarrolladores que buscan una introducción rápida y práctica a la automatización web.