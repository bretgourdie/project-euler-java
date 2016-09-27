cd ProjectEuler
for /D %%i in (*) do cd "%%i" && del *.class 2>NUL && "javac.exe" -classpath "." *.java & cd ..
cd ..
