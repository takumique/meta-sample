SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "EDL-1.0 | EPL-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/EDL-1.0;md5=e06be17b8577bf6e2277a5c3c71b2d05 \
                    file://${COMMON_LICENSE_DIR}/EPL-2.0;md5=2dd765ca47a05140be15ebafddbeadfe \
"

PYPI_PACKAGE = "paho_mqtt"

SRC_URI[sha256sum] = "12d6e7511d4137555a3f6ea167ae846af2c7357b10bc6fa4f7c3968fc1723834"

inherit pypi python_hatchling
