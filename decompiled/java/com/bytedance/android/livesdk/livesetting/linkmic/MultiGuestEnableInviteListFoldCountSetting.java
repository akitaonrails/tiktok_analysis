package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_enable_invite_list_fold_count")
public final class MultiGuestEnableInviteListFoldCountSetting {
    public static final int DEFAULT = 10000;
    public static final MultiGuestEnableInviteListFoldCountSetting INSTANCE = new MultiGuestEnableInviteListFoldCountSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("multi_enable_invite_list_fold_count", DEFAULT);
    }
}
