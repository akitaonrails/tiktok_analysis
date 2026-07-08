package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("ttlive_gift_self_diagnosis")
public final class LiveGiftSelfDiagnosisSetting {
    public static final LiveGiftSelfDiagnosisSetting INSTANCE = new LiveGiftSelfDiagnosisSetting();
    public static final LiveGiftSelfDiagnosis DEFAULT = new LiveGiftSelfDiagnosis(false, -200.0f, 50, 0.9f, 0.9f, 3000, 3000, 20, 20, 0.9f, 0.9f, Mp4ScreenVideoLoadTimeout.CONTROL, Mp4ScreenVideoLoadTimeout.CONTROL, 0.9f, 1000);

    private final LiveGiftSelfDiagnosis getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveGiftSelfDiagnosis liveGiftSelfDiagnosis = DEFAULT;
        LiveGiftSelfDiagnosis liveGiftSelfDiagnosis2 = (LiveGiftSelfDiagnosis) settingsManager.getValueSafely("ttlive_gift_self_diagnosis", liveGiftSelfDiagnosis);
        return liveGiftSelfDiagnosis2 != null ? liveGiftSelfDiagnosis2 : liveGiftSelfDiagnosis;
    }

    public final LiveGiftSelfDiagnosis config() {
        return getValue();
    }

    public static final class LiveGiftSelfDiagnosis {
        public static final TypeAdapter ADAPTER = new LiveGiftSelfDiagnosisSetting_LiveGiftSelfDiagnosis_OptTypeAdapter(NormalGson.singleton());

        @C09CT("anchor_effect_dur")
        public long anchorEffectDur;

        @C09CT("anchor_effect_success_rate")
        public float anchorEffectSuccessRate;

        @C09CT("anchor_tray_msg_drop")
        public int anchorTrayMsgDrop;

        @C09CT("anchor_tray_show_dur")
        public long anchorTrayShowDur;

        @C09CT("anchor_tray_show_success_rate")
        public float anchorTrayShowSuccessRate;

        @C09CT("enable")
        public boolean enable;

        @C09CT("high_traffic_room_score_limit")
        public float highTrafficRoomScoreLimit;

        @C09CT("panel_open_dur")
        public long panelOpenDur;

        @C09CT("panel_open_success_rate")
        public float panelOpenSuccessRate;

        @C09CT("queue_retain_size")
        public int queueRetainSize;

        @C09CT("self_effect_dur")
        public long selfEffectDur;

        @C09CT("self_effect_success_rate")
        public float selfEffectSuccessRate;

        @C09CT("self_tray_msg_drop")
        public int selfTrayMsgDrop;

        @C09CT("self_tray_show_dur")
        public long selfTrayShowDur;

        @C09CT("self_tray_show_success_rate")
        public float selfTrayShowSuccessRate;

        public LiveGiftSelfDiagnosis() {
            this(false, -200.0f, 50, 0.9f, 0.9f, 3000L, 3000L, 20, 20, 0.9f, 0.9f, Mp4ScreenVideoLoadTimeout.CONTROL, Mp4ScreenVideoLoadTimeout.CONTROL, 0.9f, 1000L);
        }

        public LiveGiftSelfDiagnosis(boolean z, float f, int i, float f2, float f3, long j, long j2, int i2, int i3, float f4, float f5, long j3, long j4, float f6, long j5) {
            this.enable = z;
            this.highTrafficRoomScoreLimit = f;
            this.queueRetainSize = i;
            this.selfTrayShowSuccessRate = f2;
            this.anchorTrayShowSuccessRate = f3;
            this.selfTrayShowDur = j;
            this.anchorTrayShowDur = j2;
            this.selfTrayMsgDrop = i2;
            this.anchorTrayMsgDrop = i3;
            this.selfEffectSuccessRate = f4;
            this.anchorEffectSuccessRate = f5;
            this.selfEffectDur = j3;
            this.anchorEffectDur = j4;
            this.panelOpenSuccessRate = f6;
            this.panelOpenDur = j5;
        }
    }
}
