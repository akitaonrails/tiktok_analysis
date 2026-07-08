package com.ss.ttlivestreamer.core.engine;

import X.InterfaceC1270340jA8;
import com.ss.ttlivestreamer.core.utils.TEBundle;

/* JADX INFO: loaded from: classes21.dex */
public class VsyncModule extends NativeObject {
    public InternalObserver mInternalObserver;

    private native void nativeAdjustLastTimeMills(long j, String str, long j2);

    private native long nativeComputeDiffAtNowMills(long j, String str);

    private native long nativeComputeDiffMs(long j, String str, String str2);

    private native long nativeConvertToNowMills(long j, String str, long j2);

    private native long nativeGetFirstFrameTimestampMs(long j, String str);

    private native long nativeGetMaxIntevalMs(long j, String str);

    private native TEBundle nativeGetOption(long j);

    private native boolean nativeIsEnable(long j);

    private native long nativeLastOriginTimeMills(long j, String str);

    private native long nativeLastTimeMills(long j, String str);

    public static native long nativeNowNanos();

    private native void nativeRegisertObserver(long j, InternalObserver internalObserver);

    private native void nativeRelease(long j);

    private native void nativeReset(long j);

    private native void nativeResetWithTrack(long j, String str);

    private native void nativeSetEnable(long j, boolean z);

    private native void nativeSetOption(long j, TEBundle tEBundle);

    private native void nativeSetupOriginAudioTrackId(long j, String str);

    private native void nativeSetupOriginVideoTrackId(long j, String str);

    private native void nativeUnRegisertObserver(long j, InternalObserver internalObserver);

    private native long nativeUpdateTimeMs(long j, String str, long j2);

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        if (this.mInternalObserver != null) {
            nativeUnRegisertObserver(this.mNativeObj, this.mInternalObserver);
        }
        nativeRelease(this.mNativeObj);
        this.mNativeObj = 0L;
        InternalObserver internalObserver = this.mInternalObserver;
        if (internalObserver != null) {
            internalObserver.release();
            this.mInternalObserver = null;
        }
    }

    public TEBundle getOption() {
        return nativeGetOption(this.mNativeObj);
    }

    public boolean isEnable() {
        return nativeIsEnable(this.mNativeObj);
    }

    public void reset() {
        nativeReset(this.mNativeObj);
    }

    public static long nowNanos() {
        return nativeNowNanos();
    }

    public String toString() {
        return super.toString();
    }

    public class InternalObserver extends NativeObject implements InterfaceC1270340jA8 {
        public InterfaceC1270340jA8 LL;

        public InternalObserver() {
        }

        public final synchronized void registerObserver(InterfaceC1270340jA8 interfaceC1270340jA8) {
            this.LL = interfaceC1270340jA8;
        }

        @Override // X.InterfaceC1270340jA8
        public void onEvent(int i, int i2, long j, String str) {
            InterfaceC1270340jA8 interfaceC1270340jA8 = this.LL;
            if (interfaceC1270340jA8 != null) {
                interfaceC1270340jA8.onEvent(i, i2, j, str);
            }
        }
    }

    public VsyncModule(long j) {
        setNativeObj(j);
    }

    public long computeDiffAtNowMills(String str) {
        return nativeComputeDiffAtNowMills(this.mNativeObj, str);
    }

    public long getFirstFrameTimestampMs(String str) {
        return nativeGetFirstFrameTimestampMs(this.mNativeObj, str);
    }

    public long getMaxIntevalMs(String str) {
        return nativeGetMaxIntevalMs(this.mNativeObj, str);
    }

    public long lastOriginTimeMills(String str) {
        return nativeLastOriginTimeMills(this.mNativeObj, str);
    }

    public long lastTimeMills(String str) {
        return nativeLastTimeMills(this.mNativeObj, str);
    }

    public synchronized void registerObserver(InterfaceC1270340jA8 interfaceC1270340jA8) {
        if (this.mInternalObserver == null) {
            this.mInternalObserver = new InternalObserver();
            nativeRegisertObserver(this.mNativeObj, this.mInternalObserver);
        }
        this.mInternalObserver.registerObserver(interfaceC1270340jA8);
    }

    public void reset(String str) {
        nativeResetWithTrack(this.mNativeObj, str);
    }

    public void setEnable(boolean z) {
        nativeSetEnable(this.mNativeObj, z);
    }

    public void setOption(TEBundle tEBundle) {
        nativeSetOption(this.mNativeObj, tEBundle);
    }

    public void setupOriginAudioTrackId(String str) {
        nativeSetupOriginAudioTrackId(this.mNativeObj, str);
    }

    public void setupOriginVideoTrackId(String str) {
        nativeSetupOriginVideoTrackId(this.mNativeObj, str);
    }

    public void adjustLastTimeMills(String str, long j) {
        nativeAdjustLastTimeMills(this.mNativeObj, str, j);
    }

    public long computeDiffMs(String str, String str2) {
        return nativeComputeDiffMs(this.mNativeObj, str, str2);
    }

    public long convertToNowMills(String str, long j) {
        return nativeConvertToNowMills(this.mNativeObj, str, j);
    }

    public long updateTimeMs(String str, long j) {
        return nativeUpdateTimeMs(this.mNativeObj, str, j);
    }
}
