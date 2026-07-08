package com.bytedance.android.livesdk.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_new_multi_feed_room_source_list")
public final class MultiFeedRoomSourceSetting {
    public static final MultiFeedRoomSourceSetting INSTANCE = new MultiFeedRoomSourceSetting();
    public static final String[] DEFAULT = {"music_spotlight_live_cell"};

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("live_new_multi_feed_room_source_list", DEFAULT);
    }
}
