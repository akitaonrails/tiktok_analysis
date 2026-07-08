package com.bytedance.android.livesdk.livesetting;

import X.C01GW;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_active_watch_show_interval")
public final class LiveActiveWatchShowIntervalSetting {
    public static final LiveActiveWatchShowIntervalSetting INSTANCE = new LiveActiveWatchShowIntervalSetting();
    public static final long DEFAULT = 259200;
    public static final C01GW value$delegate = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(58));

    public final long getValue() {
        return ((Number) value$delegate.getValue()).longValue();
    }
}
