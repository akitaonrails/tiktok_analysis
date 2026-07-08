package com.bytedance.compression.zstd;

import X.AbstractC2252851DFr;
import X.C08RS;

/* JADX INFO: loaded from: classes36.dex */
public class ZstdDictDecompress extends AbstractC2252851DFr {
    public long nativePtr;

    private native void free();

    private native void init(byte[] bArr, int i, int i2);

    @Override // X.AbstractC2252811DFn
    public void doClose() {
        if (this.nativePtr != 0) {
            free();
            this.nativePtr = 0L;
        }
    }

    static {
        C08RS.LIZ();
    }

    @Override // X.AbstractC2252811DFn, java.io.Closeable, java.lang.AutoCloseable
    public /* bridge */ /* synthetic */ void close() {
        super.close();
    }

    public ZstdDictDecompress(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public ZstdDictDecompress(byte[] bArr, int i, int i2) {
        init(bArr, i, i2);
        if (this.nativePtr != 0) {
            storeFence();
            return;
        }
        throw new IllegalStateException("ZSTD_createDDict failed");
    }
}
