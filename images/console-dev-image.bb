SUMMARY = "A console development image for the NXP imx7ulp dev board"

require console-image.bb

DEV_SDK = " \
    binutils \
    binutils-symlinks \
    cmake \
    cpp \
    cpp-symlinks \
    elfutils elfutils-binutils \
    fmt fmt-dev \
    gcc \
    gcc-symlinks \
    g++ \
    g++-symlinks \
    gettext \
    git \
    ldd \
    libstdc++ \
    libstdc++-dev \
    libtool \
    make \
    meson \
    ninja \
    pkgconfig \
    python3-modules \
"

IMAGE_INSTALL += " \
    ${DEV_SDK} \
"

export IMAGE_BASENAME = "console-dev-image"
