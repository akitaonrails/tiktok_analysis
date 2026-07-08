package com.ss.android.ugc.aweme.search.pages.result.core.uitils;

import X.C098200Yq;
import X.C0PNI;
import X.C1227904rF;
import X.C189200o6;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchDynamicPatchDeserializer implements j<DynamicPatch> {
    public static final C0PNI LIZIZ = new Object() { // from class: X.0PNI
    };
    public final Gson LIZ;

    public SearchDynamicPatchDeserializer() {
        C1227904rF.LIZ.getClass();
        this.LIZ = C1227904rF.LIZLLL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.gson.j
    public final DynamicPatch deserialize(k kVar, Type type, i iVar) {
        DynamicPatch dynamicPatch;
        DynamicPatch dynamicPatch2;
        k kVarLJJIIZ;
        h hVar;
        n nVar;
        try {
            DynamicPatch dynamicPatch3 = (DynamicPatch) this.LIZ.LIZJ(kVar, DynamicPatch.class);
            if (dynamicPatch3 != null) {
                if ((kVar instanceof n) && (nVar = (n) kVar) != null) {
                    kVarLJJIIZ = nVar.LJJIIZ("aweme_list");
                } else {
                    kVarLJJIIZ = null;
                }
                if (kVarLJJIIZ instanceof h) {
                    hVar = (h) kVarLJJIIZ;
                } else {
                    hVar = null;
                }
                dynamicPatch3.awemeListRawJsonArray = hVar;
                dynamicPatch2 = dynamicPatch3;
            } else {
                dynamicPatch2 = null;
            }
            C189200o6.m2constructorimpl(dynamicPatch2);
            dynamicPatch = dynamicPatch2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            dynamicPatch = c098200Yq;
        }
        if (C189200o6.m7isFailureimpl(dynamicPatch)) {
            return null;
        }
        return dynamicPatch;
    }
}
