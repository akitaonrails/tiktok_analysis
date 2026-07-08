package com.bytedance.compression.zstd;

import java.io.FilterInputStream;
import java.io.InputStream;

/* JADX INFO: loaded from: classes36.dex */
public class ZstdInputStream extends FilterInputStream {
    public ZstdInputStreamNoFinalizer inner;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        return this.inner.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.inner.close();
    }

    public boolean getContinuous() {
        return this.inner.getContinuous();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return this.inner.markSupported();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        return this.inner.read();
    }

    public static long recommendedDInSize() {
        return ZstdInputStreamNoFinalizer.recommendedDInSize();
    }

    public static long recommendedDOutSize() {
        return ZstdInputStreamNoFinalizer.recommendedDOutSize();
    }

    public void finalize() {
        close();
    }

    public ZstdInputStream(InputStream inputStream) {
        super(inputStream);
        this.inner = new ZstdInputStreamNoFinalizer(inputStream);
    }

    public ZstdInputStream setContinuous(boolean z) {
        this.inner.setContinuous(z);
        return this;
    }

    public ZstdInputStream setDict(ZstdDictDecompress zstdDictDecompress) {
        this.inner.setDict(zstdDictDecompress);
        return this;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) {
        return this.inner.skip(j);
    }

    public ZstdInputStream setDict(byte[] bArr) {
        this.inner.setDict(bArr);
        return this;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        return this.inner.read(bArr, i, i2);
    }
}
