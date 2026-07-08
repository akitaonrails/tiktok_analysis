package com.bytedance.android.livesdk.livesetting;

import X.C01GW;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_active_watch_guide_setting")
public final class LiveActiveWatchGuideSetting {
    public static final LiveActiveWatchGuideSetting INSTANCE = new LiveActiveWatchGuideSetting();
    public static final LiveActiveWatchGuideConfig DEFAULT = new LiveActiveWatchGuideConfig(false, "toplive", 1, false);
    public static final C01GW config$delegate = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(57));

    public final LiveActiveWatchGuideConfig getConfig() {
        return (LiveActiveWatchGuideConfig) config$delegate.getValue();
    }
}
