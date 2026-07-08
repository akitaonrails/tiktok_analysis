package com.ss.android.ugc.aweme.editpost;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class EditPostBizPermissionStruct implements Serializable {

    @C09CT("biz_status")
    public int bizStatus;

    @C09CT("biz_type")
    public int bizType;

    public EditPostBizPermissionStruct() {
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditPostBizPermissionStruct(bizType=");
        sbLIZ.append(this.bizType);
        sbLIZ.append(", bizStatus=");
        sbLIZ.append(this.bizStatus);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public EditPostBizPermissionStruct(int i, int i2) {
        this.bizType = i;
        this.bizStatus = i2;
    }
}
