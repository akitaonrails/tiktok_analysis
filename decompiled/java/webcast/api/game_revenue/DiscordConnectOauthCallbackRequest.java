package webcast.api.game_revenue;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes18.dex */
public final class DiscordConnectOauthCallbackRequest {

    @C09CT("business_id")
    public int businessId;

    @C09CT("is_from_migrate")
    public boolean isFromMigrate;

    @C09CT("is_from_sticker")
    public boolean isFromSticker;

    @C09CT("oauth_role_type")
    public int oauthRoleType;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("code")
    public String code = "";

    @C09CT("state")
    public String state = "";

    @C09CT("guild_id_str")
    public String guildIdStr = "";

    @C09CT("permission_str")
    public String permissionStr = "";
}
