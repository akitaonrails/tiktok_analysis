package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("bug_fix_voice_chat_avatar_setting")
public final class BugFixVoiceChatAvatarSetting {
    public static final int DEFAULT = 1;
    public static final BugFixVoiceChatAvatarSetting INSTANCE = new BugFixVoiceChatAvatarSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("bug_fix_voice_chat_avatar_setting", DEFAULT);
    }

    public final boolean enable() {
        return getValue() == 1;
    }
}
