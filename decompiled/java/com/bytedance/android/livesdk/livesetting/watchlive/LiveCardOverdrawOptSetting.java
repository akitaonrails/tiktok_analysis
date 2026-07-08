package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = true, value = "live_overdraw_opt")
public final class LiveCardOverdrawOptSetting {
    public static final LiveCardOverdrawOptSetting INSTANCE = new LiveCardOverdrawOptSetting();
    public static final LiveCardOverdrawOptConfigData DEFAULT = new LiveCardOverdrawOptConfigData(0, 0, 0, 3400);

    public final LiveCardOverdrawOptConfigData getValue() {
        return (LiveCardOverdrawOptConfigData) SettingsManager.INSTANCE.getValueSafely("live_overdraw_opt", DEFAULT);
    }

    public final boolean disableOverdrawOptForVoiceChat() {
        LiveCardOverdrawOptConfigData value = getValue();
        return value == null || value.enableOverdrawOptForVoiceChat == 0;
    }

    public final boolean enableOverdrawOptForMultiGuest() {
        LiveCardOverdrawOptConfigData value = getValue();
        return (value == null || value.enableOverdrawOptForMultiGuest == 0) ? false : true;
    }

    public final boolean enableOverdrawOptForVoiceChat() {
        LiveCardOverdrawOptConfigData value = getValue();
        return (value == null || value.enableOverdrawOptForVoiceChat == 0) ? false : true;
    }

    public final boolean enableRefreshOptForMultiHost() {
        LiveCardOverdrawOptConfigData value = getValue();
        return (value == null || value.enableOverdrawOptForMultiHost == 0) ? false : true;
    }

    public final LiveCardOverdrawOptConfigData getDEFAULT() {
        return DEFAULT;
    }

    public final boolean enableOverdrawOptForMultiHost(Long l) {
        LiveCardOverdrawOptConfigData value;
        if (l == null || (value = getValue()) == null || value.enableOverdrawOptForMultiHost == 0 || l.longValue() < value.webcastVersionForMultiHost) {
            return false;
        }
        return true;
    }
}
