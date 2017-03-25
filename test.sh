#! /bin/bash

set -e
if [ "$#" -lt 1 ]
then
	echo "Error: Need one file"
	exit
elif [ "$#" -ge 2 ]
then
	echo "Error: Accept one file only"
else
	INPUTFILE=$1
	javac -d bin src/*.java src/assets/*.java src/character/*.java src/utils/*.java
	java -cp bin LostCaver $INPUTFILE
fi