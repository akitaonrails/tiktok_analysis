package com.shopify.checkout.models.errors;

import X.C09AZ;
import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC1054410dXr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class UnrecoverableErrorPayload implements InterfaceC1054410dXr {

    @C09CT("code")
    public final UnrecoverableErrorCode code;

    @C09CT("flowType")
    public final String flowType;

    @C09CT("group")
    public final ErrorGroup group;

    @C09CT("reason")
    public final String reason;

    public final int hashCode() {
        int iHashCode = ((this.flowType.hashCode() * 31) + this.code.hashCode()) * 31;
        String str = this.reason;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.group.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("\n            Group: ");
        sbLIZ.append(this.group);
        sbLIZ.append("\n            Reason: ");
        sbLIZ.append(this.reason);
        sbLIZ.append("\n            Code: ");
        sbLIZ.append(this.code);
        sbLIZ.append("\n            Flow Type: ");
        sbLIZ.append(this.flowType);
        sbLIZ.append("\n        ");
        return C09AZ.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnrecoverableErrorPayload)) {
            return false;
        }
        UnrecoverableErrorPayload unrecoverableErrorPayload = (UnrecoverableErrorPayload) obj;
        if (Intrinsics.LJFF(this.flowType, unrecoverableErrorPayload.flowType) && this.code == unrecoverableErrorPayload.code && Intrinsics.LJFF(this.reason, unrecoverableErrorPayload.reason) && this.group == unrecoverableErrorPayload.group) {
            return true;
        }
        return false;
    }

    public UnrecoverableErrorPayload(String str, UnrecoverableErrorCode unrecoverableErrorCode, String str2, ErrorGroup errorGroup) {
        this.flowType = str;
        this.code = unrecoverableErrorCode;
        this.reason = str2;
        this.group = errorGroup;
    }
}
