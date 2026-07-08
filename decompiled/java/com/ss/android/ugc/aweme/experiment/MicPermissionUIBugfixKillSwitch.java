package com.ss.android.ugc.aweme.experiment;

import X.C0C64;

/* JADX INFO: loaded from: classes5.dex */
public final class MicPermissionUIBugfixKillSwitch {
    public static final int $stable = 0;
    public static final boolean DISABLE = false;
    public static final MicPermissionUIBugfixKillSwitch INSTANCE = new MicPermissionUIBugfixKillSwitch();
    public static final boolean ENABLE = true;

    public final boolean isEnabled() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "mic_permission_ui_bug_fix_kill_switch", true, false);
    }

    public final boolean getDISABLE() {
        return DISABLE;
    }

    public final boolean getENABLE() {
        return ENABLE;
    }
}
