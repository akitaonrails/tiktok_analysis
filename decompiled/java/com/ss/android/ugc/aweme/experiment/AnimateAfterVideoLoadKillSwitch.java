package com.ss.android.ugc.aweme.experiment;

import X.C0C64;

/* JADX INFO: loaded from: classes5.dex */
public final class AnimateAfterVideoLoadKillSwitch {
    public static final int $stable = 0;
    public static final boolean DISABLE = false;
    public static final AnimateAfterVideoLoadKillSwitch INSTANCE = new AnimateAfterVideoLoadKillSwitch();
    public static final boolean ENABLE = true;

    public final boolean isEnabled() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "mp4_screen_animate_after_video_load_kill_switch", true, false);
    }

    public final boolean getDISABLE() {
        return DISABLE;
    }

    public final boolean getENABLE() {
        return ENABLE;
    }
}
