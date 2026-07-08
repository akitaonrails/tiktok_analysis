package com.bytedance.android.livesdk.livesetting.feed;

import X.C01GW;
import X.C292401Bi;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "toplive_skylight_nearby_style")
public final class TopLiveSkylightNearbyStyle {
    public static final TopLiveSkylightNearbyStyle INSTANCE = new TopLiveSkylightNearbyStyle();
    public static final LiveSkylightNearbyStyleConfig DEFAULT = new LiveSkylightNearbyStyleConfig();
    public static final C01GW _value$delegate = C292401Bi.LIZ(AFwS193S0000000_7.get$arr$(65));

    private final LiveSkylightNearbyStyleConfig get_value() {
        return (LiveSkylightNearbyStyleConfig) _value$delegate.getValue();
    }

    public final LiveSkylightNearbyStyleConfig invoke() {
        return get_value();
    }
}
