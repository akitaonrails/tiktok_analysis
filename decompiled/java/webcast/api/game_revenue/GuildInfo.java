package webcast.api.game_revenue;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class GuildInfo {

    @C09CT("guild_icon_image")
    public ImageModel guildIconImage;

    @C09CT("guild_id_str")
    public String guildIdStr = "";

    @C09CT("guild_name")
    public String guildName = "";

    @C09CT("guild_icon")
    public String guildIcon = "";

    @C09CT("owner_id_str")
    public String ownerIdStr = "";

    @C09CT("roles")
    public List<RoleInfo> roles = new ArrayList();

    @C09CT("channels")
    public List<ChannelInfo> channels = new ArrayList();
}
