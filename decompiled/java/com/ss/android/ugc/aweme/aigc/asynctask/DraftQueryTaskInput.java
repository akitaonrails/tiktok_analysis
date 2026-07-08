package com.ss.android.ugc.aweme.aigc.asynctask;

import X.C09CT;
import X.C09JG;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.aigc.asynctask.models.CommonParentTaskInput;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class DraftQueryTaskInput extends C09JG {

    @C09CT("commonParentTaskInput")
    public final CommonParentTaskInput commonParentTaskInput;

    @C09CT("creation_id")
    public final String creationId;

    @C09CT("source")
    public final Source source;

    public DraftQueryTaskInput() {
        this(null, "", null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraftQueryTaskInput)) {
            return false;
        }
        DraftQueryTaskInput draftQueryTaskInput = (DraftQueryTaskInput) obj;
        return this.source == draftQueryTaskInput.source && Intrinsics.LJFF(this.creationId, draftQueryTaskInput.creationId) && Intrinsics.LJFF(this.commonParentTaskInput, draftQueryTaskInput.commonParentTaskInput);
    }

    public final int hashCode() {
        Source source = this.source;
        int iHashCode = (((source == null ? 0 : source.hashCode()) * 31) + this.creationId.hashCode()) * 31;
        CommonParentTaskInput commonParentTaskInput = this.commonParentTaskInput;
        return iHashCode + (commonParentTaskInput != null ? commonParentTaskInput.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DraftQueryTaskInput(source=");
        sbLIZ.append(this.source);
        sbLIZ.append(", creationId=");
        sbLIZ.append(this.creationId);
        sbLIZ.append(", commonParentTaskInput=");
        sbLIZ.append(this.commonParentTaskInput);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DraftQueryTaskInput(Source source, String str, CommonParentTaskInput commonParentTaskInput) {
        this.source = source;
        this.creationId = str;
        this.commonParentTaskInput = commonParentTaskInput;
    }
}
