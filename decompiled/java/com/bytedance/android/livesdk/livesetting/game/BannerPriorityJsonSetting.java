package com.bytedance.android.livesdk.livesetting.game;

import X.C19748512Ol;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.s;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("ttlive_game_guide_banner_priority_mapping")
public final class BannerPriorityJsonSetting {
    public static final BannerPriorityConfig DEFAULT;
    public static final BannerPriorityJsonSetting INSTANCE = new BannerPriorityJsonSetting();

    static {
        BannerPriorityConfig bannerPriorityConfig;
        try {
            bannerPriorityConfig = (BannerPriorityConfig) GsonProtectorUtils.fromJson(C19748512Ol.LIZIZ, "\n    {\n        \"game_banner_count\": 1,\n        \"game_banner_list\": [\n            {\n                \"name\":\"game_gpppa_ban_banner\",\n                \"priority\":12,\n                \"compatible\":true\n            },\n            {\n                \"name\":\"lop_age_assurance_banner\",\n                \"priority\":16,\n                \"compatible\":true\n            },\n            {\n                \"name\":\"lop_banner\",\n                \"priority\":20,\n                \"compatible\":true\n            },\n            {\n                \"compatible\": true,\n                \"name\": \"live_pro_gamer\",\n                \"priority\": 26\n            },\n            {\n                \"name\":\"replay_banner\",\n                \"priority\":33,\n                \"compatible\":true\n            },\n            {\n                \"compatible\": true,\n                \"name\": \"samsung_interruption_guide_banner\",\n                \"priority\": 40\n            },\n            {\n                \"compatible\": true,\n                \"name\": \"game_partnership_drops_banner\",\n                \"priority\": 41\n            },\n            {\n                \"compatible\": true,\n                \"name\": \"game_partnership_event_banner\",\n                \"priority\": 42\n            },\n            {\n                \"name\":\"game_live_new_broadcast_education_banner\",\n                \"priority\":44,\n                \"compatible\":true\n            },\n            {\n                \"name\":\"game_decoupling\",\n                \"priority\":50,\n                \"compatible\":true\n            },\n            {\n                \"name\":\"highlight_banner\",\n                \"priority\":55,\n                \"compatible\":true\n            },\n            {\n                \"name\":\"live_in_game_rank_banner\",\n                \"priority\":60,\n                \"compatible\":true\n            },\n            {\n                \"name\":\"live_studio_launch_banner\",\n                \"priority\":66,\n                \"compatible\":true\n            },\n            {\n                \"compatible\": true,\n                \"name\": \"custom_banner\",\n                \"priority\": 100\n            }\n        ],\n        \"live_studio_banner_count\": 1,\n        \"live_studio_banner_list\": [\n            {\n                \"compatible\": true,\n                \"name\": \"custom_banner\",\n                \"priority\": 100\n            }\n        ],\n        \"obs_banner_count\": 1,\n        \"obs_banner_list\": [\n            {\n                \"compatible\": true,\n                \"name\": \"game_gpppa_ban_banner\",\n                \"priority\": 12\n            },\n            {\n                \"compatible\": true,\n                \"name\": \"live_pro_gamer\",\n                \"priority\": 26\n            },\n            {\n                \"compatible\": true,\n                \"name\": \"replay_banner\",\n                \"priority\": 33\n            },\n            {\n                \"compatible\": true,\n                \"name\": \"game_partnership_drops_banner\",\n                \"priority\": 41\n            },\n            {\n                \"name\":\"obs_live_new_broadcast_education_banner\",\n                \"priority\":44,\n                \"compatible\":true\n            },\n            {\n                \"name\":\"highlight_banner\",\n                \"priority\":55,\n                \"compatible\":true\n            },\n            {\n                \"name\":\"live_studio_launch_banner\",\n                \"priority\":66,\n                \"compatible\":true\n            },\n            {\n                \"compatible\": true,\n                \"name\": \"custom_banner\",\n                \"priority\": 100\n            }\n        ]\n}\n    ", BannerPriorityConfig.class);
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            bannerPriorityConfig = null;
        }
        DEFAULT = bannerPriorityConfig;
    }

    public final BannerPriorityConfig getBannerPriorityConfig() {
        return (BannerPriorityConfig) SettingsManager.INSTANCE.getValueSafely("ttlive_game_guide_banner_priority_mapping", DEFAULT);
    }

    public final BannerPriorityConfig getDEFAULT() {
        return DEFAULT;
    }
}
