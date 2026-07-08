package com.google.gson;

import X.C09C7;
import X.C09CB;
import X.C09CQ;
import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C0VY2;
import X.C2096208Jc;
import X.C2188811AlT;
import X.C2277581ECu;
import X.C2329809Ay;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.SqlDateTypeAdapter;
import com.google.gson.internal.bind.TimeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.internal.w;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.experiment.GsonTypeAdapterOpt;
import com.ss.android.ugc.aweme.experiment.ReDexExperimentOpt;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes4.dex */
public final class Gson {
    public static final TypeToken<?> LJIL = TypeToken.get(Object.class);
    public final ThreadLocal<Map<TypeToken<?>, FutureTypeAdapter<?>>> LIZ;
    public final Map<TypeToken<?>, TypeAdapter<?>> LIZIZ;
    public final com.google.gson.internal.h LIZJ;
    public final JsonAdapterAnnotationTypeAdapterFactory LIZLLL;
    public final List<v> LJ;
    public final Excluder LJFF;
    public final d LJI;
    public final Map<Type, g<?>> LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final boolean LJIIJ;
    public final boolean LJIIJJI;
    public final boolean LJIIL;
    public final boolean LJIILIIL;
    public final boolean LJIILJJIL;
    public final String LJIILL;
    public final int LJIILLIIL;
    public final int LJIIZILJ;
    public final t LJIJ;
    public final List<v> LJIJI;
    public final List<v> LJIJJ;
    public Gson LJIJJLI;

