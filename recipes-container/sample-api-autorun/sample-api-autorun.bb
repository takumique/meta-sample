SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://."
S = "${WORKDIR}/sources"
UNPACKDIR = "${S}"

inherit systemd

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/run-sample-api.sh ${D}${bindir}/run-sample-api.sh
    install -d ${D}${systemd_unitdir}/system
    install -m 0644 ${S}/sample-api.service ${D}${systemd_unitdir}/system/sample-api.service
}

FILES:${PN} += "${bindir}/run-sample-api.sh"
FILES:${PN} += "${systemd_unitdir}/system/sample-api.service"

# SYSTEMD_AUTO_ENABLE:${PN} = "enable"
SYSTEMD_SERVICE:${PN} = "sample-api.service"

RDEPENDS:${PN} = "sample-api-preload"
