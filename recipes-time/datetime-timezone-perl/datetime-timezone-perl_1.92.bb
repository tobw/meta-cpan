DESCRIPTION = "This class is the base class for all time zone objects. A time zone is \
represented internally as a set of observances, each of which describes the \
offset from GMT for a given time period."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/DateTime-TimeZone"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/DateTime-TimeZone-1.92.tar.gz"

SRC_URI[md5sum] = "15e541682078981f1866ca1fbb6d4d90"
SRC_URI[sha256sum] = "98f7641721a49560fc5781fa04407c501a39bd824745ad2496656c544941e161"
RDEPENDS_${PN} += "class-singleton-perl"
RDEPENDS_${PN} += "list-allutils-perl"
RDEPENDS_${PN} += "module-runtime-perl"
RDEPENDS_${PN} += "params-validate-perl"
RDEPENDS_${PN} += "try-tiny-perl"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-requires-perl-native"

S = "${WORKDIR}/DateTime-TimeZone-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
