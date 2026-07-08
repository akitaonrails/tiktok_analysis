package tikcast.api.fans;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes.dex */
public final class FansRankListRequest {

    @C09CT("count")
    public long count;

    @C09CT("fans_data_section")
    public int fansDataSection;

    @C09CT("offset")
    public long offset;

    @C09CT("online_opt")
    public int onlineOpt;

    @C09CT("rank_type")
    public int rankType;

    @C09CT("with_crm_display_item")
    public boolean withCrmDisplayItem;

    @C09CT("with_customized_gift")
    public boolean withCustomizedGift;

    @C09CT("with_discord_entrance")
    public boolean withDiscordEntrance;

    @C09CT("with_fans_club_name")
    public boolean withFansClubName;

    @C09CT("with_offline_page_banner")
    public boolean withOfflinePageBanner;

    @C09CT("room_id")
    public String roomId = "";

    @C09CT("sec_anchor_id")
    public String secAnchorId = "";

    @C09CT(Scene.SCENE_SERVICE)
    public String scene = "";
}
