package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class DeliveryInstructionResult {

    @C09CT("instruction_info")
    public final DeliveryInstructionInfo instructionInfo;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeliveryInstructionResult) && Intrinsics.LJFF(this.instructionInfo, ((DeliveryInstructionResult) obj).instructionInfo);
    }

    public final int hashCode() {
        DeliveryInstructionInfo deliveryInstructionInfo = this.instructionInfo;
        if (deliveryInstructionInfo == null) {
            return 0;
        }
        return deliveryInstructionInfo.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DeliveryInstructionResult(instructionInfo=");
        sbLIZ.append(this.instructionInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DeliveryInstructionResult(DeliveryInstructionInfo deliveryInstructionInfo) {
        this.instructionInfo = deliveryInstructionInfo;
    }
}
