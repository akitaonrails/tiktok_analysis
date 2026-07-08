package com.ss.pusher.core.engine;

import X.C786410Ut5;
import Y.ARunnableS120S0100000_20;
import android.os.Handler;
import com.ss.pusher.core.base.TEBundle;

/* JADX INFO: loaded from: classes21.dex */
public class SITICalculator extends NativeObject {
    public final Handler LL;
    public final int LLILLJJLI = -1;
    public boolean LLILLL = true;

    private native void nativeCreate(int i, int i2, int i3);

    private native void nativeEnable(boolean z);

    private native String nativeGetPerformance();

    private native void nativeSetParameters(TEBundle tEBundle);

    @Override // com.ss.pusher.core.engine.NativeObject, com.ss.ttlivestreamer.core.engine.NativeObject
    public final synchronized void release() {
        C786410Ut5.LJJZZIII(this.LL, new ARunnableS120S0100000_20(this, 92));
    }

    public final boolean isValid() {
        return this.mNativeObj != 0;
    }

    public final String GetPerformance() {
        return nativeGetPerformance();
    }

    public SITICalculator(Handler handler) {
        nativeCreate(1, 0, -1);
        this.LL = handler;
    }

    public final void LLIZLLLIL(TEBundle tEBundle) {
        nativeSetParameters(tEBundle);
    }

    public final void enable(boolean z) {
        this.LLILLL = z;
        nativeEnable(z);
    }
}
