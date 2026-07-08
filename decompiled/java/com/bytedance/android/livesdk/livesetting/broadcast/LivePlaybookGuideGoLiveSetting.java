package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_anchor_golive_playbook_style")
public final class LivePlaybookGuideGoLiveSetting {
    public static final int DEFAULT = 0;
    public static final LivePlaybookGuideGoLiveSetting INSTANCE = new LivePlaybookGuideGoLiveSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_anchor_golive_playbook_style", DEFAULT);
    }

    public final boolean enable() {
        return getValue() == 2 || getValue() == 3;
    }
}