    public Gson() {
        this(Excluder.LLIZ, c.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, t.DEFAULT, null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    public final String toString() {
        return "{serializeNulls:" + this.LJIIIIZZ + ",factories:" + this.LJ + ",instanceCreators:" + this.LIZJ + "}";
    }

    public static class FutureTypeAdapter<T> extends TypeAdapter<T> {
        public TypeAdapter<T> LIZ;

        @Override // com.google.gson.TypeAdapter
        public final T read(C09CU c09cu) {
            TypeAdapter<T> typeAdapter = this.LIZ;
            if (typeAdapter != null) {
                return typeAdapter.read(c09cu);
            }
            throw new IllegalStateException();
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(C09DL c09dl, T t) {
            TypeAdapter<T> typeAdapter = this.LIZ;
            if (typeAdapter != null) {
                typeAdapter.write(c09dl, t);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public static void LIZIZ(double d) {
        if (!Double.isNaN(d) && !Double.isInfinite(d)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(d);
        sbLIZ.append(" is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    private final TypeAdapter LJIIIZ$redex$base(TypeToken typeToken) {
        TypeToken typeToken2;
        boolean z;
        if (C09CQ.LIZLLL) {
            Gson gson = this.LJIJJLI;
            if (gson == null) {
                Excluder excluder = this.LJFF;
                d dVar = this.LJI;
                Map<Type, g<?>> map = this.LJII;
                boolean zBooleanValue = Boolean.valueOf(this.LJIIIIZZ).booleanValue();
                boolean zBooleanValue2 = Boolean.valueOf(this.LJIIIZ).booleanValue();
                boolean zBooleanValue3 = Boolean.valueOf(this.LJIIJ).booleanValue();
                boolean zBooleanValue4 = Boolean.valueOf(this.LJIIJJI).booleanValue();
                boolean zBooleanValue5 = Boolean.valueOf(this.LJIIL).booleanValue();
                boolean zBooleanValue6 = Boolean.valueOf(this.LJIILIIL).booleanValue();
                boolean zBooleanValue7 = Boolean.valueOf(this.LJIILJJIL).booleanValue();
                t tVar = this.LJIJ;
                String str = this.LJIILL;
                int iIntValue = Integer.valueOf(this.LJIILLIIL).intValue();
                int iIntValue2 = Integer.valueOf(this.LJIIZILJ).intValue();
                List<v> list = this.LJIJI;
                List<v> list2 = this.LJIJJ;
                if (excluder == Excluder.LLIZ && dVar == c.IDENTITY && map.isEmpty() && !zBooleanValue && !zBooleanValue2 && !zBooleanValue3 && zBooleanValue4 && !zBooleanValue5 && !zBooleanValue6 && !zBooleanValue7 && tVar == t.DEFAULT && str == null && iIntValue == 2 && iIntValue2 == 2 && list.isEmpty() && list2.isEmpty()) {
                    if (C09CQ.LIZ == null) {
                        C09CQ.LIZ = this;
                    }
                    gson = C09CQ.LIZ;
                } else {
                    gson = this;
                }
                this.LJIJJLI = gson;
            }
            if (gson != this) {
                return gson.LJIIIZ(typeToken);
            }
        }
        Map<TypeToken<?>, TypeAdapter<?>> map2 = this.LIZIZ;
        if (typeToken == null) {
            typeToken2 = LJIL;
        } else {
            typeToken2 = typeToken;
        }
        TypeAdapter typeAdapter = (TypeAdapter) ((ConcurrentHashMap) map2).get(typeToken2);
        if (typeAdapter != null) {
            return typeAdapter;
        }
        Map<TypeToken<?>, FutureTypeAdapter<?>> map3 = this.LIZ.get();
        if (map3 == null) {
            map3 = new HashMap<>();
            this.LIZ.set(map3);
            z = true;
        } else {
            z = false;
        }
        FutureTypeAdapter<?> futureTypeAdapter = map3.get(typeToken);
        if (futureTypeAdapter != null) {
            return futureTypeAdapter;
        }
        try {
            FutureTypeAdapter<?> futureTypeAdapter2 = new FutureTypeAdapter<>();
            map3.put(typeToken, futureTypeAdapter2);
            Iterator<v> it2 = this.LJ.iterator();
            while (it2.hasNext()) {
                TypeAdapter<T> typeAdapterCreate = it2.next().create(this, typeToken);
                if (typeAdapterCreate != 0) {
                    if (futureTypeAdapter2.LIZ == null) {
                        futureTypeAdapter2.LIZ = typeAdapterCreate;
                        ((ConcurrentHashMap) this.LIZIZ).put(typeToken, typeAdapterCreate);
                        map3.remove(typeToken);
                        if (!z) {
                            return typeAdapterCreate;
                        }
                        this.LIZ.remove();
                        return typeAdapterCreate;
                    }
                    throw new AssertionError();
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("GSON (2.8.5) cannot handle ");
            sbLIZ.append(typeToken);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            map3.remove(typeToken);
            if (z) {
                this.LIZ.remove();
            }
            throw th;
        }
    }

    private final TypeAdapter LJIIIZ$redex$opt(TypeToken typeToken) {
        TypeToken typeToken2;
        boolean z;
        if (C09CQ.LIZLLL) {
            Gson gson = this.LJIJJLI;
            if (gson == null) {
                Excluder excluder = this.LJFF;
                d dVar = this.LJI;
                Map<Type, g<?>> map = this.LJII;
                boolean zBooleanValue = Boolean.valueOf(this.LJIIIIZZ).booleanValue();
                boolean zBooleanValue2 = Boolean.valueOf(this.LJIIIZ).booleanValue();
                boolean zBooleanValue3 = Boolean.valueOf(this.LJIIJ).booleanValue();
                boolean zBooleanValue4 = Boolean.valueOf(this.LJIIJJI).booleanValue();
                boolean zBooleanValue5 = Boolean.valueOf(this.LJIIL).booleanValue();
                boolean zBooleanValue6 = Boolean.valueOf(this.LJIILIIL).booleanValue();
                boolean zBooleanValue7 = Boolean.valueOf(this.LJIILJJIL).booleanValue();
                t tVar = this.LJIJ;
                String str = this.LJIILL;
                int iIntValue = Integer.valueOf(this.LJIILLIIL).intValue();
                int iIntValue2 = Integer.valueOf(this.LJIIZILJ).intValue();
                List<v> list = this.LJIJI;
                List<v> list2 = this.LJIJJ;
                if (excluder == Excluder.LLIZ && dVar == c.IDENTITY && map.isEmpty() && !zBooleanValue && !zBooleanValue2 && !zBooleanValue3 && zBooleanValue4 && !zBooleanValue5 && !zBooleanValue6 && !zBooleanValue7 && tVar == t.DEFAULT && str == null && iIntValue == 2 && iIntValue2 == 2 && list.isEmpty() && list2.isEmpty()) {
                    if (C09CQ.LIZ == null) {
                        C09CQ.LIZ = this;
                    }
                    gson = C09CQ.LIZ;
                } else {
                    gson = this;
                }
                this.LJIJJLI = gson;
            }
            if (gson != this) {
                return gson.LJIIIZ(typeToken);
            }
        }
        Map<TypeToken<?>, TypeAdapter<?>> map2 = this.LIZIZ;
        if (typeToken == null) {
            typeToken2 = LJIL;
        } else {
            typeToken2 = typeToken;
        }
        TypeAdapter typeAdapter = (TypeAdapter) ((ConcurrentHashMap) map2).get(typeToken2);
        if (typeAdapter != null) {
            return typeAdapter;
        }
        Map<TypeToken<?>, FutureTypeAdapter<?>> map3 = this.LIZ.get();
        if (map3 == null) {
            map3 = new HashMap<>();
            this.LIZ.set(map3);
            z = true;
        } else {
            z = false;
        }
        FutureTypeAdapter<?> futureTypeAdapter = map3.get(typeToken);
        if (futureTypeAdapter != null) {
            return futureTypeAdapter;
        }
        try {
            FutureTypeAdapter<?> futureTypeAdapter2 = new FutureTypeAdapter<>();
            map3.put(typeToken, futureTypeAdapter2);
            List<v> list3 = this.LJ;
            int i = 0;
            int size = list3.size();
            while (i < size) {
                v vVar = list3.get(i);
                i++;
                TypeAdapter<T> typeAdapterCreate = vVar.create(this, typeToken);
                if (typeAdapterCreate != 0) {
                    if (futureTypeAdapter2.LIZ == null) {
                        futureTypeAdapter2.LIZ = typeAdapterCreate;
                        ((ConcurrentHashMap) this.LIZIZ).put(typeToken, typeAdapterCreate);
                        map3.remove(typeToken);
                        if (!z) {
                            return typeAdapterCreate;
                        }
                        this.LIZ.remove();
                        return typeAdapterCreate;
                    }
                    throw new AssertionError();
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("GSON (2.8.5) cannot handle ");
            sbLIZ.append(typeToken);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            map3.remove(typeToken);
            if (z) {
                this.LIZ.remove();
            }
            throw th;
        }
    }

    public final TypeAdapter LJIIIZ(TypeToken typeToken) {
        if (!ReDexExperimentOpt.getAbTest()) {
            return LJIIIZ$redex$base(typeToken);
        }
        return LJIIIZ$redex$opt(typeToken);
    }

    public final <T> TypeAdapter<T> LJIIJ(Class<T> cls) {
        return LJIIIZ(TypeToken.get((Class) cls));
    }

    public final C09CU LJIIL(Reader reader) {
        C09CU c09cu = new C09CU(reader);
        c09cu.LLILLJJLI = this.LJIILIIL;
        return c09cu;
    }

    public final C09DL LJIILIIL(Writer writer) throws IOException {
        if (this.LJIIJ) {
            writer.write(")]}'\n");
        }
        C09DL c09dl = new C09DL(writer);
        if (this.LJIIL) {
            c09dl.LLILZ = "  ";
            c09dl.LLILZIL = ": ";
        }
        c09dl.LLJ = this.LJIIIIZZ;
        return c09dl;
    }

    public final String LJIILJJIL(k kVar) {
        if (!((Boolean) C2277581ECu.LJII.getValue()).booleanValue()) {
            StringWriter stringWriter = new StringWriter();
            LJIJ(kVar, stringWriter);
            return stringWriter.toString();
        }
        StringBuilder sbLIZ = C09C7.LIZ();
        C2096208Jc c2096208Jc = new C2096208Jc(sbLIZ);
        LJIJ(kVar, c2096208Jc);
        String string = c2096208Jc.toString();
        if (sbLIZ.length() >= C09C7.LIZIZ) {
            return string;
        }
        sbLIZ.setLength(0);
        ((ArrayBlockingQueue) C09C7.LIZ).offer(sbLIZ);
        return string;
    }

    public final String LJIILL(Object obj) {
        if (obj == null) {
            return LJIILJJIL(m.LL);
        }
        return LJIILLIIL(obj, obj.getClass());
    }

    public final k LJIJJLI(Object obj) {
        if (obj == null) {
            return m.LL;
        }
        return LJIL(obj, obj.getClass());
    }

    public static void LIZ(C09CU c09cu, Object obj) {
        if (obj != null) {
            try {
                if (c09cu.LJJLIIIJ() != C09D6.END_DOCUMENT) {
                    throw new l("JSON document was not fully consumed.");
                }
            } catch (C2329809Ay e) {
                TryCatchGuardChecker.doCheck(e);
                throw new s(e);
            } catch (IOException e2) {
                TryCatchGuardChecker.doCheck(e2);
                throw new l(e2);
            }
        }
    }

    public final <T> T LIZJ(k kVar, Class<T> cls) {
        return (T) com.google.gson.internal.v.LIZ(cls).cast(LIZLLL(kVar, cls));
    }

    public final <T> T LIZLLL(k kVar, Type type) {
        if (kVar == null) {
            return null;
        }
        return (T) LJ(new com.google.gson.internal.bind.a(kVar), type);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:(5:7|(3:83|11|(6:81|18|19|(1:24)(2:23|25)|(4:89|27|28|(4:30|79|31|32))(1:56)|(1:58)(1:63))(0))(0)|59|(1:61)|62)(1:42)|84|44|86|45|53|59|(0)|62) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00aa, code lost:
    
        r2 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ac, code lost:
    
        r2 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ad, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ae, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b1, code lost:
    
        if (r8 == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x010a, code lost:
    
        throw new com.google.gson.s(r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.C09CU r10, java.lang.reflect.Type r11) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.Gson.LJ(X.09CU, java.lang.reflect.Type):java.lang.Object");
    }

    public final <T> T LJFF(Reader reader, Class<T> cls) {
        C09CU c09cuLJIIL = LJIIL(reader);
        Object objLJ = LJ(c09cuLJIIL, cls);
        LIZ(c09cuLJIIL, objLJ);
        return (T) com.google.gson.internal.v.LIZ(cls).cast(objLJ);
    }

    public final <T> T LJI(Reader reader, Type type) {
        C09CU c09cuLJIIL = LJIIL(reader);
        T t = (T) LJ(c09cuLJIIL, type);
        LIZ(c09cuLJIIL, t);
        return t;
    }

    public final Object LJII(String str, Class cls) {
        long jCurrentTimeMillis;
        boolean z = C09CB.LIZ;
        if (z) {
            jCurrentTimeMillis = System.currentTimeMillis();
        } else {
            jCurrentTimeMillis = 0;
        }
        Object objCast = com.google.gson.internal.v.LIZ(cls).cast(LJIIIIZZ(str, cls));
        if (z) {
            C0VY2.LIZ(jCurrentTimeMillis, cls, "main_gson_from_json");
        }
        return objCast;
    }

    public final <T> T LJIIIIZZ(String str, Type type) {
        if (str == null) {
            return null;
        }
        return (T) LJI(new StringReader(str), type);
    }

    public final <T> TypeAdapter<T> LJIIJJI(v vVar, TypeToken<T> typeToken) {
        if (!this.LJ.contains(vVar)) {
            vVar = this.LIZLLL;
        }
        boolean z = false;
        for (v vVar2 : this.LJ) {
            if (!z) {
                if (vVar2 == vVar) {
                    z = true;
                }
            } else {
                TypeAdapter<T> typeAdapterCreate = vVar2.create(this, typeToken);
                if (typeAdapterCreate != null) {
                    return typeAdapterCreate;
                }
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GSON cannot serialize ");
        sbLIZ.append(typeToken);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final String LJIILLIIL(Object obj, Type type) {
        if (!((Boolean) C2277581ECu.LJII.getValue()).booleanValue()) {
            StringWriter stringWriter = new StringWriter();
            LJIJJ(obj, type, stringWriter);
            return stringWriter.toString();
        }
        StringBuilder sbLIZ = C09C7.LIZ();
        C2096208Jc c2096208Jc = new C2096208Jc(sbLIZ);
        LJIJJ(obj, type, c2096208Jc);
        String string = c2096208Jc.toString();
        if (sbLIZ.length() >= C09C7.LIZIZ) {
            return string;
        }
        sbLIZ.setLength(0);
        ((ArrayBlockingQueue) C09C7.LIZ).offer(sbLIZ);
        return string;
    }

    public final void LJIIZILJ(k kVar, C09DL c09dl) {
        long jCurrentTimeMillis;
        boolean z = C09CB.LIZ;
        if (z) {
            jCurrentTimeMillis = System.currentTimeMillis();
        } else {
            jCurrentTimeMillis = 0;
        }
        Gson gsonLIZLLL = f.LIZLLL(this);
        if (gsonLIZLLL != null) {
            gsonLIZLLL.LJIIZILJ(kVar, c09dl);
        } else {
            boolean z2 = c09dl.LLILZLL;
            c09dl.LLILZLL = true;
            boolean z3 = c09dl.LLIZ;
            c09dl.LLIZ = this.LJIIJJI;
            boolean z4 = c09dl.LLJ;
            c09dl.LLJ = this.LJIIIIZZ;
            try {
                try {
                    w.LIZIZ(kVar, c09dl);
                    c09dl.LLILZLL = z2;
                    c09dl.LLIZ = z3;
                    c09dl.LLJ = z4;
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw new l(e);
                } catch (AssertionError e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("AssertionError (GSON 2.8.5): ");
                    sbLIZ.append(e2.getMessage());
                    throw new AssertionError(C2188811AlT.LIZIZ(sbLIZ), e2);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c09dl.LLILZLL = z2;
                c09dl.LLIZ = z3;
                c09dl.LLJ = z4;
                throw th;
            }
        }
        if (z) {
            C0VY2.LIZ(jCurrentTimeMillis, kVar, "main_gson_to_json");
        }
    }

    public final void LJIJ(k kVar, Appendable appendable) {
        try {
            LJIIZILJ(kVar, LJIILIIL(w.LIZJ(appendable)));
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new l(e);
        }
    }

    public final k LJIL(Object obj, Type type) {
        com.google.gson.internal.bind.b bVar = new com.google.gson.internal.bind.b();
        LJIJI(obj, type, bVar);
        return bVar.LJJJZ();
    }

    public final void LJIJI(Object obj, Type type, C09DL c09dl) {
        long jCurrentTimeMillis;
        Gson gsonLIZLLL;
        boolean z = C09CB.LIZ;
        if (z) {
            jCurrentTimeMillis = System.currentTimeMillis();
        } else {
            jCurrentTimeMillis = 0;
        }
        Gson gson = f.LIZ;
        if (obj != null && !(obj instanceof GsonTypeAdapterOpt) && (gsonLIZLLL = f.LIZLLL(this)) != null) {
            gsonLIZLLL.LJIJI(obj, type, c09dl);
        } else {
            TypeAdapter typeAdapterLJIIIZ = LJIIIZ(TypeToken.get(type));
            boolean z2 = c09dl.LLILZLL;
            c09dl.LLILZLL = true;
            boolean z3 = c09dl.LLIZ;
            c09dl.LLIZ = this.LJIIJJI;
            boolean z4 = c09dl.LLJ;
            c09dl.LLJ = this.LJIIIIZZ;
            try {
                try {
                    typeAdapterLJIIIZ.write(c09dl, obj);
                    c09dl.LLILZLL = z2;
                    c09dl.LLIZ = z3;
                    c09dl.LLJ = z4;
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw new l(e);
                } catch (AssertionError e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("AssertionError (GSON 2.8.5): ");
                    sbLIZ.append(e2.getMessage());
                    throw new AssertionError(C2188811AlT.LIZIZ(sbLIZ), e2);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c09dl.LLILZLL = z2;
                c09dl.LLIZ = z3;
                c09dl.LLJ = z4;
                throw th;
            }
        }
        if (z) {
            C0VY2.LIZ(jCurrentTimeMillis, obj, "main_gson_to_json");
        }
    }

    public final void LJIJJ(Object obj, Type type, Appendable appendable) {
        try {
            LJIJI(obj, type, LJIILIIL(w.LIZJ(appendable)));
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new l(e);
        }
    }

    public Gson(Excluder excluder, d dVar, Map<Type, g<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, t tVar, String str, int i, int i2, List<v> list, List<v> list2, List<v> list3) {
        final TypeAdapter<Number> typeAdapter;
        TypeAdapter<Number> typeAdapter2;
        TypeAdapter<Number> typeAdapter3;
        this.LIZ = new ThreadLocal<>();
        this.LIZIZ = new ConcurrentHashMap();
        this.LJFF = excluder;
        this.LJI = dVar;
        this.LJII = map;
        com.google.gson.internal.h hVar = new com.google.gson.internal.h(map);
        this.LIZJ = hVar;
        this.LJIIIIZZ = z;
        this.LJIIIZ = z2;
        this.LJIIJ = z3;
        this.LJIIJJI = z4;
        this.LJIIL = z5;
        this.LJIILIIL = z6;
        this.LJIILJJIL = z7;
        this.LJIJ = tVar;
        this.LJIILL = str;
        this.LJIILLIIL = i;
        this.LJIIZILJ = i2;
        this.LJIJI = list;
        this.LJIJJ = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.LJJIIJZLJL);
        arrayList.add(ObjectTypeAdapter.LIZIZ);
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.LJIIZILJ);
        arrayList.add(TypeAdapters.LJI);
        arrayList.add(TypeAdapters.LIZLLL);
        arrayList.add(TypeAdapters.LJ);
        arrayList.add(TypeAdapters.LJFF);
        if (tVar == t.DEFAULT) {
            typeAdapter = TypeAdapters.LJIIJ;
        } else {
            typeAdapter = new TypeAdapter<Number>() { // from class: com.google.gson.Gson.3
                @Override // com.google.gson.TypeAdapter
                public final Number read(C09CU c09cu) {
                    if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                        c09cu.LJJJJJL();
                        return null;
                    }
                    return Long.valueOf(c09cu.LJJJ());
                }

                @Override // com.google.gson.TypeAdapter
                public final void write(C09DL c09dl, Number number) {
                    if (number == null) {
                        c09dl.LJIJJ();
                    } else {
                        c09dl.LJJJJJ(number.toString());
                    }
                }
            };
        }
        arrayList.add(TypeAdapters.LIZJ(Long.TYPE, Long.class, typeAdapter));
        Class cls = Double.TYPE;
        if (z7) {
            typeAdapter2 = TypeAdapters.LJIIL;
        } else {
            typeAdapter2 = new TypeAdapter<Number>() { // from class: com.google.gson.Gson.1
                @Override // com.google.gson.TypeAdapter
                public final Number read(C09CU c09cu) {
                    if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                        c09cu.LJJJJJL();
                        return null;
                    }
                    return Double.valueOf(c09cu.LJJIL());
                }

                @Override // com.google.gson.TypeAdapter
                public final void write(C09DL c09dl, Number number) {
                    Number number2 = number;
                    if (number2 == null) {
                        c09dl.LJIJJ();
                    } else {
                        Gson.LIZIZ(number2.doubleValue());
                        c09dl.LJJJJ(number2);
                    }
                }
            };
        }
        arrayList.add(TypeAdapters.LIZJ(cls, Double.class, typeAdapter2));
        Class cls2 = Float.TYPE;
        if (z7) {
            typeAdapter3 = TypeAdapters.LJIIJJI;
        } else {
            typeAdapter3 = new TypeAdapter<Number>() { // from class: com.google.gson.Gson.2
                @Override // com.google.gson.TypeAdapter
                public final Number read(C09CU c09cu) {
                    if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                        c09cu.LJJJJJL();
                        return null;
                    }
                    return Float.valueOf((float) c09cu.LJJIL());
                }

                @Override // com.google.gson.TypeAdapter
                public final void write(C09DL c09dl, Number number) {
                    Number number2 = number;
                    if (number2 == null) {
                        c09dl.LJIJJ();
                    } else {
                        Gson.LIZIZ(number2.floatValue());
                        c09dl.LJJJJ(number2);
                    }
                }
            };
        }
        arrayList.add(TypeAdapters.LIZJ(cls2, Float.class, typeAdapter3));
        arrayList.add(TypeAdapters.LJIILIIL);
        arrayList.add(TypeAdapters.LJII);
        arrayList.add(TypeAdapters.LJIIIIZZ);
        arrayList.add(TypeAdapters.LIZIZ(AtomicLong.class, new TypeAdapter<AtomicLong>() { // from class: com.google.gson.Gson.4
            @Override // com.google.gson.TypeAdapter
            public final AtomicLong read(C09CU c09cu) {
                return new AtomicLong(((Number) typeAdapter.read(c09cu)).longValue());
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C09DL c09dl, AtomicLong atomicLong) {
                typeAdapter.write(c09dl, Long.valueOf(atomicLong.get()));
            }
        }.nullSafe()));
        arrayList.add(TypeAdapters.LIZIZ(AtomicLongArray.class, new TypeAdapter<AtomicLongArray>() { // from class: com.google.gson.Gson.5
            @Override // com.google.gson.TypeAdapter
            public final AtomicLongArray read(C09CU c09cu) {
                ArrayList arrayList2 = new ArrayList();
                c09cu.LIZ();
                while (c09cu.LJIIZILJ()) {
                    arrayList2.add(Long.valueOf(((Number) typeAdapter.read(c09cu)).longValue()));
                }
                c09cu.LJI();
                int size = arrayList2.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i3 = 0; i3 < size; i3++) {
                    atomicLongArray.set(i3, ((Long) arrayList2.get(i3)).longValue());
                }
                return atomicLongArray;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C09DL c09dl, AtomicLongArray atomicLongArray) {
                AtomicLongArray atomicLongArray2 = atomicLongArray;
                c09dl.LIZIZ();
                int length = atomicLongArray2.length();
                for (int i3 = 0; i3 < length; i3++) {
                    typeAdapter.write(c09dl, Long.valueOf(atomicLongArray2.get(i3)));
                }
                c09dl.LJI();
            }
        }.nullSafe()));
        arrayList.add(TypeAdapters.LJIIIZ);
        arrayList.add(TypeAdapters.LJIILJJIL);
        arrayList.add(TypeAdapters.LJIJ);
        arrayList.add(TypeAdapters.LJIJI);
        arrayList.add(TypeAdapters.LIZIZ(BigDecimal.class, TypeAdapters.LJIILL));
        arrayList.add(TypeAdapters.LIZIZ(BigInteger.class, TypeAdapters.LJIILLIIL));
        arrayList.add(TypeAdapters.LJIJJ);
        arrayList.add(TypeAdapters.LJIJJLI);
        arrayList.add(TypeAdapters.LJJ);
        arrayList.add(TypeAdapters.LJJI);
        arrayList.add(TypeAdapters.LJJIII);
        arrayList.add(TypeAdapters.LJIL);
        arrayList.add(TypeAdapters.LIZIZ);
        arrayList.add(DateTypeAdapter.LIZIZ);
        arrayList.add(TypeAdapters.LJJII);
        arrayList.add(TimeTypeAdapter.LIZIZ);
        arrayList.add(SqlDateTypeAdapter.LIZIZ);
        arrayList.add(TypeAdapters.LJJIFFI);
        arrayList.add(ArrayTypeAdapter.LIZJ);
        arrayList.add(TypeAdapters.LIZ);
        arrayList.add(new CollectionTypeAdapterFactory(hVar));
        arrayList.add(new MapTypeAdapterFactory(hVar, z2));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(hVar);
        this.LIZLLL = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.LJJIIZ);
        arrayList.add(new ReflectiveTypeAdapterFactory(hVar, dVar, excluder, jsonAdapterAnnotationTypeAdapterFactory));
        this.LJ = Collections.unmodifiableList(arrayList);
    }
}
