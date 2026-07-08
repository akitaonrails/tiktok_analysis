package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "playbook_support_decoration")
public final class MultiGuestPlaybookDecorationSetting {
    public static final long DEFAULT = 0;
    public static final MultiGuestPlaybookDecorationSetting INSTANCE = new MultiGuestPlaybookDecorationSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getLongValue("playbook_support_decoration", DEFAULT) != 0;
    }
}
