package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_quick_gift_vote_gift_price_2")
public final class TtliveQuickGiftVoteGiftPrice2Setting {
    public static final int DEFAULT = 1;
    public static final TtliveQuickGiftVoteGiftPrice2Setting INSTANCE = new TtliveQuickGiftVoteGiftPrice2Setting();

    public final int getPrice() {
        return SettingsManager.INSTANCE.getIntValue("ttlive_quick_gift_vote_gift_price_2", DEFAULT);
    }
}
