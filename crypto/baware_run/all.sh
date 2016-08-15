#!/bin/bash

dir=`dirname "$0"`

runs=(
  sd.sh
  md.sh
  ld.sh
)

contexts=(
  hc
  mc
  lc
)

blevels=(
  0.90
  0.70
  0.40
)

export PANDA_RUNS=11

echo "Running crypto"

export PANDA_RECOVER=true

for i in `seq 0 2`; do
  export ENT_BATTERY_LEVEL=${blevels[$i]}

  for rn in ${runs[@]}; do
    echo "Starting ${contexts[$i]} ${rn}"
    $(./$rn ${contexts[$i]} > /dev/null)  
    echo "Completed ${contexts[$i]} ${rn}"
  done
done

export PANDA_RECOVER=false

for i in `seq 0 2`; do
  export ENT_BATTERY_LEVEL=${blevels[$i]}

  for rn in ${runs[@]}; do
    echo "Starting ${contexts[$i]}u ${rn}"
    $(./$rn ${contexts[$i]}u > /dev/null)  
    echo "Completed ${contexts[$i]}u ${rn}"
  done
done

