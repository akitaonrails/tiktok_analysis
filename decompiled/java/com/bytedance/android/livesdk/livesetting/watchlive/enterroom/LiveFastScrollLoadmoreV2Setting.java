package com.bytedance.android.livesdk.livesetting.watchlive.enterroom;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_fast_scroll_loadmore_v2")
public final class LiveFastScrollLoadmoreV2Setting {
    public static final boolean DEFAULT = false;
    public static final LiveFastScrollLoadmoreV2Setting INSTANCE = new LiveFastScrollLoadmoreV2Setting();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_fast_scroll_loadmore_v2", DEFAULT);
    }

    public static final boolean isDisable() {
        return !isEnable();
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
