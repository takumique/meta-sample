SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

PYPI_PACKAGE = "fastapi"

SRC_URI[sha256sum] = "80dc0794627af0390353a6d1171618276616310d37d24faba6648398e57d687a"

inherit pypi python_setuptools_build_meta

DEPENDS += " \
    ${PYTHON_PN}-pdm-native \
    ${PYTHON_PN}-pdm-backend-native \
"

RDEPENDS:${PN} = " \
    ${PYTHON_PN}-pydantic \
    ${PYTHON_PN}-pydantic-core \
    ${PYTHON_PN}-starlette \
    ${PYTHON_PN}-typing-extensions \
    ${PYTHON_PN}-click \
"
