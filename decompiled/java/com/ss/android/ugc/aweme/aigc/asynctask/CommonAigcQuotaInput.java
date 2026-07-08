package com.ss.android.ugc.aweme.aigc.asynctask;

import X.C09CT;
import X.C09JG;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.aigc.asynctask.models.CommonParentTaskInput;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class CommonAigcQuotaInput extends C09JG {
    public final List<Long> LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    @C09CT("commonParentTaskInput")
    public final CommonParentTaskInput commonParentTaskInput;

    @C09CT("creation_id")
    public final String creationId;

    @C09CT("source")
    public final Source source;

    public CommonAigcQuotaInput() {
        this(new ArrayList(), "", "", null, "", null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonAigcQuotaInput)) {
            return false;
        }
        CommonAigcQuotaInput commonAigcQuotaInput = (CommonAigcQuotaInput) obj;
        return Intrinsics.LJFF(this.LIZ, commonAigcQuotaInput.LIZ) && Intrinsics.LJFF(this.LIZIZ, commonAigcQuotaInput.LIZIZ) && Intrinsics.LJFF(this.LIZJ, commonAigcQuotaInput.LIZJ) && this.source == commonAigcQuotaInput.source && Intrinsics.LJFF(this.creationId, commonAigcQuotaInput.creationId) && Intrinsics.LJFF(this.commonParentTaskInput, commonAigcQuotaInput.commonParentTaskInput);
    }

    public final int hashCode() {
        List<Long> list = this.LIZ;
        int iHashCode = (((((list == null ? 0 : list.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        Source source = this.source;
        int iHashCode2 = (((iHashCode + (source == null ? 0 : source.hashCode())) * 31) + this.creationId.hashCode()) * 31;
        CommonParentTaskInput commonParentTaskInput = this.commonParentTaskInput;
        return iHashCode2 + (commonParentTaskInput != null ? commonParentTaskInput.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommonAigcQuotaInput(aigcIds=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", jobType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", businessScene=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", source=");
        sbLIZ.append(this.source);
        sbLIZ.append(", creationId=");
        sbLIZ.append(this.creationId);
        sbLIZ.append(", commonParentTaskInput=");
        sbLIZ.append(this.commonParentTaskInput);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CommonAigcQuotaInput(List<Long> list, String str, String str2, Source source, String str3, CommonParentTaskInput commonParentTaskInput) {
        this.LIZ = list;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.source = source;
        this.creationId = str3;
        this.commonParentTaskInput = commonParentTaskInput;
    }
}
