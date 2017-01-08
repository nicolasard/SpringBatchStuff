
call setenv.bat

echo Ejecutando Scheduler...

java -DAPP_CONFIG=%APP_HOME%/conf  -Dlog4j.configuration=conf/log4j.properties -cp %CLASSPATH% com.springbatch.common.RunScheduler conf/SpringScheduler.xml $1
