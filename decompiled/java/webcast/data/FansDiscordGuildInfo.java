package webcast.data;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class FansDiscordGuildInfo {

    @C09CT("guild_icon_image")
    public ImageModel guildIconImage;

    @C09CT("roles")
    public List<FansDiscordRoleInfo> roles;

    @C09CT("guild_id_str")
    public String guildIdStr = "";

    @C09CT("guild_name")
    public String guildName = "";

    @C09CT("guild_icon")
    public String guildIcon = "";

    @C09CT("owner_id_str")
    public String ownerIdStr = "";

    @C09CT("reconnect_url")
    public String reconnectUrl = "";
}
