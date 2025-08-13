SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

PYPI_PACKAGE = "click-didyoumean"

SRC_URI[sha256sum] = "f184f0d851d96b6d29297354ed981b7dd71df7ff500d82fa6d11f0856bee8035"

inherit pypi python_poetry_core
