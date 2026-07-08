package com.bytedance.compression.zstd;

import X.C08RS;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes36.dex */
public class Zstd {
    public static native long errGeneric();

    public static native long getErrorCode(long j);

    public static native String getErrorName(long j);

    public static native long[] getFunAddressesBySymbols(String[] strArr);

    public static native boolean isError(long j);

    static {
        C08RS.LIZ();
    }

    public static final byte[] extractArray(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            return byteBuffer.array();
        }
        throw new IllegalArgumentException("provided ByteBuffer lacks array or has non-zero arrayOffset");
    }

    public static long getFunAddressBySymbol(String str) {
        long[] funAddressesBySymbols = getFunAddressesBySymbols(new String[]{str});
        if (funAddressesBySymbols != null && funAddressesBySymbols.length == 1) {
            return funAddressesBySymbols[0];
        }
        return 0L;
    }
}
