package com.bytedance.compression.zstd;

import X.C08RS;
import X.C2252871DFt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes36.dex */
public class ZstdDecompress {
    public static native boolean decompressZstdFile(String str, String str2);

    public static native long decompressedSize0(byte[] bArr, int i, int i2);

    public static native int loadDictDecompress(long j, byte[] bArr, int i);

    public static native int loadFastDictDecompress(long j, ZstdDictDecompress zstdDictDecompress);

    static {
        C08RS.LIZ();
    }

    public static byte[] decompress(byte[] bArr) {
        long jDecompressedSize = decompressedSize(bArr);
        if (jDecompressedSize <= 2147483647L) {
            return decompress(bArr, (int) jDecompressedSize);
        }
        throw new C2252871DFt(Zstd.errGeneric(), "original size is greater than MAX_INT");
    }

    public static long decompressedSize(byte[] bArr) {
        return decompressedSize(bArr, 0);
    }

    public static byte[] decompress(byte[] bArr, ZstdDictDecompress zstdDictDecompress) {
        long jDecompressedSize = decompressedSize(bArr);
        if (jDecompressedSize <= 2147483647L) {
            return decompress(bArr, zstdDictDecompress, (int) jDecompressedSize);
        }
        throw new C2252871DFt(Zstd.errGeneric(), "original size is greater than MAX_INT");
    }

    public static long decompressedSize(byte[] bArr, int i) {
        return decompressedSize(bArr, i, bArr.length - i);
    }

    public static byte[] decompress(byte[] bArr, byte[] bArr2) {
        long jDecompressedSize = decompressedSize(bArr);
        if (jDecompressedSize <= 2147483647L) {
            return decompress(bArr, bArr2, (int) jDecompressedSize);
        }
        throw new C2252871DFt(Zstd.errGeneric(), "original size is greater than MAX_INT");
    }

    public static byte[] decompress(byte[] bArr, int i) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            byte[] bArrDecompress = zstdDecompressCtx.decompress(bArr, i);
            zstdDecompressCtx.close();
            return bArrDecompress;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            zstdDecompressCtx.close();
            throw th;
        }
    }

    public static byte[] decompress(byte[] bArr, ZstdDictDecompress zstdDictDecompress, int i) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            zstdDecompressCtx.loadDict(zstdDictDecompress);
            byte[] bArrDecompress = zstdDecompressCtx.decompress(bArr, i);
            zstdDecompressCtx.close();
            return bArrDecompress;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            zstdDecompressCtx.close();
            throw th;
        }
    }

    public static long decompressedSize(byte[] bArr, int i, int i2) {
        if (i < bArr.length) {
            int i3 = i + i2;
            if (i3 <= bArr.length) {
                return decompressedSize0(bArr, i, i2);
            }
            throw new ArrayIndexOutOfBoundsException(i3);
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public static byte[] decompress(byte[] bArr, byte[] bArr2, int i) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            zstdDecompressCtx.loadDict(bArr2);
            byte[] bArrDecompress = zstdDecompressCtx.decompress(bArr, i);
            zstdDecompressCtx.close();
            return bArrDecompress;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            zstdDecompressCtx.close();
            throw th;
        }
    }
}
