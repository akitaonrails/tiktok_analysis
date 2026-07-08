package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_viewpager_on_measure_opt")
public final class LiveViewPagerOnMeasureOptSetting {
    public static final int DEFAULT = 0;
    public static final int ENABLE_INIT_IN_NEED = 1;
    public static final int ENABLE_INIT_IN_NEED_AND_PREPARE_FRAME_ASYNC = 3;
    public static final int ENABLE_PREPARE_FRAME_ASYNC = 2;
    public static final LiveViewPagerOnMeasureOptSetting INSTANCE = new LiveViewPagerOnMeasureOptSetting();

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_viewpager_on_measure_opt", DEFAULT);
    }

    public final boolean disableInitInNeed() {
        return (getValue() & 1) != 1;
    }

    public final boolean enableInitInNeed() {
        return (getValue() & 1) == 1;
    }

    public final boolean enablePrepareFrameAsync() {
        return (getValue() & 2) == 2;
    }
}
