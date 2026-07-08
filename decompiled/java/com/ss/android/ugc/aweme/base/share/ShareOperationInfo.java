package com.ss.android.ugc.aweme.base.share;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class ShareOperationInfo implements Serializable {

    @C09CT("incentive_operation_type")
    public String incentiveOperationType;

    @C09CT("operation_id")
    public String operationId;

    @C09CT("operation_name")
    public String operationName;

    public ShareOperationInfo() {
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShareOperationInfo(operationId=");
        sbLIZ.append(this.operationId);
        sbLIZ.append(", operationName=");
        sbLIZ.append(this.operationName);
        sbLIZ.append(", incentiveOperationType=");
        sbLIZ.append(this.incentiveOperationType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ShareOperationInfo(String str, String str2, String str3) {
        this.operationId = str;
        this.operationName = str2;
        this.incentiveOperationType = str3;
    }
}
