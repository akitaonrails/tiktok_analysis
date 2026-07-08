package ttpobfuscated;

import X.AbstractC23140094w;
import X.C09DV;
import X.C1C7U;
import X.InterfaceC1364105Vn;
import java.util.Map;
import kotlin.Unit;
import ttp.orbu.sdk.app.domain.usecase.UseCaseResult;

/* JADX INFO: loaded from: classes24.dex */
public final class od implements l<v0, Unit, w0> {
    public final i9 a;
    public final b6 b;
    public final j0 c;
    public final s4 d;
    public final u1 e;

    @C09DV(c = "ttp.orbu.sdk.app.domain.usecase.cleanup.SendCleanUpEventUseCase", f = "SendCleanUpEventUseCase.kt", l = {48, 64}, m = "invoke")
    public final class a extends AbstractC23140094w {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("od@1124.a$1");
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            Object objA = od.this.a((v0) null, (InterfaceC1364105Vn<? super UseCaseResult<Unit, w0>>) this);
            C1C7U.LIZIZ("od@1124.a$1");
            return objA;
        }

        public a(InterfaceC1364105Vn<? super a> interfaceC1364105Vn) {
            super(interfaceC1364105Vn);
        }
    }

    @C09DV(c = "ttp.orbu.sdk.app.domain.usecase.cleanup.SendCleanUpEventUseCase", f = "SendCleanUpEventUseCase.kt", l = {98, 116}, m = "resolveChallenge")
    public final class b extends AbstractC23140094w {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        @Override // njp.a
        public final Object invokeSuspend(Object obj) throws n7 {
            C1C7U.LIZ("od@1124.a$2");
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            Object objA = od.this.a((k0) null, (InterfaceC1364105Vn<? super Map<String, String>>) this);
            C1C7U.LIZIZ("od@1124.a$2");
            return objA;
        }

        public b(InterfaceC1364105Vn<? super b> interfaceC1364105Vn) {
            super(interfaceC1364105Vn);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    @Override // ttpobfuscated.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(ttpobfuscated.v0 r19, X.InterfaceC1364105Vn<? super ttp.orbu.sdk.app.domain.usecase.UseCaseResult<kotlin.Unit, ttpobfuscated.w0>> r20) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.od.a(ttpobfuscated.v0, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ttpobfuscated.k0 r9, X.InterfaceC1364105Vn<? super java.util.Map<java.lang.String, java.lang.String>> r10) throws ttpobfuscated.n7 {
        /*
            r8 = this;
            boolean r0 = r10 instanceof ttpobfuscated.od.b
            if (r0 == 0) goto L97
            r6 = r10
            ttpobfuscated.od$b r6 = (ttpobfuscated.od.b) r6
            int r2 = r6.d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L97
            int r2 = r2 - r1
            r6.d = r2
        L12:
            java.lang.Object r7 = r6.b
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.d
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L57
            if (r0 == r3) goto L6f
            if (r0 != r4) goto L9e
            java.lang.Object r2 = r6.a
            ttpobfuscated.h0 r2 = (ttpobfuscated.h0) r2
            X.C155000ia.LIZIZ(r7)
        L29:
            ttpobfuscated.k0 r0 = r2.a
            java.lang.String r1 = r0.b
            kotlin.Pair r6 = new kotlin.Pair
            java.lang.String r0 = "challenge_id"
            r6.<init>(r0, r1)
            kotlin.Pair r5 = new kotlin.Pair
            java.lang.String r0 = "challenge_result"
            r5.<init>(r0, r7)
            java.lang.Integer r0 = r2.b
            java.lang.String r1 = r0.toString()
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r0 = "challenge_seed_id"
            r2.<init>(r0, r1)
            r0 = 3
            kotlin.Pair[] r1 = new kotlin.Pair[r0]
            r0 = 0
            r1[r0] = r6
            r1[r3] = r5
            r1[r4] = r2
            java.util.Map r0 = X.C2097608Jq.LJIIIIZZ(r1)
            return r0
        L57:
            X.C155000ia.LIZIZ(r7)
            ttpobfuscated.k0 r0 = ttpobfuscated.k0.HashCash
            if (r9 != r0) goto Lb0
            ttpobfuscated.b6 r1 = r8.b
            ttpobfuscated.uf r0 = ttpobfuscated.uf.Logs
            r6.a = r8
            r6.d = r3
            java.lang.Object r7 = r1.a(r0, r6)
            if (r7 != r5) goto L6d
            return r5
        L6d:
            r2 = r8
            goto L76
        L6f:
            java.lang.Object r2 = r6.a
            ttpobfuscated.od r2 = (ttpobfuscated.od) r2
            X.C155000ia.LIZIZ(r7)
        L76:
            ttpobfuscated.h0 r7 = (ttpobfuscated.h0) r7
            ttpobfuscated.k0 r1 = r7.a
            ttpobfuscated.k0 r0 = ttpobfuscated.k0.None
            if (r1 != r0) goto L83
            java.util.Map r0 = X.C2097608Jq.LJ()
            return r0
        L83:
            java.lang.Integer r0 = r7.b
            if (r0 == 0) goto La6
            ttpobfuscated.j0 r0 = r2.c
            r6.a = r7
            r6.d = r4
            java.lang.Object r0 = r0.a(r7, r6)
            if (r0 != r5) goto L94
            return r5
        L94:
            r2 = r7
            r7 = r0
            goto L29
        L97:
            ttpobfuscated.od$b r6 = new ttpobfuscated.od$b
            r6.<init>(r10)
            goto L12
        L9e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        La6:
            ttpobfuscated.n7 r2 = new ttpobfuscated.n7
            java.lang.String r1 = "seedId"
            java.lang.String r0 = "Seed Id cannot be null"
            r2.<init>(r1, r0)
            throw r2
        Lb0:
            java.util.Map r0 = X.C2097608Jq.LJ()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.od.a(ttpobfuscated.k0, X.05Vn):java.lang.Object");
    }

    public od(i9 i9Var, b6 b6Var, j0 j0Var, s4 s4Var, u1 u1Var) {
        this.a = i9Var;
        this.b = b6Var;
        this.c = j0Var;
        this.d = s4Var;
        this.e = u1Var;
    }
}
