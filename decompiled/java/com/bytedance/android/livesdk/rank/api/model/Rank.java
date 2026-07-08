package com.bytedance.android.livesdk.rank.api.model;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.List;
import tikcast.api.creator_succ.CRMUserDisplayItem;

/* JADX INFO: loaded from: classes.dex */
public final class Rank {

    @C09CT("rank")
    public long rank;

    @C09CT("rank_user")
    public User rankUser;

    @C09CT("score")
    public long score;

    @C09CT("user")
    public User user;

    @C09CT("user_restriction_level")
    public long userRestrictionLevel;

    @C09CT("gap_description")
    public String gapDescription = "";

    @C09CT("crm_user_display_item_list")
    public List<CRMUserDisplayItem> crmUserDisplayItemList = new ArrayList();

    @C09CT("rank_str")
    public String rankStr = "";
}
