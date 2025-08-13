SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://."
S = "${WORKDIR}"

do_install() {
    install -d "${D}/opt/sample"
    install -m 644 ${S}/compose.yaml ${D}/opt/sample/compose.yaml
    install -m 644 "${DEPLOY_DIR_IMAGE}/sample-api-container-image-${MACHINE}.rootfs.tar.bz2" "${D}/opt/sample"
    install -m 644 "${DEPLOY_DIR_IMAGE}/sample-core-container-image-${MACHINE}.rootfs.tar.bz2" "${D}/opt/sample"
}

FILES:${PN} = "/opt/sample/*"

DEPENDS = "sample-api-container-image sample-core-container-image"
do_install[depends] += "sample-api-container-image:do_image_complete"
do_install[depends] += "sample-core-container-image:do_image_complete"
