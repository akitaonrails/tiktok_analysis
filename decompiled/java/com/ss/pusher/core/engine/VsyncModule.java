package com.ss.pusher.core.engine;

import X.C1279220jOS;
import X.InterfaceC1279300jOa;
import com.ss.pusher.core.base.TEBundle;

/* JADX INFO: loaded from: classes21.dex */
public class VsyncModule extends NativeObject {
    public InternalObserver LL;

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

    @Override // com.ss.pusher.core.engine.NativeObject, com.ss.ttlivestreamer.core.engine.NativeObject
    public final synchronized void release() {
        if (this.LL != null) {
            nativeUnRegisertObserver(this.mNativeObj, this.LL);
        }
        nativeRelease(this.mNativeObj);
        this.mNativeObj = 0L;
        InternalObserver internalObserver = this.LL;
        if (internalObserver != null) {
            internalObserver.release();
            this.LL = null;
        }
    }

    public final TEBundle LLIZ() {
        return nativeGetOption(this.mNativeObj);
    }

    public final String toString() {
        return super.toString();
    }

    public class InternalObserver extends NativeObject implements InterfaceC1279300jOa {
        public InterfaceC1279300jOa LL;

        public InternalObserver() {
        }

        public final synchronized void LLIZ(C1279220jOS c1279220jOS) {
            this.LL = c1279220jOS;
        }
    }

    public VsyncModule(long j) {
        setNativeObj(j);
    }

    public final synchronized void LLIZLLLIL(C1279220jOS c1279220jOS) {
        if (this.LL == null) {
            this.LL = new InternalObserver();
            nativeRegisertObserver(this.mNativeObj, this.LL);
        }
        this.LL.LLIZ(c1279220jOS);
    }

    public final void LLJ(TEBundle tEBundle) {
        nativeSetOption(this.mNativeObj, tEBundle);
    }

    public final void setEnable(boolean z) {
        nativeSetEnable(this.mNativeObj, z);
    }
}
