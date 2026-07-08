package com.bytedance.android.livesdk.comp.api.subscription.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "sub_live_only_chat_stay_ms")
public final class SubLiveOnlyChatStayMsSetting {
    public static final int DEFAULT = 120;
    public static final SubLiveOnlyChatStayMsSetting INSTANCE = new SubLiveOnlyChatStayMsSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("sub_live_only_chat_stay_ms", DEFAULT);
    }
}
