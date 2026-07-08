package com.bytedance.android.livesdk.livesetting.feed;

import X.C01GW;
import X.C292401Bi;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "toplive_net_opt_v2")
public final class TopLiveNetOptV2 {
    public static final TopLiveNetOptV2 INSTANCE = new TopLiveNetOptV2();
    public static final TopLiveNetOptConfigV2 DEFAULT = new TopLiveNetOptConfigV2();
    public static final C01GW _value$delegate = C292401Bi.LIZ(AFwS193S0000000_7.get$arr$(63));

    private final TopLiveNetOptConfigV2 get_value() {
        return (TopLiveNetOptConfigV2) _value$delegate.getValue();
    }

    public final TopLiveNetOptConfigV2 getValue() {
        return get_value();
    }
}
