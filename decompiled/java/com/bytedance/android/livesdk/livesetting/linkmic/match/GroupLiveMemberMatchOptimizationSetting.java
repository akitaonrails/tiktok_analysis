package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_group_live_1v1_match_optimization_enable")
public final class GroupLiveMemberMatchOptimizationSetting {
    public static final GroupLiveMemberMatchOptimizationSetting INSTANCE = new GroupLiveMemberMatchOptimizationSetting();
    public static final Configs DEFAULT = new Configs(true, "aweme://roma_redirect/?spark_page=group_live_member_pk_contributor_list_page");

    private final Configs getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Configs configs = DEFAULT;
        Configs configs2 = (Configs) settingsManager.getValueSafely("live_group_live_1v1_match_optimization_enable", configs);
        return configs2 != null ? configs2 : configs;
    }

    public final String getContributorsPageLink() {
        return getConfig().contributorsPageLink;
    }

    public final boolean isEnable() {
        return getConfig().enable;
    }

    public static final class Configs {
        public static final TypeAdapter ADAPTER = new GroupLiveMemberMatchOptimizationSetting_Configs_OptTypeAdapter(NormalGson.singleton());

        @C09CT("member_pk_match_optimization_contributors_page")
        public String contributorsPageLink;

        @C09CT("enable")
        public boolean enable;

        public Configs() {
            this(true, "aweme://roma_redirect/?spark_page=group_live_member_pk_contributor_list_page");
        }

        public Configs(boolean z, String str) {
            this.enable = z;
            this.contributorsPageLink = str;
        }
    }
}
