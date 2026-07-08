package com.ss.android.ugc.aweme.config;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes11.dex */
public final class TiktokEcSearchRegionConfigSettings {
    public static final TiktokEcSearchRegionConfigModel LIZ;

    public static final class TiktokEcSearchRegionConfigModel {

        @C09CT("disable_sug_from_mall")
        public boolean disableSugFromMall;

        @C09CT("disable_suggest_guide_from_mall")
        public boolean disableSuggestGuideFromMall;

        @C09CT("specify_history_from_mall")
        public boolean specifyHistoryFromMall;
    }

    static {
        TiktokEcSearchRegionConfigModel tiktokEcSearchRegionConfigModel = new TiktokEcSearchRegionConfigModel();
        tiktokEcSearchRegionConfigModel.disableSugFromMall = false;
        tiktokEcSearchRegionConfigModel.disableSuggestGuideFromMall = false;
        tiktokEcSearchRegionConfigModel.specifyHistoryFromMall = false;
        LIZ = tiktokEcSearchRegionConfigModel;
    }

    public static final TiktokEcSearchRegionConfigModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        TiktokEcSearchRegionConfigModel tiktokEcSearchRegionConfigModel = LIZ;
        TiktokEcSearchRegionConfigModel tiktokEcSearchRegionConfigModel2 = (TiktokEcSearchRegionConfigModel) settingsManagerLIZLLL.LJIIIIZZ("tiktok_ec_search_region_config", TiktokEcSearchRegionConfigModel.class, tiktokEcSearchRegionConfigModel);
        return tiktokEcSearchRegionConfigModel2 != null ? tiktokEcSearchRegionConfigModel2 : tiktokEcSearchRegionConfigModel;
    }
}
