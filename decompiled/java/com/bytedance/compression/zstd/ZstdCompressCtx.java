package com.bytedance.compression.zstd;

import X.AbstractC2252811DFn;
import X.C08RS;
import X.C2252871DFt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;

/* JADX INFO: loaded from: classes36.dex */
public class ZstdCompressCtx extends AbstractC2252811DFn {
    public ZstdDictCompress compression_dict;
    public long nativePtr;

    private native long compressByteArray0(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4);

    private native void free();

    private native void init();

    private native long loadCDict0(byte[] bArr);

    private native long loadCDictFast0(ZstdDictCompress zstdDictCompress);

    private native long reset0();

    private native void setChecksum0(boolean z);

    private native void setContentSize0(boolean z);

    private native void setDictID0(boolean z);

    private native void setLevel0(int i);

    private native long setPledgedSrcSize0(long j);

    private void ensureOpen() {
        if (this.nativePtr == 0) {
            throw new IllegalStateException("Compression context is closed");
        }
    }

    @Override // X.AbstractC2252811DFn
    public void doClose() {
        if (this.nativePtr != 0) {
            free();
            this.nativePtr = 0L;
        }
    }

    public ZstdCompressCtx() {
        init();
        if (0 == this.nativePtr) {
            throw new IllegalStateException("ZSTD_createCompressCtx failed");
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

    public byte[] compress(byte[] bArr) {
        long jCompressBound = ZstdCompress.compressBound(bArr.length);
        if (jCompressBound <= 2147483647L) {
            int i = (int) jCompressBound;
            byte[] bArr2 = new byte[i];
            return Arrays.copyOfRange(bArr2, 0, compressByteArray(bArr2, 0, i, bArr, 0, bArr.length));
        }
        throw new C2252871DFt(Zstd.errGeneric(), "Max output size is greater than MAX_INT");
    }

    public ZstdCompressCtx loadDict(ZstdDictCompress zstdDictCompress) {
        if (this.nativePtr != 0) {
            acquireSharedLock();
            zstdDictCompress.acquireSharedLock();
            try {
                long jLoadCDictFast0 = loadCDictFast0(zstdDictCompress);
                if (!Zstd.isError(jLoadCDictFast0)) {
                    this.compression_dict = zstdDictCompress;
                    zstdDictCompress.releaseSharedLock();
                    releaseSharedLock();
                    return this;
                }
                throw new C2252871DFt(jLoadCDictFast0);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                zstdDictCompress.releaseSharedLock();
                releaseSharedLock();
                throw th;
            }
        }
        throw new IllegalStateException("Compression context is closed");
    }

    public ZstdCompressCtx setChecksum(boolean z) {
        if (this.nativePtr != 0) {
            acquireSharedLock();
            setChecksum0(z);
            releaseSharedLock();
            return this;
        }
        throw new IllegalStateException("Compression context is closed");
    }

    public ZstdCompressCtx setContentSize(boolean z) {
        if (this.nativePtr != 0) {
            acquireSharedLock();
            setContentSize0(z);
            releaseSharedLock();
            return this;
        }
        throw new IllegalStateException("Compression context is closed");
    }

    public ZstdCompressCtx setDictID(boolean z) {
        if (this.nativePtr != 0) {
            acquireSharedLock();
            setDictID0(z);
            releaseSharedLock();
            return this;
        }
        throw new IllegalStateException("Compression context is closed");
    }

    public ZstdCompressCtx setLevel(int i) {
        if (this.nativePtr != 0) {
            acquireSharedLock();
            setLevel0(i);
            releaseSharedLock();
            return this;
        }
        throw new IllegalStateException("Compression context is closed");
    }

    public ZstdCompressCtx setLong(int i) {
        if (this.nativePtr != 0) {
            acquireSharedLock();
            ZstdCompress.setCompressionLong(this.nativePtr, i);
            releaseSharedLock();
            return this;
        }
        throw new IllegalStateException("Compression context is closed");
    }

    public void setPledgedSrcSize(long j) {
        ensureOpen();
        long pledgedSrcSize0 = setPledgedSrcSize0(j);
        if (!Zstd.isError(pledgedSrcSize0)) {
        } else {
            throw new C2252871DFt(pledgedSrcSize0);
        }
    }

    public ZstdCompressCtx setWorkers(int i) {
        acquireSharedLock();
        ZstdCompress.setCompressionWorkers(this.nativePtr, i);
        releaseSharedLock();
        return this;
    }

    public ZstdCompressCtx loadDict(byte[] bArr) {
        if (this.nativePtr != 0) {
            acquireSharedLock();
            try {
                long jLoadCDict0 = loadCDict0(bArr);
                if (!Zstd.isError(jLoadCDict0)) {
                    this.compression_dict = null;
                    releaseSharedLock();
                    return this;
                }
                throw new C2252871DFt(jLoadCDict0);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                releaseSharedLock();
                throw th;
            }
        }
        throw new IllegalStateException("Compression context is closed");
    }

    public int compress(byte[] bArr, byte[] bArr2) {
        return compressByteArray(bArr, 0, bArr.length, bArr2, 0, bArr2.length);
    }

    public int compressByteArray(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        if (this.nativePtr != 0) {
            acquireSharedLock();
            try {
                long jCompressByteArray0 = compressByteArray0(bArr, i, i2, bArr2, i3, i4);
                if (!Zstd.isError(jCompressByteArray0)) {
                    if (jCompressByteArray0 <= 2147483647L) {
                        int i5 = (int) jCompressByteArray0;
                        releaseSharedLock();
                        return i5;
                    }
                    throw new C2252871DFt(Zstd.errGeneric(), "Output size is greater than MAX_INT");
                }
                throw new C2252871DFt(jCompressByteArray0);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                releaseSharedLock();
                throw th;
            }
        }
        throw new IllegalStateException("Compression context is closed");
    }
}
