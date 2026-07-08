package com.ss.android.ugc.aweme.search.utils;

import com.google.gson.Gson;
import com.google.gson.e;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.q;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class MapDeserializerDoubleAsIntFix implements j<HashMap<String, Object>> {
    public static final Gson LIZ;
    public static final Type LIZIZ;

    static {
        e eVar = new e();
        Type type = new TypeToken<HashMap<String, Object>>() { // from class: X.051G
        }.getType();
        LIZIZ = type;
        eVar.LIZJ(new MapDeserializerDoubleAsIntFix(), type);
        LIZ = eVar.LIZ();
    }

    public static Object LIZ(k kVar) {
        kVar.getClass();
        if (kVar instanceof h) {
            ArrayList arrayList = new ArrayList();
            Iterator<k> it2 = kVar.LJIIL().iterator();
            while (it2.hasNext()) {
                arrayList.add(LIZ(it2.next()));
            }
            return arrayList;
        }
        if (kVar instanceof n) {
            HashMap map = new HashMap();
            for (Map.Entry<String, k> entry : kVar.LJIILIIL().entrySet()) {
                map.put(entry.getKey(), LIZ(entry.getValue()));
            }
            return map;
        }
        if (kVar instanceof q) {
            q qVarLJIILJJIL = kVar.LJIILJJIL();
            Object obj = qVarLJIILJJIL.LL;
            if (obj instanceof Boolean) {
                return Boolean.valueOf(qVarLJIILJJIL.LJ());
            }
            if (obj instanceof String) {
                return qVarLJIILJJIL.LJIL();
            }
            if (obj instanceof Number) {
                Number numberLJIJ = qVarLJIILJJIL.LJIJ();
                if (Math.ceil(numberLJIJ.doubleValue()) == numberLJIJ.longValue()) {
                    return Long.valueOf(numberLJIJ.longValue());
                }
                return Double.valueOf(numberLJIJ.doubleValue());
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.HashMap<java.lang.String, java.lang.Object>] */
    @Override // com.google.gson.j
    public final HashMap<String, Object> deserialize(k kVar, Type type, i iVar) {
        return LIZ(kVar);
    }
}
