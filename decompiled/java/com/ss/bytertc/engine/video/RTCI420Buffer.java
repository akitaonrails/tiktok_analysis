package com.ss.bytertc.engine.video;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class RTCI420Buffer {
    public ByteBuffer dataU;
    public ByteBuffer dataV;
    public ByteBuffer dataY;
    public int height;
    public int width;

    public ByteBuffer getDataU() {
        return this.dataU;
    }

    public ByteBuffer getDataV() {
        return this.dataV;
    }

    public ByteBuffer getDataY() {
        return this.dataY;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public void setDataU(ByteBuffer byteBuffer) {
        this.dataU = byteBuffer;
    }

    public void setDataV(ByteBuffer byteBuffer) {
        this.dataV = byteBuffer;
    }

    public void setDataY(ByteBuffer byteBuffer) {
        this.dataY = byteBuffer;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}
