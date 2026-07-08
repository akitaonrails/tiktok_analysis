package com.ttnet.org.chromium.net.impl;

import X.EnumC1495340p12;

/* JADX INFO: loaded from: classes24.dex */
public class TTCompressManager {
    public static native byte[] nativeCompressData(byte[] bArr, int i, int i2, int i3);

    public static native byte[] nativeDecompressData(byte[] bArr, int i, int i2);

    public static byte[] LIZIZ(byte[] bArr, int i, EnumC1495340p12 enumC1495340p12) {
        return nativeDecompressData(bArr, i, enumC1495340p12.getValue());
    }

    public static byte[] LIZ(byte[] bArr, int i, int i2, EnumC1495340p12 enumC1495340p12) {
        return nativeCompressData(bArr, i, i2, enumC1495340p12.getValue());
    }
}
