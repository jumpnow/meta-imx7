require linux-stable.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

KERNEL_CONFIG_COMMAND = "oe_runmake_call -C ${S} CC="${KERNEL_CC}" O=${B} olddefconfig"

COMPATIBLE_MACHINE = "imx7ulpevk"

KERNEL_DEVICETREE = "\
    nxp/imx/imx7ulp-evk.dtb \
"

LINUX_VERSION = "6.12"

FILESEXTRAPATHS:prepend := "${THISDIR}/linux-stable-${LINUX_VERSION}:"

S = "${WORKDIR}/git"

PV = "6.12.7"
SRCREV = "319addc2ad901dac4d6cc931d77ef35073e0942f"
SRC_URI = " \
    git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;branch=linux-${LINUX_VERSION}.y \
    file://defconfig \
    file://0001-Remove-reference-to-local-filesystem-in-generated-co.patch \
"
