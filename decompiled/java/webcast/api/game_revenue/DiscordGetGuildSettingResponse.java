package webcast.api.game_revenue;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class DiscordGetGuildSettingResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("discord_status")
        public int discordStatus;

        @C09CT("guild_setting_info")
        public GuildSettingInfo guildSettingInfo;

        @C09CT("has_set_bio")
        public boolean hasSetBio;

        @C09CT("has_sticker_permission")
        public boolean hasStickerPermission;

        @C09CT("is_migration")
        public boolean isMigration;

        @C09CT("msg_settings")
        public BotAlterSettings msgSettings;

        @C09CT("persona_switch")
        public boolean personaSwitch;

        @C09CT("pervious_guild_map")
        public DiscordGuildsPrevVersion perviousGuildMap;

        @C09CT("sticker_switch")
        public boolean stickerSwitch;

        @C09CT("total_record")
        public int totalRecord;

        @C09CT("reconnect_url")
        public String reconnectUrl = "";

        @C09CT("bio_url")
        public String bioUrl = "";

        @C09CT("records")
        public List<JoinRecordItem> records = new ArrayList();
    }
}
