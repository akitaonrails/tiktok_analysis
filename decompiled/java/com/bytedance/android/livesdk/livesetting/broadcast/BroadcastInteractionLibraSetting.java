package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("ttlive_broadcast_interaction_improvememnt")
public final class BroadcastInteractionLibraSetting {
    public static final int DEFAULT = 0;
    public static final int GROUP_ONE = 1;
    public static final int GROUP_TWO = 2;
    public static final BroadcastInteractionLibraSetting INSTANCE = new BroadcastInteractionLibraSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("ttlive_broadcast_interaction_improvememnt", DEFAULT);
    }
}
