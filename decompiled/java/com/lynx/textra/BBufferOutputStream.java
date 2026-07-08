package com.lynx.textra;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes14.dex */
public class BBufferOutputStream {
    public final ByteBuffer byteBuffer;

    public byte[] getByteArray() {
        return this.byteBuffer.array();
    }

    public BBufferOutputStream(int i) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
        this.byteBuffer = byteBufferAllocate;
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
    }

    public BBufferOutputStream writeByte(byte b) {
        this.byteBuffer.put(b);
        return this;
    }

    public BBufferOutputStream writeFloat(float f) {
        this.byteBuffer.putFloat(f);
        return this;
    }

    public BBufferOutputStream writeInt(int i) {
        this.byteBuffer.putInt(i);
        return this;
    }

    public BBufferOutputStream writeLong(long j) {
        this.byteBuffer.putLong(j);
        return this;
    }

    public BBufferOutputStream writeShort(short s) {
        this.byteBuffer.putShort(s);
        return this;
    }
}
