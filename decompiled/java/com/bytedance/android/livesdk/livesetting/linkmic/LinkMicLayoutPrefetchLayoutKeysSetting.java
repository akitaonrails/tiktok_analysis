package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("linkmic_layout_prefetch_layout_keys")
public final class LinkMicLayoutPrefetchLayoutKeysSetting {
    public static final LinkMicLayoutPrefetchLayoutKeysSetting INSTANCE = new LinkMicLayoutPrefetchLayoutKeysSetting();
    public static final String[] DEFAULT = new String[0];

    public static final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("linkmic_layout_prefetch_layout_keys", DEFAULT);
    }
}
