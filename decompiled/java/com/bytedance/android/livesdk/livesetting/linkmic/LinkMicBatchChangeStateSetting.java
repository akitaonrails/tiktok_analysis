package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("linkmic_batch_change_state")
public final class LinkMicBatchChangeStateSetting {
    public static final boolean DEFAULT = false;
    public static final LinkMicBatchChangeStateSetting INSTANCE = new LinkMicBatchChangeStateSetting();

    public static final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_batch_change_state", DEFAULT);
    }
}
