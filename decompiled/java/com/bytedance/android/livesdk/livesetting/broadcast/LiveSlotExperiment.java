package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C2097608Jq;
import X.C486960J7u;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.model.LiveSlotSettings;
import com.bytedance.android.livesdk.livesetting.model.SlotBizTypeDisallow;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_slot_setting")
public final class LiveSlotExperiment {
    public static final LiveSlotExperiment INSTANCE = new LiveSlotExperiment();
    public static final LiveSlotSettings DEFAULT = new LiveSlotSettings(null);

    public final Map<String, SlotBizTypeDisallow> getBizTypeDisallow() {
        Map<String, SlotBizTypeDisallow> bizTypeDisallow = getValue().getBizTypeDisallow();
        return bizTypeDisallow == null ? C2097608Jq.LJ() : bizTypeDisallow;
    }

    public final LiveSlotSettings getValue() {
        if (C486960J7u.LIZ()) {
            return DEFAULT;
        }
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveSlotSettings liveSlotSettings = DEFAULT;
        LiveSlotSettings liveSlotSettings2 = (LiveSlotSettings) settingsManager.getValueSafely("live_slot_setting", liveSlotSettings);
        return liveSlotSettings2 == null ? liveSlotSettings : liveSlotSettings2;
    }

    public final LiveSlotSettings getDEFAULT() {
        return DEFAULT;
    }
}
