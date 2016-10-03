                         del ProjectEuler\*.class 2>NUL && "javac.exe" -classpath "." ProjectEuler\*.java
for /D %%i in (ProjectEuler\*) do del %%i\*.class 2>NUL && "javac.exe" -classpath "." %%i\*.java
