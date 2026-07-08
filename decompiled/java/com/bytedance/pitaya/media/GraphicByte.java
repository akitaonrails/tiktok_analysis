package com.bytedance.pitaya.media;

import com.bytedance.pitaya.jniwrapper.ReflectionCall;

/* JADX INFO: loaded from: classes27.dex */
public final class GraphicByte implements ReflectionCall {
    public byte[] byteArr;
    public int format;
    public int height;
    public int width;

    public final byte[] getByteArr() {
        return this.byteArr;
    }

    public final int getFormat() {
        return this.format;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public final void setByteArr(byte[] bArr) {
        this.byteArr = bArr;
    }

    public final void setFormat(int i) {
        this.format = i;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setWidth(int i) {
        this.width = i;
    }
}
