package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("gbl_group_live_fe_pages_configuration")
public final class GiftGroupLiveLinksSettings {
    public static final GiftGroupLiveLinksSettings INSTANCE = new GiftGroupLiveLinksSettings();
    public static final Configs DEFAULT = new Configs("aweme://roma_redirect/?roma_group_key=roma_schema_group_group_live_gift&roma_page_key=roma_schema_page_guide", "aweme://roma_redirect/?roma_group_key=roma_schema_group_group_live_gift&roma_page_key=roma_schema_page_faq", "aweme://roma_redirect/?spark_page=group_live_ranking");

    public static final class Configs {
        public static final TypeAdapter ADAPTER;

        @C09CT("faq_link")
        public String faqLink;

        @C09CT("guide_page_link")
        public String guideLink;

        @C09CT("ranking")
        public String rankingLink;

        static {
            NormalGson.singleton();
            ADAPTER = new GiftGroupLiveLinksSettings_Configs_OptTypeAdapter();
        }

        public Configs() {
            this("aweme://roma_redirect/?roma_group_key=roma_schema_group_group_live_gift&roma_page_key=roma_schema_page_guide", "aweme://roma_redirect/?roma_group_key=roma_schema_group_group_live_gift&roma_page_key=roma_schema_page_faq", "aweme://roma_redirect/?spark_page=group_live_ranking");
        }

        public Configs(String str, String str2, String str3) {
            this.guideLink = str;
            this.faqLink = str2;
            this.rankingLink = str3;
        }
    }

    public static final Configs getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Configs configs = DEFAULT;
        Configs configs2 = (Configs) settingsManager.getValueSafely("gbl_group_live_fe_pages_configuration", configs);
        return configs2 != null ? configs2 : configs;
    }
}
