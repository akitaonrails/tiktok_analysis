package com.bytedance.android.livesdk.interaction.custompoll.shorttouch.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_custom_gift_vote_short_touch_anim_duration")
public final class TtliveCustomGiftVoteShortTouchAnimDurationSetting {
    public static final long DEFAULT = 2560;
    public static final TtliveCustomGiftVoteShortTouchAnimDurationSetting INSTANCE = new TtliveCustomGiftVoteShortTouchAnimDurationSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("ttlive_custom_gift_vote_short_touch_anim_duration", DEFAULT);
    }
}
