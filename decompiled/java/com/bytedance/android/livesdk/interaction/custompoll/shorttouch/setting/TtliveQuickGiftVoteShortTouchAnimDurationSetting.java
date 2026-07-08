package com.bytedance.android.livesdk.interaction.custompoll.shorttouch.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_quick_gift_vote_short_touch_anim_duration")
public final class TtliveQuickGiftVoteShortTouchAnimDurationSetting {
    public static final long DEFAULT = 2560;
    public static final TtliveQuickGiftVoteShortTouchAnimDurationSetting INSTANCE = new TtliveQuickGiftVoteShortTouchAnimDurationSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("ttlive_quick_gift_vote_short_touch_anim_duration", DEFAULT);
    }
}
