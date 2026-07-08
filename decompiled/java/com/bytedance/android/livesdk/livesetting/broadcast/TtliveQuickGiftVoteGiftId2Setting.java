package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_quick_gift_vote_gift_id_2")
public final class TtliveQuickGiftVoteGiftId2Setting {
    public static final int DEFAULT = 6247;
    public static final TtliveQuickGiftVoteGiftId2Setting INSTANCE = new TtliveQuickGiftVoteGiftId2Setting();

    public final int getId() {
        return SettingsManager.INSTANCE.getIntValue("ttlive_quick_gift_vote_gift_id_2", DEFAULT);
    }
}
