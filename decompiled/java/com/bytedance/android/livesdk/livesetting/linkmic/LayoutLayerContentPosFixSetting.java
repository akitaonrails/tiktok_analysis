package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("layout_layer_content_pos_fix")
public final class LayoutLayerContentPosFixSetting {
    public static final boolean DEFAULT = true;
    public static final LayoutLayerContentPosFixSetting INSTANCE = new LayoutLayerContentPosFixSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("layout_layer_content_pos_fix", DEFAULT);
    }
}
