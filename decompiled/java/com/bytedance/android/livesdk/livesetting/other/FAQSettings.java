package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_subscribe_need_show_faq")
public final class FAQSettings {
    public static final boolean DEFAULT = false;
    public static final FAQSettings INSTANCE = new FAQSettings();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_subscribe_need_show_faq", DEFAULT);
    }
}
