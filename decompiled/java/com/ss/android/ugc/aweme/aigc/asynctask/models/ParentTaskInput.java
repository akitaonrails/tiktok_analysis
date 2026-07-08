package com.ss.android.ugc.aweme.aigc.asynctask.models;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;

/* JADX INFO: loaded from: classes9.dex */
public final class ParentTaskInput {

    @C09CT("CommonParentTaskInput")
    public final CommonParentTaskInput commonParentTaskInput;

    @C09CT("CreativeInfo")
    public final CreativeInfo creativeInfo;

    public ParentTaskInput() {
        this(null, null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ParentTaskInput(creativeInfo=");
        sbLIZ.append(this.creativeInfo);
        sbLIZ.append(", commonParentTaskInput=");
        sbLIZ.append(this.commonParentTaskInput);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ParentTaskInput(CreativeInfo creativeInfo, CommonParentTaskInput commonParentTaskInput) {
        this.creativeInfo = creativeInfo;
        this.commonParentTaskInput = commonParentTaskInput;
    }
}
