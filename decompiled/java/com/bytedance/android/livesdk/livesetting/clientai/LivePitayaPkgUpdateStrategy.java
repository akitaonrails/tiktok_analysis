package com.bytedance.android.livesdk.livesetting.clientai;

import X.C01GW;
import X.C292401Bi;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_pitaya_pkg_update_strategy")
public final class LivePitayaPkgUpdateStrategy {
    public static final int DEFAULT = 0;
    public static final LivePitayaPkgUpdateStrategy INSTANCE = new LivePitayaPkgUpdateStrategy();
    public static final int ONLY_IN_LIVE = 1;
    public static final int ALL_TIKTOK = 2;
    public static final C01GW strategyVal$delegate = C292401Bi.LIZ(AFwS206S0000000_18.get$arr$(44));

    public final int getStrategyVal() {
        return ((Number) strategyVal$delegate.getValue()).intValue();
    }

    public final int getALL_TIKTOK() {
        return ALL_TIKTOK;
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }

    public final int getONLY_IN_LIVE() {
        return ONLY_IN_LIVE;
    }
}
