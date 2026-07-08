package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C01GW;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_jump_return_skylight_auto_open")
public final class LiveJumpReturnSkylightAutoOpenSetting {
    public static final int DEFAULT = 0;
    public static final LiveJumpReturnSkylightAutoOpenSetting INSTANCE = new LiveJumpReturnSkylightAutoOpenSetting();
    public static final C01GW _value$delegate = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(74));

    private final int get_value() {
        return ((Number) _value$delegate.getValue()).intValue();
    }

    public final boolean bottomTabAutoOpen() {
        return get_value() == 3 || get_value() == 2;
    }

    public final boolean topliveAutoOpen() {
        return get_value() == 3 || get_value() == 1;
    }
}
