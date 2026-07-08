package com.ss.android.ugc.aweme.creative.model.json.adapter;

import X.C09E3;
import X.C09E5;
import X.C844470XAv;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.i;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.r;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ThirdPartyModelDefaultTypeAdapter<T> implements j<T>, r<T> {
    @Override // com.google.gson.r
    public final k LIZ(Object obj, Type type, TreeTypeAdapter.a aVar) throws Exception {
        try {
            return ((Gson) C09E3.LIZIZ.getValue()).LJIJJLI(obj);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C844470XAv.LIZ.getClass();
            if (!Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
                C09E5.LIZ.LIZ(e);
                return null;
            }
            throw e;
        }
    }

    @Override // com.google.gson.j
    public final T deserialize(k kVar, Type type, i iVar) throws Exception {
        try {
            return (T) ((Gson) C09E3.LIZIZ.getValue()).LIZLLL(kVar.LJIILIIL(), type);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C844470XAv.LIZ.getClass();
            if (!Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
                C09E5.LIZ.LIZ(e);
                return null;
            }
            throw e;
        }
    }
}
