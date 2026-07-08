package com.ss.ttm.player;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes24.dex */
public abstract class AudioProcessor extends NativeObject {
    public abstract void audioClose();

    public abstract void audioOpen(int i, int i2, int i3, int i4);

    public abstract void audioProcess(ByteBuffer[] byteBufferArr, int i, long j);

    public abstract void audioRelease(int i);
}
