package com.bytedance.android.livesdk.livesetting.level;

import X.C09CT;
import X.C538540LAe;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("super_fans_emote_capsule_config")
public final class FansClubSuperFanEmoteCapsuleSetting {
    public static final FansClubSuperFanEmoteCapsuleSetting INSTANCE = new FansClubSuperFanEmoteCapsuleSetting();
    public static final LiveSuperFansEmoteCapsuleConfig DEFAULT = new LiveSuperFansEmoteCapsuleConfig(C538540LAe.LLJJJIL, 0, null, null);

    public static final class LiveSuperFanEmoteStarlingKey {
        public static final TypeAdapter ADAPTER;

        @C09CT("starling_key")
        public String key;

        @C09CT("pattern")
        public String pattern;

        static {
            NormalGson.singleton();
            ADAPTER = new FansClubSuperFanEmoteCapsuleSetting_LiveSuperFanEmoteStarlingKey_OptTypeAdapter();
        }

        public LiveSuperFanEmoteStarlingKey() {
            this("", "");
        }

        public LiveSuperFanEmoteStarlingKey(String str, String str2) {
            this.pattern = str;
            this.key = str2;
        }
    }

    public final LiveSuperFansEmoteCapsuleConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveSuperFansEmoteCapsuleConfig liveSuperFansEmoteCapsuleConfig = DEFAULT;
        LiveSuperFansEmoteCapsuleConfig liveSuperFansEmoteCapsuleConfig2 = (LiveSuperFansEmoteCapsuleConfig) settingsManager.getValueSafely("super_fans_emote_capsule_config", liveSuperFansEmoteCapsuleConfig);
        return liveSuperFansEmoteCapsuleConfig2 != null ? liveSuperFansEmoteCapsuleConfig2 : liveSuperFansEmoteCapsuleConfig;
    }

    public static final class LiveSuperFansEmoteCapsuleConfig {
        public static final TypeAdapter ADAPTER = new FansClubSuperFanEmoteCapsuleSetting_LiveSuperFansEmoteCapsuleConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("capsule_button_text")
        public LiveSuperFanEmoteStarlingKey buttonText;

        @C09CT("capsule_content")
        public LiveSuperFanEmoteStarlingKey content;

        @C09CT("detection_time")
        public int detectionTime;

        @C09CT("show_max_times")
        public int showMaxTimes;

        public LiveSuperFansEmoteCapsuleConfig() {
            this(C538540LAe.LLJJJIL, 3, null, null);
        }

        public LiveSuperFansEmoteCapsuleConfig(int i, int i2, LiveSuperFanEmoteStarlingKey liveSuperFanEmoteStarlingKey, LiveSuperFanEmoteStarlingKey liveSuperFanEmoteStarlingKey2) {
            this.detectionTime = i;
            this.showMaxTimes = i2;
            this.content = liveSuperFanEmoteStarlingKey;
            this.buttonText = liveSuperFanEmoteStarlingKey2;
        }
    }
}
