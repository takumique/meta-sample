SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "git://github.com/takumique/sample-api.git;branch=main;protocol=https"
SRCREV = "73295e269cd5b3e33cabe1f18954f7b102f501b9"
S = "${WORKDIR}/sources"
UNPACKDIR = "${S}"

do_install() {
    install -d ${D}${bindir}/sample
    install -m 0755 ${S}/git/app/main.py ${D}${bindir}/sample/main.py
    install -m 0755 ${S}/git/app/tasks.py ${D}${bindir}/sample/tasks.py
    install -m 0755 ${S}/git/run-sample-api.sh ${D}${bindir}/run-sample-api.sh
}
