@echo off
title CREA BOX

REM Ir a la carpeta donde se encuentra este archivo BAT
cd /d "%~dp0"

REM Verificar que el proyecto este en la misma carpeta
if not exist "pom.xml" (
    echo ERROR: No se encontro pom.xml.
    echo Coloca este archivo BAT en la carpeta principal de CREA BOX.
    pause
    exit /b 1
)

REM Configuracion de conexion MySQL
set "DB_USERNAME=root"
set "DB_URL=jdbc:mysql://localhost:3306/crea_box"

echo.
echo ==================================
echo       INICIANDO CREA BOX
echo ==================================
echo.

REM Solicitar la contrasena de MySQL sin mostrarla en pantalla
for /f "delims=" %%P in ('powershell -NoProfile -Command "$p=Read-Host 'Contrasena MySQL' -AsSecureString; [System.Net.NetworkCredential]::new('', $p).Password"') do set "DB_PASSWORD=%%P"

if not defined DB_PASSWORD (
    echo No se recibio la contrasena.
    pause
    exit /b 1
)

REM Verificar que Maven este disponible
where mvn >nul 2>nul
if errorlevel 1 (
    echo ERROR: Maven no esta instalado o no esta agregado al PATH.
    echo Instala Maven y vuelve a intentarlo.
    pause
    exit /b 1
)

echo Iniciando servidor Java...
start "" powershell -NoProfile -Command "Start-Sleep -Seconds 10; Start-Process 'http://localhost:8080/'"

call mvn spring-boot:run

echo.
echo CREA BOX ha terminado.
pause
