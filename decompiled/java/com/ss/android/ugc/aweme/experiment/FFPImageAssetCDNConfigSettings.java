package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes17.dex */
public final class FFPImageAssetCDNConfigSettings {
    public static final FFPImageAssetCDNConfig LIZ = new FFPImageAssetCDNConfig(new FindFriendsAssetConfig(null, null, null, null));

    public static final FFPImageAssetCDNConfig LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        FFPImageAssetCDNConfig fFPImageAssetCDNConfig = LIZ;
        FFPImageAssetCDNConfig fFPImageAssetCDNConfig2 = (FFPImageAssetCDNConfig) settingsManagerLIZLLL.LJIIIIZZ("find_friends_redesign_auth_background", FFPImageAssetCDNConfig.class, fFPImageAssetCDNConfig);
        return fFPImageAssetCDNConfig2 != null ? fFPImageAssetCDNConfig2 : fFPImageAssetCDNConfig;
    }

    public static final class FFPImageAssetCDNConfig {

        @C09CT("find_friends_auth_page_asset_config")
        public final FindFriendsAssetConfig ffpAssetConfig;

        public FFPImageAssetCDNConfig() {
            this(new FindFriendsAssetConfig(null, null, null, null));
        }

        public FFPImageAssetCDNConfig(FindFriendsAssetConfig findFriendsAssetConfig) {
            this.ffpAssetConfig = findFriendsAssetConfig;
        }
    }

    public static final class FindFriendsAssetConfig {

        @C09CT("dark")
        public final String suggestAuthPageLTRBGDark;

        @C09CT("light")
        public final String suggestAuthPageLTRBGLight;

        @C09CT("rtl_dark")
        public final String suggestAuthPageRTLBGDark;

        @C09CT("rtl_light")
        public final String suggestAuthPageRTLBGLight;

        public FindFriendsAssetConfig() {
            this(null, null, null, null);
        }

        public FindFriendsAssetConfig(String str, String str2, String str3, String str4) {
            this.suggestAuthPageLTRBGDark = str;
            this.suggestAuthPageLTRBGLight = str2;
            this.suggestAuthPageRTLBGDark = str3;
            this.suggestAuthPageRTLBGLight = str4;
        }
    }
}
