package ttpobfuscated;

import X.C1507240pKE;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class k9 extends o7 {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[t4.values().length];
            try {
                iArr[t4.URL_QUERY.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                iArr[t4.HEADER_COOKIE.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            a = iArr;
        }
    }

    public k9(List<C1507240pKE> list) {
        super(ha.MatchFieldKeySubset, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0077 A[Catch: all -> 0x0096, PHI: r1
      0x0077: PHI (r1v13 java.util.Set<java.lang.String>) = (r1v12 java.util.Set<java.lang.String>), (r1v17 java.util.Set<java.lang.String>) binds: [B:21:0x0075, B:19:0x0071] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0096, blocks: (B:2:0x0000, B:4:0x0011, B:6:0x002c, B:8:0x0032, B:11:0x003e, B:13:0x0052, B:22:0x0077, B:24:0x0081, B:32:0x0092, B:25:0x0084, B:20:0x0073, B:14:0x0057, B:15:0x005c, B:16:0x005d, B:18:0x006d, B:27:0x0088, B:29:0x008c, B:31:0x0090), top: B:40:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0088 A[Catch: all -> 0x0096, TryCatch #0 {all -> 0x0096, blocks: (B:2:0x0000, B:4:0x0011, B:6:0x002c, B:8:0x0032, B:11:0x003e, B:13:0x0052, B:22:0x0077, B:24:0x0081, B:32:0x0092, B:25:0x0084, B:20:0x0073, B:14:0x0057, B:15:0x005c, B:16:0x005d, B:18:0x006d, B:27:0x0088, B:29:0x008c, B:31:0x0090), top: B:40:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c A[Catch: all -> 0x0096, TryCatch #0 {all -> 0x0096, blocks: (B:2:0x0000, B:4:0x0011, B:6:0x002c, B:8:0x0032, B:11:0x003e, B:13:0x0052, B:22:0x0077, B:24:0x0081, B:32:0x0092, B:25:0x0084, B:20:0x0073, B:14:0x0057, B:15:0x005c, B:16:0x005d, B:18:0x006d, B:27:0x0088, B:29:0x008c, B:31:0x0090), top: B:40:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090 A[Catch: all -> 0x0096, TryCatch #0 {all -> 0x0096, blocks: (B:2:0x0000, B:4:0x0011, B:6:0x002c, B:8:0x0032, B:11:0x003e, B:13:0x0052, B:22:0x0077, B:24:0x0081, B:32:0x0092, B:25:0x0084, B:20:0x0073, B:14:0x0057, B:15:0x005c, B:16:0x005d, B:18:0x006d, B:27:0x0088, B:29:0x008c, B:31:0x0090), top: B:40:0x0000 }] */
    @Override // ttpobfuscated.o7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ttpobfuscated.tc a(ttpobfuscated.xc r8, ttpobfuscated.cc r9) {
        /*
            r7 = this;
            java.util.List<X.0pKE> r0 = r7.b     // Catch: java.lang.Throwable -> L96
            r5 = 2
            java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.Throwable -> L96
            X.0pKE r0 = (X.C1507240pKE) r0     // Catch: java.lang.Throwable -> L96
            int r0 = r0.LL     // Catch: java.lang.Throwable -> L96
            java.util.List r6 = r7.a(r8, r0)     // Catch: java.lang.Throwable -> L96
            if (r6 == 0) goto L90
            ttpobfuscated.t4$a r1 = ttpobfuscated.t4.b     // Catch: java.lang.Throwable -> L96
            java.util.List<X.0pKE> r0 = r7.b     // Catch: java.lang.Throwable -> L96
            r4 = 1
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L96
            X.0pKE r0 = (X.C1507240pKE) r0     // Catch: java.lang.Throwable -> L96
            int r0 = r0.LL     // Catch: java.lang.Throwable -> L96
            int r0 = r7.c(r8, r0)     // Catch: java.lang.Throwable -> L96
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L96
            ttpobfuscated.t4 r3 = r1.a(r0)     // Catch: java.lang.Throwable -> L96
            if (r3 == 0) goto L8c
            ttp.orbu.sdk.requestvalidator.Request r2 = r9.b     // Catch: java.lang.Throwable -> L96
            boolean r0 = r2 instanceof ttp.orbu.sdk.requestvalidator.Request.Http     // Catch: java.lang.Throwable -> L96
            if (r0 == 0) goto L88
            int[] r1 = ttpobfuscated.k9.a.a     // Catch: java.lang.Throwable -> L96
            int r0 = r3.ordinal()     // Catch: java.lang.Throwable -> L96
            r0 = r1[r0]     // Catch: java.lang.Throwable -> L96
            if (r0 == r4) goto L5d
            if (r0 != r5) goto L57
            ttp.orbu.sdk.requestvalidator.Request$Http r2 = (ttp.orbu.sdk.requestvalidator.Request.Http) r2     // Catch: java.lang.Throwable -> L96
            X.01GW r0 = r2.h     // Catch: java.lang.Throwable -> L96
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L96
            ttpobfuscated.ng r0 = (ttpobfuscated.ng) r0     // Catch: java.lang.Throwable -> L96
            java.util.Map r0 = r0.l()     // Catch: java.lang.Throwable -> L96
            java.util.Map r0 = ttpobfuscated.og.a(r0)     // Catch: java.lang.Throwable -> L96
            if (r0 == 0) goto L73
            java.util.Set r1 = r0.keySet()     // Catch: java.lang.Throwable -> L96
            goto L71
        L57:
            X.07lC r0 = new X.07lC     // Catch: java.lang.Throwable -> L96
            r0.<init>()     // Catch: java.lang.Throwable -> L96
            throw r0     // Catch: java.lang.Throwable -> L96
        L5d:
            ttp.orbu.sdk.requestvalidator.Request$Http r2 = (ttp.orbu.sdk.requestvalidator.Request.Http) r2     // Catch: java.lang.Throwable -> L96
            X.01GW r0 = r2.h     // Catch: java.lang.Throwable -> L96
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L96
            ttpobfuscated.ng r0 = (ttpobfuscated.ng) r0     // Catch: java.lang.Throwable -> L96
            java.util.Map r0 = r0.a()     // Catch: java.lang.Throwable -> L96
            if (r0 == 0) goto L73
            java.util.Set r1 = r0.keySet()     // Catch: java.lang.Throwable -> L96
        L71:
            if (r1 != 0) goto L77
        L73:
            X.08CX r1 = X.C08CX.INSTANCE     // Catch: java.lang.Throwable -> L96
            if (r1 == 0) goto L88
        L77:
            java.util.Set r0 = X.C13LP.LLIIJI(r6)     // Catch: java.lang.Throwable -> L96
            boolean r0 = r0.containsAll(r1)     // Catch: java.lang.Throwable -> L96
            if (r0 == 0) goto L84
            ttpobfuscated.tc r1 = ttpobfuscated.tc.True     // Catch: java.lang.Throwable -> L96
            goto L86
        L84:
            ttpobfuscated.tc r1 = ttpobfuscated.tc.False     // Catch: java.lang.Throwable -> L96
        L86:
            if (r1 != 0) goto L92
        L88:
            ttpobfuscated.tc r1 = ttpobfuscated.tc.Undefined     // Catch: java.lang.Throwable -> L96
            if (r1 != 0) goto L92
        L8c:
            ttpobfuscated.tc r1 = ttpobfuscated.tc.Undefined     // Catch: java.lang.Throwable -> L96
            if (r1 != 0) goto L92
        L90:
            ttpobfuscated.tc r1 = ttpobfuscated.tc.Undefined     // Catch: java.lang.Throwable -> L96
        L92:
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L96
            goto La2
        L96:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        La2:
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r1)
            if (r0 == 0) goto Laa
            ttpobfuscated.tc r1 = ttpobfuscated.tc.Undefined
        Laa:
            ttpobfuscated.tc r1 = (ttpobfuscated.tc) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.k9.a(ttpobfuscated.xc, ttpobfuscated.cc):ttpobfuscated.tc");
    }
}
