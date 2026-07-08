package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("live_intro_web_url")
public final class LiveIntroLynxUrl {
    public static final String DEFAULT = "";
    public static final LiveIntroLynxUrl INSTANCE = new LiveIntroLynxUrl();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_intro_web_url", DEFAULT);
    }
}
