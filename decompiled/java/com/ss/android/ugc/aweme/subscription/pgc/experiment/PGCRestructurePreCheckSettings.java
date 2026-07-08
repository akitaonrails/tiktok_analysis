package com.ss.android.ugc.aweme.subscription.pgc.experiment;

import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
public final class PGCRestructurePreCheckSettings {
    public static final int $stable = 0;
    public static final boolean DEFAULT = true;
    public static final PGCRestructurePreCheckSettings INSTANCE = new PGCRestructurePreCheckSettings();

    public final boolean isEnabled() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LIZ("pgc_restructure_precheck_enabled", true);
    }
}
