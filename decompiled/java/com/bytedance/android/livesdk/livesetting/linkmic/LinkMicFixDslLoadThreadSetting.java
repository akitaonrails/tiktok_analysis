package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("linkmic_fix_dsl_load_thread_setting")
public final class LinkMicFixDslLoadThreadSetting {
    public static final boolean DEFAULT = false;
    public static final LinkMicFixDslLoadThreadSetting INSTANCE = new LinkMicFixDslLoadThreadSetting();

    public static final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_fix_dsl_load_thread_setting", DEFAULT);
    }
}
