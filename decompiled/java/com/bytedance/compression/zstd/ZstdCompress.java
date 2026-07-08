package com.bytedance.compression.zstd;

import X.C08RS;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes36.dex */
public class ZstdCompress {
    public static native long compressBound(long j);

    public static native int defaultCompressionLevel();

    public static native int loadDictCompress(long j, byte[] bArr, int i);

    public static native int loadFastDictCompress(long j, ZstdDictCompress zstdDictCompress);

    public static native int maxCompressionLevel();

    public static native int minCompressionLevel();

    public static native int setCompressionChecksums(long j, boolean z);

    public static native int setCompressionLevel(long j, int i);

    public static native int setCompressionLong(long j, int i);

    public static native int setCompressionWorkers(long j, int i);

    static {
        C08RS.LIZ();
    }

    public static byte[] compress(byte[] bArr) {
        return compress(bArr, defaultCompressionLevel());
    }

    public static byte[] compress(byte[] bArr, ZstdDictCompress zstdDictCompress) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.loadDict(zstdDictCompress);
            zstdCompressCtx.setLevel(zstdDictCompress.level());
            byte[] bArrCompress = zstdCompressCtx.compress(bArr);
            zstdCompressCtx.close();
            return bArrCompress;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            zstdCompressCtx.close();
            throw th;
        }
    }

    public static byte[] compress(byte[] bArr, int i) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.setLevel(i);
            byte[] bArrCompress = zstdCompressCtx.compress(bArr);
            zstdCompressCtx.close();
            return bArrCompress;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            zstdCompressCtx.close();
            throw th;
        }
    }

    public static byte[] compress(byte[] bArr, byte[] bArr2, int i) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.loadDict(bArr2);
            zstdCompressCtx.setLevel(i);
            byte[] bArrCompress = zstdCompressCtx.compress(bArr);
            zstdCompressCtx.close();
            return bArrCompress;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            zstdCompressCtx.close();
            throw th;
        }
    }

    public static int compress(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4, ZstdDictCompress zstdDictCompress) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.loadDict(zstdDictCompress);
            zstdCompressCtx.setLevel(zstdDictCompress.level());
            int iCompressByteArray = zstdCompressCtx.compressByteArray(bArr, i, i2, bArr2, i3, i4);
            zstdCompressCtx.close();
            return iCompressByteArray;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            zstdCompressCtx.close();
            throw th;
        }
    }

    public static int compress(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4, int i5) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.setLevel(i5);
            int iCompressByteArray = zstdCompressCtx.compressByteArray(bArr, i, i2, bArr2, i3, i4);
            zstdCompressCtx.close();
            return iCompressByteArray;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            zstdCompressCtx.close();
            throw th;
        }
    }
}
