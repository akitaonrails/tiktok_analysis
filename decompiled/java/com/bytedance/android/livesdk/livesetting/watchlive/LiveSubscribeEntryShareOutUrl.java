package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("subscribe_entry_share_h5_url")
public final class LiveSubscribeEntryShareOutUrl {
    public static final LiveSubscribeEntryShareOutUrl INSTANCE = new LiveSubscribeEntryShareOutUrl();
    public static final String DEFAULT = "";

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("subscribe_entry_share_h5_url", DEFAULT);
    }

    public final String getDEFAULT() {
        return DEFAULT;
    }
}
