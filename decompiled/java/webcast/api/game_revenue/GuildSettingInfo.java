package webcast.api.game_revenue;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class GuildSettingInfo {

    @C09CT("guild_info")
    public GuildInfo guildInfo;

    @C09CT("role_setting_info")
    public List<RoleSettingInfo> roleSettingInfo = new ArrayList();

    @C09CT("role_expired_info")
    public List<RoleExpiredInfo> roleExpiredInfo = new ArrayList();
}
