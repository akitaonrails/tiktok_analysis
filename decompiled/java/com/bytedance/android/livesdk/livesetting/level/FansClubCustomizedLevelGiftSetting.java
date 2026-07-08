package com.bytedance.android.livesdk.livesetting.level;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("fans_club_customized_gift_config")
public final class FansClubCustomizedLevelGiftSetting {
    public static final FansClubCustomizedLevelGiftSetting INSTANCE = new FansClubCustomizedLevelGiftSetting();
    public static final LiveFansCustomizedLevelGiftConfig DEFAULT = new LiveFansCustomizedLevelGiftConfig(false, 45, 40, 0, 15, new LiveFansBubbleStarlingKey("", ""));

    public static final class LiveFansBubbleStarlingKey {
        public static final TypeAdapter ADAPTER;

        @C09CT("starling_key")
        public String key;

        @C09CT("pattern")
        public String pattern;

        static {
            NormalGson.singleton();
            ADAPTER = new FansClubCustomizedLevelGiftSetting_LiveFansBubbleStarlingKey_OptTypeAdapter();
        }

        public LiveFansBubbleStarlingKey() {
            this("", "");
        }

        public LiveFansBubbleStarlingKey(String str, String str2) {
            this.pattern = str;
            this.key = str2;
        }
    }

    public final LiveFansCustomizedLevelGiftConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveFansCustomizedLevelGiftConfig liveFansCustomizedLevelGiftConfig = DEFAULT;
        LiveFansCustomizedLevelGiftConfig liveFansCustomizedLevelGiftConfig2 = (LiveFansCustomizedLevelGiftConfig) settingsManager.getValueSafely("fans_club_customized_gift_config", liveFansCustomizedLevelGiftConfig);
        return liveFansCustomizedLevelGiftConfig2 != null ? liveFansCustomizedLevelGiftConfig2 : liveFansCustomizedLevelGiftConfig;
    }

    public final long obtainDetectionTime() {
        LiveFansCustomizedLevelGiftConfig value = getValue();
        return ((long) (value != null ? value.detectionTime : 45)) * 1000;
    }

    public final long obtainMinMemberLevel() {
        return getValue() != null ? r0.memberLevel : 15;
    }

    public static final class LiveFansCustomizedLevelGiftConfig {
        public static final TypeAdapter ADAPTER = new FansClubCustomizedLevelGiftSetting_LiveFansCustomizedLevelGiftConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("bubble_content")
        public LiveFansBubbleStarlingKey bubbleContent;

        @C09CT("cache_size")
        public int cacheSize;

        @C09CT("detection_time")
        public int detectionTime;

        @C09CT("enable")
        public boolean enable;

        @C09CT("customized_level_gift_id")
        public int giftId;

        @C09CT("member_level")
        public int memberLevel;

        public LiveFansCustomizedLevelGiftConfig() {
            this(false, 0, 40, 0, 15, null);
        }

        public LiveFansCustomizedLevelGiftConfig(boolean z, int i, int i2, int i3, int i4, LiveFansBubbleStarlingKey liveFansBubbleStarlingKey) {
            this.enable = z;
            this.detectionTime = i;
            this.cacheSize = i2;
            this.giftId = i3;
            this.memberLevel = i4;
            this.bubbleContent = liveFansBubbleStarlingKey;
        }
    }
}
