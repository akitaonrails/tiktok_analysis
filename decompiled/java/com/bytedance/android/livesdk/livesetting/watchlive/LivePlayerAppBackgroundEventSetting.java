package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C01GW;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_player_app_background_event")
public final class LivePlayerAppBackgroundEventSetting {
    public static final boolean DEFAULT = false;
    public static final LivePlayerAppBackgroundEventSetting INSTANCE = new LivePlayerAppBackgroundEventSetting();
    public static final C01GW _value$delegate = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(59));

    public static final boolean enable() {
        return INSTANCE.get_value();
    }

    private final boolean get_value() {
        return ((Boolean) _value$delegate.getValue()).booleanValue();
    }
}
