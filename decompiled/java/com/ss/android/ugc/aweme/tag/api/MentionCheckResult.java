package com.ss.android.ugc.aweme.tag.api;

import X.C09CT;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes32.dex */
public final class MentionCheckResult implements Serializable {
    public static final int $stable = 8;

    @C09CT("user_blocked_results")
    public ArrayList<MentionCheckSingleTypeResult> tagUpdateStatus;

    @C09CT("uid")
    public long uid;

    public MentionCheckResult() {
        this(0L, null);
    }

    public final void setTagUpdateStatus(ArrayList<MentionCheckSingleTypeResult> arrayList) {
        this.tagUpdateStatus = arrayList;
    }

    public final void setUid(long j) {
        this.uid = j;
    }

    public MentionCheckResult(long j, ArrayList<MentionCheckSingleTypeResult> arrayList) {
        this.uid = j;
        this.tagUpdateStatus = arrayList;
    }
}
