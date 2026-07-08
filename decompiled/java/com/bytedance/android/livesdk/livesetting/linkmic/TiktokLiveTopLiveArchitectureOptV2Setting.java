package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "tiktok_live_top_live_architecture_opt_v2")
public final class TiktokLiveTopLiveArchitectureOptV2Setting {
    public static final TiktokLiveTopLiveArchitectureOptV2Setting INSTANCE = new TiktokLiveTopLiveArchitectureOptV2Setting();
    public static final OptConfig DEFAULT = new OptConfig(false, false, false);
    public static final C01GW _value$delegate = C452501pT.LIZ(EnumC452301pR.NONE, AFwS193S0000000_7.get$arr$(68));

    private final OptConfig get_value() {
        return (OptConfig) _value$delegate.getValue();
    }

    public final OptConfig getValue() {
        return get_value();
    }
}
