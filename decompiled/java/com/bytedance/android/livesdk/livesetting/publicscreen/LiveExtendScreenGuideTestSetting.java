package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_extend_screen_guide_test_setting")
public final class LiveExtendScreenGuideTestSetting {
    public static final LiveExtendScreenGuideTestSetting INSTANCE = new LiveExtendScreenGuideTestSetting();
    public static final GuideConfig DEFAULT = new GuideConfig();

    public static final class GuideConfig {
        public static final TypeAdapter ADAPTER;

        @C09CT("common_guide_time")
        public float commonGuideTime = 6.0f;

        @C09CT("companion_guide_time")
        public float companionGuideTime = 10.0f;

        static {
            NormalGson.singleton();
            ADAPTER = new LiveExtendScreenGuideTestSetting_GuideConfig_OptTypeAdapter();
        }
    }

    private final GuideConfig getValue() {
        GuideConfig guideConfig = (GuideConfig) SettingsManager.INSTANCE.getValueSafely(LiveExtendScreenGuideTestSetting.class);
        return guideConfig == null ? DEFAULT : guideConfig;
    }

    public final float getCommonGuideTime() {
        return getValue().commonGuideTime;
    }

    public final float getCompanionGuideTime() {
        return getValue().companionGuideTime;
    }
}
