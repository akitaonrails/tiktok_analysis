package com.ss.ttlivestreamer.core.engine;

import X.InterfaceC1267890j6B;
import android.os.Handler;
import com.ss.ttlivestreamer.core.utils.TEBundle;

/* JADX INFO: loaded from: classes21.dex */
public class SITICalculator extends NativeObject {
    public String GetPerformance() {
        return null;
    }

    public void enable(boolean z) {
    }

    public int getCurPlxCategory() {
        return 0;
    }

    public boolean isEnabled() {
        return false;
    }

    public void onStrategyCalculated(int i, String str) {
    }

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        super.release();
    }

    public void setParameters(TEBundle tEBundle) {
    }

    public void setSITIEventObserver(InterfaceC1267890j6B interfaceC1267890j6B) {
    }

    public boolean isValid() {
        return this.mNativeObj != 0;
    }

    public SITICalculator(Handler handler, int i, int i2) {
    }
}
