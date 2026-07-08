package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes15.dex */
public final class RecentActivityResponse implements Serializable {

    @C09CT("activity_type")
    public final Integer activityType;

    @C09CT("creator_uid")
    public final Long creatorUserId;

    @C09CT("activity_id")
    public final Long itemId;

    public RecentActivityResponse() {
        this(null, null, null);
    }

    public RecentActivityResponse(Integer num, Long l, Long l2) {
        this.activityType = num;
        this.creatorUserId = l;
        this.itemId = l2;
    }
}
