package com.ss.android.ugc.tools.chat.input.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class BusinessActionBarResponse extends BaseResponse {
    public static final int $stable = 8;

    @C09CT("action_bar")
    public final List<ActionBarButtonConfBusiness> actionBarConf;

    @C09CT("log_pb")
    public final LogPbBean logPb;

    public BusinessActionBarResponse() {
        this(null, null);
    }

    public final BusinessActionBarResponse copy(List<ActionBarButtonConfBusiness> list, LogPbBean logPbBean) {
        return new BusinessActionBarResponse(list, logPbBean);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BusinessActionBarResponse)) {
            return false;
        }
        BusinessActionBarResponse businessActionBarResponse = (BusinessActionBarResponse) obj;
        return Intrinsics.LJFF(this.actionBarConf, businessActionBarResponse.actionBarConf) && Intrinsics.LJFF(this.logPb, businessActionBarResponse.logPb);
    }

    public int hashCode() {
        List<ActionBarButtonConfBusiness> list = this.actionBarConf;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        LogPbBean logPbBean = this.logPb;
        return iHashCode + (logPbBean != null ? logPbBean.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BusinessActionBarResponse(actionBarConf=");
        sbLIZ.append(this.actionBarConf);
        sbLIZ.append(", logPb=");
        sbLIZ.append(this.logPb);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<ActionBarButtonConfBusiness> getActionBarConf() {
        return this.actionBarConf;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public BusinessActionBarResponse(List<ActionBarButtonConfBusiness> list, LogPbBean logPbBean) {
        this.actionBarConf = list;
        this.logPb = logPbBean;
    }
}
