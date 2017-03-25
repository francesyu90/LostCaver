#! /bin/bash

set -e
if [ "$#" -lt 1 ]
then
	echo "Need one file"
	exit
elif [ "$#" -ge 2 ]
then
	echo "Accept one file only"
else
	INPUTFILE=$1
	javac -d target src/LostCaver.java
	java -cp target LostCaver $INPUTFILE
fi