#!/bin/sh

dir=`dirname "$0"`

if [ $# -ne 1 ]; then
  echo "sd usage: [ESTIMATED_LEVEL]"
  exit
fi

export PANDA_RUNS=5
#export PANDA_RECOVER=false
export PANDA_RECOVER=true
ent -cp $dir/../build/classes camera.Main 2048 1536
mv mode.txt run_md_${1}.txt
