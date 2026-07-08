package com.ss.android.ugc.aweme.aigc.asynctask;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class SendDMMessageTaskOutput extends AbsTaskOutput {
    public final String LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    @C09CT("message_id")
    public final String messageId;

    public SendDMMessageTaskOutput() {
        this("", 0, "", null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendDMMessageTaskOutput)) {
            return false;
        }
        SendDMMessageTaskOutput sendDMMessageTaskOutput = (SendDMMessageTaskOutput) obj;
        return Intrinsics.LJFF(this.LIZ, sendDMMessageTaskOutput.LIZ) && this.LIZIZ == sendDMMessageTaskOutput.LIZIZ && Intrinsics.LJFF(this.LIZJ, sendDMMessageTaskOutput.LIZJ) && Intrinsics.LJFF(this.LIZLLL, sendDMMessageTaskOutput.LIZLLL) && Intrinsics.LJFF(this.messageId, sendDMMessageTaskOutput.messageId);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31;
        String str = this.LIZLLL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.messageId;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SendDMMessageTaskOutput(status=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", errorSource=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", messageId=");
        sbLIZ.append(this.messageId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput
    public final int LIZ() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput
    public final String LIZIZ() {
        return this.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput
    public final String LIZJ() {
        return this.LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput
    public final String LJ() {
        return this.LIZ;
    }

    public SendDMMessageTaskOutput(String str, int i, String str2, String str3, String str4) {
        super(str, i, str2, null, "");
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.messageId = str4;
    }
}
