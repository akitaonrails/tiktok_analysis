package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("linkmic_cohost_cap_res")
public final class CoHostChangeCapResSetting {
    public static final boolean DEFAULT = false;
    public static final CoHostChangeCapResSetting INSTANCE = new CoHostChangeCapResSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_cohost_cap_res", DEFAULT);
    }
}
