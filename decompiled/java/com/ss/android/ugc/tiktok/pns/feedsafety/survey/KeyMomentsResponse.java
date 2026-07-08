package com.ss.android.ugc.tiktok.pns.feedsafety.survey;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class KeyMomentsResponse extends BaseResponse {

    @C09CT("topics")
    public final List<Integer> topics;

    public KeyMomentsResponse() {
        this(null, 1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof KeyMomentsResponse) && Intrinsics.LJFF(this.topics, ((KeyMomentsResponse) obj).topics);
    }

    public final int hashCode() {
        return this.topics.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("KeyMomentsResponse(topics=");
        sbLIZ.append(this.topics);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public KeyMomentsResponse(List<Integer> list) {
        this.topics = list;
    }

    public KeyMomentsResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
