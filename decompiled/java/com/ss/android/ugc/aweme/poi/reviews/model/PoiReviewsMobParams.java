package com.ss.android.ugc.aweme.poi.reviews.model;

import X.C09CT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiReviewsMobParams implements Serializable {

    @C09CT("group_id")
    public final String groupId;

    public PoiReviewsMobParams() {
        this(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PoiReviewsMobParams) && Intrinsics.LJFF(this.groupId, ((PoiReviewsMobParams) obj).groupId);
    }

    public PoiReviewsMobParams(String str) {
        this.groupId = str;
    }
}
