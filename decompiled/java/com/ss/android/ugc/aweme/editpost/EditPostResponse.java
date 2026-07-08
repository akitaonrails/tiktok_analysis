package com.ss.android.ugc.aweme.editpost;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class EditPostResponse implements Serializable {

    @C09CT("biz_err_code")
    public final int bizErrorCode;

    @C09CT("edit_diff")
    public final EditDiffMessage editDiffMessage;

    @C09CT("error_msg")
    public final String errorMsg;

    @C09CT("local_cover_path")
    public String localCoverPath;

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditPostResponse(statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", statusMsg=");
        sbLIZ.append(this.statusMsg);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.errorMsg);
        sbLIZ.append(", editDiffMessage=");
        sbLIZ.append(this.editDiffMessage);
        sbLIZ.append(", bizErrorCode=");
        sbLIZ.append(this.bizErrorCode);
        sbLIZ.append(", localCoverPath=");
        sbLIZ.append(this.localCoverPath);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setLocalCoverPath(String str) {
        this.localCoverPath = str;
    }

    public EditPostResponse(int i, String str, String str2, EditDiffMessage editDiffMessage, int i2, String str3) {
        this.statusCode = i;
        this.statusMsg = str;
        this.errorMsg = str2;
        this.editDiffMessage = editDiffMessage;
        this.bizErrorCode = i2;
        this.localCoverPath = str3;
    }
}
