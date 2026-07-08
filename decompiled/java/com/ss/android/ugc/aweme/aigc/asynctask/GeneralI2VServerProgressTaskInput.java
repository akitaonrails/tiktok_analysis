package com.ss.android.ugc.aweme.aigc.asynctask;

import X.C09CT;
import X.C09JG;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.aigc.asynctask.models.CommonParentTaskInput;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class GeneralI2VServerProgressTaskInput extends C09JG {
    public final String LIZ;

    @C09CT("commonParentTaskInput")
    public final CommonParentTaskInput commonParentTaskInput;

    @C09CT("source")
    public final Source source;

    @C09CT("time_out_second")
    public Long timeOutSecond;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GeneralI2VServerProgressTaskInput)) {
            return false;
        }
        GeneralI2VServerProgressTaskInput generalI2VServerProgressTaskInput = (GeneralI2VServerProgressTaskInput) obj;
        return this.source == generalI2VServerProgressTaskInput.source && Intrinsics.LJFF(this.LIZ, generalI2VServerProgressTaskInput.LIZ) && Intrinsics.LJFF(this.timeOutSecond, generalI2VServerProgressTaskInput.timeOutSecond) && Intrinsics.LJFF(this.commonParentTaskInput, generalI2VServerProgressTaskInput.commonParentTaskInput);
    }

    public final int hashCode() {
        Source source = this.source;
        int iHashCode = (((source == null ? 0 : source.hashCode()) * 31) + this.LIZ.hashCode()) * 31;
        Long l = this.timeOutSecond;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        CommonParentTaskInput commonParentTaskInput = this.commonParentTaskInput;
        return iHashCode2 + (commonParentTaskInput != null ? commonParentTaskInput.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GeneralI2VServerProgressTaskInput(source=");
        sbLIZ.append(this.source);
        sbLIZ.append(", serverTaskId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", timeOutSecond=");
        sbLIZ.append(this.timeOutSecond);
        sbLIZ.append(", commonParentTaskInput=");
        sbLIZ.append(this.commonParentTaskInput);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public GeneralI2VServerProgressTaskInput(Source source, String str, Long l, CommonParentTaskInput commonParentTaskInput) {
        this.source = source;
        this.LIZ = str;
        this.timeOutSecond = l;
        this.commonParentTaskInput = commonParentTaskInput;
    }
}
