package webcast.api.game_revenue;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class DiscordUpdateGuildSettingRequest {

    @C09CT("business_id")
    public int businessId;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("guild_id_str")
    public String guildIdStr = "";

    @C09CT("guild_name")
    public String guildName = "";

    @C09CT("guild_icon")
    public String guildIcon = "";

    @C09CT("role_settings")
    public List<RoleSettingInfo> roleSettings = new ArrayList();

    @C09CT("role_expired_settings")
    public List<RoleExpiredInfo> roleExpiredSettings = new ArrayList();
}
