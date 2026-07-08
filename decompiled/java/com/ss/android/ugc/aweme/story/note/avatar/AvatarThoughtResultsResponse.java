package com.ss.android.ugc.aweme.story.note.avatar;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AvatarThoughtResultsResponse extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("results")
    public final List<AvatarThoughtResult> results;

    public final AvatarThoughtResultsResponse copy(List<AvatarThoughtResult> list) {
        return new AvatarThoughtResultsResponse(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AvatarThoughtResultsResponse) && Intrinsics.LJFF(this.results, ((AvatarThoughtResultsResponse) obj).results);
    }

    public int hashCode() {
        List<AvatarThoughtResult> list = this.results;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AvatarThoughtResultsResponse(results=");
        sbLIZ.append(this.results);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<AvatarThoughtResult> getResults() {
        return this.results;
    }

    public AvatarThoughtResultsResponse(List<AvatarThoughtResult> list) {
        this.results = list;
    }
}
