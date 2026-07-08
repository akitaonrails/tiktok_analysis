package ttpobfuscated;

import X.AbstractC23140094w;
import X.C09DV;
import X.C1C7U;
import X.InterfaceC1364105Vn;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class f implements m<jg, e> {
    public final j4 a;
    public final tg b;
    public final sg c;
    public final ttpobfuscated.c d;
    public final u1 e;

    public final boolean a(String str) {
        return true;
    }

    public final boolean b(String str) {
        return true;
    }

    public final boolean c(String str) {
        return true;
    }

    @C09DV(c = "ttp.orbu.sdk.app.domain.usecase.activation.ActivationUseCase", f = "ActivationUseCase.kt", l = {45, 46, 48, 51, 55, 59, 63, 67}, m = "invoke")
    public final class a extends AbstractC23140094w {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public /* synthetic */ Object e;
        public int g;

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("f@df91.a$1");
            this.e = obj;
            this.g |= Integer.MIN_VALUE;
            Object objA = f.this.a(this);
            C1C7U.LIZIZ("f@df91.a$1");
            return objA;
        }

        public a(InterfaceC1364105Vn<? super a> interfaceC1364105Vn) {
            super(interfaceC1364105Vn);
        }
    }

    @C09DV(c = "ttp.orbu.sdk.app.domain.usecase.activation.ActivationUseCase", f = "ActivationUseCase.kt", l = {158, 159}, m = "sendEvent")
    public final class b extends AbstractC23140094w {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("f@df91.a$2");
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            Object objA = f.this.a((rg) null, (ttpobfuscated.b) null, this);
            C1C7U.LIZIZ("f@df91.a$2");
            return objA;
        }

        public b(InterfaceC1364105Vn<? super b> interfaceC1364105Vn) {
            super(interfaceC1364105Vn);
        }
    }

    @C09DV(c = "ttp.orbu.sdk.app.domain.usecase.activation.ActivationUseCase", f = "ActivationUseCase.kt", l = {102, 140, 143}, m = "setUser")
    public final class c extends AbstractC23140094w {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("f@df91.a$3");
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            Object objA = f.this.a((jg) null, (rg) null, this);
            C1C7U.LIZIZ("f@df91.a$3");
            return objA;
        }

        public c(InterfaceC1364105Vn<? super c> interfaceC1364105Vn) {
            super(interfaceC1364105Vn);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c8 A[Catch: all -> 0x0115, TryCatch #0 {all -> 0x0115, blocks: (B:13:0x002e, B:19:0x0045, B:25:0x0067, B:31:0x008b, B:33:0x008f, B:35:0x0099, B:41:0x00c2, B:43:0x00c8, B:48:0x00e8, B:51:0x00f7, B:54:0x0106, B:57:0x010f, B:18:0x0042, B:24:0x0064, B:30:0x0088, B:40:0x00bf, B:47:0x00e5, B:50:0x00f4, B:53:0x0103, B:56:0x010c), top: B:88:0x001a }] */
    @Override // ttpobfuscated.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(X.InterfaceC1364105Vn<? super ttp.orbu.sdk.app.domain.usecase.UseCaseResult<ttpobfuscated.jg, ttpobfuscated.e>> r10) {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.f.a(X.05Vn):java.lang.Object");
    }

    public final xb a(jg jgVar, List<String> list) {
        if (b(jgVar, list)) {
            if ((!jgVar.f.isEmpty()) && jgVar.g != xb.us) {
                return xb.migrated;
            }
            return xb.us;
        }
        return xb.nonUs;
    }

    public final boolean b(jg jgVar, List<String> list) {
        return ze.a(list, jgVar.c, true);
    }

    public final boolean a(jg jgVar, jg jgVar2) {
        if (jgVar != null && Intrinsics.LJFF(jgVar.a, jgVar2.a) && !Intrinsics.LJFF(jgVar.c, jgVar2.c)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ttpobfuscated.jg r31, ttpobfuscated.rg r32, X.InterfaceC1364105Vn<? super ttpobfuscated.jg> r33) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.f.a(ttpobfuscated.jg, ttpobfuscated.rg, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ttpobfuscated.rg r14, ttpobfuscated.b r15, X.InterfaceC1364105Vn<? super kotlin.Unit> r16) {
        /*
            r13 = this;
            r3 = r16
            boolean r0 = r3 instanceof ttpobfuscated.f.b
            if (r0 == 0) goto L7d
            r5 = r3
            ttpobfuscated.f$b r5 = (ttpobfuscated.f.b) r5
            int r2 = r5.e
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7d
            int r2 = r2 - r1
            r5.e = r2
        L14:
            java.lang.Object r0 = r5.c
            java.lang.Object r4 = X.C099R.LJFF()
            int r1 = r5.e
            r3 = 2
            r6 = 1
            if (r1 == 0) goto L36
            if (r1 == r6) goto L2a
            if (r1 != r3) goto L83
            X.C155000ia.LIZIZ(r0)
        L27:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2a:
            java.lang.Object r2 = r5.b
            ttpobfuscated.a r2 = (ttpobfuscated.a) r2
            java.lang.Object r1 = r5.a
            ttpobfuscated.f r1 = (ttpobfuscated.f) r1
            X.C155000ia.LIZIZ(r0)
            goto L65
        L36:
            X.C155000ia.LIZIZ(r0)
            ttpobfuscated.a r2 = new ttpobfuscated.a
            ttpobfuscated.a$b r7 = new ttpobfuscated.a$b
            java.lang.String r8 = r14.a
            java.lang.String r9 = r14.b
            java.lang.String r10 = r14.c
            java.lang.String r11 = r14.d
            r12 = r15
            r7.<init>(r8, r9, r10, r11, r12)
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            r2.<init>(r1, r0, r7)
            ttpobfuscated.j4 r0 = r13.a
            r5.a = r13
            r5.b = r2
            r5.e = r6
            java.lang.Object r0 = r0.a(r2, r5)
            if (r0 != r4) goto L64
            return r4
        L64:
            r1 = r13
        L65:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L8b
            ttpobfuscated.j4 r1 = r1.a
            r0 = 0
            r5.a = r0
            r5.b = r0
            r5.e = r3
            java.lang.Object r0 = r1.b(r2, r5)
            if (r0 != r4) goto L27
            return r4
        L7d:
            ttpobfuscated.f$b r5 = new ttpobfuscated.f$b
            r5.<init>(r3)
            goto L14
        L83:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L8b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.f.a(ttpobfuscated.rg, ttpobfuscated.b, X.05Vn):java.lang.Object");
    }

    public f(j4 j4Var, tg tgVar, sg sgVar, ttpobfuscated.c cVar, u1 u1Var) {
        this.a = j4Var;
        this.b = tgVar;
        this.c = sgVar;
        this.d = cVar;
        this.e = u1Var;
    }
}
