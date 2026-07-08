package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_outside_invite_optimize")
public final class MultiGuestOutsideInviteOptimize {
    public static final boolean DEFAULT = false;
    public static final MultiGuestOutsideInviteOptimize INSTANCE = new MultiGuestOutsideInviteOptimize();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_outside_invite_optimize", DEFAULT);
    }
}
