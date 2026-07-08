package com.ss.ttlivestreamer.core.engine;

import com.ss.ttlivestreamer.core.utils.TEBundle;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public abstract class AudioEncoder extends NativeObject {
    public abstract int Encode(ByteBuffer byteBuffer, int i, int i2, int i3, long j);

    public abstract boolean InitEncoder(TEBundle tEBundle);

    public abstract int SetBitrate(int i);

    public String getEncoderInfo() {
        return "";
    }

    public native void nativeEncodeError(int i, int i2);

    public native void nativeEncodeWarning(int i, int i2, int i3);

    public native void nativeEncoded(ByteBuffer byteBuffer, int i, int i2, long j);

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public void release() {
    }
}
