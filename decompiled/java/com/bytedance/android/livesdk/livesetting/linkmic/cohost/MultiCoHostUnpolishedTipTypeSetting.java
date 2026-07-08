package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_cohost_unpolished_tip_toast_type")
public final class MultiCoHostUnpolishedTipTypeSetting {
    public static final MultiCoHostUnpolishedTipTypeSetting INSTANCE = new MultiCoHostUnpolishedTipTypeSetting();
    public static final int DEFAULT = 1;

    public final boolean isViewerToast() {
        return SettingsManager.INSTANCE.getIntValue("live_cohost_unpolished_tip_toast_type", DEFAULT) == 2;
    }
}
