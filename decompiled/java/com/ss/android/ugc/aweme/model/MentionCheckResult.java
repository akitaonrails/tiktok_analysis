package com.ss.android.ugc.aweme.model;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public final class MentionCheckResult {

    @C09CT("uid")
    public final String uid;

    @C09CT("user_blocked_results")
    public final List<MentionCheckSingleTypeResult> userBlockedResults;

    public MentionCheckResult() {
        this(null, null, 3, null);
    }

    public final int hashCode() {
        return (this.uid.hashCode() * 31) + this.userBlockedResults.hashCode();
    }

    public MentionCheckResult(String str, List<MentionCheckSingleTypeResult> list) {
        this.uid = str;
        this.userBlockedResults = list;
    }

    public MentionCheckResult(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
