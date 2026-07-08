package com.google.gson.internal.bind;

import X.AbstractC1971607nu;
import X.C09CT;
import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C2277531ECp;
import X.C2332909Cd;
import X.C2333109Cf;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.h;
import com.google.gson.internal.t;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.google.gson.v;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class OptReflectiveTypeAdapterFactoryV2 implements v {
    public static final boolean LLILZLL = ((Boolean) C2277531ECp.LJI.getValue()).booleanValue();
    public final h LL;
    public final com.google.gson.d LLILLJJLI;
    public final Excluder LLILLL;
    public final JsonAdapterAnnotationTypeAdapterFactory LLILZ;
    public final AbstractC1971607nu LLILZIL = AbstractC1971607nu.LIZ;

    public static final class Adapter<T> extends TypeAdapter<T> {
        public volatile t<T> LIZ;
        public final e<Map<String, ReflectiveTypeAdapterFactory.a>> LIZIZ;
        public final e<t<T>> LIZJ;
        public volatile Map<String, ReflectiveTypeAdapterFactory.a> LIZLLL;

        public final void LIZ() {
            if (this.LIZLLL == null) {
                this.LIZLLL = this.LIZIZ.call();
            }
            if (this.LIZ == null) {
                this.LIZ = this.LIZJ.call();
            }
        }

        @Override // com.google.gson.TypeAdapter
        public final T read(C09CU c09cu) {
            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                c09cu.LJJJJJL();
                return null;
            }
            LIZ();
            T tLIZ = this.LIZ.LIZ();
            try {
                c09cu.LIZIZ();
                while (c09cu.LJIIZILJ()) {
                    ReflectiveTypeAdapterFactory.a aVar = this.LIZLLL.get(c09cu.LJJJJ());
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

        public Adapter(a aVar, b bVar) {
            this.LIZJ = aVar;
            this.LIZIZ = bVar;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(C09DL c09dl, T t) {
            if (t == null) {
                c09dl.LJIJJ();
                return;
            }
            LIZ();
            c09dl.LIZLLL();
            try {
                for (ReflectiveTypeAdapterFactory.a aVar : this.LIZLLL.values()) {
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

        public Adapter(t tVar, c cVar) {
            this.LIZ = tVar;
            this.LIZIZ = cVar;
        }

        public Adapter(t tVar, Map map) {
            this.LIZ = tVar;
            this.LIZLLL = map;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public final class a<T> implements e<t<T>> {
        public final /* synthetic */ TypeToken LIZ;

        @Override // com.google.gson.internal.bind.OptReflectiveTypeAdapterFactoryV2.e
        public final Object call() {
            return OptReflectiveTypeAdapterFactoryV2.this.LL.LIZ(this.LIZ);
        }

        public a(TypeToken typeToken) {
            this.LIZ = typeToken;
        }
    }

    public final class b implements e<Map<String, ReflectiveTypeAdapterFactory.a>> {
        public final /* synthetic */ Gson LIZ;
        public final /* synthetic */ TypeToken LIZIZ;
        public final /* synthetic */ Class LIZJ;

        @Override // com.google.gson.internal.bind.OptReflectiveTypeAdapterFactoryV2.e
        public final Map<String, ReflectiveTypeAdapterFactory.a> call() {
            return OptReflectiveTypeAdapterFactoryV2.this.LIZIZ(this.LIZ, this.LIZIZ, this.LIZJ);
        }

        public b(Gson gson, TypeToken typeToken, Class cls) {
            this.LIZ = gson;
            this.LIZIZ = typeToken;
            this.LIZJ = cls;
        }
    }

    public final class c implements e<Map<String, ReflectiveTypeAdapterFactory.a>> {
        public final /* synthetic */ Gson LIZ;
        public final /* synthetic */ TypeToken LIZIZ;
        public final /* synthetic */ Class LIZJ;

        @Override // com.google.gson.internal.bind.OptReflectiveTypeAdapterFactoryV2.e
        public final Map<String, ReflectiveTypeAdapterFactory.a> call() {
            return OptReflectiveTypeAdapterFactoryV2.this.LIZIZ(this.LIZ, this.LIZIZ, this.LIZJ);
        }

        public c(Gson gson, TypeToken typeToken, Class cls) {
            this.LIZ = gson;
            this.LIZIZ = typeToken;
            this.LIZJ = cls;
        }
    }

    public interface e<T> {
        T call();
    }

    public final class d extends ReflectiveTypeAdapterFactory.a {
        public final /* synthetic */ Field LIZLLL;
        public final /* synthetic */ boolean LJ;
        public final /* synthetic */ TypeAdapter LJFF;
        public final /* synthetic */ Gson LJI;
        public final /* synthetic */ TypeToken LJII;
        public final /* synthetic */ boolean LJIIIIZZ;

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.a
        public final boolean LIZJ(Object obj) {
            if (!this.LIZIZ || this.LIZLLL.get(obj) == obj) {
                return false;
            }
            return true;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.a
        public final void LIZ(C09CU c09cu, Object obj) throws IllegalAccessException {
            Object obj2 = this.LJFF.read(c09cu);
            if (obj2 != null || !this.LJIIIIZZ) {
                this.LIZLLL.set(obj, obj2);
            }
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.a
        public final void LIZIZ(C09DL c09dl, Object obj) throws IllegalAccessException {
            Type type;
            TypeAdapter typeAdapterRuntimeTypeWrapper;
            Object obj2 = this.LIZLLL.get(obj);
            if (!OptReflectiveTypeAdapterFactoryV2.LLILZLL) {
                if (this.LJ) {
                    typeAdapterRuntimeTypeWrapper = this.LJFF;
                } else {
                    typeAdapterRuntimeTypeWrapper = new TypeAdapterRuntimeTypeWrapper(this.LJI, this.LJFF, this.LJII.getType());
                }
                typeAdapterRuntimeTypeWrapper.write(c09dl, obj2);
                return;
            }
            if (this.LJ) {
                this.LJFF.write(c09dl, obj2);
                return;
            }
            Gson gson = this.LJI;
            TypeAdapter typeAdapter = this.LJFF;
            Type type2 = this.LJII.getType();
            if (obj2 != null && (type2 == Object.class || (type2 instanceof TypeVariable) || (type2 instanceof Class))) {
                type = obj2.getClass();
            } else {
                type = type2;
            }
            if (type != type2) {
                TypeAdapter typeAdapterLJIIIZ = gson.LJIIIZ(TypeToken.get(type));
                if ((!(typeAdapterLJIIIZ instanceof ReflectiveTypeAdapterFactory.Adapter) && !(typeAdapterLJIIIZ instanceof Adapter)) || (typeAdapter instanceof ReflectiveTypeAdapterFactory.Adapter) || (typeAdapter instanceof Adapter)) {
                    typeAdapter = typeAdapterLJIIIZ;
                }
            }
            typeAdapter.write(c09dl, obj2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, boolean z, boolean z2, Field field, boolean z3, TypeAdapter typeAdapter, Gson gson, TypeToken typeToken, boolean z4) {
            super(str, z, z2);
            this.LIZLLL = field;
            this.LJ = z3;
            this.LJFF = typeAdapter;
            this.LJI = gson;
            this.LJII = typeToken;
            this.LJIIIIZZ = z4;
        }
    }

    public final List<String> LIZJ(Field field) {
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

    @Override // com.google.gson.v
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        C2333109Cf.LIZ.getClass();
        C2332909Cd c2332909Cd = C2333109Cf.LJIIIIZZ;
        Boolean bool = c2332909Cd.get();
        Boolean bool2 = Boolean.TRUE;
        if (!Intrinsics.LJFF(bool, bool2) && ((Boolean) C2333109Cf.LIZLLL.getValue()).booleanValue()) {
            return new Adapter(new a(typeToken), new b(gson, typeToken, rawType));
        }
        t<T> tVarLIZ = this.LL.LIZ(typeToken);
        if (!Intrinsics.LJFF(c2332909Cd.get(), bool2) && ((Boolean) C2333109Cf.LIZJ.getValue()).booleanValue()) {
            return new Adapter(tVarLIZ, new c(gson, typeToken, rawType));
        }
        return new Adapter(tVarLIZ, LIZIZ(gson, typeToken, rawType));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a2  */
    /* JADX WARN: Type inference failed for: r9v3, types: [int] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.a> LIZIZ(com.google.gson.Gson r27, com.google.gson.reflect.TypeToken<?> r28, java.lang.Class<?> r29) {
        /*
            Method dump skipped, instruction units count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.OptReflectiveTypeAdapterFactoryV2.LIZIZ(com.google.gson.Gson, com.google.gson.reflect.TypeToken, java.lang.Class):java.util.Map");
    }

    public OptReflectiveTypeAdapterFactoryV2(h hVar, com.google.gson.d dVar, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory) {
        this.LL = hVar;
        this.LLILLJJLI = dVar;
        this.LLILLL = excluder;
        this.LLILZ = jsonAdapterAnnotationTypeAdapterFactory;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.a LIZ(com.google.gson.Gson r11, java.lang.reflect.Field r12, java.lang.String r13, com.google.gson.reflect.TypeToken<?> r14, boolean r15, boolean r16) {
        /*
            r10 = this;
            r8 = r14
            java.lang.Class r1 = r8.getRawType()
            java.util.Map<java.lang.Class<?>, java.lang.Class<?>> r0 = com.google.gson.internal.v.LIZ
            boolean r9 = r0.containsKey(r1)
            java.lang.Class<X.09CS> r0 = X.C09CS.class
            r4 = r12
            java.lang.annotation.Annotation r2 = r4.getAnnotation(r0)
            X.09CS r2 = (X.C09CS) r2
            r7 = r11
            if (r2 == 0) goto L35
            com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory r1 = r10.LLILZ
            com.google.gson.internal.h r0 = r10.LL
            r1.getClass()
            com.google.gson.TypeAdapter r6 = com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory.LIZ(r0, r7, r8, r2)
            if (r6 == 0) goto L36
            r5 = 1
        L25:
            if (r6 != 0) goto L2b
            com.google.gson.TypeAdapter r6 = r7.LJIIIZ(r8)
        L2b:
            com.google.gson.internal.bind.OptReflectiveTypeAdapterFactoryV2$d r0 = new com.google.gson.internal.bind.OptReflectiveTypeAdapterFactoryV2$d
            r3 = r16
            r2 = r15
            r1 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
        L35:
            r6 = 0
        L36:
            r5 = 0
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.OptReflectiveTypeAdapterFactoryV2.LIZ(com.google.gson.Gson, java.lang.reflect.Field, java.lang.String, com.google.gson.reflect.TypeToken, boolean, boolean):com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$a");
    }
}
