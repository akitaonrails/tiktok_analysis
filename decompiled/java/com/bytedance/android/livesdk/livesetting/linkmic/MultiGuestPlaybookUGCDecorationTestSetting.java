package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "playbook_ugc_support_decoration_test")
public final class MultiGuestPlaybookUGCDecorationTestSetting {
    public static final long DEFAULT = 0;
    public static final MultiGuestPlaybookUGCDecorationTestSetting INSTANCE = new MultiGuestPlaybookUGCDecorationTestSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getLongValue("playbook_ugc_support_decoration_test", DEFAULT) != 0;
    }
}
