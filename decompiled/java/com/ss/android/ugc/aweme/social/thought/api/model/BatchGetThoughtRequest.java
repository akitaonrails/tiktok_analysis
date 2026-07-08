package com.ss.android.ugc.aweme.social.thought.api.model;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class BatchGetThoughtRequest implements Serializable {
    public static final int $stable = 8;

    @C09CT("user_ids")
    public final List<String> userIds;

    public BatchGetThoughtRequest() {
        this(null, 1, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BatchGetThoughtRequest) && Intrinsics.LJFF(this.userIds, ((BatchGetThoughtRequest) obj).userIds);
    }

    public int hashCode() {
        return this.userIds.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BatchGetThoughtRequest(userIds=");
        sbLIZ.append(this.userIds);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BatchGetThoughtRequest(List<String> list) {
        this.userIds = list;
    }

    public BatchGetThoughtRequest(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
