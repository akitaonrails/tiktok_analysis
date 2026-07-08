package com.ss.android.ugc.gamora.recorder.sticker.abtest;

import X.C01GW;
import X.C452501pT;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class AIGCGenerationOptimizationConfig {
    public static final int CONTROL = 0;
    public static final int V1 = 1;
    public static final int V2 = 2;
    public static final AIGCGenerationOptimizationConfig INSTANCE = new AIGCGenerationOptimizationConfig();
    public static final C01GW isEnabled$delegate = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2184));
    public static final int $stable = 8;

    public final boolean isEnabled() {
        return ((Boolean) isEnabled$delegate.getValue()).booleanValue();
    }
}
