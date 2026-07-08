package com.bytedance.ies.im.core.bridge.init.queryexp.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class QueryExpResponse extends BaseResponse implements Serializable {

    @C09CT("user_feature_result")
    public final List<UserExperimentResult> allUserExpResult;

    public QueryExpResponse() {
        this(null);
    }

    public final QueryExpResponse copy(List<UserExperimentResult> list) {
        return new QueryExpResponse(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof QueryExpResponse) && Intrinsics.LJFF(this.allUserExpResult, ((QueryExpResponse) obj).allUserExpResult);
    }

    public int hashCode() {
        List<UserExperimentResult> list = this.allUserExpResult;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QueryExpResponse(allUserExpResult=");
        sbLIZ.append(this.allUserExpResult);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<UserExperimentResult> getAllUserExpResult() {
        return this.allUserExpResult;
    }

    public QueryExpResponse(List<UserExperimentResult> list) {
        this.allUserExpResult = list;
    }
}
