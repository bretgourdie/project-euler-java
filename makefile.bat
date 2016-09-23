rem del *.class 2>NUL
for /D %%i in (*) do cd "%%i" && del *.class && "C:\Program Files\Java\jdk1.8.0_05\bin\javac.exe" *.java && cd ..
