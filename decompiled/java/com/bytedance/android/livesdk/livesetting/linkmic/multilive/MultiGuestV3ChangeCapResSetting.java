package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("linkmic_multiguestv3_cap_res")
public final class MultiGuestV3ChangeCapResSetting {
    public static final boolean DEFAULT = false;
    public static final MultiGuestV3ChangeCapResSetting INSTANCE = new MultiGuestV3ChangeCapResSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_multiguestv3_cap_res", DEFAULT);
    }
}
