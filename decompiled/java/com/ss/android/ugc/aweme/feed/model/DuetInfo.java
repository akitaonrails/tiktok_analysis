package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class DuetInfo implements Serializable {

    @C09CT("original_item_duetted_count")
    public long originalItemDuetCount;

    @C09CT("original_item_id")
    public String originalItemId = "";

    public final long getOriginalItemDuetCount() {
        return this.originalItemDuetCount;
    }

    public final String getOriginalItemId() {
        return this.originalItemId;
    }

    public final void setOriginalItemDuetCount(long j) {
        this.originalItemDuetCount = j;
    }

    public final void setOriginalItemId(String str) {
        this.originalItemId = str;
    }
}
