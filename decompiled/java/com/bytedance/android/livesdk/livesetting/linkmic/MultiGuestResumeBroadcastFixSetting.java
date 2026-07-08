package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("multi_guest_resume_broadcast_fix")
public final class MultiGuestResumeBroadcastFixSetting {
    public static final boolean DEFAULT = true;
    public static final MultiGuestResumeBroadcastFixSetting INSTANCE = new MultiGuestResumeBroadcastFixSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_resume_broadcast_fix", DEFAULT);
    }
}
