package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.settings;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes27.dex */
public final class TtecLiveBannerResourceIdSettings {
    public static final BannerResourceIdConfig LIZ = new BannerResourceIdConfig("live_ec_top_atmosphere", "7423385301164233217", "top_atmosphere", Boolean.TRUE);

    public static final class BannerResourceIdConfig {

        @C09CT("category_id")
        public final String categoryId;

        @C09CT("panel")
        public final String panel;

        @C09CT("preload")
        public final Boolean preload;

        @C09CT("resource_id")
        public final String resourceId;

        public BannerResourceIdConfig() {
            this("live_ec_top_atmosphere", "7423385301164233217", "top_atmosphere", Boolean.TRUE);
        }

        public BannerResourceIdConfig(String str, String str2, String str3, Boolean bool) {
            this.panel = str;
            this.resourceId = str2;
            this.categoryId = str3;
            this.preload = bool;
        }
    }

    public static final BannerResourceIdConfig LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        BannerResourceIdConfig bannerResourceIdConfig = LIZ;
        BannerResourceIdConfig bannerResourceIdConfig2 = (BannerResourceIdConfig) settingsManagerLIZLLL.LJIIIIZZ("ttkec_billboard_top_atmosphere_resource_info", BannerResourceIdConfig.class, bannerResourceIdConfig);
        return bannerResourceIdConfig2 != null ? bannerResourceIdConfig2 : bannerResourceIdConfig;
    }
}
