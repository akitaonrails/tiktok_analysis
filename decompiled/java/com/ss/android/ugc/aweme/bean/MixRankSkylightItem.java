package com.ss.android.ugc.aweme.bean;

import X.C09CT;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import java.io.Serializable;

/* JADX INFO: loaded from: classes25.dex */
public final class MixRankSkylightItem implements Serializable {

    @C09CT("biz_data")
    public final MixRankSkylightItemBizData bizData;

    @C09CT("biz_group")
    public final Integer bizGroup;

    @C09CT("entity_id")
    public final String entityId;
    public transient FollowingInterestUser interestUser;
    public transient SlimRoom slimRoom;

    @C09CT("user_id")
    public final Long userId;

    public MixRankSkylightItem() {
        this(null, null, null, null);
    }

    public final void setInterestUser(FollowingInterestUser followingInterestUser) {
        this.interestUser = followingInterestUser;
    }

    public final void setSlimRoom(SlimRoom slimRoom) {
        this.slimRoom = slimRoom;
    }

    public MixRankSkylightItem(String str, Long l, Integer num, MixRankSkylightItemBizData mixRankSkylightItemBizData) {
        this.entityId = str;
        this.userId = l;
        this.bizGroup = num;
        this.bizData = mixRankSkylightItemBizData;
    }
}
