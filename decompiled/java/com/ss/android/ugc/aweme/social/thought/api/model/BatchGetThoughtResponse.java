package com.ss.android.ugc.aweme.social.thought.api.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class BatchGetThoughtResponse extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("thought_infos")
    public final List<ThoughtQueryResult> thoughtInfos;

    public BatchGetThoughtResponse() {
        this(null);
    }

    public final BatchGetThoughtResponse copy(List<ThoughtQueryResult> list) {
        return new BatchGetThoughtResponse(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BatchGetThoughtResponse) && Intrinsics.LJFF(this.thoughtInfos, ((BatchGetThoughtResponse) obj).thoughtInfos);
    }

    public int hashCode() {
        List<ThoughtQueryResult> list = this.thoughtInfos;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BatchGetThoughtResponse(thoughtInfos=");
        sbLIZ.append(this.thoughtInfos);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<ThoughtQueryResult> getThoughtInfos() {
        return this.thoughtInfos;
    }

    public BatchGetThoughtResponse(List<ThoughtQueryResult> list) {
        this.thoughtInfos = list;
    }
}
