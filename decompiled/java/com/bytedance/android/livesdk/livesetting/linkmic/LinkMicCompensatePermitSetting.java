package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("link_mic_compensate_permit")
public final class LinkMicCompensatePermitSetting {
    public static final boolean DEFAULT = false;
    public static final LinkMicCompensatePermitSetting INSTANCE = new LinkMicCompensatePermitSetting();

    public static final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("link_mic_compensate_permit", DEFAULT);
    }
}
