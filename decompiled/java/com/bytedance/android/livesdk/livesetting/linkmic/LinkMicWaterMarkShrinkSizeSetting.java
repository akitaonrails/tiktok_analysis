package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_watermark_shrink_size")
public final class LinkMicWaterMarkShrinkSizeSetting {
    public static final LinkMicWaterMarkShrinkSizeSetting INSTANCE = new LinkMicWaterMarkShrinkSizeSetting();
    public static final float DEFAULT = 0.5f;

    public final float getValue() {
        return SettingsManager.INSTANCE.getFloatValue("linkmic_watermark_shrink_size", DEFAULT);
    }
}
