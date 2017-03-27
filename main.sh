set -e
if [ "$#" -lt 1 ] || [ "$#" -gt 2 ] || ([ "$#" -eq 1 ] && [ $1 != -t ]) || ([ "$#" -eq 2 ] && [ $1 != -f ])
then
    echo "Warning: Invalid number of arguments. usage: ./main.sh -f [filename] or ./main.sh -t"
    exit
else
    FLAG=$1
    INPUTFILE=$2
    javac -d main/bin main/src/*.java main/src/assets/*.java main/src/character/*.java main/src/utils/*.java
    java -cp main/bin LostCaver $FLAG $INPUTFILE
fi