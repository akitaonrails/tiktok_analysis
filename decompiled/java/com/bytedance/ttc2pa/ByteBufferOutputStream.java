package com.bytedance.ttc2pa;

import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes35.dex */
public final class ByteBufferOutputStream extends OutputStream {
    public final ByteBuffer LL;

    public ByteBufferOutputStream(ByteBuffer byteBuffer) {
        this.LL = byteBuffer;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.LL.put((byte) i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.LL.put(bArr, i, i2);
    }
}
