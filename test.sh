set -e
if [ "$#" -lt 1 ] || [ "$#" -gt 2 ] || ([ "$#" -eq 1 ] && [ $1 != -t ]) || ([ "$#" -eq 2 ] && [ $1 != -f ])
then
    echo "Warning: Invalid number of arguments. usage: ./test.sh -f [filename] or ./test.sh -t"
    exit
else
    FLAG=$1
    INPUTFILE=$2
    javac -d bin src/*.java src/assets/*.java src/character/*.java src/utils/*.java
    java -cp bin LostCaver $FLAG $INPUTFILE
fi