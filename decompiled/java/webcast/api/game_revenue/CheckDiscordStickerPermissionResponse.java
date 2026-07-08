package webcast.api.game_revenue;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class CheckDiscordStickerPermissionResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("is_has_sticker_permission")
        public boolean isHasStickerPermission;

        @C09CT("oauth_url")
        public String oauthUrl = "";

        @C09CT("sticker_switch")
        public boolean stickerSwitch;
    }
}
