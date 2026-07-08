package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C01GW;
import X.C292401Bi;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("watch_live_mem_opt_setting")
public final class WatchLiveMemOpt {
    public static final int DEFAULT = 0;
    public static final WatchLiveMemOpt INSTANCE = new WatchLiveMemOpt();
    public static final C01GW value$delegate = C292401Bi.LIZ(AFwS205S0000000_17.get$arr$(94));

    public static final boolean enableLikeHelperTouchListenerFix() {
        return (INSTANCE.getValue() & 2) != 0;
    }

    public static final boolean enableNpthListenerFix() {
        return (INSTANCE.getValue() & 1) != 0;
    }

    private final int getValue() {
        return ((Number) value$delegate.getValue()).intValue();
    }
}
