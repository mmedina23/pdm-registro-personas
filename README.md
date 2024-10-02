# pdm-registro-personas

## Crear almacenamiento base de datos local

````shell
PS C:\> cd D:\workSpaceInstNetbeas\pdm-registro-personas
PS D:\workSpaceInstNetbeas\pdm-registro-personas> java -cp C:\Users\user\.m2\repository\com\h2database\h2\2.1.210\h2-2.1.210.jar org.h2.tools.Shell

Welcome to H2 Shell 2.1.210 (2022-01-17)
Exit with Ctrl+C
[Enter]   jdbc:h2:mem:test_db
URL       jdbc:h2:./test_db
[Enter]   org.h2.Driver
Driver
[Enter]   guest
User
Password

Type the same password again to confirm database creation.
Password

Connected
Commands are case insensitive; SQL statements end with ';'
help or ?      Display this help
list           Toggle result list / stack trace mode
maxwidth       Set maximum column width (default is 100)
autocommit     Enable or disable autocommit
history        Show the last 20 statements
quit or exit   Close the connection and exit

sql>
````

## query crear bd esquema y tablas

> [h2 database tutorial](https://h2database.com/html/tutorial.html)