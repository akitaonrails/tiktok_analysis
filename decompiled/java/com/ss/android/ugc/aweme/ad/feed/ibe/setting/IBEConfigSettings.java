package com.ss.android.ugc.aweme.ad.feed.ibe.setting;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes17.dex */
public final class IBEConfigSettings {
    public static final IbeConfigModel LIZ = new IbeConfigModel();

    public static final class IBEChannelConfig {

        @C09CT("channel")
        public String channel = "";
    }

    public static final class IbeConfigModel {

        @C09CT("ibe_list")
        public IBEChannelConfig[] ibeList = new IBEChannelConfig[0];

        @C09CT("ibe_show_time")
        public double ibeShowTime = 2.0d;

        @C09CT("ibe_hide_time")
        public double ibeHideTime = 6.0d;
    }

    public static IbeConfigModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        IbeConfigModel ibeConfigModel = LIZ;
        IbeConfigModel ibeConfigModel2 = (IbeConfigModel) settingsManagerLIZLLL.LJIIIIZZ("ibe_config", IbeConfigModel.class, ibeConfigModel);
        return ibeConfigModel2 != null ? ibeConfigModel2 : ibeConfigModel;
    }
}
