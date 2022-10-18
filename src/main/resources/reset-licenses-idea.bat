REM Delete eval folder with licence key and options.xml which contains a reference  to it
ECHO OFF
cd\
cd "C:\Users\urkov\AppData\Roaming\JetBrains\DataGrip2020.3"
IF EXIST "eval" rmdir "eval" /s /q
IF EXIST options\other.xml del "options\other.xml"
cd\
cd "C:\Users\urkov\AppData\Roaming\JetBrains\PhpStorm2020.3"
IF EXIST "eval\" rmdir "eval" /s /q 
IF EXIST options\other.xml del "options\other.xml"
cd\
IF EXIST "eval\" rmdir "eval" /s /q
IF EXIST options\other.xml del "options\other.xml"
cd\
cd "C:\Users\urkov\AppData\Roaming\JetBrains\IntelliJIdea2020.3"
IF EXIST "eval\" del "eval" /s /q
IF EXIST "options\other.xml" del "options\other.xml"
cd\
cd Desarrollo
ECHO ON
REM Delete registry key
ECHO OFF
IF EXIST "HKEY_CURRENT_USER\Software\JavaSoft\Prefs\jetbrains\idea" reg delete "HKEY_CURRENT_USER\Software\JavaSoft\Prefs\jetbrains\idea" /f
PAUSE