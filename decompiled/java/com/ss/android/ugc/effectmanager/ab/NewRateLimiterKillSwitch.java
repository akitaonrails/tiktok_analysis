package com.ss.android.ugc.effectmanager.ab;

import X.C0C64;

/* JADX INFO: loaded from: classes5.dex */
public final class NewRateLimiterKillSwitch {
    public static final boolean DISABLE = false;
    public static final boolean ENABLE = true;
    public static final NewRateLimiterKillSwitch INSTANCE = new NewRateLimiterKillSwitch();

    public final boolean isEnabled() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "disable_new_rate_limit_for_monitor_service", true, false);
    }
}
