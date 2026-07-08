package com.ss.android.ugc.aweme.aigc.asynctask;

import X.C09CT;
import X.C09JG;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.aigc.asynctask.models.CommonParentTaskInput;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class SendDMMessageTaskInput extends C09JG {

    @C09CT("commonParentTaskInput")
    public final CommonParentTaskInput commonParentTaskInput;

    @C09CT("dm_message_params")
    public final String dmMessageParams;

    @C09CT("source")
    public final Source source;

    public SendDMMessageTaskInput() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendDMMessageTaskInput)) {
            return false;
        }
        SendDMMessageTaskInput sendDMMessageTaskInput = (SendDMMessageTaskInput) obj;
        return this.source == sendDMMessageTaskInput.source && Intrinsics.LJFF(this.commonParentTaskInput, sendDMMessageTaskInput.commonParentTaskInput) && Intrinsics.LJFF(this.dmMessageParams, sendDMMessageTaskInput.dmMessageParams);
    }

    public final int hashCode() {
        Source source = this.source;
        int iHashCode = (source == null ? 0 : source.hashCode()) * 31;
        CommonParentTaskInput commonParentTaskInput = this.commonParentTaskInput;
        int iHashCode2 = (iHashCode + (commonParentTaskInput == null ? 0 : commonParentTaskInput.hashCode())) * 31;
        String str = this.dmMessageParams;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SendDMMessageTaskInput(source=");
        sbLIZ.append(this.source);
        sbLIZ.append(", commonParentTaskInput=");
        sbLIZ.append(this.commonParentTaskInput);
        sbLIZ.append(", dmMessageParams=");
        sbLIZ.append(this.dmMessageParams);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SendDMMessageTaskInput(Source source, CommonParentTaskInput commonParentTaskInput, String str) {
        this.source = source;
        this.commonParentTaskInput = commonParentTaskInput;
        this.dmMessageParams = str;
    }
}
