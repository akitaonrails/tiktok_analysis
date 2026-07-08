package com.ss.android.ugc.aweme.im.common.experiment;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes10.dex */
public final class ImSpecialEffectsFrequencyControlSettings {
    public static final ImSpecialEffectsFrequencyControlModel LIZ = new ImSpecialEffectsFrequencyControlModel(3, 3, 3, 10, 20);

    public static final class ImSpecialEffectsFrequencyControlModel {

        @C09CT("share_again_retroactive_validity_period")
        public final long shareAgainRetroactiveValidityPeriod;

        @C09CT("share_again_validity_window")
        public final long shareAgainValidityWindow;

        @C09CT("share_high_freq_validity_window")
        public final long shareHighFreqValidityWindow;

        @C09CT("video_rain_complicated_trigger_threshold")
        public final int videoRainComplicatedTriggerThreshold;

        @C09CT("video_rain_trigger_threshold")
        public final int videoRainTriggerThreshold;

        public ImSpecialEffectsFrequencyControlModel() {
            this(3L, 3L, 3L, 10, 20);
        }

        public ImSpecialEffectsFrequencyControlModel(long j, long j2, long j3, int i, int i2) {
            this.shareAgainRetroactiveValidityPeriod = j;
            this.shareAgainValidityWindow = j2;
            this.shareHighFreqValidityWindow = j3;
            this.videoRainTriggerThreshold = i;
            this.videoRainComplicatedTriggerThreshold = i2;
        }
    }

    public static final ImSpecialEffectsFrequencyControlModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        ImSpecialEffectsFrequencyControlModel imSpecialEffectsFrequencyControlModel = LIZ;
        ImSpecialEffectsFrequencyControlModel imSpecialEffectsFrequencyControlModel2 = (ImSpecialEffectsFrequencyControlModel) settingsManagerLIZLLL.LJIIIIZZ("im_special_effects_frequency_control", ImSpecialEffectsFrequencyControlModel.class, imSpecialEffectsFrequencyControlModel);
        return imSpecialEffectsFrequencyControlModel2 != null ? imSpecialEffectsFrequencyControlModel2 : imSpecialEffectsFrequencyControlModel;
    }
}
