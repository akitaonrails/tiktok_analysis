package com.shopify.checkout.models.errors;

import X.C09AZ;
import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC1054410dXr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class DefaultsErrorPayload implements InterfaceC1054410dXr {

    @C09CT("code")
    public final DefaultsErrorCode code;

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
        sbLIZ.append("\n        ");
        return C09AZ.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DefaultsErrorPayload)) {
            return false;
        }
        DefaultsErrorPayload defaultsErrorPayload = (DefaultsErrorPayload) obj;
        if (Intrinsics.LJFF(this.flowType, defaultsErrorPayload.flowType) && this.code == defaultsErrorPayload.code && Intrinsics.LJFF(this.reason, defaultsErrorPayload.reason) && this.group == defaultsErrorPayload.group) {
            return true;
        }
        return false;
    }

    public DefaultsErrorPayload(String str, DefaultsErrorCode defaultsErrorCode, String str2, ErrorGroup errorGroup) {
        this.flowType = str;
        this.code = defaultsErrorCode;
        this.reason = str2;
        this.group = errorGroup;
    }
}
