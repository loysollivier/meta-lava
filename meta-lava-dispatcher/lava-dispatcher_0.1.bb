SUMMARY="A test to build lava-dispatcher"

DEPENDS = ""
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"

SRCREV = "0853cfa10d9c3c812eb556d7971ec52ecdc245f7"
SRC_URI = "git://github.com/Linaro/lava-dispatcher.git;branch=release"
SRC_URI[md5sum] = "a4bce7125af4ca8fe51d4dffad0c0402"

S = "${WORKDIR}/git"

# lzma in meta-vitualization/
# noze in meta/
# rest in meta-openembedded/
# guestfs in this layer

RDEPENDS_${PN} = "\
    ${PYTHON_PN}-argparse \
    ${PYTHON_PN}-daemon \
    ${PYTHON_PN}-json \
    ${PYTHON_PN}-logging \
    ${PYTHON_PN}-pytz \
    ${PYTHON_PN}-pyudev \
    ${PYTHON_PN}-pyyaml \
    ${PYTHON_PN}-pyzmq \
    ${PYTHON_PN}-requests \
    ${PYTHON_PN}-subprocess \
    ${PYTHON_PN}-shell \
    ${PYTHON_PN}-backports-lzma \
    ${PYTHON_PN}-nose \
    ${PYTHON_PN}-guestfs \    
"

inherit setuptools

SRC_URI_append = " \
                  file://fix-lzma-backports.patch \
"