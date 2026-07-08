package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C13LQ;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_effect_has_slide_gesture_list")
public final class LiveEffectHasSlideGestureListSetting {
    public static final LiveEffectHasSlideGestureListSetting INSTANCE = new LiveEffectHasSlideGestureListSetting();
    public static final String[] DEFAULT = {"6925369105348301314", "7216636005950951937", "7313516023326446082", "7302107646901883394", "7270434917090071042", "7162043994917048834", "7254282463113908737", "7209045789148975618", "7164606320681685506", "7202510299948126722", "6959575665762898434", "7174978127527940610", "7212516427603907074", "7174670964226003458"};

    private final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("live_effect_has_slide_gesture_list", DEFAULT);
    }

    public final boolean canSlide(String str) {
        if (OptimizeEffectGestureSetting.INSTANCE.enable()) {
            return C13LQ.LJIILLIIL(str, getValue());
        }
        return true;
    }
}
