package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.settings;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes27.dex */
public final class TtecLiveMultiBillboardResourceIdSettings {
    public static final MultiBillboardResourceIdConfig LIZ = new MultiBillboardResourceIdConfig("7288950467940323841", "7291602761399931394");

    public static final class MultiBillboardResourceIdConfig {

        @C09CT("photo")
        public final String photoResourceId;

        @C09CT("template")
        public final String templateResourceId;

        public MultiBillboardResourceIdConfig() {
            this("7288950467940323841", "7291602761399931394");
        }

        public MultiBillboardResourceIdConfig(String str, String str2) {
            this.templateResourceId = str;
            this.photoResourceId = str2;
        }
    }

    public static final MultiBillboardResourceIdConfig LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        MultiBillboardResourceIdConfig multiBillboardResourceIdConfig = LIZ;
        MultiBillboardResourceIdConfig multiBillboardResourceIdConfig2 = (MultiBillboardResourceIdConfig) settingsManagerLIZLLL.LJIIIIZZ("ttec_live_multi_billboard_resource_id_dict", MultiBillboardResourceIdConfig.class, multiBillboardResourceIdConfig);
        return multiBillboardResourceIdConfig2 != null ? multiBillboardResourceIdConfig2 : multiBillboardResourceIdConfig;
    }
}
