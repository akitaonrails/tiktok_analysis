package com.ss.android.ugc.aweme.compliance.api.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class CmplRespForEncrypt extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("cmpl_enc")
    public final String complianceEncrypt;

    @C09CT("log_pb")
    public final LogPbBean logPb;

    public CmplRespForEncrypt() {
        this(null, null);
    }

    public final CmplRespForEncrypt copy(String str, LogPbBean logPbBean) {
        return new CmplRespForEncrypt(str, logPbBean);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CmplRespForEncrypt)) {
            return false;
        }
        CmplRespForEncrypt cmplRespForEncrypt = (CmplRespForEncrypt) obj;
        return Intrinsics.LJFF(this.complianceEncrypt, cmplRespForEncrypt.complianceEncrypt) && Intrinsics.LJFF(this.logPb, cmplRespForEncrypt.logPb);
    }

    public int hashCode() {
        String str = this.complianceEncrypt;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        LogPbBean logPbBean = this.logPb;
        return iHashCode + (logPbBean != null ? logPbBean.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CmplRespForEncrypt(complianceEncrypt=");
        sbLIZ.append(this.complianceEncrypt);
        sbLIZ.append(", logPb=");
        sbLIZ.append(this.logPb);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getComplianceEncrypt() {
        return this.complianceEncrypt;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public CmplRespForEncrypt(String str, LogPbBean logPbBean) {
        this.complianceEncrypt = str;
        this.logPb = logPbBean;
    }
}
