package com.ss.android.ugc.aweme.editpost;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class EditPostPermission implements Serializable {

    @C09CT("biz_permissions")
    public List<EditPostBizPermissionStruct> bizPermission;

    public EditPostPermission() {
        this(null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditPostPermission(bizPermission=");
        sbLIZ.append(this.bizPermission);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public EditPostPermission(List<EditPostBizPermissionStruct> list) {
        this.bizPermission = list;
    }
}
