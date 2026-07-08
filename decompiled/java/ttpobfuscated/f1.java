package ttpobfuscated;

import X.AbstractC23140094w;
import X.C09DV;
import X.C1C7U;
import X.InterfaceC1364105Vn;
import java.util.Iterator;
import ttp.orbu.sdk.app.domain.usecase.UseCaseResult;
import ttp.orbu.sdk.configuration.model.GeneralConfig;
import ttp.orbu.sdk.configuration.model.ServerAPIType;
import ttp.orbu.sdk.configuration.model.ServerConfig;
import ttp.orbu.sdk.init.TTPOrbuContext;

/* JADX INFO: loaded from: classes24.dex */
public final class f1 implements l<e1, h1, g1> {
    public final u1 a;
    public final TTPOrbuContext b;
    public final s4 c;

    @C09DV(c = "ttp.orbu.sdk.app.domain.usecase.configuration.ConfigDelayRetrievalUseCase", f = "ConfigDelayRetrievalUseCase.kt", l = {43, 49}, m = "invoke")
    public final class a extends AbstractC23140094w {
        public long a;
        public /* synthetic */ Object b;
        public int d;

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("f1@126e.a$1");
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            Object objA = f1.this.a((e1) null, (InterfaceC1364105Vn<? super UseCaseResult<h1, g1>>) this);
            C1C7U.LIZIZ("f1@126e.a$1");
            return objA;
        }

        public a(InterfaceC1364105Vn<? super a> interfaceC1364105Vn) {
            super(interfaceC1364105Vn);
        }
    }

    public final int a(GeneralConfig generalConfig) {
        ServerConfig next;
        Integer num;
        Iterator<ServerConfig> it2 = generalConfig.getServerConfigs().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.name == ServerAPIType.CONFIGURATION) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        ServerConfig serverConfig = next;
        if (serverConfig != null && (num = serverConfig.serviceDeferIntervalInSeconds) != null) {
            return num.intValue();
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    @Override // ttpobfuscated.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(ttpobfuscated.e1 r9, X.InterfaceC1364105Vn<? super ttp.orbu.sdk.app.domain.usecase.UseCaseResult<ttpobfuscated.h1, ttpobfuscated.g1>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof ttpobfuscated.f1.a
            if (r0 == 0) goto L25
            r5 = r10
            ttpobfuscated.f1$a r5 = (ttpobfuscated.f1.a) r5
            int r2 = r5.d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r5.d = r2
        L12:
            java.lang.Object r7 = r5.b
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.d
            r1 = 2
            r6 = 1
            if (r0 == 0) goto L33
            if (r0 == r6) goto L6e
            if (r0 != r1) goto L2b
            long r2 = r5.a
            goto L88
        L25:
            ttpobfuscated.f1$a r5 = new ttpobfuscated.f1$a
            r5.<init>(r10)
            goto L12
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L33:
            X.C155000ia.LIZIZ(r7)
            ttpobfuscated.u1 r0 = r8.a     // Catch: java.lang.Throwable -> L96
            ttp.orbu.sdk.configuration.model.Config r7 = r0.get()     // Catch: java.lang.Throwable -> L96
            ttp.orbu.sdk.configuration.model.GeneralConfig r7 = (ttp.orbu.sdk.configuration.model.GeneralConfig) r7     // Catch: java.lang.Throwable -> L96
            boolean r0 = r9.a     // Catch: java.lang.Throwable -> L96
            if (r0 == 0) goto L79
            ttp.orbu.sdk.init.TTPOrbuContext r0 = r8.b     // Catch: java.lang.Throwable -> L96
            org.json.JSONObject r1 = r0.getExtraInfo()     // Catch: java.lang.Throwable -> L96
            if (r1 == 0) goto L6b
            java.lang.String r0 = "perfScore"
            java.lang.Object r3 = ttpobfuscated.q4.a(r1, r0)     // Catch: java.lang.Throwable -> L96
        L50:
            int r0 = r8.a(r7)     // Catch: java.lang.Throwable -> L96
            java.lang.Integer r2 = X.C2286608xc.LJ(r0)     // Catch: java.lang.Throwable -> L96
            ttpobfuscated.s4 r1 = r8.c     // Catch: java.lang.Throwable -> L96
            java.util.Map r0 = r7.getAdaptiveDelayConfig()     // Catch: java.lang.Throwable -> L96
            long r0 = ttpobfuscated.y9.a(r3, r2, r1, r0)     // Catch: java.lang.Throwable -> L96
            r5.d = r6     // Catch: java.lang.Throwable -> L96
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r5)     // Catch: java.lang.Throwable -> L96
            if (r0 != r4) goto L71
            goto L6d
        L6b:
            r3 = 0
            goto L50
        L6d:
            return r4
        L6e:
            X.C155000ia.LIZIZ(r7)     // Catch: java.lang.Throwable -> L96
        L71:
            ttp.orbu.sdk.app.domain.usecase.UseCaseResult$b r1 = new ttp.orbu.sdk.app.domain.usecase.UseCaseResult$b     // Catch: java.lang.Throwable -> L96
            ttpobfuscated.h1$a r0 = ttpobfuscated.h1.a.a     // Catch: java.lang.Throwable -> L96
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L96
            return r1
        L79:
            long r2 = r7.getConfigRefreshIntervalMillis()     // Catch: java.lang.Throwable -> L96
            r5.a = r2     // Catch: java.lang.Throwable -> L96
            r5.d = r1     // Catch: java.lang.Throwable -> L96
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r2, r5)     // Catch: java.lang.Throwable -> L96
            if (r0 != r4) goto L8b
            return r4
        L88:
            X.C155000ia.LIZIZ(r7)     // Catch: java.lang.Throwable -> L96
        L8b:
            ttp.orbu.sdk.app.domain.usecase.UseCaseResult$b r1 = new ttp.orbu.sdk.app.domain.usecase.UseCaseResult$b     // Catch: java.lang.Throwable -> L96
            ttpobfuscated.h1$b r0 = new ttpobfuscated.h1$b     // Catch: java.lang.Throwable -> L96
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L96
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L96
            return r1
        L96:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r0)
            if (r0 == 0) goto Lbc
            boolean r0 = r0 instanceof ttpobfuscated.u1.a.C0077a
            if (r0 == 0) goto Lb4
            ttp.orbu.sdk.app.domain.usecase.UseCaseResult$a r1 = new ttp.orbu.sdk.app.domain.usecase.UseCaseResult$a
            ttpobfuscated.g1$b r0 = ttpobfuscated.g1.b.a
            r1.<init>(r0)
            return r1
        Lb4:
            ttp.orbu.sdk.app.domain.usecase.UseCaseResult$a r1 = new ttp.orbu.sdk.app.domain.usecase.UseCaseResult$a
            ttpobfuscated.g1$c r0 = ttpobfuscated.g1.c.a
            r1.<init>(r0)
            return r1
        Lbc:
            X.08jB r0 = new X.08jB
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.f1.a(ttpobfuscated.e1, X.05Vn):java.lang.Object");
    }

    public f1(u1 u1Var, TTPOrbuContext tTPOrbuContext, s4 s4Var) {
        this.a = u1Var;
        this.b = tTPOrbuContext;
        this.c = s4Var;
    }
}
