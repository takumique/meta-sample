SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

PYPI_PACKAGE = "tzdata"

SRC_URI[sha256sum] = "2674120f8d891909751c38abcdfd386ac0a5a1127954fbc332af6b5ceae07efd"

inherit pypi python_setuptools_build_meta
