SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/BSD-3-Clause;md5=550794465ba0ec5312d6919e203a55f9"

PYPI_PACKAGE = "click-plugins"

SRC_URI[sha256sum] = "46ab999744a9d831159c3411bb0c79346d94a444df9a3a3742e9ed63645f264b"

inherit pypi python_setuptools_build_meta
