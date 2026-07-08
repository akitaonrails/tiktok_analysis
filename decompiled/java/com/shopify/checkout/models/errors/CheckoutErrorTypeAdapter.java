package com.shopify.checkout.models.errors;

import X.C2188811AlT;
import com.google.gson.i;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.o;
import com.google.gson.q;
import com.google.gson.r;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public final class CheckoutErrorTypeAdapter implements j<CheckoutErrorType>, r<CheckoutErrorType> {
    @Override // com.google.gson.r
    public final k LIZ(Object obj, Type type, TreeTypeAdapter.a aVar) {
        return new q(((CheckoutErrorType) obj).getValue());
    }

    @Override // com.google.gson.j
    public final CheckoutErrorType deserialize(k kVar, Type type, i iVar) {
        String strLJIL = kVar.LJIL();
        CheckoutErrorType.Companion.getClass();
        CheckoutErrorType checkoutErrorType = CheckoutErrorType.map.get(strLJIL);
        if (checkoutErrorType != null) {
            return checkoutErrorType;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Unknown CheckoutErrorType value: ");
        sbLIZ.append(strLJIL);
        throw new o(C2188811AlT.LIZIZ(sbLIZ));
    }
}
