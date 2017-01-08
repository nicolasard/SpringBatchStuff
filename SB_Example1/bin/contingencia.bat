call setenv.bat

cd %APP_HOME%/bin

rem Ejemplo de parametro expArchivoEmbozado

java org.springframework.batch.core.launch.support.CommandLineJobRunner conf/SpringScheduler.xml %1
