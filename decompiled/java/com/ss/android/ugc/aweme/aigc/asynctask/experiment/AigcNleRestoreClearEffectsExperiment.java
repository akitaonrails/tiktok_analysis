package com.ss.android.ugc.aweme.aigc.asynctask.experiment;

import X.C0C64;

/* JADX INFO: loaded from: classes5.dex */
public final class AigcNleRestoreClearEffectsExperiment {
    public static final int ALL = 4;
    public static final int DISABLED = 0;
    public static final int EFFECT_ONLY = 1;
    public static final int FILTER_ONLY = 2;
    public static final AigcNleRestoreClearEffectsExperiment INSTANCE = new AigcNleRestoreClearEffectsExperiment();
    public static final int TRANSITION_ONLY = 3;

    public static final int getCase() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "aigc_nle_restore_clear_effects", true);
    }

    public static final boolean isEnabled() {
        return getCase() != 0;
    }
}
