package com.ss.android.ugc.aweme.topic.search.api;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SearchTopicResponse extends BaseResponse {

    @C09CT("sug_list")
    public final List<SugStruct> sugList;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchTopicResponse) && Intrinsics.LJFF(this.sugList, ((SearchTopicResponse) obj).sugList);
    }

    public final int hashCode() {
        List<SugStruct> list = this.sugList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchTopicResponse(sugList=");
        sbLIZ.append(this.sugList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SearchTopicResponse(List<SugStruct> list) {
        this.sugList = list;
    }
}
