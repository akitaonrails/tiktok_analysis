package com.facebook.common.time;

import X.InterfaceC1331160kkE;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes21.dex */
public class RealtimeSinceBootClock implements InterfaceC1331160kkE {
    public static final RealtimeSinceBootClock INSTANCE = new RealtimeSinceBootClock();

    @Override // X.InterfaceC1331160kkE
    public long now() {
        return SystemClock.elapsedRealtime();
    }

    public static RealtimeSinceBootClock get() {
        return INSTANCE;
    }
}
