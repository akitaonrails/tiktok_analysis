package com.ss.android.ugc.aweme.comment.easteregg.model;

import X.AnonymousClass0561;
import X.C09CT;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class SurpriseResourceReq implements Serializable {
    public static final int $stable = 8;

    @C09CT("activity_ids")
    public final List<Integer> activityIds;

    @C09CT("surprise_resource_type")
    public final int surpriseResourceType;

    public SurpriseResourceReq() {
        this(AnonymousClass0561.SURPRISE_RESOURCE_TYPE_ENUM_FIRST_COMMENT_SURPRISE.getValue(), new ArrayList());
    }

    public SurpriseResourceReq(int i, List<Integer> list) {
        this.surpriseResourceType = i;
        this.activityIds = list;
    }
}
