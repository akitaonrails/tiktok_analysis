package ttpobfuscated;

import X.AbstractC2252651DEx;
import X.AbstractC23140094w;
import X.C098200Yq;
import X.C099R;
import X.C09AX;
import X.C09DV;
import X.C0PEM;
import X.C13LE;
import X.C13LP;
import X.C155000ia;
import X.C189200o6;
import X.C1C7U;
import X.C2097608Jq;
import X.C23250099c;
import X.C817503Hh;
import X.InterfaceC1364105Vn;
import X.InterfaceC497601wk;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ttp.orbu.sdk.netnative.TTPOrbuNetworkCaller;
import ttpobfuscated.q3;

/* JADX INFO: loaded from: classes4.dex */
public final class lb {
    public static final a j = new a();
    public static lb k;
    public final boolean a;
    public boolean d;
    public Context f;
    public int i;
    public final String b = C13LE.LIZ(lb.class).LJI();
    public final ConcurrentHashMap<String, List<Long>> c = new ConcurrentHashMap<>();
    public final long e = 20;
    public final String g = "orbuSdkPerfReportSummary";
    public final String h = "orbuSdkPerfReportDetails";

    public static final class a {
        public final lb a() {
            return lb.k;
        }
    }

    static {
        q3.a.getClass();
        k = new lb(q3.a.d);
    }

    public final Long c() {
        if (this.a) {
            return Long.valueOf(System.nanoTime());
        }
        return null;
    }

    public final String b() {
        return this.b;
    }

    @C09DV(c = "ttp.orbu.sdk.utils.ProfilingPerfUtils$prepare$1", f = "ProfilingPerfUtils.kt", l = {74}, m = "invokeSuspend")
    public final class b extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
        public int a;

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("lb@1183.a$1");
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
                lb lbVar = lb.this;
                this.a = 1;
                if (lbVar.a(this) == objLJFF) {
                    C1C7U.LIZIZ("lb@1183.a$1");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("lb@1183.a$1");
            return unit;
        }

        public b(InterfaceC1364105Vn<? super b> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return lb.this.new b(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return lb.this.new b(interfaceC1364105Vn);
        }
    }

    @C09DV(c = "ttp.orbu.sdk.utils.ProfilingPerfUtils", f = "ProfilingPerfUtils.kt", l = {117, 122}, m = "scheduleReport")
    public final class c extends AbstractC23140094w {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        @Override // njp.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C1C7U.LIZ("lb@1183.a$2");
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            Object objA = lb.this.a(this);
            C1C7U.LIZIZ("lb@1183.a$2");
            return objA;
        }

