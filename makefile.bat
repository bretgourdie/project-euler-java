cd ProjectEuler
del *.class 2>NUL
"javac.exe" -classpath "." *.java
for /D %%i in (*) do cd "%%i" && del *.class 2>NUL && "javac.exe" -classpath "." *.java & cd ..
cd ..
