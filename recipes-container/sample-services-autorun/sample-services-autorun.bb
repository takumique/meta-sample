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
    install -m 0755 ${S}/import-container-image.sh ${D}${bindir}/import-container-image.sh
    install -m 0755 ${S}/run-sample-services.sh ${D}${bindir}/run-sample-services.sh
    install -d ${D}${systemd_unitdir}/system
    install -m 0644 ${S}/sample-services.service ${D}${systemd_unitdir}/system/sample-services.service
}

FILES:${PN} += "${bindir}/import-container-image.sh"
FILES:${PN} += "${bindir}/run-sample-services.sh"
FILES:${PN} += "${systemd_unitdir}/system/sample-services.service"

# SYSTEMD_AUTO_ENABLE:${PN} = "enable"
SYSTEMD_SERVICE:${PN} = "sample-services.service"

RDEPENDS:${PN} = "sample-services-preload"
