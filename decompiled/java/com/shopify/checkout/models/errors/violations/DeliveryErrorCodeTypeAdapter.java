package com.shopify.checkout.models.errors.violations;

import X.C09CU;
import X.C09DL;
import X.C2188811AlT;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class DeliveryErrorCodeTypeAdapter extends TypeAdapter<DeliveryErrorCode> {
    @Override // com.google.gson.TypeAdapter
    public final DeliveryErrorCode read(C09CU c09cu) {
        String strLJJJZ = null;
        if (c09cu != null) {
            strLJJJZ = c09cu.LJJJZ();
        }
        for (DeliveryErrorCode deliveryErrorCode : DeliveryErrorCode.values()) {
            if (Intrinsics.LJFF(deliveryErrorCode.getValue(), strLJJJZ)) {
                return deliveryErrorCode;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Unknown DeliveryErrorCode value: ");
        sbLIZ.append(strLJJJZ);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, DeliveryErrorCode deliveryErrorCode) {
        DeliveryErrorCode deliveryErrorCode2 = deliveryErrorCode;
        if (deliveryErrorCode2 == null) {
            c09dl.LJIJJ();
        } else {
            c09dl.LJJJJJ(deliveryErrorCode2.getValue());
        }
    }
}
