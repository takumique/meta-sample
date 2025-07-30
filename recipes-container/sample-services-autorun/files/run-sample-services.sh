#!/bin/sh

IMPORT_CONTAINER_IMAGE_EXEC=/usr/bin/import-container-image.sh

${IMPORT_CONTAINER_IMAGE_EXEC} sample-api latest sample-api-container-image-raspberrypi4-64.rootfs.tar.bz2
${IMPORT_CONTAINER_IMAGE_EXEC} sample-core latest sample-core-container-image-raspberrypi4-64.rootfs.tar.bz2
docker compose up
