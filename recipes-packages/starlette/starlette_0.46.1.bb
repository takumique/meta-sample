SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

PYPI_PACKAGE = "starlette"

SRC_URI[sha256sum] = "3c88d58ee4bd1bb807c0d1acb381838afc7752f9ddaec81bbe4383611d833230"

inherit pypi python_hatchling

RDEPENDS:${PN} = " \
    ${PYTHON_PN}-typing-extensions \
    ${PYTHON_PN}-anyio \
"