        public c(InterfaceC1364105Vn<? super c> interfaceC1364105Vn) {
            super(interfaceC1364105Vn);
        }
    }

    public lb(boolean z) {
        this.a = z;
    }

    public final void a(boolean z) throws Throwable {
        Object c098200Yq;
        try {
            c098200Yq = TTPOrbuNetworkCaller.INSTANCE.profilingPerfUtilsGetMetrics();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Map mapLJ = C2097608Jq.LJ();
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = mapLJ;
        }
        Map mapLJ2 = (Map) c098200Yq;
        if (mapLJ2 == null) {
            mapLJ2 = C2097608Jq.LJ();
        }
        Map<String, ? extends List<Long>> mapLJIIL = C2097608Jq.LJIIL(this.c, mapLJ2);
        Iterator it2 = ((LinkedHashMap) mapLJIIL).values().iterator();
        int size = 0;
        while (it2.hasNext()) {
            size += ((List) it2.next()).size();
        }
        if (size > this.i) {
            this.i = size;
            if (z) {
                long jNanoTime = System.nanoTime();
                a(this.f, this.g + '_' + jNanoTime, b(mapLJIIL));
                a(this.f, this.h + '_' + jNanoTime, a(mapLJIIL));
            }
            q3.b.a(q3.a, this.b, b(mapLJIIL), (Throwable) null, 4, (Object) null);
        }
    }

    public final String b(Map<String, ? extends List<Long>> map) {
        StringBuilder sb = new StringBuilder("name, count, total_time (microseconds),average (microseconds),min (microseconds),max (microseconds),10pc (microseconds),20pc (microseconds),30pc (microseconds),50pc (microseconds),70pc (microseconds),90pc (microseconds),95pc (microseconds),99pc (microseconds)\n");
        for (Map.Entry<String, ? extends List<Long>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<Long> value = entry.getValue();
            sb.append(key + ',' + value.size() + ',' + C13LP.LJZL(value) + ',' + ((long) C13LP.LJJJI(value)) + ',' + ((Number) C13LP.LJJZZIII(value)).longValue() + ',' + ((Number) C13LP.LJJLJ(value)).longValue() + ',' + mb.b(value, 10) + ',' + mb.b(value, 20) + ',' + mb.b(value, 30) + ',' + mb.b(value, 50) + ',' + mb.b(value, 70) + ',' + mb.b(value, 90) + ',' + mb.b(value, 95) + ',' + mb.b(value, 99) + '\n');
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0085 -> B:17:0x0043). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(X.InterfaceC1364105Vn<? super kotlin.Unit> r16) throws java.lang.Throwable {
        /*
            r15 = this;
            r3 = r16
            boolean r0 = r3 instanceof ttpobfuscated.lb.c
            if (r0 == 0) goto L2c
            r8 = r3
            ttpobfuscated.lb$c r8 = (ttpobfuscated.lb.c) r8
            int r2 = r8.d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2c
            int r2 = r2 - r1
            r8.d = r2
        L14:
            java.lang.Object r1 = r8.b
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r8.d
            r6 = 2
            r5 = 1
            if (r0 == 0) goto L3f
            if (r0 == r5) goto L3a
            if (r0 != r6) goto L32
            java.lang.Object r4 = r8.a
            ttpobfuscated.lb r4 = (ttpobfuscated.lb) r4
            X.C155000ia.LIZIZ(r1)
            goto L43
        L2c:
            ttpobfuscated.lb$c r8 = new ttpobfuscated.lb$c
            r8.<init>(r3)
            goto L14
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L3a:
            java.lang.Object r4 = r8.a
            ttpobfuscated.lb r4 = (ttpobfuscated.lb) r4
            goto L54
        L3f:
            X.C155000ia.LIZIZ(r1)
            r4 = r15
        L43:
            long r2 = r4.e     // Catch: java.lang.Exception -> L5d
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0     // Catch: java.lang.Exception -> L5d
            long r2 = r2 * r0
            r8.a = r4     // Catch: java.lang.Exception -> L5d
            r8.d = r5     // Catch: java.lang.Exception -> L5d
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r2, r8)     // Catch: java.lang.Exception -> L5d
            if (r0 != r7) goto L57
            goto L88
        L54:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L5d
        L57:
            r1 = 0
            r0 = 0
            a(r4, r1, r5, r0)     // Catch: java.lang.Exception -> L5d
            goto L7d
        L5d:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            ttpobfuscated.q3$a r9 = ttpobfuscated.q3.a
            java.lang.String r10 = r4.b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Error in scheduleReport: "
            r1.<init>(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r11 = r1.toString()
            r12 = 0
            r13 = 4
            r14 = r12
            ttpobfuscated.q3.b.b(r9, r10, r11, r12, r13, r14)
        L7d:
            r8.a = r4
            r8.d = r6
            java.lang.Object r0 = X.C2252671DEz.LIZ(r8)
            if (r0 != r7) goto L43
            return r7
        L88:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.lb.a(X.05Vn):java.lang.Object");
    }

    public final String a(Map<String, ? extends List<Long>> map) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, ? extends List<Long>> entry : map.entrySet()) {
            sb.append(entry.getKey() + ", " + entry.getValue() + '\n');
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(android.content.Context r19, java.lang.String r20, java.lang.String r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.lb.a(android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    public final void a(Context context, InterfaceC497601wk interfaceC497601wk, AbstractC2252651DEx abstractC2252651DEx) {
        this.f = context;
        if (this.a && !this.d) {
            C23250099c.LIZLLL(interfaceC497601wk, abstractC2252651DEx, null, new b(null), 2);
            this.d = true;
        }
    }

    public final void a(String str, Long l, boolean z, String str2) {
        if (this.a && l != null) {
            List<Long> list = this.c.get(str);
            if (list == null || list.isEmpty()) {
                this.c.put(str, new ArrayList());
            }
            long jNanoTime = System.nanoTime() - l.longValue();
            List<Long> list2 = this.c.get(str);
            if (list2 != null) {
                list2.add(Long.valueOf((long) (jNanoTime / 1000.0d)));
            }
            if (z) {
                q3.a.getClass();
                q3.a.c.a(l, str, str2);
            }
        }
    }

    public static /* synthetic */ void a(lb lbVar, boolean z, int i, Object obj) throws Throwable {
        if ((i & 1) != 0) {
            z = true;
        }
        lbVar.a(z);
    }

    public static void a(lb lbVar, Context context, InterfaceC497601wk interfaceC497601wk, AbstractC2252651DEx abstractC2252651DEx, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC497601wk = C817503Hh.LL;
        }
        if ((i & 4) != 0) {
            abstractC2252651DEx = C0PEM.LIZJ;
        }
        lbVar.a(context, interfaceC497601wk, abstractC2252651DEx);
    }

    public static /* synthetic */ void a(lb lbVar, String str, Long l, boolean z, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        lbVar.a(str, l, z, str2);
    }
}
