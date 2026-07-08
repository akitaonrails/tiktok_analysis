package com.ss.ttlivestreamer.core.mixer;

import com.ss.ttlivestreamer.core.utils.TEBundle;

/* JADX INFO: loaded from: classes21.dex */
public abstract class NativeMixer extends Mixer {
    private native float nativeAvgCostTimePerFrameMs(long j);

    private native boolean nativeGetParameter(TEBundle tEBundle);

    private native boolean nativeSetParameter(TEBundle tEBundle);

    @Override // com.ss.ttlivestreamer.core.mixer.Mixer
    public boolean isNativeMixer() {
        return true;
    }

    public float getAvgCostTimePerFrameMs() {
        return nativeAvgCostTimePerFrameMs(this.mNativeObj);
    }

    @Override // com.ss.ttlivestreamer.core.mixer.Mixer
    public boolean getParameter(TEBundle tEBundle) {
        if (tEBundle != null) {
            return nativeGetParameter(tEBundle);
        }
        return false;
    }

    @Override // com.ss.ttlivestreamer.core.mixer.Mixer
    public boolean setParameter(TEBundle tEBundle) {
        if (tEBundle != null) {
            return nativeSetParameter(tEBundle);
        }
        return false;
    }
}
