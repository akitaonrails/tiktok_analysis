package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("m2live_enable_gson_parser")
public final class M2LiveEnableGsonParserSettings {
    public static final boolean DEFAULT = false;
    public static final M2LiveEnableGsonParserSettings INSTANCE = new M2LiveEnableGsonParserSettings();

    public final boolean enabled() {
        return SettingsManager.INSTANCE.getBooleanValue("m2live_enable_gson_parser", DEFAULT);
    }
}
