package com.ss.android.ugc.aweme.experiment;

import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes26.dex */
public final class SimplifyPermissionFixKillSwitch {
    public static final int $stable = 0;
    public static final SimplifyPermissionFixKillSwitch INSTANCE = new SimplifyPermissionFixKillSwitch();
    public static final boolean DEFAULT = true;

    public final boolean enable() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LIZ("simplify_permission_fix_kill_switch", true);
    }
}
