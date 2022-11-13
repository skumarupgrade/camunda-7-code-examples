#!/bin/bash

mountPath=$(pwd)/pluginlibs/
userLibPath=$(pwd)/configuration/userlib/

ECHO "copy Plugin Jars from=> ${mountPath} to => ${userLibPath}"

cp *.jar -fr "${mountPath}" "${userLibPath}"

ECHO "Now starting camunda via ./camunda.sh"

exec ./camunda.sh