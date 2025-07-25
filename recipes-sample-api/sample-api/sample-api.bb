SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

# SRC_URI = "https://github.com/takumique/sample-api-server.git"
# S = "${WORKDIR}/git"
SRC_URI = "file://."
S = "${WORKDIR}/sources"
UNPACKDIR = "${S}"

do_install() {
    install -d ${D}${bindir}/sample
    install -m 0755 ${S}/app/main.py ${D}${bindir}/sample/main.py
    install -m 0755 ${S}/run-sample-api.sh ${D}${bindir}/run-sample-api.sh
}
