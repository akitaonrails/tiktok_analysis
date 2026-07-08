package com.ss.android.ugc.aweme.aigc.asynctask;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes.dex */
public final class InputContent {

    @C09CT("content_id")
    public final String contentId;

    @C09CT("extra")
    public final String extra;

    @C09CT("input_type")
    public final int inputType;

    public InputContent() {
        this(1, "", "");
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InputContent(inputType=");
        sbLIZ.append(this.inputType);
        sbLIZ.append(", contentId=");
        sbLIZ.append(this.contentId);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public InputContent(int i, String str, String str2) {
        this.inputType = i;
        this.contentId = str;
        this.extra = str2;
    }
}
