#!/bin/sh

TARGET_REPOSITORY=$1
TARGET_TAG=$2
IMAGE_FILE=$3

# trap subshell error, code 1 is SUCCESS_PUBLISH
set -E
trap '[ "$?" -ne 1 ] || exit 0' ERR

docker images --format "table {{.Repository}} {{.Tag}}" |
while read row; do
    repository=`echo ${row} | cut -d " " -f 1`
    tag=`echo ${row} | cut -d " " -f 2`
    if [[ "${repository}" == ${TARGET_REPOSITORY} ]]; then
        if [[ "${tag}" == ${TARGET_TAG} ]]; then
            exit 1
        fi
    fi
done

docker import ${IMAGE_FILE} ${TARGET_REPOSITORY}:${TARGET_TAG}

exit 0
