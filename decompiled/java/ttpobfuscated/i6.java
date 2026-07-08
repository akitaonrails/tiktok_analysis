package ttpobfuscated;

import X.AbstractC23140094w;
import X.C099R;
import X.C09AX;
import X.C09DV;
import X.C1500770p9n;
import X.C155000ia;
import X.C1C7U;
import X.InterfaceC1364105Vn;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ttp.orbu.sdk.network.model.ConfigurationResponse;
import ttpobfuscated.c6;

/* JADX INFO: loaded from: classes24.dex */
public final class i6 implements c6 {
    public final j1 a;
    public final String b;
    public final w9 c;

    @C09DV(c = "ttp.orbu.sdk.app.data.repository.artefact.GetOrbucodeConfigArtefactRepository", f = "GetOrbucodeConfigArtefactRepository.kt", l = {27}, m = "get")
    public final class a extends AbstractC23140094w {
        public /* synthetic */ Object a;
        public int c;

        @Override // njp.a
        public final Object invokeSuspend(Object obj) throws c6.a {
            C1C7U.LIZ("i6@120c.a$1");
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            Object objA = i6.this.a(this);
            C1C7U.LIZIZ("i6@120c.a$1");
            return objA;
        }

        public a(InterfaceC1364105Vn<? super a> interfaceC1364105Vn) {
            super(interfaceC1364105Vn);
        }
    }

    @C09DV(c = "ttp.orbu.sdk.app.data.repository.artefact.GetOrbucodeConfigArtefactRepository$get$2$result$1", f = "GetOrbucodeConfigArtefactRepository.kt", l = {28}, m = "invokeSuspend")
    public final class b extends C09AX implements Function1<InterfaceC1364105Vn<? super C1500770p9n<ConfigurationResponse>>, Object> {
        public int a;

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC1364105Vn<? super C1500770p9n<ConfigurationResponse>> interfaceC1364105Vn) {
            return i6.this.new b(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return i6.this.new b(interfaceC1364105Vn);
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("i6@120c.a$2");
            Object objLJFF = C099R.LJFF();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                i6 i6Var = i6.this;
                j1 j1Var = i6Var.a;
                String str = i6Var.b;
                this.a = 1;
                obj = j1Var.b(str, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("i6@120c.a$2");
                    return objLJFF;
                }
            }
            C1C7U.LIZIZ("i6@120c.a$2");
            return obj;
        }

