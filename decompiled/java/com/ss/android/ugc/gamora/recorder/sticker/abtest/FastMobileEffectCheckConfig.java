package com.ss.android.ugc.gamora.recorder.sticker.abtest;

import X.C01GW;
import X.C452501pT;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class FastMobileEffectCheckConfig {
    public static final boolean OFF = false;
    public static final boolean ON = true;
    public static final FastMobileEffectCheckConfig INSTANCE = new FastMobileEffectCheckConfig();
    public static final C01GW isEnabled$delegate = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2185));
    public static final int $stable = 8;

    public final boolean isEnabled() {
        return ((Boolean) isEnabled$delegate.getValue()).booleanValue();
    }
}
