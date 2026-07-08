package com.google.gson.internal.bind;

import X.AbstractC1971607nu;
import X.C09CT;
import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.TypeAdapter;
import com.google.gson.d;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.h;
import com.google.gson.internal.t;
import com.google.gson.s;
import com.google.gson.v;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class ReflectiveTypeAdapterFactory implements v {
    public final h LL;
    public final d LLILLJJLI;
    public final Excluder LLILLL;
    public final JsonAdapterAnnotationTypeAdapterFactory LLILZ;
    public final AbstractC1971607nu LLILZIL = AbstractC1971607nu.LIZ;
    public OptReflectiveTypeAdapterFactoryV2 LLILZLL;

    public static final class Adapter<T> extends TypeAdapter<T> {
        public final t<T> LIZ;
        public final Map<String, a> LIZIZ;

        @Override // com.google.gson.TypeAdapter
        public final T read(C09CU c09cu) {
            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                c09cu.LJJJJJL();
                return null;
            }
            T tLIZ = this.LIZ.LIZ();
            try {
                c09cu.LIZIZ();
                while (c09cu.LJIIZILJ()) {
                    a aVar = this.LIZIZ.get(c09cu.LJJJJ());
                    if (aVar != null && aVar.LIZJ) {
                        aVar.LIZ(c09cu, tLIZ);
                    } else {
                        c09cu.LJJZ();
                    }
                }
                c09cu.LJII();
                return tLIZ;
            } catch (IllegalAccessException e) {
                TryCatchGuardChecker.doCheck(e);
                throw new AssertionError(e);
            } catch (IllegalStateException e2) {
                TryCatchGuardChecker.doCheck(e2);
                throw new s(e2);
            }
        }

        public Adapter(t<T> tVar, Map<String, a> map) {
            this.LIZ = tVar;
            this.LIZIZ = map;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(C09DL c09dl, T t) {
            if (t == null) {
                c09dl.LJIJJ();
                return;
            }
            c09dl.LIZLLL();
            try {
                for (a aVar : this.LIZIZ.values()) {
                    if (aVar.LIZJ(t)) {
                        c09dl.LJIILLIIL(aVar.LIZ);
                        aVar.LIZIZ(c09dl, t);
                    }
                }
                c09dl.LJII();
            } catch (IllegalAccessException e) {
                TryCatchGuardChecker.doCheck(e);
                throw new AssertionError(e);
            }
        }
    }

    public final List<String> LIZ(Field field) {
        C09CT c09ct = (C09CT) field.getAnnotation(C09CT.class);
        if (c09ct == null) {
            return Collections.singletonList(this.LLILLJJLI.translateName(field));
        }
        String strValue = c09ct.value();
        String[] strArrAlternate = c09ct.alternate();
        if (strArrAlternate.length == 0) {
            return Collections.singletonList(strValue);
        }
        ArrayList arrayList = new ArrayList(strArrAlternate.length + 1);
        arrayList.add(strValue);
        for (String str : strArrAlternate) {
            arrayList.add(str);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00fe  */
    @Override // com.google.gson.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.gson.TypeAdapter create(com.google.gson.Gson r32, com.google.gson.reflect.TypeToken r33) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.create(com.google.gson.Gson, com.google.gson.reflect.TypeToken):com.google.gson.TypeAdapter");
    }

    public static abstract class a {
        public final String LIZ;
        public final boolean LIZIZ;
        public final boolean LIZJ;

        public abstract void LIZ(C09CU c09cu, Object obj);

        public abstract void LIZIZ(C09DL c09dl, Object obj);

        public abstract boolean LIZJ(Object obj);

        public a(String str, boolean z, boolean z2) {
            this.LIZ = str;
            this.LIZIZ = z;
            this.LIZJ = z2;
        }
    }

    public ReflectiveTypeAdapterFactory(h hVar, d dVar, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory) {
        this.LL = hVar;
        this.LLILLJJLI = dVar;
        this.LLILLL = excluder;
        this.LLILZ = jsonAdapterAnnotationTypeAdapterFactory;
    }
}
