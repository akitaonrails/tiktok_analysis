package com.bytedance.android.livesdk.comp.impl.linkcore.layout;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_match_pad_layout_measure_margin_top_setting")
public final class PadMatchLayoutMeasureMarginTopSetting {
    public static final PadMatchLayoutMeasureMarginTopSetting INSTANCE = new PadMatchLayoutMeasureMarginTopSetting();
    public static final float DEFAULT = 52.0f;

    public final float getValue() {
        return SettingsManager.INSTANCE.getFloatValue("live_match_pad_layout_measure_margin_top_setting", DEFAULT);
    }
}
