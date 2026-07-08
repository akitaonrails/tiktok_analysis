package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("linkmic_layout_data_pb_encoder")
public final class LinkMicLayoutDataPbEncoder {
    public static final boolean DEFAULT = true;
    public static final LinkMicLayoutDataPbEncoder INSTANCE = new LinkMicLayoutDataPbEncoder();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_layout_data_pb_encoder", DEFAULT);
    }
}
