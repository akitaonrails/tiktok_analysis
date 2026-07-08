package com.bytedance.android.livesdk.livesetting.level;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("fans_club_member_level_upgrade_gift_config")
public final class FansClubUpgradeMemberLevelSetting {
    public static final FansClubUpgradeMemberLevelSetting INSTANCE = new FansClubUpgradeMemberLevelSetting();
    public static final LiveFansUpgradeMemberLevelGiftsConfig DEFAULT = new LiveFansUpgradeMemberLevelGiftsConfig(false, 70, 40, new ArrayList(), new LiveFansBubbleStarlingKey("", ""));

    public static final class LiveFansBubbleStarlingKey {
        public static final TypeAdapter ADAPTER;

        @C09CT("starling_key")
        public String key;

        @C09CT("pattern")
        public String pattern;

        static {
            NormalGson.singleton();
            ADAPTER = new FansClubUpgradeMemberLevelSetting_LiveFansBubbleStarlingKey_OptTypeAdapter();
        }

        public LiveFansBubbleStarlingKey() {
            this("", "");
        }

        public LiveFansBubbleStarlingKey(String str, String str2) {
            this.pattern = str;
            this.key = str2;
        }
    }

    public final LiveFansUpgradeMemberLevelGiftsConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveFansUpgradeMemberLevelGiftsConfig liveFansUpgradeMemberLevelGiftsConfig = DEFAULT;
        LiveFansUpgradeMemberLevelGiftsConfig liveFansUpgradeMemberLevelGiftsConfig2 = (LiveFansUpgradeMemberLevelGiftsConfig) settingsManager.getValueSafely("fans_club_member_level_upgrade_gift_config", liveFansUpgradeMemberLevelGiftsConfig);
        return liveFansUpgradeMemberLevelGiftsConfig2 != null ? liveFansUpgradeMemberLevelGiftsConfig2 : liveFansUpgradeMemberLevelGiftsConfig;
    }

    public static final class LiveFansUpgradeMemberLevelGiftsConfig {
        public static final TypeAdapter ADAPTER = new FansClubUpgradeMemberLevelSetting_LiveFansUpgradeMemberLevelGiftsConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("bubble_content")
        public LiveFansBubbleStarlingKey bubbleContent;

        @C09CT("cache_size")
        public int cacheSize;

        @C09CT("detection_time")
        public Integer detectionTime;

        @C09CT("enable")
        public boolean enable;

        @C09CT("level_id_list")
        public List<Integer> giftIdList;

        public LiveFansUpgradeMemberLevelGiftsConfig() {
            this(false, null, 40, null, null);
        }

        public LiveFansUpgradeMemberLevelGiftsConfig(boolean z, Integer num, int i, List<Integer> list, LiveFansBubbleStarlingKey liveFansBubbleStarlingKey) {
            this.enable = z;
            this.detectionTime = num;
            this.cacheSize = i;
            this.giftIdList = list;
            this.bubbleContent = liveFansBubbleStarlingKey;
        }
    }
}
