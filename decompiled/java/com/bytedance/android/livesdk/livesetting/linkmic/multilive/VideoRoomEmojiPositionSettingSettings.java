package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "video_room_emoji_position_setting")
public final class VideoRoomEmojiPositionSettingSettings {
    public static final VideoRoomEmojiPositionSettingSettings INSTANCE = new VideoRoomEmojiPositionSettingSettings();
    public static final String DEFAULT = "";

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("video_room_emoji_position_setting", DEFAULT);
    }
}
