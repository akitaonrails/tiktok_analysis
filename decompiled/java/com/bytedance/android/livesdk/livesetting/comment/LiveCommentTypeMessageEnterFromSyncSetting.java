package com.bytedance.android.livesdk.livesetting.comment;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_comment_type_message_enter_from_sync")
public final class LiveCommentTypeMessageEnterFromSyncSetting {
    public static final boolean DEFAULT = true;
    public static final LiveCommentTypeMessageEnterFromSyncSetting INSTANCE = new LiveCommentTypeMessageEnterFromSyncSetting();

    public static final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_comment_type_message_enter_from_sync", DEFAULT);
    }
}
