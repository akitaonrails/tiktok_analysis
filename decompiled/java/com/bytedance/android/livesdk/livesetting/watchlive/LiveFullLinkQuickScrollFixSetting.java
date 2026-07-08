package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_full_link_quick_scroll_fix")
public final class LiveFullLinkQuickScrollFixSetting {
    public static final LiveFullLinkQuickScrollFixSetting INSTANCE = new LiveFullLinkQuickScrollFixSetting();
    public static final int DEFAULT = 1;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_full_link_quick_scroll_fix", DEFAULT);
    }

    public final boolean disableQuickScrollFix() {
        return getValue() == 0;
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }
}
