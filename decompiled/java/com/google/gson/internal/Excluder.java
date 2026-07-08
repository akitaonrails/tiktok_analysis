package com.google.gson.internal;

import X.C09DF;
import X.C09DG;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class Excluder implements com.google.gson.v, Cloneable {
    public static final Excluder LLIZ = new Excluder();
    public boolean LLILZ;
    public final double LL = -1.0d;
    public int LLILLJJLI = 136;
    public final boolean LLILLL = true;
    public List<com.google.gson.a> LLILZIL = Collections.emptyList();
    public List<com.google.gson.a> LLILZLL = Collections.emptyList();

    /* JADX INFO: renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final Excluder clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new AssertionError(e);
        }
    }

    public final boolean LIZIZ(Class<?> cls) {
        if (this.LL != -1.0d && !LJ((C09DF) cls.getAnnotation(C09DF.class), (C09DG) cls.getAnnotation(C09DG.class))) {
            return true;
        }
        if (!this.LLILLL && cls.isMemberClass() && (cls.getModifiers() & 8) == 0) {
            return true;
        }
        if (!Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return true;
        }
        return false;
    }

    public final boolean LIZJ(Class<?> cls, boolean z) {
        List<com.google.gson.a> list;
        if (z) {
            list = this.LLILZIL;
        } else {
            list = this.LLILZLL;
        }
        Iterator<com.google.gson.a> it2 = list.iterator();
        while (it2.hasNext()) {
            if (it2.next().shouldSkipClass(cls)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        if (r0.serialize() == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZLLL(java.lang.reflect.Field r7, boolean r8) {
        /*
            r6 = this;
            int r1 = r6.LLILLJJLI
            int r0 = r7.getModifiers()
            r1 = r1 & r0
            r5 = 1
            if (r1 == 0) goto Lb
            return r5
        Lb:
            double r3 = r6.LL
            r1 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L2a
            java.lang.Class<X.09DF> r0 = X.C09DF.class
            java.lang.annotation.Annotation r1 = r7.getAnnotation(r0)
            X.09DF r1 = (X.C09DF) r1
            java.lang.Class<X.09DG> r0 = X.C09DG.class
            java.lang.annotation.Annotation r0 = r7.getAnnotation(r0)
            X.09DG r0 = (X.C09DG) r0
            boolean r0 = r6.LJ(r1, r0)
            if (r0 != 0) goto L2a
            return r5
        L2a:
            boolean r0 = r7.isSynthetic()
            if (r0 == 0) goto L31
            return r5
        L31:
            boolean r0 = r6.LLILZ
            if (r0 == 0) goto L4f
            java.lang.Class<X.09DE> r0 = X.C09DE.class
            java.lang.annotation.Annotation r0 = r7.getAnnotation(r0)
            X.09DE r0 = (X.C09DE) r0
            if (r0 == 0) goto L47
            if (r8 == 0) goto L48
            boolean r0 = r0.serialize()
            if (r0 != 0) goto L4f
        L47:
            return r5
        L48:
            boolean r0 = r0.deserialize()
            if (r0 != 0) goto L4f
            return r5
        L4f:
            boolean r0 = r6.LLILLL
            r3 = 0
            if (r0 != 0) goto L67
            java.lang.Class r1 = r7.getType()
            boolean r0 = r1.isMemberClass()
            if (r0 == 0) goto L67
            int r0 = r1.getModifiers()
            r0 = r0 & 8
            if (r0 != 0) goto L67
            return r5
        L67:
            java.lang.Class r1 = r7.getType()
            java.lang.Class<java.lang.Enum> r0 = java.lang.Enum.class
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 != 0) goto L80
            boolean r0 = r1.isAnonymousClass()
            if (r0 != 0) goto L7f
            boolean r0 = r1.isLocalClass()
            if (r0 == 0) goto L80
        L7f:
            return r5
        L80:
            if (r8 == 0) goto La6
            java.util.List<com.google.gson.a> r1 = r6.LLILZIL
        L84:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto La9
            com.google.gson.b r2 = new com.google.gson.b
            r2.<init>(r7)
            java.util.Iterator r1 = r1.iterator()
        L93:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto La9
            java.lang.Object r0 = r1.next()
            com.google.gson.a r0 = (com.google.gson.a) r0
            boolean r0 = r0.shouldSkipField(r2)
            if (r0 == 0) goto L93
            return r5
        La6:
            java.util.List<com.google.gson.a> r1 = r6.LLILZLL
            goto L84
        La9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.Excluder.LIZLLL(java.lang.reflect.Field, boolean):boolean");
    }

    public final boolean LJ(C09DF c09df, C09DG c09dg) {
        if (c09df != null && c09df.value() > this.LL) {
            return false;
        }
        if (c09dg != null && c09dg.value() <= this.LL) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0026 A[PHI: r6
      0x0026: PHI (r6v1 boolean) = (r6v0 boolean), (r6v3 boolean) binds: [B:15:0x0023, B:8:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.gson.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> com.google.gson.TypeAdapter<T> create(final com.google.gson.Gson r10, final com.google.gson.reflect.TypeToken<T> r11) {
        /*
            r9 = this;
            r8 = r11
            java.lang.Class r3 = r8.getRawType()
            r4 = r9
            boolean r2 = r4.LIZIZ(r3)
            r1 = 0
            r0 = 1
            if (r2 != 0) goto L22
            boolean r0 = r4.LIZJ(r3, r0)
            if (r0 != 0) goto L22
            r6 = 0
        L15:
            boolean r0 = r4.LIZJ(r3, r1)
            if (r0 != 0) goto L26
            r5 = 0
        L1c:
            if (r6 != 0) goto L28
            if (r5 != 0) goto L28
            r0 = 0
            return r0
        L22:
            r6 = 1
            if (r2 != 0) goto L26
            goto L15
        L26:
            r5 = 1
            goto L1c
        L28:
            com.google.gson.internal.Excluder$1 r3 = new com.google.gson.internal.Excluder$1
            r7 = r10
            r3.<init>()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.Excluder.create(com.google.gson.Gson, com.google.gson.reflect.TypeToken):com.google.gson.TypeAdapter");
    }

    public final Excluder LJFF(com.google.gson.a aVar, boolean z, boolean z2) {
        Excluder excluderClone = clone();
        if (z) {
            ArrayList arrayList = new ArrayList(this.LLILZIL);
            excluderClone.LLILZIL = arrayList;
            arrayList.add(aVar);
        }
        if (z2) {
            ArrayList arrayList2 = new ArrayList(this.LLILZLL);
            excluderClone.LLILZLL = arrayList2;
            arrayList2.add(aVar);
        }
        return excluderClone;
    }
}
