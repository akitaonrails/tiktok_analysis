package com.bytedance.android.livesdk.livesetting.watchlive.firstscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAudienceDeviceScoreSetting;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_interaction_layer_delay_exp")
public final class LiveInteractionLayerDelayExp {
    public static final LiveInteractionLayerDelayExp INSTANCE = new LiveInteractionLayerDelayExp();
    public static final DATA DEFAULT = new DATA(false, new ArrayList(), 200);

    public static final boolean enable() {
        return INSTANCE.getSettingValue().enable;
    }

    private final DATA getSettingValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        DATA data = DEFAULT;
        DATA data2 = (DATA) settingsManager.getValueSafely("live_interaction_layer_delay_exp", data);
        return data2 != null ? data2 : data;
    }

    public static final int getDelayDuration(String str) {
        float value = TTliveAudienceDeviceScoreSetting.INSTANCE.getValue();
        for (DeviceScoreLimit deviceScoreLimit : INSTANCE.getSettingValue().delayList) {
            if (value >= deviceScoreLimit.scoreLow && value < deviceScoreLimit.scoreHigh) {
                if (Intrinsics.LJFF(str, "draw")) {
                    return deviceScoreLimit.drawDelayTime;
                }
                return deviceScoreLimit.clickDelayTime;
            }
        }
        return INSTANCE.getSettingValue().defaultDelayTime;
    }
}
