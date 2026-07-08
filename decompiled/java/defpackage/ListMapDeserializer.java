package defpackage;

import X.C15438062q;
import X.C2095008Iq;
import X.C2097608Jq;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.q;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes3.dex */
public final class ListMapDeserializer implements j<List<? extends Map<String, ? extends Object>>> {
    public static final /* synthetic */ int LIZ = 0;

    public static final class a {
        public static Map LIZ(k kVar) {
            kVar.getClass();
            if (kVar instanceof n) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, k> entry : kVar.LJIILIIL().entrySet()) {
                    linkedHashMap.put(entry.getKey(), LIZIZ(entry.getValue()));
                }
                return linkedHashMap;
            }
            return C2097608Jq.LJ();
        }

        public static Object LIZIZ(k kVar) {
            if (kVar instanceof q) {
                q qVarLJIILJJIL = kVar.LJIILJJIL();
                Object obj = qVarLJIILJJIL.LL;
                if (obj instanceof Number) {
                    String string = qVarLJIILJJIL.toString();
                    if (a0.LJJIIZI(string, e3.d, false)) {
                        return Double.valueOf(qVarLJIILJJIL.LJIIIZ());
                    }
                    if (C2095008Iq.LJIIJJI(string) != null) {
                        return Integer.valueOf(qVarLJIILJJIL.LJIIJJI());
                    }
                    if (C2095008Iq.LJIILIIL(string) != null) {
                        return Long.valueOf(qVarLJIILJJIL.LJIIZILJ());
                    }
                    return Double.valueOf(qVarLJIILJJIL.LJIIIZ());
                }
                if (obj instanceof Boolean) {
                    return Boolean.valueOf(qVarLJIILJJIL.LJ());
                }
                if (obj instanceof String) {
                    return qVarLJIILJJIL.LJIL();
                }
                return qVarLJIILJJIL.toString();
            }
            if (kVar instanceof h) {
                h hVarLJIIL = kVar.LJIIL();
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(hVarLJIIL, 10));
                Iterator<k> it2 = hVarLJIIL.iterator();
                while (it2.hasNext()) {
                    arrayList.add(LIZIZ(it2.next()));
                }
                return arrayList;
            }
            if (kVar instanceof n) {
                return LIZ(kVar);
            }
            if (kVar instanceof m) {
                return null;
            }
            return kVar.toString();
        }
    }

    @Override // com.google.gson.j
    public final List<? extends Map<String, ? extends Object>> deserialize(k kVar, Type type, i iVar) {
        h hVarLJIIL = kVar.LJIIL();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(hVarLJIIL, 10));
        Iterator<k> it2 = hVarLJIIL.iterator();
        while (it2.hasNext()) {
            arrayList.add(a.LIZ(it2.next()));
        }
        return arrayList;
    }
}
