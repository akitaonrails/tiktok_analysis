package ttpobfuscated;

import X.AbstractC23140094w;
import X.C09DV;
import X.C1C7U;
import X.InterfaceC1364105Vn;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;

/* JADX INFO: loaded from: classes24.dex */
public final class ie implements m<ve, te> {
    public final d1 a;
    public final d1 b;
    public final pb c;
    public final qb d;
    public final u1 e;
    public final t1 f;

    @C09DV(c = "ttp.orbu.sdk.app.domain.usecase.configuration.SetLocalOrbucodeConfigUseCase", f = "SetLocalOrbucodeConfigUseCase.kt", l = {LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT}, m = "invoke")
    public final class a extends AbstractC23140094w {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("ie@11dd.a$1");
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            Object objA = ie.this.a(this);
            C1C7U.LIZIZ("ie@11dd.a$1");
            return objA;
        }

        public a(InterfaceC1364105Vn<? super a> interfaceC1364105Vn) {
            super(interfaceC1364105Vn);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    @Override // ttpobfuscated.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(X.InterfaceC1364105Vn<? super ttp.orbu.sdk.app.domain.usecase.UseCaseResult<ttpobfuscated.ve, ttpobfuscated.te>> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof ttpobfuscated.ie.a
            if (r0 == 0) goto L24
            r9 = r11
            ttpobfuscated.ie$a r9 = (ttpobfuscated.ie.a) r9
            int r2 = r9.d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r9.d = r2
        L12:
            java.lang.Object r3 = r9.b
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r9.d
            r0 = 1
            if (r1 == 0) goto L32
            if (r1 != r0) goto L2a
            java.lang.Object r0 = r9.a
            ttpobfuscated.ie r0 = (ttpobfuscated.ie) r0
            goto L4e
        L24:
            ttpobfuscated.ie$a r9 = new ttpobfuscated.ie$a
            r9.<init>(r11)
            goto L12
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r3)
            ttp.orbu.sdk.configuration.model.ConfigType$OrbuCode r3 = ttp.orbu.sdk.configuration.model.ConfigType.OrbuCode.INSTANCE     // Catch: java.lang.Throwable -> L63
            ttpobfuscated.d1 r4 = r10.b     // Catch: java.lang.Throwable -> L63
            ttpobfuscated.d1 r5 = r10.a     // Catch: java.lang.Throwable -> L63
            ttpobfuscated.pb r6 = r10.c     // Catch: java.lang.Throwable -> L63
            ttpobfuscated.qb r7 = r10.d     // Catch: java.lang.Throwable -> L63
            ttpobfuscated.t1 r8 = r10.f     // Catch: java.lang.Throwable -> L63
            r9.a = r10     // Catch: java.lang.Throwable -> L63
            r9.d = r0     // Catch: java.lang.Throwable -> L63
            java.lang.Object r3 = ttpobfuscated.we.a(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L63
            if (r3 != r2) goto L4c
            return r2
        L4c:
            r0 = r10
            goto L51
        L4e:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Throwable -> L63
        L51:
            ttp.orbu.sdk.configuration.model.Config r3 = (ttp.orbu.sdk.configuration.model.Config) r3     // Catch: java.lang.Throwable -> L63
            ttpobfuscated.u1 r0 = r0.e     // Catch: java.lang.Throwable -> L63
            r0.a(r3)     // Catch: java.lang.Throwable -> L63
            ttp.orbu.sdk.app.domain.usecase.UseCaseResult$b r1 = new ttp.orbu.sdk.app.domain.usecase.UseCaseResult$b     // Catch: java.lang.Throwable -> L63
            ttpobfuscated.ve$a r0 = new ttpobfuscated.ve$a     // Catch: java.lang.Throwable -> L63
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L63
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L63
            return r1
        L63:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r2 = new X.00Yq
            r2.<init>(r0)
            X.C189200o6.m2constructorimpl(r2)
            java.lang.Throwable r1 = X.C189200o6.m5exceptionOrNullimpl(r2)
            if (r1 == 0) goto L8c
            boolean r0 = r1 instanceof ttpobfuscated.i1
            if (r0 != 0) goto Lb3
            boolean r0 = r1 instanceof ttpobfuscated.d1.a.c
            if (r0 != 0) goto Lb3
            boolean r0 = r1 instanceof ttpobfuscated.d1.a.b
            if (r0 != 0) goto Lb3
            boolean r0 = r1 instanceof ttpobfuscated.pb.a.C0066a
            if (r0 == 0) goto L8d
            ttpobfuscated.te$i r0 = ttpobfuscated.te.i.a
        L87:
            ttp.orbu.sdk.app.domain.usecase.UseCaseResult$a r2 = new ttp.orbu.sdk.app.domain.usecase.UseCaseResult$a
            r2.<init>(r0)
        L8c:
            return r2
        L8d:
            boolean r0 = r1 instanceof ttpobfuscated.qb.b.a
            if (r0 == 0) goto L94
            ttpobfuscated.te$k r0 = ttpobfuscated.te.k.a
            goto L87
        L94:
            boolean r0 = r1 instanceof ttpobfuscated.d1.a.C0050a
            if (r0 == 0) goto L9b
            ttpobfuscated.te$a r0 = ttpobfuscated.te.a.a
            goto L87
        L9b:
            boolean r0 = r1 instanceof ttpobfuscated.x7
            if (r0 == 0) goto La2
            ttpobfuscated.te$h r0 = ttpobfuscated.te.h.a
            goto L87
        La2:
            boolean r0 = r1 instanceof ttpobfuscated.t1.a.C0073a
            if (r0 == 0) goto La9
            ttpobfuscated.te$b r0 = ttpobfuscated.te.b.a
            goto L87
        La9:
            boolean r0 = r1 instanceof ttpobfuscated.u1.a.c
            if (r0 == 0) goto Lb0
            ttpobfuscated.te$g r0 = ttpobfuscated.te.g.a
            goto L87
        Lb0:
            ttpobfuscated.te$l r0 = ttpobfuscated.te.l.a
            goto L87
        Lb3:
            ttpobfuscated.te$j r0 = ttpobfuscated.te.j.a
            goto L87
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.ie.a(X.05Vn):java.lang.Object");
    }

    public ie(d1 d1Var, d1 d1Var2, pb pbVar, qb qbVar, u1 u1Var, t1 t1Var) {
        this.a = d1Var;
        this.b = d1Var2;
        this.c = pbVar;
        this.d = qbVar;
        this.e = u1Var;
        this.f = t1Var;
    }
}
