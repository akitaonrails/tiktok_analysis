package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("should_layout_prefetch_setting")
public final class LinkMicShouldLayoutPrefetchSetting {
    public static final boolean DEFAULT = false;
    public static final LinkMicShouldLayoutPrefetchSetting INSTANCE = new LinkMicShouldLayoutPrefetchSetting();

    public static final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("should_layout_prefetch_setting", DEFAULT);
    }
}
