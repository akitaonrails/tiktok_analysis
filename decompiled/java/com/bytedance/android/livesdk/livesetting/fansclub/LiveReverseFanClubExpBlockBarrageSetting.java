package com.bytedance.android.livesdk.livesetting.fansclub;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "fansclub_reverse_exp_block_barrage")
public final class LiveReverseFanClubExpBlockBarrageSetting {
    public static final LiveReverseFanClubExpBlockBarrageSetting INSTANCE = new LiveReverseFanClubExpBlockBarrageSetting();
    public static final String[] DEFAULT = new String[0];

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("fansclub_reverse_exp_block_barrage", DEFAULT);
    }
}
