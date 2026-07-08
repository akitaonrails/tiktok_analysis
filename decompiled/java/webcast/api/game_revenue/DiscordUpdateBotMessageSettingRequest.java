package webcast.api.game_revenue;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes18.dex */
public final class DiscordUpdateBotMessageSettingRequest {

    @C09CT("bot_alter_settings")
    public BotAlterSettings botAlterSettings;

    @C09CT("business_id")
    public int businessId;

    @C09CT("guild_id_str")
    public String guildIdStr = "";

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;
}
