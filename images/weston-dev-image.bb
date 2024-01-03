SUMMARY = "A basic weston/gtk3/gtkmm3 dev image"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

require console-dev-image.bb

FONTS = " \
    fontconfig \
    fontconfig-utils \
    ttf-bitstream-vera \
"

NET_STUFF = " \
    nng-dev \
    nng-tools \
    protobuf-dev \
    protobuf-c-dev \
"

GTK_STUFF = " \
    gtk+3-dev \
    gtkmm3-dev \
"

TSLIB = " \
    tslib-conf \
    tslib-calibrate \
    tslib \
"

WESTON_STUFF = " \
    weston-dev \
    weston-init \
"

IMAGE_INSTALL += " \
    ${FONTS} \
    ${NET_STUFF} \
    ${GTK_STUFF} \
    ${TSLIB} \
    ${WESTON_STUFF} \
"

export IMAGE_BASENAME = "weston-dev-image"
