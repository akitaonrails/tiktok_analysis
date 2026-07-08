package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_ignore_message_check_for_bytest")
public final class LiveIgnoreMessageCheckForBytestSetting {
    public static final boolean DEFAULT = false;
    public static final LiveIgnoreMessageCheckForBytestSetting INSTANCE = new LiveIgnoreMessageCheckForBytestSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_ignore_message_check_for_bytest", DEFAULT);
    }
}
