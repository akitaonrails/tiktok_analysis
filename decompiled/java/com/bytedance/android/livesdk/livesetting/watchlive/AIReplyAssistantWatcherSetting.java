package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("ai_reply_assistant_watcher_setting")
public final class AIReplyAssistantWatcherSetting {
    public static final boolean DEFAULT = false;
    public static final boolean ENABLE = true;
    public static final AIReplyAssistantWatcherSetting INSTANCE = new AIReplyAssistantWatcherSetting();

    public static /* synthetic */ void isEnable$annotations() {
    }

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("ai_reply_assistant_watcher_setting", DEFAULT);
    }
}
