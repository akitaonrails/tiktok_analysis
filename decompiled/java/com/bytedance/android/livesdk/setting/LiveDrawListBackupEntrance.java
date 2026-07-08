package com.bytedance.android.livesdk.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_draw_list_backup_entrance")
public final class LiveDrawListBackupEntrance {
    public static final LiveDrawListBackupEntrance INSTANCE = new LiveDrawListBackupEntrance();
    public static final String[] DEFAULT = {"homepage_hot_live_cell", "homepage_hot_video_head", "homepage_follow_live_cell", "homepage_follow_video_head", "homepage_friends_live_cell", "homepage_friends_video_head", "homepage_follow_live_cover", "homepage_friends_live_cover", "message_live_cover"};

    public final String[] getEntrance() {
        return SettingsManager.INSTANCE.getStringArrayValue("live_draw_list_backup_entrance", DEFAULT);
    }

    public final String[] getDEFAULT() {
        return DEFAULT;
    }
}
