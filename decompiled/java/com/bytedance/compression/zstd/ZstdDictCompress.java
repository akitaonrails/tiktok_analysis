package com.bytedance.compression.zstd;

import X.AbstractC2252851DFr;
import X.C08RS;

/* JADX INFO: loaded from: classes36.dex */
public class ZstdDictCompress extends AbstractC2252851DFr {
    public int level;
    public long nativePtr;

    private native void free();

    private native void init(byte[] bArr, int i, int i2, int i3);

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

    public int level() {
        return this.level;
    }

    public ZstdDictCompress(byte[] bArr, int i) {
        this(bArr, 0, bArr.length, i);
    }

    public ZstdDictCompress(byte[] bArr, int i, int i2, int i3) {
        ZstdCompress.defaultCompressionLevel();
        this.level = i3;
        if (bArr.length - i >= 0) {
            init(bArr, i, i2, i3);
            if (0 != this.nativePtr) {
                storeFence();
                return;
            }
            throw new IllegalStateException("ZSTD_createCDict failed");
        }
        throw new IllegalArgumentException("Dictionary buffer is to short");
    }
}
