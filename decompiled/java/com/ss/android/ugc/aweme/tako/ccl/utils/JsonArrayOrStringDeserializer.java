package com.ss.android.ugc.aweme.tako.ccl.utils;

import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.q;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public final class JsonArrayOrStringDeserializer implements j<String> {
    @Override // com.google.gson.j
    public final String deserialize(k kVar, Type type, i iVar) {
        if (!(kVar instanceof m)) {
            if (!(kVar instanceof h) && !(kVar instanceof n)) {
                if (kVar instanceof q) {
                    return kVar.LJIL();
                }
                return "";
            }
            return kVar.toString();
        }
        return "";
    }
}