        public b(InterfaceC1364105Vn<? super b> interfaceC1364105Vn) {
            super(1, interfaceC1364105Vn);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // ttpobfuscated.c6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(X.InterfaceC1364105Vn<? super ttpobfuscated.se> r8) throws ttpobfuscated.c6.a {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ttpobfuscated.i6.a
            if (r0 == 0) goto L20
            r6 = r8
            ttpobfuscated.i6$a r6 = (ttpobfuscated.i6.a) r6
            int r2 = r6.c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r6.c = r2
        L12:
            java.lang.Object r5 = r6.a
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.c
            r3 = 1
            if (r0 == 0) goto L2e
            if (r0 != r3) goto L26
            goto L42
        L20:
            ttpobfuscated.i6$a r6 = new ttpobfuscated.i6$a
            r6.<init>(r8)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r5)
            ttpobfuscated.w9 r2 = r7.c     // Catch: java.lang.Throwable -> L6e
            ttpobfuscated.i6$b r1 = new ttpobfuscated.i6$b     // Catch: java.lang.Throwable -> L6e
            r0 = 0
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L6e
            r6.c = r3     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r5 = r2.a(r1, r6)     // Catch: java.lang.Throwable -> L6e
            if (r5 != r4) goto L45
            return r4
        L42:
            X.C155000ia.LIZIZ(r5)     // Catch: java.lang.Throwable -> L6e
        L45:
            ttp.orbu.sdk.app.domain.usecase.TTPResult r5 = (ttp.orbu.sdk.app.domain.usecase.TTPResult) r5     // Catch: java.lang.Throwable -> L6e
            boolean r0 = r5 instanceof ttp.orbu.sdk.app.domain.usecase.TTPResult.b     // Catch: java.lang.Throwable -> L6e
            if (r0 == 0) goto L56
            ttp.orbu.sdk.app.domain.usecase.TTPResult$b r5 = (ttp.orbu.sdk.app.domain.usecase.TTPResult.b) r5     // Catch: java.lang.Throwable -> L6e
            DATA r0 = r5.b     // Catch: java.lang.Throwable -> L6e
            ttp.orbu.sdk.network.model.ConfigurationResponse r0 = (ttp.orbu.sdk.network.model.ConfigurationResponse) r0     // Catch: java.lang.Throwable -> L6e
            ttpobfuscated.se r0 = ttpobfuscated.w1.a(r0)     // Catch: java.lang.Throwable -> L6e
            return r0
        L56:
            boolean r0 = r5 instanceof ttp.orbu.sdk.app.domain.usecase.TTPResult.a     // Catch: java.lang.Throwable -> L6e
            if (r0 == 0) goto L68
            ttpobfuscated.c6$a$a r2 = new ttpobfuscated.c6$a$a     // Catch: java.lang.Throwable -> L6e
            ttp.orbu.sdk.configuration.model.ConfigType$OrbuCode r1 = ttp.orbu.sdk.configuration.model.ConfigType.OrbuCode.INSTANCE     // Catch: java.lang.Throwable -> L6e
            ttp.orbu.sdk.app.domain.usecase.TTPResult$a r5 = (ttp.orbu.sdk.app.domain.usecase.TTPResult.a) r5     // Catch: java.lang.Throwable -> L6e
            ttp.orbu.sdk.app.domain.usecase.TTPError r0 = r5.b     // Catch: java.lang.Throwable -> L6e
            ttp.orbu.sdk.constants.TTPErrorCode r0 = r0.a     // Catch: java.lang.Throwable -> L6e
            r2.<init>(r1, r0)     // Catch: java.lang.Throwable -> L6e
            throw r2     // Catch: java.lang.Throwable -> L6e
        L68:
            X.07lC r0 = new X.07lC     // Catch: java.lang.Throwable -> L6e
            r0.<init>()     // Catch: java.lang.Throwable -> L6e
            throw r0     // Catch: java.lang.Throwable -> L6e
        L6e:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            java.lang.Throwable r5 = X.C189200o6.m5exceptionOrNullimpl(r0)
            if (r5 == 0) goto Lbf
            boolean r0 = r5 instanceof ttpobfuscated.c6.a.C0047a
            if (r0 == 0) goto Lb5
            r4 = r5
            ttpobfuscated.c6$a r4 = (ttpobfuscated.c6.a) r4
        L87:
            ttpobfuscated.q3$a r3 = ttpobfuscated.q3.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Error while retrieving cloud configuration. "
            r1.<init>(r0)
            ttp.orbu.sdk.constants.TTPErrorCode r0 = r4.b
            java.lang.String r0 = r0.name()
            r1.append(r0)
            java.lang.String r0 = ". "
            r1.append(r0)
            java.lang.String r0 = r5.getMessage()
            r1.append(r0)
            java.lang.String r2 = r1.toString()
            java.lang.String r1 = ttpobfuscated.j6.a
            r3.getClass()
            ttpobfuscated.q3 r0 = ttpobfuscated.q3.a.c
            r0.b(r2, r1, r5)
            throw r4
        Lb5:
            ttpobfuscated.c6$a$a r4 = new ttpobfuscated.c6$a$a
            ttp.orbu.sdk.configuration.model.ConfigType$OrbuCode r1 = ttp.orbu.sdk.configuration.model.ConfigType.OrbuCode.INSTANCE
            ttp.orbu.sdk.constants.TTPErrorCode r0 = ttp.orbu.sdk.constants.TTPErrorCode.Unknown
            r4.<init>(r1, r0)
            goto L87
        Lbf:
            X.08jB r0 = new X.08jB
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.i6.a(X.05Vn):java.lang.Object");
    }

    public i6(j1 j1Var, String str, w9 w9Var) {
        this.a = j1Var;
        this.b = str;
        this.c = w9Var;
    }
}
