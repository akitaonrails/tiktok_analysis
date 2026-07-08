package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_creator_hub_entrance")
public final class LiveCreatorHubEntranceSetting {
    public static final boolean DEFAULT = false;
    public static final LiveCreatorHubEntranceSetting INSTANCE = new LiveCreatorHubEntranceSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_creator_hub_entrance", DEFAULT);
    }
}
