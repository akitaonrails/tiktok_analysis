package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("linkmic_multiguestv3_cap_res_guest")
public final class MultiGuestV3ChangeCapResGuestSetting {
    public static final boolean DEFAULT = false;
    public static final MultiGuestV3ChangeCapResGuestSetting INSTANCE = new MultiGuestV3ChangeCapResGuestSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_multiguestv3_cap_res_guest", DEFAULT);
    }
}
