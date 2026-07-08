package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Iterator;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_cross_screen_duration")
public final class LiveGiftCrossScreenDurationSetting {
    public static final LiveGiftCrossScreenDurationSetting INSTANCE = new LiveGiftCrossScreenDurationSetting();
    public static final CrossScreenDurationParams DEFAULT = new CrossScreenDurationParams(0, null, 3, null);

    private final CrossScreenDurationParams getSettingParams() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        CrossScreenDurationParams crossScreenDurationParams = DEFAULT;
        CrossScreenDurationParams crossScreenDurationParams2 = (CrossScreenDurationParams) settingsManager.getValueSafely("live_gift_cross_screen_duration", crossScreenDurationParams);
        return crossScreenDurationParams2 != null ? crossScreenDurationParams2 : crossScreenDurationParams;
    }

    public final CrossScreenDurationParams getDEFAULT() {
        return DEFAULT;
    }

    public final long getFallbackDuration(long j) {
        DurationInfo next;
        Iterator<DurationInfo> it2 = getSettingParams().durationInfoList.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.giftId == j) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        DurationInfo durationInfo = next;
        if (durationInfo != null) {
            return durationInfo.duration;
        }
        return getSettingParams().f31default;
    }
}
