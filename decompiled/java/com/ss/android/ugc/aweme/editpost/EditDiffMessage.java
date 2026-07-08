package com.ss.android.ugc.aweme.editpost;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public final class EditDiffMessage implements Serializable {

    @C09CT("aweme_id")
    public final String aid;

    @C09CT("edit_id")
    public final String editId;

    @C09CT("edit_post_permission")
    public final EditPostPermission permission;

    public EditDiffMessage() {
        this("", "", null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditDiffMessage(aid=");
        sbLIZ.append(this.aid);
        sbLIZ.append(", editId=");
        sbLIZ.append(this.editId);
        sbLIZ.append(", permission=");
        sbLIZ.append(this.permission);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public EditDiffMessage(String str, String str2, EditPostPermission editPostPermission) {
        this.aid = str;
        this.editId = str2;
        this.permission = editPostPermission;
    }
}
