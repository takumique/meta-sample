SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/BSD-3-Clause;md5=550794465ba0ec5312d6919e203a55f9"

PYPI_PACKAGE = "amqp"

SRC_URI[sha256sum] = "cddc00c725449522023bad949f70fff7b48f0b1ade74d170a6f10ab044739432"

inherit pypi python_setuptools_build_meta

RDEPENDS:${PN} = " \
    vine \
"
