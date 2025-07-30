SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "git://github.com/takumique/sample-core.git;branch=main;protocol=https"
SRCREV = "a1ba0e1da48bc57986bca890c95f6c28deaaa495"
S = "${WORKDIR}/sources"
UNPACKDIR = "${S}"

do_install() {
    install -d ${D}${bindir}/sample
    install -m 0755 ${S}/git/app/tasks.py ${D}${bindir}/sample/tasks.py
    install -m 0755 ${S}/git/run-sample-core.sh ${D}${bindir}/run-sample-core.sh
}
