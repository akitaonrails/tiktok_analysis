package com.ss.android.ugc.tools.chat.data;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class MessageContext {

    @C09CT("prompt_info")
    public final MaterialStruct promptInfo;

    @C09CT("send_info")
    public final SendInfo sendInfo;

    public MessageContext() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageContext)) {
            return false;
        }
        MessageContext messageContext = (MessageContext) obj;
        return Intrinsics.LJFF(this.promptInfo, messageContext.promptInfo) && Intrinsics.LJFF(this.sendInfo, messageContext.sendInfo);
    }

    public final int hashCode() {
        MaterialStruct materialStruct = this.promptInfo;
        int iHashCode = (materialStruct == null ? 0 : materialStruct.hashCode()) * 31;
        SendInfo sendInfo = this.sendInfo;
        return iHashCode + (sendInfo != null ? sendInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageContext(promptInfo=");
        sbLIZ.append(this.promptInfo);
        sbLIZ.append(", sendInfo=");
        sbLIZ.append(this.sendInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MessageContext(MaterialStruct materialStruct, SendInfo sendInfo) {
        this.promptInfo = materialStruct;
        this.sendInfo = sendInfo;
    }
}
