package com.ss.android.ugc.ur.socialavatar;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialAvatarAISelfCompatibilityConfig {
    public static final AssetConfig LIZ = new AssetConfig(true, "excited", "amused", "shocked", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/aiself-compatibility/compatibility_foreground_dark.png", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/aiself-compatibility/compatibility_foreground_light.png", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/aiself-compatibility/compatibility_bg_dark.png", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/aiself-compatibility/compatibility_bg_light.png");

    public static final class AssetConfig {

        @C09CT("enable_sa_aiself_compatibility_ur_client")
        public final boolean enable;

        @C09CT("popup_background_dark")
        public final String popupBackgroundDarkUrl;

        @C09CT("popup_background_light")
        public final String popupBackgroundLightUrl;

        @C09CT("popup_foreground_dark")
        public final String popupForegroundDarkUrl;

        @C09CT("popup_foreground_light")
        public final String popupForegroundLightUrl;

        @C09CT("stickers_behind_expression")
        public final String stickerBehind;

        @C09CT("stickers_left_expression")
        public final String stickerLeft;

        @C09CT("stickers_right_expression")
        public final String stickerRight;

        public AssetConfig() {
            this(true, "excited", "amused", "shocked", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/aiself-compatibility/compatibility_foreground_dark.png", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/aiself-compatibility/compatibility_foreground_light.png", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/aiself-compatibility/compatibility_bg_dark.png", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/aiself-compatibility/compatibility_bg_light.png");
        }

        public AssetConfig(boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.enable = z;
            this.stickerLeft = str;
            this.stickerRight = str2;
            this.stickerBehind = str3;
            this.popupForegroundDarkUrl = str4;
            this.popupForegroundLightUrl = str5;
            this.popupBackgroundDarkUrl = str6;
            this.popupBackgroundLightUrl = str7;
        }
    }

    public static boolean LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        AssetConfig assetConfig = LIZ;
        AssetConfig assetConfig2 = (AssetConfig) settingsManagerLIZLLL.LJIIIIZZ("sa_aiself_compatibility_ur_client", AssetConfig.class, assetConfig);
        if (assetConfig2 != null) {
            assetConfig = assetConfig2;
        }
        return assetConfig.enable;
    }
}
