package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C01GW;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.AFwS203S0000000_15;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_interactive_page_perf_config")
public final class CoHostInviteListPerformanceSetting {
    public static final CoHostInviteListPerformanceSetting INSTANCE = new CoHostInviteListPerformanceSetting();
    public static final CoHostInviteListPerformanceConfigs DEFAULT = new CoHostInviteListPerformanceConfigs();
    public static final C01GW value$delegate = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(164));

    public final CoHostInviteListPerformanceConfigs getValue() {
        return (CoHostInviteListPerformanceConfigs) value$delegate.getValue();
    }

    public final boolean isEnabled() {
        return getValue().enable;
    }
}
