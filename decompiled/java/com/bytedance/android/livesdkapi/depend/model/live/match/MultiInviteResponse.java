package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class MultiInviteResponse {

    @C09CT("battle_id")
    public Long battleId;

    @C09CT("battle_team_user")
    public List<TeamUser> battleTeamUser;

    @C09CT("gift_mode_meta")
    public GiftModeMeta giftModeMeta;

    @C09CT("gift_mode_meta_v2")
    public GiftModeMetaV2 giftModeMetaV2;

    @C09CT("league_info_map")
    public Map<Long, GiftGalleryBadgeInfo> leagueInfoMap;

    @C09CT("invite_scene")
    public int meanwhileInviteScene;

    public MultiInviteResponse() {
        this(0L, 0, null);
    }

    public MultiInviteResponse(Long l, int i, List<TeamUser> list) {
        this.battleId = l;
        this.meanwhileInviteScene = i;
        this.battleTeamUser = list;
        this.leagueInfoMap = new LinkedHashMap();
    }
}
