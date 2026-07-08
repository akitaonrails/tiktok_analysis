package com.bytedance.android.livesdk.livesetting.level;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_client_gift_celebration_keys")
public final class FansClubCelebrationBubbleTextSetting {
    public static final FansClubCelebrationBubbleTextSetting INSTANCE = new FansClubCelebrationBubbleTextSetting();
    public static final LiveFansStarlingKeyConfig DEFAULT = new LiveFansStarlingKeyConfig(new LiveFansStarlingKey("", ""), new LiveFansStarlingKey("", ""));

    public static final class LiveFansStarlingKey {
        public static final TypeAdapter ADAPTER;

        @C09CT("starling_key")
        public String key;

        @C09CT("pattern")
        public String pattern;

        static {
            NormalGson.singleton();
            ADAPTER = new FansClubCelebrationBubbleTextSetting_LiveFansStarlingKey_OptTypeAdapter();
        }

        public LiveFansStarlingKey() {
            this("", "");
        }

        public LiveFansStarlingKey(String str, String str2) {
            this.pattern = str;
            this.key = str2;
        }
    }

    public final LiveFansStarlingKeyConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveFansStarlingKeyConfig liveFansStarlingKeyConfig = DEFAULT;
        LiveFansStarlingKeyConfig liveFansStarlingKeyConfig2 = (LiveFansStarlingKeyConfig) settingsManager.getValueSafely("live_client_gift_celebration_keys", liveFansStarlingKeyConfig);
        return liveFansStarlingKeyConfig2 != null ? liveFansStarlingKeyConfig2 : liveFansStarlingKeyConfig;
    }

    public static final class LiveFansStarlingKeyConfig {
        public static final TypeAdapter ADAPTER = new FansClubCelebrationBubbleTextSetting_LiveFansStarlingKeyConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("claim_key")
        public LiveFansStarlingKey claimKey;

        @C09CT("no_claim_key")
        public LiveFansStarlingKey noClaimKey;

        public LiveFansStarlingKeyConfig() {
            this(null, null);
        }

        public LiveFansStarlingKeyConfig(LiveFansStarlingKey liveFansStarlingKey, LiveFansStarlingKey liveFansStarlingKey2) {
            this.claimKey = liveFansStarlingKey;
            this.noClaimKey = liveFansStarlingKey2;
        }
    }
}
