package com.lynx.canvas.capi;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class BitmapDecodeResult {
    public final ByteBuffer LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    public ByteBuffer getBuffer() {
        return this.LIZ;
    }

    public int getHeight() {
        return this.LIZJ;
    }

    public int getWidth() {
        return this.LIZIZ;
    }

    public BitmapDecodeResult(ByteBuffer byteBuffer, int i, int i2) {
        this.LIZ = byteBuffer;
        this.LIZIZ = i;
        this.LIZJ = i2;
    }
}
