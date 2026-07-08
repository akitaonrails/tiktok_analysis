package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class IMSearchSuggestedResponse extends BaseResponse {

    @C09CT("doc_list")
    public final List<SearchDoc> docList;

    public final IMSearchSuggestedResponse copy(List<SearchDoc> list) {
        return new IMSearchSuggestedResponse(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IMSearchSuggestedResponse) && Intrinsics.LJFF(this.docList, ((IMSearchSuggestedResponse) obj).docList);
    }

    public int hashCode() {
        List<SearchDoc> list = this.docList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMSearchSuggestedResponse(docList=");
        sbLIZ.append(this.docList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<SearchDoc> getDocList() {
        return this.docList;
    }

    public IMSearchSuggestedResponse(List<SearchDoc> list) {
        this.docList = list;
    }
}
