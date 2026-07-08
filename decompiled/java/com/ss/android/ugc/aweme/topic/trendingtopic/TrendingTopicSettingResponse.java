package com.ss.android.ugc.aweme.topic.trendingtopic;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes.dex */
public final class TrendingTopicSettingResponse extends BaseResponse {

    @C09CT("enable_link_topic")
    public final int status;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TrendingTopicSettingResponse) && this.status == ((TrendingTopicSettingResponse) obj).status;
    }

    public final int hashCode() {
        return this.status;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TrendingTopicSettingResponse(status=");
        sbLIZ.append(this.status);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TrendingTopicSettingResponse(int i) {
        this.status = i;
    }
}
