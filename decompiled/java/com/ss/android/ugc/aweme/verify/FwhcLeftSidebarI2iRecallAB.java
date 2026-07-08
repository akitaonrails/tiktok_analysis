package com.ss.android.ugc.aweme.verify;

import X.C01GW;
import X.C452501pT;
import kotlin.jvm.internal.AFwS214S0000000_25;

/* JADX INFO: loaded from: classes26.dex */
public final class FwhcLeftSidebarI2iRecallAB {
    public static final boolean DISABLE = false;
    public static final boolean ENABLE = true;
    public static final FwhcLeftSidebarI2iRecallAB INSTANCE = new FwhcLeftSidebarI2iRecallAB();
    public static final C01GW value$delegate = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(261));

    private final boolean getValue() {
        return ((Boolean) value$delegate.getValue()).booleanValue();
    }

    public static final boolean isEnabled() {
        return INSTANCE.getValue();
    }
}
