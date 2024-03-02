SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe for breakpoint kernel module"
LICENSE = "GPL-3.0-or-later"
SRCREV = "${AUTOREV}"
PV = "1.0+git"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"
SRC_URI = "git://github.com/PolisanTheEasyNick/breakpoint_kernel_module.git;protocol=https;branch=main"
SRC_URI[sha256sum] = "73e435fda0e5cc711668aee4cc4c7999003420973a553f3cd3684340586ad1b8"
S = "${WORKDIR}/git"
MODULE_NAME = "memory"

inherit module

module_do_install() {
    install -d ${D}${nonarch_base_libdir}/modules/${KERNEL_VERSION}/kernel/${MODULE_NAME}
    install -m 0644 ${MODULE_NAME}.ko \
    ${D}${nonarch_base_libdir}/modules/${KERNEL_VERSION}/kernel/${MODULE_NAME}/${MODULE_NAME}.ko
}

RPROVIDES:${PN} += "kernel-module-breakpoint-module"
