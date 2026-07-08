package com.bytedance.android.livesdk.livesetting.level;

import X.C09CT;
import X.C538540LAe;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("fans_club_customize_capsule_config")
public final class FansClubCustomizeCapsuleSetting {
    public static final FansClubCustomizeCapsuleSetting INSTANCE = new FansClubCustomizeCapsuleSetting();
    public static final LiveFansCustomizeCapsuleConfig DEFAULT = new LiveFansCustomizeCapsuleConfig(120000, 3, null, null);

    public static final class LiveFansCapsuleStarlingKey {
        public static final TypeAdapter ADAPTER;

        @C09CT("starling_key")
        public String key;

        @C09CT("pattern")
        public String pattern;

        static {
            NormalGson.singleton();
            ADAPTER = new FansClubCustomizeCapsuleSetting_LiveFansCapsuleStarlingKey_OptTypeAdapter();
        }

        public LiveFansCapsuleStarlingKey() {
            this("", "");
        }

        public LiveFansCapsuleStarlingKey(String str, String str2) {
            this.pattern = str;
            this.key = str2;
        }
    }

    public final LiveFansCustomizeCapsuleConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveFansCustomizeCapsuleConfig liveFansCustomizeCapsuleConfig = DEFAULT;
        LiveFansCustomizeCapsuleConfig liveFansCustomizeCapsuleConfig2 = (LiveFansCustomizeCapsuleConfig) settingsManager.getValueSafely("fans_club_customize_capsule_config", liveFansCustomizeCapsuleConfig);
        return liveFansCustomizeCapsuleConfig2 != null ? liveFansCustomizeCapsuleConfig2 : liveFansCustomizeCapsuleConfig;
    }

    public static final class LiveFansCustomizeCapsuleConfig {
        public static final TypeAdapter ADAPTER = new FansClubCustomizeCapsuleSetting_LiveFansCustomizeCapsuleConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("capsule_button_text")
        public LiveFansCapsuleStarlingKey buttonText;

        @C09CT("capsule_content")
        public LiveFansCapsuleStarlingKey content;

        @C09CT("detection_time")
        public int detectionTime;

        @C09CT("show_max_times")
        public int showMaxTimes;

        public LiveFansCustomizeCapsuleConfig() {
            this(C538540LAe.LLJJJIL, 3, null, null);
        }

        public LiveFansCustomizeCapsuleConfig(int i, int i2, LiveFansCapsuleStarlingKey liveFansCapsuleStarlingKey, LiveFansCapsuleStarlingKey liveFansCapsuleStarlingKey2) {
            this.detectionTime = i;
            this.showMaxTimes = i2;
            this.content = liveFansCapsuleStarlingKey;
            this.buttonText = liveFansCapsuleStarlingKey2;
        }
    }
}
