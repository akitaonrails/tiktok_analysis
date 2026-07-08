package com.ss.android.ugc.tools.chat.services;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class CreationChatMessageActionResp extends BaseResponse {

    @C09CT("content_pb")
    public final String contentPb;

    @C09CT("log_pb")
    public final LogPbBean logPb;

    public CreationChatMessageActionResp() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreationChatMessageActionResp)) {
            return false;
        }
        CreationChatMessageActionResp creationChatMessageActionResp = (CreationChatMessageActionResp) obj;
        return Intrinsics.LJFF(this.contentPb, creationChatMessageActionResp.contentPb) && Intrinsics.LJFF(this.logPb, creationChatMessageActionResp.logPb);
    }

    public final int hashCode() {
        String str = this.contentPb;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        LogPbBean logPbBean = this.logPb;
        return iHashCode + (logPbBean != null ? logPbBean.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreationChatMessageActionResp(contentPb=");
        sbLIZ.append(this.contentPb);
        sbLIZ.append(", logPb=");
        sbLIZ.append(this.logPb);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CreationChatMessageActionResp(String str, LogPbBean logPbBean) {
        this.contentPb = str;
        this.logPb = logPbBean;
    }
}
