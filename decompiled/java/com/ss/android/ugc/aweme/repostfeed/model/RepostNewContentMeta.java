package com.ss.android.ugc.aweme.repostfeed.model;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class RepostNewContentMeta {

    @C09CT("feed_recall_reason")
    public final String feedRecallReason;

    @C09CT("item_id")
    public final String itemId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RepostNewContentMeta)) {
            return false;
        }
        RepostNewContentMeta repostNewContentMeta = (RepostNewContentMeta) obj;
        return Intrinsics.LJFF(this.itemId, repostNewContentMeta.itemId) && Intrinsics.LJFF(this.feedRecallReason, repostNewContentMeta.feedRecallReason);
    }

    public RepostNewContentMeta() {
        this("", "");
    }

    public RepostNewContentMeta(String str, String str2) {
        this.itemId = str;
        this.feedRecallReason = str2;
    }
}
