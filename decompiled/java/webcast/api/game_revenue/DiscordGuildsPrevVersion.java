package webcast.api.game_revenue;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class DiscordGuildsPrevVersion {

    @C09CT("number")
    public int number;

    @C09CT("prev_version_guild_map")
    public Map<Integer, GuildInfo> prevVersionGuildMap = new LinkedHashMap();
}
