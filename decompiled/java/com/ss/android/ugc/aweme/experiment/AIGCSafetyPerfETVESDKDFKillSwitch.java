package com.ss.android.ugc.aweme.experiment;

import X.C0C64;

/* JADX INFO: loaded from: classes5.dex */
public final class AIGCSafetyPerfETVESDKDFKillSwitch {
    public static final int $stable = 0;
    public static final boolean DISABLE = false;
    public static final AIGCSafetyPerfETVESDKDFKillSwitch INSTANCE = new AIGCSafetyPerfETVESDKDFKillSwitch();
    public static final boolean ENABLE = true;

    public final boolean isEnabled() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "aigc_safety_perf_et_vesdk_df_kill_switch", true, false);
    }

    public final boolean getDISABLE() {
        return DISABLE;
    }

    public final boolean getENABLE() {
        return ENABLE;
    }
}
