package com.ss.android.ugc.aweme.shortvideo.aigc.abtest;

import X.C0C64;

/* JADX INFO: loaded from: classes9.dex */
public final class AIGCEffectPathRedesignExperiment {
    public static final int CONTROL = 0;
    public static final AIGCEffectPathRedesignExperiment INSTANCE = new AIGCEffectPathRedesignExperiment();
    public static final int V1 = 1;
    public static final boolean isEnabled;

    static {
        isEnabled = C0C64.LJIILLIIL().LJIJ(31744, 0, "aigc_effect_path_refactor", true) == 1;
    }

    public final boolean isEnabled() {
        return isEnabled;
    }
}
