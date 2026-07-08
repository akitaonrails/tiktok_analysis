package com.ss.android.ugc.aweme.bean;

import X.C09CT;
import com.ss.android.ugc.aweme.story.model.ClientControlParams;
import java.io.Serializable;

/* JADX INFO: loaded from: classes25.dex */
public final class MixRanSkylightStoryBizParams implements Serializable {

    @C09CT("client_control_params")
    public final ClientControlParams clientControlParams;

    @C09CT("following_count")
    public final int followingCount;

    @C09CT("loadmore_position")
    public final int loadmorePosition;

    @C09CT("maf_story_exit")
    public final int mafStoryExit;

    @C09CT("muf_count")
    public final int mufCount;

    @C09CT("need_story_notes")
    public final int needStoryNotes;

    @C09CT("recent_viewed_ids")
    public final String recentViewedIds;

    @C09CT("reveal_promotion_last_view_time")
    public final Long revealPromotionLastViewTime;

    @C09CT("user_story_package_count_limit")
    public final Long userStoryPackageCountLimit;

    public MixRanSkylightStoryBizParams() {
        this(0, 0, 0, null, null, null, 0, 0, null);
    }

    public MixRanSkylightStoryBizParams(int i, int i2, int i3, ClientControlParams clientControlParams, String str, Long l, int i4, int i5, Long l2) {
        this.needStoryNotes = i;
        this.mufCount = i2;
        this.followingCount = i3;
        this.clientControlParams = clientControlParams;
        this.recentViewedIds = str;
        this.userStoryPackageCountLimit = l;
        this.mafStoryExit = i4;
        this.loadmorePosition = i5;
        this.revealPromotionLastViewTime = l2;
    }
}
