package com.lynx.textra;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes21.dex */
public class BBufferInputStream {
    public final byte[] buffer;
    public final ByteBuffer byteBuffer;

    public char ReadChar() {
        return this.byteBuffer.getChar();
    }

    public int ReadVarInt32() {
        int i = this.byteBuffer.get() & 255;
        int i2 = i & 127;
        int i3 = 7;
        while (i > 127) {
            i = this.byteBuffer.get() & 255;
            i2 |= (i & 127) << i3;
            i3 += 7;
        }
        return i2;
    }

    public int available() {
        return this.byteBuffer.limit() - this.byteBuffer.position();
    }

    public byte readByte() {
        return this.byteBuffer.get();
    }

    public float readFloat() {
        return this.byteBuffer.getFloat();
    }

    public int readInt() {
        return this.byteBuffer.getInt();
    }

    public long readLong() {
        return this.byteBuffer.getLong();
    }

    public short readShort() {
        return this.byteBuffer.getShort();
    }

    public String ReadCString() {
        int i = readInt();
        if (i == 0) {
            return "";
        }
        int iPosition = this.byteBuffer.position();
        this.byteBuffer.position(iPosition + i);
        return new String(this.buffer, iPosition, i, Charset.defaultCharset());
    }

    public BBufferInputStream(byte[] bArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        this.byteBuffer = byteBufferWrap;
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        this.buffer = bArr;
    }

    public void read(byte[] bArr, int i, int i2) {
        this.byteBuffer.get(bArr, i, i2);
    }
}
