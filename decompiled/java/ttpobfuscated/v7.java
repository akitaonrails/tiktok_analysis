package ttpobfuscated;

import X.C09AY;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ttp.orbu.sdk.ITTPOrbuRequest;
import ttp.orbu.sdk.ITTPOrbuRequestPayload;
import ttpobfuscated.dg;
import ttpobfuscated.q3;

/* JADX INFO: loaded from: classes24.dex */
public final class v7 {

    public final class b extends C09AY implements Function0<cc> {
        public final /* synthetic */ ITTPOrbuRequest<T> a;
        public final /* synthetic */ long b;

        public final cc a() {
            return dc.a(this.a, this.b);
        }

        @Override // kotlin.jvm.functions.Function0
        public cc invoke() {
            return dc.a(this.a, this.b);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(ITTPOrbuRequest<? extends T> iTTPOrbuRequest, long j) {
            super(0);
            this.a = iTTPOrbuRequest;
            this.b = j;
        }
    }

    public final class d extends C09AY implements Function0<Unit> {
        public final /* synthetic */ fc a;

        public final void a() {
            this.a.a("Fail to Activate OrbuSdk");
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.LIZ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(fc fcVar) {
            super(0);
            this.a = fcVar;
        }
    }

    public final class e extends C09AY implements Function0<Unit> {
        public final /* synthetic */ fc a;

        public final void a() {
            this.a.a("Fail to Activate OrbuSdk on time");
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.LIZ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(fc fcVar) {
            super(0);
            this.a = fcVar;
        }
    }

    public final class k extends C09AY implements Function0<Unit> {
        public final /* synthetic */ dg a;
        public final /* synthetic */ long b;
        public final /* synthetic */ Function0<Unit> c;
        public final /* synthetic */ Function0<Unit> d;

        public final void a() {
            dg dgVar = this.a;
            long j = this.b;
            dgVar.getClass();
            if (dg.e.await(j, TimeUnit.MILLISECONDS)) {
                this.d.invoke();
            } else {
                this.c.invoke();
                this.a.b(dg.a.Broken);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.LIZ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(dg dgVar, long j, Function0<Unit> function0, Function0<Unit> function02) {
            super(0);
            this.a = dgVar;
            this.b = j;
            this.c = function0;
            this.d = function02;
        }
    }

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[dg.a.values().length];
            try {
                iArr[dg.a.Ready.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                iArr[dg.a.Broken.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                iArr[dg.a.NotReady.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            a = iArr;
        }
    }

    public static final sa b() {
        q3.a.getClass();
        if (q3.a.d) {
            return new sa();
        }
        return null;
    }

    public final class c extends C09AY implements Function0<Unit> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        public final void a() {
        }

        @Override // kotlin.jvm.functions.Function0
        public Unit invoke() {
            return Unit.LIZ;
        }
    }

    public final class f extends C09AY implements Function0<Unit> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        public final void a() {
        }

        @Override // kotlin.jvm.functions.Function0
        public Unit invoke() {
            return Unit.LIZ;
        }
    }

    public final class g extends C09AY implements Function0<Unit> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        public final void a() {
        }

        @Override // kotlin.jvm.functions.Function0
        public Unit invoke() {
            return Unit.LIZ;
        }
    }

    public final class h extends C09AY implements Function0<Unit> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        public final void a() {
        }

        @Override // kotlin.jvm.functions.Function0
        public Unit invoke() {
            return Unit.LIZ;
        }
    }

    public final class i extends C09AY implements Function0<Unit> {
        public static final i a = new i();

        public i() {
            super(0);
        }

        public final void a() {
        }

        @Override // kotlin.jvm.functions.Function0
        public Unit invoke() {
            return Unit.LIZ;
        }
    }

    public final class j extends C09AY implements Function0<Unit> {
        public static final j a = new j();

        public j() {
            super(0);
        }

        public final void a() {
        }

        @Override // kotlin.jvm.functions.Function0
        public Unit invoke() {
            return Unit.LIZ;
        }
    }

    public static final <T extends ITTPOrbuRequestPayload> String a(ITTPOrbuRequest<? extends T> iTTPOrbuRequest) {
        String strB;
        q3.a.getClass();
        if (q3.a.d) {
            StringBuilder sb = new StringBuilder();
            sb.append(UUID.randomUUID());
            sb.append("-dfid-");
            String str = iTTPOrbuRequest.metadata().get("x-tt-dataflow-id");
            if (str == null || (strB = ze.b(str)) == null) {
                strB = "unknown";
            }
            sb.append(strB);
            return sb.toString();
        }
        return null;
    }

    public static final void b(fc fcVar) {
        fcVar.a("Fail to Activate OrbuSdk");
    }

    public static final boolean a(Integer num) {
        if (num != null && num.intValue() >= 1024) {
            return true;
        }
        return false;
    }

