package com.ss.android.ugc.aweme.subscription.pgc.experiment;

import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
public final class PGCRestructureDebugIndicator {
    public static final int $stable = 0;
    public static final boolean DEFAULT = false;
    public static final PGCRestructureDebugIndicator INSTANCE = new PGCRestructureDebugIndicator();

    public final boolean isEnabled() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LIZ("pgc_restructure_debug_indicator", false);
    }
}
