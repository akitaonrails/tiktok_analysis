package com.bytedance.android.livesdk.livesetting.feed;

import X.C01GW;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_nearby_tab")
public final class LiveNearbyTabSetting {
    public static final LiveNearbyTabSetting INSTANCE = new LiveNearbyTabSetting();
    public static final Config DEFAULT = new Config(false, true, true, false, 180000);
    public static final C01GW _value$delegate = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(61));

    private final Config get_value() {
        return (Config) _value$delegate.getValue();
    }

    public final boolean backSmooth() {
        return getValue().backSmooth;
    }

    public final boolean enable() {
        return getValue().enable;
    }

    public final Config getValue() {
        return get_value();
    }
}
