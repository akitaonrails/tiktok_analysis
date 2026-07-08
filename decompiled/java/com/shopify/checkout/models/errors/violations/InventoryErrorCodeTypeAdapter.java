package com.shopify.checkout.models.errors.violations;

import X.C09CU;
import X.C09DL;
import X.C2188811AlT;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class InventoryErrorCodeTypeAdapter extends TypeAdapter<InventoryErrorCode> {
    @Override // com.google.gson.TypeAdapter
    public final InventoryErrorCode read(C09CU c09cu) {
        String strLJJJZ = c09cu.LJJJZ();
        for (InventoryErrorCode inventoryErrorCode : InventoryErrorCode.values()) {
            if (Intrinsics.LJFF(inventoryErrorCode.getValue(), strLJJJZ)) {
                return inventoryErrorCode;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Unknown InventoryErrorCode value: ");
        sbLIZ.append(strLJJJZ);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, InventoryErrorCode inventoryErrorCode) {
        InventoryErrorCode inventoryErrorCode2 = inventoryErrorCode;
        if (inventoryErrorCode2 == null) {
            c09dl.LJIJJ();
        } else {
            c09dl.LJJJJJ(inventoryErrorCode2.getValue());
        }
    }
}
