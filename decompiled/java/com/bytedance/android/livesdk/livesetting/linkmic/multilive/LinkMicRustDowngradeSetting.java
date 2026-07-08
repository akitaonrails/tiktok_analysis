package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_triones_downgrade_opt")
public final class LinkMicRustDowngradeSetting {
    public static final boolean DEFAULT = true;
    public static final LinkMicRustDowngradeSetting INSTANCE = new LinkMicRustDowngradeSetting();

    public final boolean downgrade() {
        return SettingsManager.INSTANCE.getBooleanValue("link_mic_triones_downgrade_opt", DEFAULT);
    }
}
