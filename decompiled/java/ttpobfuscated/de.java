package ttpobfuscated;

import X.C098200Yq;
import X.C13LE;
import X.C189200o6;
import X.C2097908Jt;
import X.InterfaceC1364105Vn;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Pair;
import kotlin.Unit;
import ttp.orbu.sdk.configuration.model.SessionIdHeaderFrequency;
import ttp.orbu.sdk.requestvalidator.Request;
import ttpobfuscated.ce;
import ttpobfuscated.q3;

/* JADX INFO: loaded from: classes24.dex */
public final class de implements ce {
    public final ae a;
    public final String b = C13LE.LIZ(de.class).LJI();

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[SessionIdHeaderFrequency.values().length];
            try {
                iArr[SessionIdHeaderFrequency.Never.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                iArr[SessionIdHeaderFrequency.HeartbeatOnly.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                iArr[SessionIdHeaderFrequency.Always.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            a = iArr;
        }
    }

    public de(ae aeVar) {
        this.a = aeVar;
    }

    @Override // ttpobfuscated.ce
    public Object a(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws ce.a.c {
        Object c098200Yq;
        try {
            this.a.clear();
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl == null) {
            return Unit.LIZ;
        }
        q3.a aVar = q3.a;
        String str = this.b;
        aVar.getClass();
        q3.a.c.b("Resetting the current header session id configuration failed", str, thM5exceptionOrNullimpl);
        throw new ce.a.c();
    }

    @Override // ttpobfuscated.ce
    public Object a(Request request, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws ce.a.C0049a {
        Object c098200Yq;
        Integer numC;
        String strB;
        try {
            d7 d7Var = this.a.get();
            if (d7Var.b == null && d7Var.a != SessionIdHeaderFrequency.Never && (request instanceof Request.Http) && (numC = request.c()) != null && numC.intValue() == 671088640 && (strB = ((ng) ((Request.Http) request).h.getValue()).b(fe.e)) != null) {
                if (ee.a().matches(strB)) {
                    q3.b.a(q3.a, "sessionId is extracted from request: " + request, this.b, (Throwable) null, 4, (Object) null);
                    this.a.a(C2097908Jt.LIZJ(new Pair(fe.e, strB)));
                }
                q3.b.a(q3.a, "sessionId is not extracted from request", this.b, (Throwable) null, 4, (Object) null);
            }
            q3.b.a(q3.a, "sessionId is null, hence not get extracted from request", this.b, (Throwable) null, 4, (Object) null);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl == null) {
            return Unit.LIZ;
        }
        q3.a aVar = q3.a;
        String str = this.b;
        aVar.getClass();
        q3.a.c.b("Extracting the session Id from the request failed", str, thM5exceptionOrNullimpl);
        throw new ce.a.C0049a();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
    @Override // ttpobfuscated.ce
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(java.lang.String r5, X.InterfaceC1364105Vn<? super java.util.Map<java.lang.String, java.lang.String>> r6) throws ttpobfuscated.ce.a.b {
        /*
            r4 = this;
            ttpobfuscated.ae r0 = r4.a     // Catch: java.lang.Throwable -> L31
            ttpobfuscated.d7 r0 = r0.get()     // Catch: java.lang.Throwable -> L31
            java.util.Map<java.lang.String, java.lang.String> r2 = r0.b     // Catch: java.lang.Throwable -> L31
            if (r2 == 0) goto L23
            ttp.orbu.sdk.configuration.model.SessionIdHeaderFrequency r0 = r0.a     // Catch: java.lang.Throwable -> L31
            int[] r1 = ttpobfuscated.de.a.a     // Catch: java.lang.Throwable -> L31
            int r0 = r0.ordinal()     // Catch: java.lang.Throwable -> L31
            r1 = r1[r0]     // Catch: java.lang.Throwable -> L31
            r0 = 1
            if (r1 == r0) goto L23
            r0 = 2
            if (r1 == r0) goto L25
            r0 = 3
            if (r1 == r0) goto L2d
            X.07lC r0 = new X.07lC     // Catch: java.lang.Throwable -> L31
            r0.<init>()     // Catch: java.lang.Throwable -> L31
            throw r0     // Catch: java.lang.Throwable -> L31
        L23:
            r2 = 0
            goto L2d
        L25:
            java.lang.String r0 = "heartbeat"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r0)     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L23
        L2d:
            X.C189200o6.m2constructorimpl(r2)     // Catch: java.lang.Throwable -> L31
            goto L3d
        L31:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r2 = new X.00Yq
            r2.<init>(r0)
            X.C189200o6.m2constructorimpl(r2)
        L3d:
            java.lang.Throwable r3 = X.C189200o6.m5exceptionOrNullimpl(r2)
            if (r3 != 0) goto L44
            return r2
        L44:
            ttpobfuscated.q3$a r0 = ttpobfuscated.q3.a
            java.lang.String r2 = r4.b
            r0.getClass()
            ttpobfuscated.q3 r1 = ttpobfuscated.q3.a.c
            java.lang.String r0 = "Obtaining the session id header map failed"
            r1.b(r0, r2, r3)
            ttpobfuscated.ce$a$b r0 = new ttpobfuscated.ce$a$b
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.de.a(java.lang.String, X.05Vn):java.lang.Object");
    }
}
