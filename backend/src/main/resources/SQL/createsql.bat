@echo off


REM Set MySQL variables
set "HOST=localhost"
set "USER=root"
set "PASSWORD=praveen"
set "SQL_FILE=%~dp0\create.sql"

mysql -h %HOST% -u %USER% -p%PASSWORD% < "%SQL_FILE%"

