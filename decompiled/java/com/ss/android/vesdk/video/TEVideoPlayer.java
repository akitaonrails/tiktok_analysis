package com.ss.android.vesdk.video;

import com.ss.android.ttve.nativePort.TENativeLibsLoader;
import com.ss.android.ttvecamera.TECameraFrame;

/* JADX INFO: loaded from: classes21.dex */
public class TEVideoPlayer {
    public final long mHandle = nativeCreate();

    private native long nativeCreate();

    private native void nativeDestroy(long j);

    private native TECameraFrame nativeGetFrame(long j);

    private native void nativePause(long j);

    private native void nativePlay(long j);

    private native void nativeSeek(long j, long j2);

    private native void nativeSetLoop(long j, boolean z);

    private native long nativeSetVideoSource(long j, String str);

    private native void nativeSetVolume(long j, float f);

    public void destroy() {
        nativeDestroy(this.mHandle);
    }

    public TECameraFrame getFrame() {
        return nativeGetFrame(this.mHandle);
    }

    public void pause() {
        nativePause(this.mHandle);
    }

    public void play() {
        nativePlay(this.mHandle);
    }

    static {
        TENativeLibsLoader.loadLibrary();
    }

    public void seek(long j) {
        nativeSeek(this.mHandle, j);
    }

    public void setLoop(boolean z) {
        nativeSetLoop(this.mHandle, z);
    }

    public void setVideoSource(String str) {
        nativeSetVideoSource(this.mHandle, str);
    }

    public void setVolume(float f) {
        nativeSetVolume(this.mHandle, f);
    }
}
