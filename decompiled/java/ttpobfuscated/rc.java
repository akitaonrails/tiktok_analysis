package ttpobfuscated;

import X.AbstractC23140094w;
import X.AbstractC842530X3j;
import X.C099R;
import X.C09AX;
import X.C09DV;
import X.C0X0P;
import X.C0X76;
import X.C1500770p9n;
import X.C155000ia;
import X.C1C7U;
import X.C842540X3k;
import X.InterfaceC1364105Vn;
import android.content.Context;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ttp.orbu.sdk.configuration.model.ServerAPIType;
import ttpobfuscated.jd;

/* JADX INFO: loaded from: classes24.dex */
public final class rc implements kd {
    public final w9 a;
    public final jd b;
    public final Context c;
    public final yd d;
    public final String e;

    @C09DV(c = "ttp.orbu.sdk.logging.RetrofitSamplingRepository", f = "RetrofitSamplingRepository.kt", l = {56}, m = "putSample")
    public final class a extends AbstractC23140094w {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("rc@10c8.a$1");
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            Object objA = rc.this.a(null, null, null, null, this);
            C1C7U.LIZIZ("rc@10c8.a$1");
            return objA;
        }

        public a(InterfaceC1364105Vn<? super a> interfaceC1364105Vn) {
            super(interfaceC1364105Vn);
        }
    }

    @C09DV(c = "ttp.orbu.sdk.logging.RetrofitSamplingRepository$putSample$result$1", f = "RetrofitSamplingRepository.kt", l = {57}, m = "invokeSuspend")
    public final class b extends C09AX implements Function1<InterfaceC1364105Vn<? super C1500770p9n<Unit>>, Object> {
        public int a;
        public final /* synthetic */ C0X76 c;
        public final /* synthetic */ String d;
        public final /* synthetic */ Map<String, String> e;
        public final /* synthetic */ String f;

        public final Object a(InterfaceC1364105Vn<? super C1500770p9n<Unit>> interfaceC1364105Vn) {
            return ((njp.a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return rc.this.new b(this.c, this.d, this.e, this.f, interfaceC1364105Vn);
        }

        @Override // kotlin.jvm.functions.Function1
        public Object invoke(InterfaceC1364105Vn<? super C1500770p9n<Unit>> interfaceC1364105Vn) {
            return ((njp.a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            Object objA = obj;
            C1C7U.LIZ("rc@10c8.a$2");
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
                rc rcVar = rc.this;
                jd jdVar = rcVar.b;
                String str = rcVar.d.a(ServerAPIType.SAMPLING).apiVersionPathParameter;
                if (str == null) {
                    str = "v1";
                }
                String str2 = rc.this.e;
                C0X76 c0x76 = this.c;
                String str3 = this.d;
                Map<String, String> map = this.e;
                v3.s.getClass();
                String strA = x3.a(v3.u.h());
                String str4 = this.f;
                this.a = 1;
                objA = jd.a.a(jdVar, str, str2, c0x76, str3, map, null, strA, null, str4, this, 160, null);
                if (objA == objLJFF) {
                    C1C7U.LIZIZ("rc@10c8.a$2");
                    return objLJFF;
                }
            }
            C1C7U.LIZIZ("rc@10c8.a$2");
            return objA;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C0X76 c0x76, String str, Map<String, String> map, String str2, InterfaceC1364105Vn<? super b> interfaceC1364105Vn) {
            super(1, interfaceC1364105Vn);
            this.c = c0x76;
            this.d = str;
            this.e = map;
            this.f = str2;
        }
    }

    public final AbstractC842530X3j a(byte[] bArr) {
        C842540X3k c842540X3kLIZJ = AbstractC842530X3j.LIZJ(C0X0P.LIZJ("text/plain"), ze.a(bArr));
        AbstractC842530X3j abstractC842530X3jA = y9.a(c842540X3kLIZJ, this.d.a(ServerAPIType.SAMPLING).maxPayloadSizeInBytes);
        if (abstractC842530X3jA != null) {
            return abstractC842530X3jA;
        }
        return c842540X3kLIZJ;
    }

    public rc(w9 w9Var, jd jdVar, Context context, yd ydVar, String str) {
        this.a = w9Var;
        this.b = jdVar;
        this.c = context;
        this.d = ydVar;
        this.e = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    @Override // ttpobfuscated.kd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(java.lang.String r15, byte[] r16, java.lang.String r17, java.util.Map<java.lang.String, java.lang.String> r18, X.InterfaceC1364105Vn<? super ttp.orbu.sdk.app.domain.usecase.TTPResult<kotlin.Unit>> r19) {
        /*
            r14 = this;
            r3 = r19
            boolean r0 = r3 instanceof ttpobfuscated.rc.a
            r8 = r14
            if (r0 == 0) goto L28
            r6 = r3
            ttpobfuscated.rc$a r6 = (ttpobfuscated.rc.a) r6
            int r2 = r6.d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r6.d = r2
        L15:
            java.lang.Object r1 = r6.b
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.d
            r4 = 1
            r13 = 0
            if (r0 == 0) goto L36
            if (r0 != r4) goto L2e
            java.lang.Object r3 = r6.a
            java.io.File r3 = (java.io.File) r3
            goto L80
        L28:
            ttpobfuscated.rc$a r6 = new ttpobfuscated.rc$a
            r6.<init>(r3)
            goto L15
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L36:
            X.C155000ia.LIZIZ(r1)
            X.0VSJ r3 = new X.0VSJ     // Catch: java.lang.Exception -> L94
            r10 = r15
            r3.<init>(r10)     // Catch: java.lang.Exception -> L94
            boolean r0 = r3.exists()     // Catch: java.lang.Exception -> L94
            r7 = r16
            if (r0 != 0) goto L62
            android.content.Context r1 = r8.c     // Catch: java.lang.Exception -> L94
            r0 = 0
            java.io.FileOutputStream r2 = r1.openFileOutput(r10, r0)     // Catch: java.lang.Exception -> L94
            r2.write(r7)     // Catch: java.lang.Throwable -> L52
            goto L5f
        L52:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            throw r1     // Catch: java.lang.Throwable -> L57
        L57:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Exception -> L94
            X.C2107108Nh.LIZ(r2, r1)     // Catch: java.lang.Exception -> L94
            throw r0     // Catch: java.lang.Exception -> L94
        L5f:
            X.C2107108Nh.LIZ(r2, r13)     // Catch: java.lang.Exception -> L94
        L62:
            X.0X3j r0 = r8.a(r7)     // Catch: java.lang.Exception -> L94
            X.0X76 r9 = X.C0X76.LIZIZ(r10, r13, r0)     // Catch: java.lang.Exception -> L94
            ttpobfuscated.w9 r0 = r8.a     // Catch: java.lang.Exception -> L94
            ttpobfuscated.rc$b r7 = new ttpobfuscated.rc$b     // Catch: java.lang.Exception -> L94
            r11 = r18
            r12 = r17
            r7.<init>(r9, r10, r11, r12, r13)     // Catch: java.lang.Exception -> L94
            r6.a = r3     // Catch: java.lang.Exception -> L94
            r6.d = r4     // Catch: java.lang.Exception -> L94
            java.lang.Object r1 = r0.a(r7, r6)     // Catch: java.lang.Exception -> L94
            if (r1 != r5) goto L83
            return r5
        L80:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L94
        L83:
            ttp.orbu.sdk.app.domain.usecase.TTPResult r1 = (ttp.orbu.sdk.app.domain.usecase.TTPResult) r1     // Catch: java.lang.Exception -> L94
            boolean r0 = r1 instanceof ttp.orbu.sdk.app.domain.usecase.TTPResult.a     // Catch: java.lang.Exception -> L94
            if (r0 == 0) goto L8a
            return r1
        L8a:
            boolean r0 = r3.exists()     // Catch: java.lang.Exception -> L94
            if (r0 == 0) goto L93
            r3.delete()     // Catch: java.lang.Exception -> L94
        L93:
            return r1
        L94:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            ttp.orbu.sdk.app.domain.usecase.TTPResult$a r3 = new ttp.orbu.sdk.app.domain.usecase.TTPResult$a
            ttp.orbu.sdk.app.domain.usecase.TTPError r2 = new ttp.orbu.sdk.app.domain.usecase.TTPError
            ttp.orbu.sdk.constants.TTPErrorCode r1 = ttp.orbu.sdk.constants.TTPErrorCode.Unknown
            java.lang.String r0 = X.C13SZ.LIZIZ(r0)
            r2.<init>(r1, r0)
            r3.<init>(r2, r13)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.rc.a(java.lang.String, byte[], java.lang.String, java.util.Map, X.05Vn):java.lang.Object");
    }
}
