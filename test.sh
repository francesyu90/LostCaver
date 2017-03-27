javac -d tests/bin -cp .:tests/bin/junit-4.12.jar ./main/src/utils/*.java  ./main/src/character/*.java \
    ./main/src/assets/*.java ./tests/src/utils/*.java ./tests/src/character/*.java

java -classpath tests/bin:tests/bin/junit-4.12.jar:tests/bin/hamcrest-core-1.3.jar \
    org.junit.runner.JUnitCore utils.DirectionTest utils.InstructionTest \
    character.CaverTest


