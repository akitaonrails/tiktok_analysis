package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_quick_gift_vote_gift_id_1")
public final class TtliveQuickGiftVoteGiftId1Setting {
    public static final int DEFAULT = 6246;
    public static final TtliveQuickGiftVoteGiftId1Setting INSTANCE = new TtliveQuickGiftVoteGiftId1Setting();

    public final int getId() {
        return SettingsManager.INSTANCE.getIntValue("ttlive_quick_gift_vote_gift_id_1", DEFAULT);
    }
}
