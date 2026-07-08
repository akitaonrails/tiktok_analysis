package com.ss.android.ugc.aweme.tablet.impl.experiment;

import X.C2097608Jq;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.n;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class TabletsScanLoginModelDeserializer implements j<TabletsScanLoginModel> {
    @Override // com.google.gson.j
    public final TabletsScanLoginModel deserialize(k kVar, Type type, i iVar) {
        String strLJIL;
        try {
            n nVarLJIILIIL = kVar.LJIILIIL();
            k kVarLJJIIZ = nVarLJIILIIL.LJJIIZ("host");
            if (kVarLJJIIZ == null || (strLJIL = kVarLJJIIZ.LJIL()) == null) {
                strLJIL = "";
            }
            Set setSingleton = Collections.singleton("host");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, k> entry : nVarLJIILIIL.entrySet()) {
                String key = entry.getKey();
                k value = entry.getValue();
                if (!setSingleton.contains(key)) {
                    linkedHashMap.put(key, value.LJIL());
                }
            }
            return new TabletsScanLoginModel(strLJIL, linkedHashMap);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new TabletsScanLoginModel("", C2097608Jq.LJ());
        }
    }
}
