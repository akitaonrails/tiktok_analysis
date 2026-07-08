package com.bytedance.android.livesdk.livesetting.feed;

import X.C01GW;
import X.C292401Bi;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_preview_auto_skip_type")
public final class LivePreviewAutoSkipTypeSetting {
    public static final int DEFAULT = 0;
    public static final LivePreviewAutoSkipTypeSetting INSTANCE = new LivePreviewAutoSkipTypeSetting();
    public static final C01GW setting$delegate = C292401Bi.LIZ(AFwS193S0000000_7.get$arr$(62));

    private final int getSetting() {
        return ((Number) setting$delegate.getValue()).intValue();
    }

    public final int getValue() {
        return getSetting();
    }
}
