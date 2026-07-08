package com.ss.ttm.player;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes24.dex */
public abstract class MediaTransport extends NativeObject {

    public static class MediaPacket {
        public void set(ByteBuffer byteBuffer, boolean z, boolean z2, int i, int i2, long j, int i3, int i4) {
        }
    }

    private native void nativeSetFilterType(int i);

    public abstract void sendPacket(MediaPacket mediaPacket);
}
