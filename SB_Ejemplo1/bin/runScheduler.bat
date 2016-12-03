
call setenv.bat

echo Ejecutando Scheduler...

java -DAPP_CONFIG=%APP_HOME%/conf -cp %CLASSPATH% com.springbatch.common.RunScheduler conf/SpringScheduler.xml $1
