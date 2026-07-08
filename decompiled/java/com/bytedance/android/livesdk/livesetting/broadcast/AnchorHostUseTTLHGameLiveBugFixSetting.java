package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "anchor_host_use_ttlh_game_live_bug_fix")
public final class AnchorHostUseTTLHGameLiveBugFixSetting {
    public static final int DEFAULT = 1;
    public static final AnchorHostUseTTLHGameLiveBugFixSetting INSTANCE = new AnchorHostUseTTLHGameLiveBugFixSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("anchor_host_use_ttlh_game_live_bug_fix", DEFAULT) == 1;
    }
}
