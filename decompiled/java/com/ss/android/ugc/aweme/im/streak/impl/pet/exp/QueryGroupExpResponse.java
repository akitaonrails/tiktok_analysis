package com.ss.android.ugc.aweme.im.streak.impl.pet.exp;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class QueryGroupExpResponse extends BaseResponse implements Serializable {

    @C09CT("group_feature_result")
    public final List<GroupExperimentResult> allUserExpResult;

    public QueryGroupExpResponse() {
        this(null);
    }

    public final QueryGroupExpResponse copy(List<GroupExperimentResult> list) {
        return new QueryGroupExpResponse(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof QueryGroupExpResponse) && Intrinsics.LJFF(this.allUserExpResult, ((QueryGroupExpResponse) obj).allUserExpResult);
    }

    public int hashCode() {
        List<GroupExperimentResult> list = this.allUserExpResult;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QueryGroupExpResponse(allUserExpResult=");
        sbLIZ.append(this.allUserExpResult);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<GroupExperimentResult> getAllUserExpResult() {
        return this.allUserExpResult;
    }

    public QueryGroupExpResponse(List<GroupExperimentResult> list) {
        this.allUserExpResult = list;
    }
}
