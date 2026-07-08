package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "voice_room_emoji_position_setting")
public final class VoiceRoomEmojiPositionSettingSettings {
    public static final VoiceRoomEmojiPositionSettingSettings INSTANCE = new VoiceRoomEmojiPositionSettingSettings();
    public static final String DEFAULT = "";

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("voice_room_emoji_position_setting", DEFAULT);
    }
}
