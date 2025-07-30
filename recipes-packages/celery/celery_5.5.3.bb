SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/BSD-3-Clause;md5=550794465ba0ec5312d6919e203a55f9"

PYPI_PACKAGE = "celery"

SRC_URI[sha256sum] = "6c972ae7968c2b5281227f01c3a3f984037d21c5129d07bf3550cc2afc6b10a5"

inherit pypi python_setuptools_build_meta

RDEPENDS:${PN} = " \
    billiard \
    ${PYTHON_PN}-click \
    click-didyoumean \
    click-plugins \
    click-repl \
    kombu \
    ${PYTHON_PN}-dateutil \
    vine \
"
