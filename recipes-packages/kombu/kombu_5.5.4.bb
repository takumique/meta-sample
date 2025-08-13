SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/BSD-3-Clause;md5=550794465ba0ec5312d6919e203a55f9"

PYPI_PACKAGE = "kombu"

SRC_URI[sha256sum] = "886600168275ebeada93b888e831352fe578168342f0d1d5833d88ba0d847363"

inherit pypi python_setuptools_build_meta

RDEPENDS:${PN} = " \
    python3-tzdata \
    amqp \
"
