package com.ss.ttlivestreamer.core.receiver;

import com.ss.ttlivestreamer.core.engine.AudioDecoderFactory;
import com.ss.ttlivestreamer.core.engine.Receiver;
import com.ss.ttlivestreamer.core.engine.VideoDecoderFactory;
import com.ss.ttlivestreamer.core.utils.AVLog;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class NativeReceiver extends Receiver {
    private native int nativeAudioBuffer(ByteBuffer byteBuffer, boolean z, long j);

    private native int nativeAudioBufferWithTimestampMs(ByteBuffer byteBuffer, boolean z, long j, IntBuffer intBuffer);

    private native long nativeCreate(VideoDecoderFactory videoDecoderFactory, AudioDecoderFactory audioDecoderFactory);

    private native void nativeRelease();

    @Override // com.ss.ttlivestreamer.core.engine.Receiver
    public boolean isNativeReceiver() {
        return true;
    }

    @Override // com.ss.ttlivestreamer.core.engine.Receiver
    public int readVideoBuffer(ByteBuffer byteBuffer) {
        return 0;
    }

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        if (this.mNativeObj != 0) {
            nativeRelease();
            this.mNativeObj = 0L;
        }
    }

    public NativeReceiver(VideoDecoderFactory videoDecoderFactory, AudioDecoderFactory audioDecoderFactory) {
        nativeCreate(videoDecoderFactory, audioDecoderFactory);
    }

    @Override // com.ss.ttlivestreamer.core.engine.Receiver
    public int readAudioBuffer(ByteBuffer byteBuffer, boolean z) {
        return readAudioBuffer(byteBuffer, z, null);
    }

    @Override // com.ss.ttlivestreamer.core.engine.Receiver
    public int readAudioBuffer(ByteBuffer byteBuffer, boolean z, IntBuffer intBuffer) {
        if (byteBuffer == null) {
            AVLog.logToIODeviceCheckRedundancy(6, "NativeReceiver", "readAudioBuffer null", new Throwable(), "NativeReceiver.readAudioBuffer", 100000);
            return -1;
        }
        return nativeAudioBufferWithTimestampMs(byteBuffer, z, this.mNativeObj, intBuffer);
    }
}
