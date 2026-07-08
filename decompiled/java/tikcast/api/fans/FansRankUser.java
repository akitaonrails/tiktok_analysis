package tikcast.api.fans;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import tikcast.api.creator_succ.CRMUserDisplayItem;
import webcast.data.MiniUser;

/* JADX INFO: loaded from: classes29.dex */
public final class FansRankUser {

    @C09CT("crm_user_display_item")
    public CRMUserDisplayItem crmUserDisplayItem;

    @C09CT("fans_level")
    public long fansLevel;

    @C09CT("fans_score")
    public long fansScore;

    @C09CT("live_online")
    public boolean liveOnline;

    @C09CT("rank_index")
    public long rankIndex;

    @C09CT("rank_score")
    public long rankScore;

    @C09CT("user")
    public MiniUser user;

    @C09CT("user_id")
    public long userId;

    @C09CT("fans_tag_for_anchor")
    public String fansTagForAnchor = "";

    @C09CT("daily_task_status")
    public List<MiniTaskProcess> dailyTaskStatus = new ArrayList();
}
