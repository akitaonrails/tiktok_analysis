package com.ss.android.ugc.aweme.utils;

import X.C09CU;
import X.C09DL;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.internal.w;
import com.google.gson.k;
import com.google.gson.p;

/* JADX INFO: loaded from: classes4.dex */
public class JsonToStringAdapter extends TypeAdapter<String> {
    @Override // com.google.gson.TypeAdapter
    public final String read(C09CU c09cu) {
        k kVarLIZ = w.LIZ(c09cu);
        if (kVarLIZ != null) {
            return kVarLIZ.toString();
        }
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, String str) {
        TypeAdapters.LJJIIJ.write(c09dl, GsonProtectorUtils.parse(new p(), str));
    }
}
