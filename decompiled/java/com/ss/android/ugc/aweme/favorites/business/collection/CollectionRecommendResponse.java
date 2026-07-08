package com.ss.android.ugc.aweme.favorites.business.collection;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class CollectionRecommendResponse extends BaseResponse {

    @C09CT("rec_name_list")
    public final List<String> nameList;

    public CollectionRecommendResponse() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CollectionRecommendResponse) && Intrinsics.LJFF(this.nameList, ((CollectionRecommendResponse) obj).nameList);
    }

    public final int hashCode() {
        List<String> list = this.nameList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CollectionRecommendResponse(nameList=");
        sbLIZ.append(this.nameList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CollectionRecommendResponse(List<String> list) {
        this.nameList = list;
    }
}
