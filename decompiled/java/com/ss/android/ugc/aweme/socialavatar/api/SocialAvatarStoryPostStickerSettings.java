package com.ss.android.ugc.aweme.socialavatar.api;

import X.C09CT;
import X.C1697810uHb;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.socialavatar.model.SocialAvatarStickerStruct;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialAvatarStoryPostStickerSettings {
    public static final SocialAvatarStoryPostStickerSettings LIZ = new SocialAvatarStoryPostStickerSettings();
    public static final Config LIZIZ = new Config(C1697810uHb.LJIIJJI(3, 7), "https://p16-sg.tiktokcdn.com/obj/tiktok-obj/social_avatar_sticker_intro.png", "excited");

    public static SocialAvatarStickerStruct LIZIZ() {
        ISocialAvatarStoryPostService iSocialAvatarStoryPostService = (ISocialAvatarStoryPostService) PluggableExtentionKt.pluggableSpi$default(ISocialAvatarStoryPostService.class, false, false, false, 14, null);
        if (iSocialAvatarStoryPostService != null) {
            return iSocialAvatarStoryPostService.LIZIZ(LIZ().entranceExpression);
        }
        return null;
    }

    public static final Config LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        Config config = LIZIZ;
        Config config2 = (Config) settingsManagerLIZLLL.LJIIIIZZ("social_avatar_story_post_sticker_settings", Config.class, config);
        return config2 != null ? config2 : config;
    }

    public static final class Config {

        @C09CT("anchor_sheet_default_image")
        public final String anchorDefaultImage;

        @C09CT("entrance_expression")
        public final String entranceExpression;

        @C09CT("sticker_tray_intervals")
        public final List<Integer> stickerTrayIntervals;

        public Config() {
            this(C1697810uHb.LJIIJJI(3, 7), "https://p16-sg.tiktokcdn.com/obj/tiktok-obj/social_avatar_sticker_intro.png", "excited");
        }

        public Config(List<Integer> list, String str, String str2) {
            this.stickerTrayIntervals = list;
            this.anchorDefaultImage = str;
            this.entranceExpression = str2;
        }
    }
}
