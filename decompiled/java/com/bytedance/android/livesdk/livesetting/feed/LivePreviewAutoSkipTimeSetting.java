package com.bytedance.android.livesdk.livesetting.feed;

import X.C00Y7;
import X.C01GW;
import X.C292401Bi;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_preview_auto_skip_time")
public final class LivePreviewAutoSkipTimeSetting {
    public static final long DEFAULT = 100;
    public static final LivePreviewAutoSkipTimeSetting INSTANCE = new LivePreviewAutoSkipTimeSetting();
    public static final C01GW setting$delegate = C292401Bi.LIZ(AFwS206S0000000_18.get$arr$(46));

    private final long getSetting() {
        return ((Number) setting$delegate.getValue()).longValue();
    }

    public final long getValue(C00Y7 c00y7) {
        if (c00y7 != C00Y7.FYP_INNER_DRAW_EXP || getSetting() <= 20) {
            return 20L;
        }
        return getSetting();
    }
}
