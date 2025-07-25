SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

PYPI_PACKAGE = "uvicorn"

SRC_URI[sha256sum] = "bc662f087f7cf2ce11a1d7fd70b90c9f98ef2e2831556dd078d131b96cc94a01"

inherit pypi python_hatchling

DEPENDS += " \
    ${PYTHON_PN}-hatchling \
"

RDEPENDS:${PN} = " \
    ${PYTHON_PN}-h11 \
"
