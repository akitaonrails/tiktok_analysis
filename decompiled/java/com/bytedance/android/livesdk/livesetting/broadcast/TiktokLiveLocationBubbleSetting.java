package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "tiktok_live_location_bubble")
public final class TiktokLiveLocationBubbleSetting {
    public static final TiktokLiveLocationBubbleSetting INSTANCE = new TiktokLiveLocationBubbleSetting();
    public static final BubbleConfig DEFAULT = new BubbleConfig(false, 0, 604800000, 10000, 3, 2, 5000);
    public static final C01GW _value$delegate = C452501pT.LIZ(EnumC452301pR.NONE, AFwS193S0000000_7.get$arr$(59));

    public static final BubbleConfig getValue() {
        return INSTANCE.get_value();
    }

    private final BubbleConfig get_value() {
        return (BubbleConfig) _value$delegate.getValue();
    }
}
