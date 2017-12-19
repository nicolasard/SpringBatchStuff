call setenv.bat

cd %APP_HOME%/bin

rem Ejemplo de parametro expArchivoEmbozado

rem java -cp "C:\E\nicRepos\SpringBanchStuff\SB_Example4\target\example2-1.0-SNAPSHOT.jar" org.springframework.batch.core.launch.support.CommandLineJobRunner conf/SpringScheduler.xml %1

java org.springframework.batch.core.launch.support.CommandLineJobRunner conf/SpringScheduler.xml %1
