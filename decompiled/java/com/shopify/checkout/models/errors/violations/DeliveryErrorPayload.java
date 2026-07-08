package com.shopify.checkout.models.errors.violations;

import X.C09AZ;
import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC1054410dXr;
import com.shopify.checkout.models.errors.ErrorGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class DeliveryErrorPayload implements InterfaceC1054410dXr {

    @C09CT("code")
    public final DeliveryErrorCode code;

    @C09CT("flowType")
    public final String flowType;

    @C09CT("group")
    public final ErrorGroup group;

    @C09CT("reason")
    public final String reason;

    @C09CT("type")
    public final ViolationErrorType type;

    public final int hashCode() {
        int iHashCode = ((this.flowType.hashCode() * 31) + this.code.hashCode()) * 31;
        String str = this.reason;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.group.hashCode()) * 31) + this.type.hashCode();
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
        if (!(obj instanceof DeliveryErrorPayload)) {
            return false;
        }
        DeliveryErrorPayload deliveryErrorPayload = (DeliveryErrorPayload) obj;
        if (Intrinsics.LJFF(this.flowType, deliveryErrorPayload.flowType) && this.code == deliveryErrorPayload.code && Intrinsics.LJFF(this.reason, deliveryErrorPayload.reason) && this.group == deliveryErrorPayload.group && this.type == deliveryErrorPayload.type) {
            return true;
        }
        return false;
    }

    public DeliveryErrorPayload(String str, DeliveryErrorCode deliveryErrorCode, String str2, ErrorGroup errorGroup, ViolationErrorType violationErrorType) {
        this.flowType = str;
        this.code = deliveryErrorCode;
        this.reason = str2;
        this.group = errorGroup;
        this.type = violationErrorType;
    }
}
