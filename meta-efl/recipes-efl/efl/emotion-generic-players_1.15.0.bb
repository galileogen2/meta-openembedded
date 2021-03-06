require ${BPN}.inc

SRC_URI = "\
    ${E_RELEASES}/libs/${SRCNAME}/${SRCNAME}-${SRCVER}.tar.gz \
"

SRC_URI[md5sum] = "68627c1aabf5b7fe084299adcc0b73c1"
SRC_URI[sha256sum] = "10bad633480a691585b0ba470c573b14da0a010008d9d59d0792cea8c621d423"

PNBLACKLIST[emotion-generic-players] ?= "Depends on blacklisted emotion - the recipe will be removed on 2017-09-01 unless the issue is fixed"

PNBLACKLIST[emotion-generic-players] ?= "Runtime depends on blacklisted emotion-generic-players - the recipe will be removed on 2017-09-01 unless the issue is fixed"

PNBLACKLIST[emotion-generic-players] ?= "Runtime depends on blacklisted emotion-generic-players-dev - the recipe will be removed on 2017-09-01 unless the issue is fixed"
