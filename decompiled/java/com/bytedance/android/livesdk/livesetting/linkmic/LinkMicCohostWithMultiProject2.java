package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("linkmic_cohost_with_multi_protect_2")
public final class LinkMicCohostWithMultiProject2 {
    public static final boolean DEFAULT = true;
    public static final LinkMicCohostWithMultiProject2 INSTANCE = new LinkMicCohostWithMultiProject2();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_cohost_with_multi_protect_2", DEFAULT);
    }
}
