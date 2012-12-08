#!/bin/bash

num=$(cat numCommit)
git add /home/victor/4o/FIA/Practica3/practica/src/practica2fia/controller.fcl
git commit -m "Modificación de controller: $num"
num=$(($num + 1))
echo $num > numCommit
