package com.bytedance.android.livesdk.livesetting.other;

import X.C1161920gLG;
import X.C13LZ;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdkapi.host.IHostUser;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("ttlive_like_tap_count_sample_rate")
public final class LiveLikeTapCountMonitorSampleRateSetting {
    public static final LiveLikeTapCountMonitorSampleRateSetting INSTANCE = new LiveLikeTapCountMonitorSampleRateSetting();
    public static final int DEFAULT = 1;

    public static final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("ttlive_like_tap_count_sample_rate", DEFAULT);
    }

    public static final boolean hit() {
        int iLJ = C13LZ.LJ(getValue(), 0, 100);
        if (iLJ == 0) {
            return false;
        }
        if (iLJ >= 100) {
            return true;
        }
        IHostUser iHostUser = (IHostUser) C1161920gLG.LIZJ(IHostUser.class);
        if (iHostUser != null) {
            long curUserId = iHostUser.getCurUserId();
            return curUserId > 0 && curUserId % 100 < ((long) iLJ);
        }
        return false;
    }
}
