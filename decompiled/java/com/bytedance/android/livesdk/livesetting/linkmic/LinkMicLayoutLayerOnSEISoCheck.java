package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_layout_layer_on_sei_so_check")
public final class LinkMicLayoutLayerOnSEISoCheck {
    public static final boolean DEFAULT = true;
    public static final LinkMicLayoutLayerOnSEISoCheck INSTANCE = new LinkMicLayoutLayerOnSEISoCheck();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("link_mic_layout_layer_on_sei_so_check", DEFAULT);
    }
}
