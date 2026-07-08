package com.bytedance.memrelief.pressure;

import X.C01GW;
import X.C452501pT;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class MemoryPressureWatcher {
    public static final MemoryPressureWatcher INSTANCE = new MemoryPressureWatcher();
    public static final C01GW instance$delegate = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(344));

    public static /* synthetic */ void getInstance$annotations() {
    }

    public static final GlobalMemoryPressure getInstance() {
        return (GlobalMemoryPressure) instance$delegate.getValue();
    }
}
