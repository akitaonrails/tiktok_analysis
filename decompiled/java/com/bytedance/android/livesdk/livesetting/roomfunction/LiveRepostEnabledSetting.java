package com.bytedance.android.livesdk.livesetting.roomfunction;

import X.C01GW;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_repost_enabled")
public final class LiveRepostEnabledSetting {
    public static final boolean DEFAULT = false;
    public static final boolean ENABLE = true;
    public static final LiveRepostEnabledSetting INSTANCE = new LiveRepostEnabledSetting();
    public static final C01GW enabled$delegate = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(87));

    private final boolean getEnabled() {
        return ((Boolean) enabled$delegate.getValue()).booleanValue();
    }

    public final boolean getValue() {
        return getEnabled();
    }
}
