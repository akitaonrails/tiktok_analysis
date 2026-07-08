package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_quick_gift_vote_gift_price_1")
public final class TtliveQuickGiftVoteGiftPrice1Setting {
    public static final int DEFAULT = 1;
    public static final TtliveQuickGiftVoteGiftPrice1Setting INSTANCE = new TtliveQuickGiftVoteGiftPrice1Setting();

    public final int getPrice() {
        return SettingsManager.INSTANCE.getIntValue("ttlive_quick_gift_vote_gift_price_1", DEFAULT);
    }
}
