package com.shopify.checkout.models.errors;

import X.C09AZ;
import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC1054410dXr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class CheckoutErrorPayload implements InterfaceC1054410dXr {

    @C09CT("flowType")
    public final String flowType;

    @C09CT("group")
    public final ErrorGroup group;

    @C09CT("reason")
    public final String reason;

    @C09CT("type")
    public final CheckoutErrorType type;

    public final int hashCode() {
        int iHashCode = ((this.flowType.hashCode() * 31) + this.type.hashCode()) * 31;
        String str = this.reason;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.group.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("\n            Group: ");
        sbLIZ.append(this.group);
        sbLIZ.append("\n            Type: ");
        sbLIZ.append(this.type);
        sbLIZ.append("\n            Reason: ");
        sbLIZ.append(this.reason);
        sbLIZ.append("\n        ");
        return C09AZ.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutErrorPayload)) {
            return false;
        }
        CheckoutErrorPayload checkoutErrorPayload = (CheckoutErrorPayload) obj;
        if (Intrinsics.LJFF(this.flowType, checkoutErrorPayload.flowType) && this.type == checkoutErrorPayload.type && Intrinsics.LJFF(this.reason, checkoutErrorPayload.reason) && this.group == checkoutErrorPayload.group) {
            return true;
        }
        return false;
    }

    public CheckoutErrorPayload(String str, CheckoutErrorType checkoutErrorType, String str2, ErrorGroup errorGroup) {
        this.flowType = str;
        this.type = checkoutErrorType;
        this.reason = str2;
        this.group = errorGroup;
    }
}
