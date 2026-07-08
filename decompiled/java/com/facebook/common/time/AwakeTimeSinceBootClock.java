package com.facebook.common.time;

import X.InterfaceC1331160kkE;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes21.dex */
public class AwakeTimeSinceBootClock implements InterfaceC1331160kkE {
    public static final AwakeTimeSinceBootClock INSTANCE = new AwakeTimeSinceBootClock();

    @Override // X.InterfaceC1331160kkE
    public long now() {
        return SystemClock.uptimeMillis();
    }

    public static AwakeTimeSinceBootClock get() {
        return INSTANCE;
    }
}
