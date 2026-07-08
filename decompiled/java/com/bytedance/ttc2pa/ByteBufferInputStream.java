package com.bytedance.ttc2pa;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes31.dex */
public final class ByteBufferInputStream extends InputStream {
    public final ByteBuffer LL;

    @Override // java.io.InputStream
    public final int read() {
        if (this.LL.hasRemaining()) {
            return this.LL.get() & 255;
        }
        return -1;
    }

    public ByteBufferInputStream(ByteBuffer byteBuffer) {
        this.LL = byteBuffer;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (!this.LL.hasRemaining()) {
            return -1;
        }
        int iRemaining = this.LL.remaining();
        if (i2 > iRemaining) {
            i2 = iRemaining;
        }
        this.LL.get(bArr, i, i2);
        return i2;
    }
}