    public static final void a(fc fcVar) {
        fcVar.a("Fail to Activate OrbuSdk on time");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T extends ttp.orbu.sdk.ITTPOrbuRequestPayload> ttp.orbu.sdk.TTPOrbuResponse a(ttpobfuscated.ra r24, ttp.orbu.sdk.ITTPOrbuRequest<? extends T> r25) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.v7.a(ttpobfuscated.ra, ttp.orbu.sdk.ITTPOrbuRequest):ttp.orbu.sdk.TTPOrbuResponse");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T extends ttp.orbu.sdk.ITTPOrbuRequestPayload> ttp.orbu.sdk.TTPOrbuResponse a(ttpobfuscated.ra r11, ttp.orbu.sdk.ITTPOrbuRequest<? extends T> r12, long r13, ttpobfuscated.fc r15) {
        /*
            ttpobfuscated.lb$a r0 = ttpobfuscated.lb.j
            java.lang.Long r5 = ttpobfuscated.nd.a(r0)
            java.util.Map r1 = r12.metadata()
            java.lang.String r0 = "x-tt-dataflow-id"
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r9 = 0
            if (r0 == 0) goto L4d
            java.lang.Integer r3 = X.C2095008Iq.LJIIJJI(r0)
        L19:
            boolean r0 = a(r3)
            if (r0 != 0) goto L4f
            ttp.orbu.sdk.requestvalidator.OrbuResult$c r2 = ttp.orbu.sdk.requestvalidator.OrbuResult.c.a
            ttp.orbu.sdk.TTPOrbuResponse$Builder r1 = new ttp.orbu.sdk.TTPOrbuResponse$Builder
            r1.<init>()
            int r0 = r2.getCode()
            r1.statusCode(r0)
            java.lang.String r0 = r2.getReason()
            r1.description(r0)
            r1.request(r12)
            ttp.orbu.sdk.TTPOrbuResponse r2 = r1.build()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Invalid request with dfid "
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            r15.a(r0)
            return r2
        L4d:
            r3 = r9
            goto L19
        L4f:
            r6 = r11
            if (r6 == 0) goto L7f
            ttpobfuscated.cc r7 = ttpobfuscated.dc.a(r12, r13)     // Catch: java.lang.Throwable -> L64
            ttpobfuscated.sa r8 = b()     // Catch: java.lang.Throwable -> L64
            r10 = 4
            r11 = r9
            ttp.orbu.sdk.requestvalidator.OrbuResult r2 = ttpobfuscated.ra.b.a(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L64
            X.C189200o6.m2constructorimpl(r2)     // Catch: java.lang.Throwable -> L64
            goto L70
        L64:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r2 = new X.00Yq
            r2.<init>(r0)
            X.C189200o6.m2constructorimpl(r2)
        L70:
            java.lang.Throwable r1 = X.C189200o6.m5exceptionOrNullimpl(r2)
            if (r1 == 0) goto L7b
            r0 = 2
            ttp.orbu.sdk.requestvalidator.OrbuResult r2 = ttpobfuscated.ra.b.a(r6, r1, r9, r0, r9)
        L7b:
            ttp.orbu.sdk.requestvalidator.OrbuResult r2 = (ttp.orbu.sdk.requestvalidator.OrbuResult) r2
            if (r2 != 0) goto L81
        L7f:
            ttp.orbu.sdk.requestvalidator.OrbuResult$a r2 = ttp.orbu.sdk.requestvalidator.OrbuResult.a.a
        L81:
            ttpobfuscated.lb$a r0 = ttpobfuscated.lb.j
            r0.getClass()
            ttpobfuscated.lb r3 = ttpobfuscated.lb.k
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            ttp.orbu.sdk.Channel r0 = r12.channel()
            java.lang.String r0 = r0.name()
            r1.append(r0)
            java.lang.String r0 = ".validate"
            r1.append(r0)
            java.lang.String r4 = r1.toString()
            r6 = 0
            r7 = 0
            r8 = 12
            r9 = r7
            ttpobfuscated.lb.a(r3, r4, r5, r6, r7, r8, r9)
            ttp.orbu.sdk.TTPOrbuResponse$Builder r1 = new ttp.orbu.sdk.TTPOrbuResponse$Builder
            r1.<init>()
            int r0 = r2.getCode()
            r1.statusCode(r0)
            java.lang.String r0 = r2.getReason()
            r1.description(r0)
            r1.request(r12)
            ttp.orbu.sdk.TTPOrbuResponse r0 = r1.build()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.v7.a(ttpobfuscated.ra, ttp.orbu.sdk.ITTPOrbuRequest, long, ttpobfuscated.fc):ttp.orbu.sdk.TTPOrbuResponse");
    }

    public static final void a(dg dgVar, long j2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04) {
        lb.j.getClass();
        Long lC = lb.k.c();
        dgVar.getClass();
        int i2 = a.a[dg.f.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    dgVar.a(new k(dgVar, j2, function03, function04));
                }
            } else {
                function02.invoke();
            }
        } else {
            function0.invoke();
        }
        lb.a(lb.k, "lock.waitingForPredefineDataFlowInit", lC, false, null, 12, null);
    }

    public static /* synthetic */ void a(dg dgVar, long j2, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            dgVar = dg.a;
        }
        if ((i2 & 2) != 0) {
            j2 = 1500;
        }
        if ((i2 & 4) != 0) {
            function0 = g.a;
        }
        if ((i2 & 8) != 0) {
            function02 = h.a;
        }
        if ((i2 & 16) != 0) {
            function03 = i.a;
        }
        if ((i2 & 32) != 0) {
            function04 = j.a;
        }
        a(dgVar, j2, function0, function02, function03, function04);
    }
}
