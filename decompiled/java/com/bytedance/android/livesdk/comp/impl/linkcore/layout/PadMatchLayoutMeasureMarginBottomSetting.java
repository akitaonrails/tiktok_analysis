package com.bytedance.android.livesdk.comp.impl.linkcore.layout;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_match_pad_layout_measure_margin_bottom_setting")
public final class PadMatchLayoutMeasureMarginBottomSetting {
    public static final PadMatchLayoutMeasureMarginBottomSetting INSTANCE = new PadMatchLayoutMeasureMarginBottomSetting();
    public static final float DEFAULT = 93.0f;

    public final float getValue() {
        return SettingsManager.INSTANCE.getFloatValue("live_match_pad_layout_measure_margin_bottom_setting", DEFAULT);
    }
}
