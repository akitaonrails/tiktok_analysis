package webcast.api.game_revenue;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes.dex */
public final class DiscordGetGuildSettingRequest {

    @C09CT("business_id")
    public int businessId;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("with_join_records")
    public boolean withJoinRecords;

    @C09CT("with_msg_settings")
    public boolean withMsgSettings;

    @C09CT("with_prev_guilds")
    public boolean withPrevGuilds;
}
