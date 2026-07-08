package com.ss.bytertc.engine.video;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class VideoExternalData {
    public ByteBuffer data;
    public byte dataId;

    public VideoExternalData() {
    }

    public ByteBuffer getData() {
        return this.data;
    }

    public byte getDataId() {
        return this.dataId;
    }

    public void setData(ByteBuffer byteBuffer) {
        if (byteBuffer != null && !byteBuffer.isDirect()) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(byteBuffer.remaining());
            byteBufferAllocateDirect.position(0);
            byteBufferAllocateDirect.put(byteBuffer);
            byteBufferAllocateDirect.rewind();
            this.data = byteBufferAllocateDirect;
            return;
        }
        this.data = byteBuffer;
    }

    public void setDataId(byte b) {
        this.dataId = b;
    }

    public VideoExternalData(byte b, ByteBuffer byteBuffer) {
        setDataId(b);
        setData(byteBuffer);
    }
}
