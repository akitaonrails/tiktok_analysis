package com.ss.ttlivestreamer.core.engine;

import com.ss.ttlivestreamer.core.utils.TEBundle;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

/* JADX INFO: loaded from: classes21.dex */
public abstract class Receiver extends NativeObject {
    private native void nativeCloseStream();

    private native long nativeGetCurrentPos(boolean z, long j);

    private native TEBundle nativeGetOption();

    private native int nativeGetStreamInfo(TEBundle tEBundle);

    public static native int nativeMixer(Buffer buffer, Buffer buffer2, float f, float f2, int i, int i2, boolean z);

    private native int nativeOpenStream(String str);

    private native int nativeOpenStreamWithFd(int i);

    private native int nativeSeek(long j, boolean z, long j2);

    private native void nativeSetOption(TEBundle tEBundle);

    public boolean isNativeReceiver() {
        return false;
    }

    public abstract int readAudioBuffer(ByteBuffer byteBuffer, boolean z);

    public abstract int readAudioBuffer(ByteBuffer byteBuffer, boolean z, IntBuffer intBuffer);

    public abstract int readVideoBuffer(ByteBuffer byteBuffer);

    public TEBundle getOption() {
        return nativeGetOption();
    }

    public void closeStream() {
        nativeCloseStream();
    }

    public long getCurrentPos(boolean z) {
        return nativeGetCurrentPos(z, this.mNativeObj);
    }

    public int getStreamInfo(TEBundle tEBundle) {
        return nativeGetStreamInfo(tEBundle);
    }

    public int openStream(int i) {
        return nativeOpenStreamWithFd(i);
    }

    public void setOption(TEBundle tEBundle) {
        nativeSetOption(tEBundle);
    }

    public int openStream(String str) {
        return nativeOpenStream(str);
    }

    public int seek(long j, boolean z) {
        return nativeSeek(j, z, this.mNativeObj);
    }
}
