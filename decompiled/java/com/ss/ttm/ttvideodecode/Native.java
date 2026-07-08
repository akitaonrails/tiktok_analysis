package com.ss.ttm.ttvideodecode;

/* JADX INFO: loaded from: classes14.dex */
public class Native {
    public static native byte[] _encryptAesCbc128(byte[] bArr, byte[] bArr2);

    public static native String _getDecodedStr(byte[] bArr, byte[] bArr2);

    public static native byte[] _getSignature(String str);

    public static native int _getSupportedMethod();

    public static int LIZIZ() {
        return _getSupportedMethod();
    }

    public static String LIZ(byte[] bArr, byte[] bArr2) {
        return _getDecodedStr(bArr, bArr2);
    }
}
