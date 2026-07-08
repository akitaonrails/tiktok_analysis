package com.shopify.checkout.models.errors;

import X.C09CU;
import X.C09DL;
import X.C2188811AlT;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class ErrorGroupAdapter extends TypeAdapter<ErrorGroup> {
    @Override // com.google.gson.TypeAdapter
    public final ErrorGroup read(C09CU c09cu) {
        String strLJJJZ = c09cu.LJJJZ();
        for (ErrorGroup errorGroup : ErrorGroup.values()) {
            if (Intrinsics.LJFF(errorGroup.getValue(), strLJJJZ)) {
                return errorGroup;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Unknown ErrorGroup value: ");
        sbLIZ.append(strLJJJZ);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, ErrorGroup errorGroup) {
        c09dl.LJJJJJ(errorGroup.getValue());
    }
}
