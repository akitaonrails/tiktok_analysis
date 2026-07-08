package com.bytedance.compression.zstd;

import X.AbstractC2252811DFn;
import X.C08RS;
import X.C2252871DFt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;

/* JADX INFO: loaded from: classes36.dex */
public class ZstdDecompressCtx extends AbstractC2252811DFn {
    public ZstdDictDecompress decompression_dict;
    public long nativePtr;

    private native long decompressByteArray0(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4);

    private native void free();

    private native void init();

    private native long loadDDict0(byte[] bArr);

    private native long loadDDictFast0(ZstdDictDecompress zstdDictDecompress);

    private native long reset0();

    private void ensureOpen() {
        if (this.nativePtr == 0) {
            throw new IllegalStateException("Decompression context is closed");
        }
    }

    @Override // X.AbstractC2252811DFn
    public void doClose() {
        if (this.nativePtr != 0) {
            free();
            this.nativePtr = 0L;
        }
    }

    public ZstdDecompressCtx() {
        init();
        if (0 == this.nativePtr) {
            throw new IllegalStateException("ZSTD_createDeCompressCtx failed");
        }
        storeFence();
    }

    public void reset() {
        ensureOpen();
        long jReset0 = reset0();
        if (Zstd.isError(jReset0)) {
            throw new C2252871DFt(jReset0);
        }
    }

    static {
        C08RS.LIZ();
    }

    @Override // X.AbstractC2252811DFn, java.io.Closeable, java.lang.AutoCloseable
    public /* bridge */ /* synthetic */ void close() {
        super.close();
    }

    public ZstdDecompressCtx loadDict(ZstdDictDecompress zstdDictDecompress) {
        if (this.nativePtr != 0) {
            acquireSharedLock();
            zstdDictDecompress.acquireSharedLock();
            try {
                long jLoadDDictFast0 = loadDDictFast0(zstdDictDecompress);
                if (!Zstd.isError(jLoadDDictFast0)) {
                    this.decompression_dict = zstdDictDecompress;
                    zstdDictDecompress.releaseSharedLock();
                    releaseSharedLock();
                    return this;
                }
                throw new C2252871DFt(jLoadDDictFast0);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                zstdDictDecompress.releaseSharedLock();
                releaseSharedLock();
                throw th;
            }
        }
        throw new IllegalStateException("Decompression context is closed");
    }

    public ZstdDecompressCtx loadDict(byte[] bArr) {
        if (this.nativePtr != 0) {
            acquireSharedLock();
            try {
                long jLoadDDict0 = loadDDict0(bArr);
                if (!Zstd.isError(jLoadDDict0)) {
                    this.decompression_dict = null;
                    releaseSharedLock();
                    return this;
                }
                throw new C2252871DFt(jLoadDDict0);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                releaseSharedLock();
                throw th;
            }
        }
        throw new IllegalStateException("Compression context is closed");
    }

    public byte[] decompress(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        int iDecompress = decompress(bArr2, bArr);
        if (iDecompress != i) {
            return Arrays.copyOfRange(bArr2, 0, iDecompress);
        }
        return bArr2;
    }

    public int decompress(byte[] bArr, byte[] bArr2) {
        return decompressByteArray(bArr, 0, bArr.length, bArr2, 0, bArr2.length);
    }

    public int decompressByteArray(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        if (this.nativePtr != 0) {
            acquireSharedLock();
            try {
                long jDecompressByteArray0 = decompressByteArray0(bArr, i, i2, bArr2, i3, i4);
                if (!Zstd.isError(jDecompressByteArray0)) {
                    if (jDecompressByteArray0 <= 2147483647L) {
                        int i5 = (int) jDecompressByteArray0;
                        releaseSharedLock();
                        return i5;
                    }
                    throw new C2252871DFt(Zstd.errGeneric(), "Output size is greater than MAX_INT");
                }
                throw new C2252871DFt(jDecompressByteArray0);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                releaseSharedLock();
                throw th;
            }
        }
        throw new IllegalStateException("Decompression context is closed");
    }
}
