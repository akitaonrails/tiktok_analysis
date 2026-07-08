package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_creator_ranking_memory_leak_fix")
public final class LiveCreatorRankingMemoryLeakFixSetting {
    public static final LiveCreatorRankingMemoryLeakFixSetting INSTANCE = new LiveCreatorRankingMemoryLeakFixSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_creator_ranking_memory_leak_fix", DEFAULT);
    }
}
