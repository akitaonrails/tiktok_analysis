package com.bytedance.android.livesdk.livesetting.linkmic.multilive.voicechat;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "voice_chat_permission_mgr_detach_opt")
public final class VoiceChatPermissionMgrDetachOpt {
    public static final boolean DEFAULT = true;
    public static final VoiceChatPermissionMgrDetachOpt INSTANCE = new VoiceChatPermissionMgrDetachOpt();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("voice_chat_permission_mgr_detach_opt", DEFAULT);
    }
}
