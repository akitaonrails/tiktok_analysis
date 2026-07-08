package com.ss.android.ugc.aweme.ecommerce.arch;

import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.n;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public final class MixPageDataStringGsonAdapter implements j<String> {
    @Override // com.google.gson.j
    public final String deserialize(k kVar, Type type, i iVar) {
        if (kVar instanceof n) {
            return kVar.toString();
        }
        String strLJIL = kVar.LJIL();
        if (strLJIL != null) {
            return strLJIL;
        }
        return "";
    }
}
