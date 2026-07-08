package com.ss.pusher.core.codec;

import android.util.AndroidRuntimeException;
import com.ss.pusher.core.base.TEBundle;
import com.ss.pusher.core.buffer.VideoFrame;
import com.ss.pusher.core.engine.VideoEncoder;

/* JADX INFO: loaded from: classes21.dex */
public class NativeVideoEncoder extends VideoEncoder {
    private native String nativeGetVersion(long j);

    @Override // com.ss.pusher.core.engine.VideoEncoder
    public void RequestIDRFrame() {
        throw new AndroidRuntimeException("RequestIDRFrame");
    }

    @Override // com.ss.pusher.core.engine.VideoEncoder
    public String getEncoderInfo() {
        return nativeGetVersion(this.mNativeObj);
    }

    public NativeVideoEncoder(long j) {
        this.mNativeObj = j;
    }

    public static boolean isNativeVideoEncoderInstence(Object obj) {
        return obj instanceof NativeVideoEncoder;
    }

    @Override // com.ss.pusher.core.engine.VideoEncoder
    public int Encode(VideoFrame videoFrame) {
        throw new AndroidRuntimeException("Native direct mode");
    }

    @Override // com.ss.pusher.core.engine.VideoEncoder
    public boolean InitEncoder(TEBundle tEBundle) {
        throw new AndroidRuntimeException("Native direct mode");
    }

    @Override // com.ss.pusher.core.engine.VideoEncoder
    public void SetBitrate(int i) {
        throw new AndroidRuntimeException("SetBitrate");
    }
}
