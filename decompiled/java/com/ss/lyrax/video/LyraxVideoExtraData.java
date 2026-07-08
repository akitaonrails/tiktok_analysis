package com.ss.lyrax.video;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxVideoExtraData {
    public byte channelId;
    public ByteBuffer seiData;

    public LyraxVideoExtraData() {
    }

    public byte getChannelId() {
        return this.channelId;
    }

    public ByteBuffer getSeiData() {
        return this.seiData;
    }

    public void setChannelId(byte b) {
        this.channelId = b;
    }

    public void setSeiData(ByteBuffer byteBuffer) {
        if (byteBuffer != null && !byteBuffer.isDirect()) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(byteBuffer.remaining());
            byteBufferAllocateDirect.position(0);
            byteBufferAllocateDirect.put(byteBuffer);
            byteBufferAllocateDirect.rewind();
            this.seiData = byteBufferAllocateDirect;
            return;
        }
        this.seiData = byteBuffer;
    }

    public LyraxVideoExtraData(byte b, ByteBuffer byteBuffer) {
        setChannelId(b);
        setSeiData(byteBuffer);
    }

    public void updateInfo(byte b, ByteBuffer byteBuffer) {
        setChannelId(b);
        setSeiData(byteBuffer);
    }
}
