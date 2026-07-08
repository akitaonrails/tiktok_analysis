package com.ss.ttlivestreamer.core.effect;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public class EffectImageInfo {
    public int format;
    public int height;
    public ByteBuffer imageBuffer;
    public int orientation;
    public int stride;
    public int width;

    public int getFormat() {
        return this.format;
    }

    public int getHeight() {
        return this.height;
    }

    public ByteBuffer getImageBuffer() {
        return this.imageBuffer;
    }

    public int getOrientation() {
        return this.orientation;
    }

    public int getStride() {
        return this.stride;
    }

    public int getWidth() {
        return this.width;
    }

    public EffectImageInfo(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5) {
        this.imageBuffer = byteBuffer;
        this.width = i;
        this.height = i2;
        this.stride = i3;
        this.format = i4;
        this.orientation = i5;
    }
}
