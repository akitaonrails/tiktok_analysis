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
import ttp.orbu.sdk.app.framework.network.request.challenge.ChallengeResponse;
import ttp.orbu.sdk.configuration.model.GeneralConfig;
import ttp.orbu.sdk.configuration.model.ServerAPIType;
import ttpobfuscated.b6;
import ttpobfuscated.f0;

/* JADX INFO: loaded from: classes24.dex */
public final class d6 implements b6 {
    public final n1 a;
    public final w9 b;
    public final f0 c;
    public final String d;
    public final String e;

    public final String a() {
        String str = new hg((GeneralConfig) this.a.get()).a(ServerAPIType.CHALLENGE).apiVersionPathParameter;
        return str == null ? "v1" : str;
    }

    @C09DV(c = "ttp.orbu.sdk.app.data.repository.challenge.GetExternalChallengeRepository", f = "GetExternalChallengeRepository.kt", l = {40}, m = "get")
    public final class a extends AbstractC23140094w {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        @Override // njp.a
        public final Object invokeSuspend(Object obj) throws b6.a {
            C1C7U.LIZ("d6@12a7.a$1");
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            Object objA = d6.this.a(null, this);
            C1C7U.LIZIZ("d6@12a7.a$1");
            return objA;
        }

        public a(InterfaceC1364105Vn<? super a> interfaceC1364105Vn) {
            super(interfaceC1364105Vn);
        }
    }

    @C09DV(c = "ttp.orbu.sdk.app.data.repository.challenge.GetExternalChallengeRepository$get$2$result$1", f = "GetExternalChallengeRepository.kt", l = {41}, m = "invokeSuspend")
    public final class b extends C09AX implements Function1<InterfaceC1364105Vn<? super C1500770p9n<ChallengeResponse>>, Object> {
        public int a;
        public final /* synthetic */ uf c;

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC1364105Vn<? super C1500770p9n<ChallengeResponse>> interfaceC1364105Vn) {
            return d6.this.new b(this.c, interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return d6.this.new b(this.c, interfaceC1364105Vn);
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            Object objA = obj;
            C1C7U.LIZ("d6@12a7.a$2");
            Object objLJFF = C099R.LJFF();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(objA);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(objA);
                d6 d6Var = d6.this;
                f0 f0Var = d6Var.c;
                String strA = d6Var.a();
                d6 d6Var2 = d6.this;
                String str = d6Var2.d;
                String str2 = this.c.a;
                String str3 = d6Var2.e;
                this.a = 1;
                objA = f0.a.a(f0Var, strA, str, str2, null, str3, null, this, 40, null);
                if (objA == objLJFF) {
                    C1C7U.LIZIZ("d6@12a7.a$2");
                    return objLJFF;
                }
            }
            C1C7U.LIZIZ("d6@12a7.a$2");
            return objA;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(uf ufVar, InterfaceC1364105Vn<? super b> interfaceC1364105Vn) {
            super(1, interfaceC1364105Vn);
            this.c = ufVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ttpobfuscated.h0 a(ttp.orbu.sdk.app.framework.network.request.challenge.ChallengeResponse r10) throws ttpobfuscated.b6.a.C0044a {
        /*
            r9 = this;
            ttpobfuscated.h0 r2 = new ttpobfuscated.h0
            ttpobfuscated.k0$a r1 = ttpobfuscated.k0.c
            java.lang.String r0 = r10.challengeId
            ttpobfuscated.k0 r3 = r1.a(r0)
            if (r3 == 0) goto L3d
            ttp.orbu.sdk.app.framework.network.request.challenge.ChallengeMetadata r0 = r10.challengeMetadata
            r7 = 0
            if (r0 == 0) goto L3b
            int r0 = r0.seedId
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L17:
            ttp.orbu.sdk.app.framework.network.request.challenge.ChallengeMetadata r0 = r10.challengeMetadata
            if (r0 == 0) goto L38
            java.lang.String r5 = r0.token
            java.lang.String r1 = r0.serverTimestamp
            if (r1 == 0) goto L39
            r0 = 1
            java.util.Date r6 = ttpobfuscated.o3.a(r1, r7, r0, r7)
        L26:
            ttp.orbu.sdk.app.framework.network.request.challenge.ChallengeMetadata r0 = r10.challengeMetadata
            if (r0 == 0) goto L30
            int r0 = r0.requestedLeadingZeros
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
        L30:
            java.util.Map r8 = X.C2097608Jq.LJ()
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r2
        L38:
            r5 = r7
        L39:
            r6 = r7
            goto L26
        L3b:
            r4 = r7
            goto L17
        L3d:
            ttpobfuscated.b6$a$a r1 = new ttpobfuscated.b6$a$a
            ttp.orbu.sdk.constants.TTPErrorCode r0 = ttp.orbu.sdk.constants.TTPErrorCode.Exception
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.d6.a(ttp.orbu.sdk.app.framework.network.request.challenge.ChallengeResponse):ttpobfuscated.h0");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    @Override // ttpobfuscated.b6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(ttpobfuscated.uf r11, X.InterfaceC1364105Vn<? super ttpobfuscated.h0> r12) throws ttpobfuscated.b6.a {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.d6.a(ttpobfuscated.uf, X.05Vn):java.lang.Object");
    }

    public d6(n1 n1Var, w9 w9Var, f0 f0Var, String str, String str2) {
        this.a = n1Var;
        this.b = w9Var;
        this.c = f0Var;
        this.d = str;
        this.e = str2;
    }
}
