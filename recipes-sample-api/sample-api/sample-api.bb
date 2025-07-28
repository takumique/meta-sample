SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "git://github.com/takumique/sample-api.git;branch=main;protocol=https"
SRCREV = "248f800ea7e7609de1a929c8d180ec3bc07748d4"
S = "${WORKDIR}/sources"
UNPACKDIR = "${S}"

do_install() {
    install -d ${D}${bindir}/sample
    install -m 0755 ${S}/git/app/main.py ${D}${bindir}/sample/main.py
    install -m 0755 ${S}/git/run-sample-api.sh ${D}${bindir}/run-sample-api.sh
}
