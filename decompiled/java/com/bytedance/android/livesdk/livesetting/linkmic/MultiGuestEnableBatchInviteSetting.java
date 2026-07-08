package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_enable_batch_invite")
public final class MultiGuestEnableBatchInviteSetting {
    public static final boolean DEFAULT = false;
    public static final MultiGuestEnableBatchInviteSetting INSTANCE = new MultiGuestEnableBatchInviteSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_enable_batch_invite", DEFAULT);
    }
}
