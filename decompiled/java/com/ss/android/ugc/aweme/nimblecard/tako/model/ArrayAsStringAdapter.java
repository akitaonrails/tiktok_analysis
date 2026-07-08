package com.ss.android.ugc.aweme.nimblecard.tako.model;

import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.q;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public final class ArrayAsStringAdapter implements j<String> {
    @Override // com.google.gson.j
    public final String deserialize(k kVar, Type type, i iVar) {
        if (kVar instanceof m) {
            return null;
        }
        if (kVar instanceof q) {
            return kVar.LJIL();
        }
        if (kVar instanceof h) {
            return kVar.toString();
        }
        return kVar.toString();
    }
}
