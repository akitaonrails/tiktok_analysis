package com.bytedance.android.livesdk.livesetting.performance;

import X.C01GW;
import X.C292401Bi;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_public_screen_visible_count_log_setting")
public final class LivePublicScreenVisibleLogSetting {
    public static final boolean DEFAULT = false;
    public static final LivePublicScreenVisibleLogSetting INSTANCE = new LivePublicScreenVisibleLogSetting();
    public static final C01GW value$delegate = C292401Bi.LIZ(AFwS205S0000000_17.get$arr$(79));

    public final boolean getValue() {
        return ((Boolean) value$delegate.getValue()).booleanValue();
    }
}
