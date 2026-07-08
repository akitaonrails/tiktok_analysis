package kotlin.jvm.internal;

import X.AbstractC1522680pj8;
import X.C013C;
import X.C086F;
import X.C09AY;
import X.C1492150ovt;
import X.C1531820pxs;
import X.C1531990py9;
import X.C1532710pzJ;
import X.C1533490q0Z;
import X.C1533670q0r;
import X.C1533790q13;
import X.C1534000q1O;
import X.C1534070q1V;
import X.C1534080q1W;
import X.C1534110q1Z;
import X.C1534250q1n;
import X.C1534320q1u;
import X.C2188811AlT;
import X.C259800zU;
import X.C786410Ut5;
import X.EnumC1534700q2W;
import com.bytedance.forest.chain.fetchers.ResourceFetcher;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes24.dex */
public class AwS56S0500000_23 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f8, code lost:
    
        if (r3 > r1) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [T, X.0pxs, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS56S0500000_23 r11, java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS56S0500000_23.invoke$0(kotlin.jvm.internal.AwS56S0500000_23, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0049 A[PHI: r8
      0x0049: PHI (r8v4 boolean) = (r8v1 boolean), (r8v1 boolean), (r8v0 boolean) binds: [B:38:0x00a0, B:39:0x00a2, B:17:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f A[PHI: r8
      0x004f: PHI (r8v3 boolean) = (r8v1 boolean), (r8v4 boolean) binds: [B:39:0x00a2, B:19:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0084  */
    /* JADX WARN: Type inference failed for: r11v1, types: [T, X.0py9$b, java.lang.Object] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS56S0500000_23 r10, java.lang.Object r11) {
        /*
            X.0py9$b r11 = (X.C1531990py9.b) r11
            java.lang.Object r0 = r10.l0
            X.00zU r0 = (X.C259800zU) r0
            r0.element = r11
            E r5 = r11.LIZ
            X.0pxs r5 = (X.C1531820pxs) r5
            if (r5 == 0) goto L9c
            boolean r0 = r5.LIZLLL()
            if (r0 == 0) goto L9c
            X.0py9<X.0pxs> r1 = r5.LIZLLL
            java.lang.Object r0 = r10.l1
            X.0py9 r0 = (X.C1531990py9) r0
            if (r1 != r0) goto L9c
            java.lang.String r9 = r5.LJ
            if (r9 == 0) goto L9c
            r0 = 45
            java.lang.String r1 = kotlin.text.a0.LJJZZIII(r0, r9, r9)
            java.lang.String r0 = "forest_"
            java.lang.String r7 = kotlin.text.a0.LJJLJLI(r1, r0, r1)
            java.lang.Long r0 = r5.LJFF
            r8 = 1
            r6 = 0
            if (r0 == 0) goto La5
            long r3 = r0.longValue()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto La5
            r1 = 1
        L3d:
            java.lang.Object r0 = r10.l2
            java.util.Set r0 = (java.util.Set) r0
            boolean r0 = r0.contains(r7)
            if (r0 == 0) goto L9f
            if (r1 == 0) goto L9f
        L49:
            boolean r0 = kotlin.text.a0.LJJJIL(r9)
            if (r0 == 0) goto L52
        L4f:
            r5.LIZJ()
        L52:
            boolean r0 = r5.LIZLLL()
            if (r0 == 0) goto L9c
            if (r8 != 0) goto L9c
            java.lang.Object r0 = r10.l0
            X.00zU r0 = (X.C259800zU) r0
            T r1 = r0.element
            X.0py9$b r1 = (X.C1531990py9.b) r1
            if (r1 == 0) goto L6f
            E r0 = r1.LIZ
            if (r0 == r5) goto L75
            if (r1 == 0) goto L6f
            java.util.concurrent.atomic.AtomicReference<X.0py9<E>$b<E>> r0 = r1.LIZIZ
            r0.set(r11)
        L6f:
            java.lang.Object r0 = r10.l0
            X.00zU r0 = (X.C259800zU) r0
            r0.element = r11
        L75:
            java.lang.Object r0 = r10.l2
            java.util.Set r0 = (java.util.Set) r0
            r0.add(r7)
            java.lang.Object r0 = r10.l3
            X.013C r0 = (X.C013C) r0
            boolean r0 = r0.element
            if (r0 != 0) goto L8d
            java.lang.Object r1 = r10.l4
            java.lang.StringBuilder r1 = (java.lang.StringBuilder) r1
            r0 = 44
            r1.append(r0)
        L8d:
            java.lang.Object r0 = r10.l3
            X.013C r0 = (X.C013C) r0
            r0.element = r6
            java.lang.Object r1 = r10.l4
            java.lang.StringBuilder r1 = (java.lang.StringBuilder) r1
            java.lang.String r0 = r5.LJ
            r1.append(r0)
        L9c:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L9f:
            r8 = 0
            if (r1 != 0) goto L49
            if (r0 != 0) goto L4f
            goto L49
        La5:
            r1 = 0
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS56S0500000_23.invoke$1(kotlin.jvm.internal.AwS56S0500000_23, java.lang.Object):java.lang.Object");
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS56S0500000_23 awS56S0500000_23, Object obj) {
        C1492150ovt timer;
        C1492150ovt timer2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ResourceFetcher resourceFetcher = ((C1533790q13) awS56S0500000_23.l0).LJIJJ;
        if (resourceFetcher != null && (timer2 = resourceFetcher.getTimer()) != null) {
            timer2.LIZJ("cache");
        }
        C1534250q1n c1534250q1n = C1534250q1n.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("result of cache: ");
        sbLIZ.append(zBooleanValue);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1534250q1n.getClass();
        C1534250q1n.LJIIIZ("TTNetDepender", "fetchResource", strLIZIZ, null, false);
        if (zBooleanValue) {
            C1534070q1V c1534070q1V = (C1534070q1V) awS56S0500000_23.l1;
            c1534070q1V.LIZIZ.LJ = "cdn";
            c1534070q1V.LIZJ();
            if (((C1533790q13) awS56S0500000_23.l0).LJIJ != null) {
                C1534080q1W.LIZJ.remove(((AbstractC1522680pj8) awS56S0500000_23.l2).toString());
            }
        } else {
            C1534070q1V c1534070q1V2 = (C1534070q1V) awS56S0500000_23.l1;
            if (!c1534070q1V2.LJIIIZ && !((C1533490q0Z) awS56S0500000_23.l3).LJIIIIZZ) {
                ResourceFetcher resourceFetcher2 = ((C1533790q13) awS56S0500000_23.l0).LJIJJ;
                if (resourceFetcher2 != null && (timer = resourceFetcher2.getTimer()) != null) {
                    timer.LIZLLL("load");
                }
                if (!Intrinsics.LJFF(C786410Ut5.u3(), (Thread) awS56S0500000_23.l4)) {
                    C1534080q1W.LJIIL((AbstractC1522680pj8) awS56S0500000_23.l2, (C1534070q1V) awS56S0500000_23.l1, (C1533790q13) awS56S0500000_23.l0);
                } else {
                    C1534070q1V c1534070q1V3 = (C1534070q1V) awS56S0500000_23.l1;
                    if (c1534070q1V3.LIZ) {
                        C086F c086f = C086F.LIZ;
                        AwS267S0300000_23 awS267S0300000_23 = new AwS267S0300000_23((AbstractC1522680pj8) awS56S0500000_23.l2, c1534070q1V3, (C1533790q13) awS56S0500000_23.l0, 4);
                        c086f.getClass();
                        C086F.LJI(awS267S0300000_23);
                    } else {
                        C1534080q1W.LJIIL((AbstractC1522680pj8) awS56S0500000_23.l2, (C1534070q1V) awS56S0500000_23.l1, (C1533790q13) awS56S0500000_23.l0);
                    }
                }
            } else {
                c1534070q1V2.LIZ(new C1533670q0r(1, 0, "only local but no cache found"));
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [T, java.util.Map] */
    public static final Object invoke$3(AwS56S0500000_23 awS56S0500000_23, Object obj) {
        C1534110q1Z c1534110q1Z = (C1534110q1Z) obj;
        C1534000q1O c1534000q1OLJFF = c1534110q1Z.LJFF();
        if (c1534000q1OLJFF == null) {
            AbstractC1522680pj8 abstractC1522680pj8 = (AbstractC1522680pj8) awS56S0500000_23.l2;
            c1534110q1Z.LIZJ(true);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("invalid cdn cache for ");
            sbLIZ.append(abstractC1522680pj8.LIZ);
            C1534250q1n.LIZIZ("TTNetDepender", C2188811AlT.LIZIZ(sbLIZ), null);
            return Boolean.FALSE;
        }
        if (((C1533790q13) awS56S0500000_23.l0).LIZ.LIZ()) {
            ((C259800zU) awS56S0500000_23.l1).element = c1534110q1Z.LJ();
            if (!C1534080q1W.LIZLLL((Map) ((C259800zU) awS56S0500000_23.l1).element, ((AbstractC1522680pj8) awS56S0500000_23.l2).LJ)) {
                return Boolean.FALSE;
            }
        }
        if (!((C1534070q1V) awS56S0500000_23.l3).LJIIJ && !c1534110q1Z.LIZLLL()) {
            C1534250q1n c1534250q1n = C1534250q1n.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("request hit by disk response cache, ");
            sbLIZ2.append(((AbstractC1522680pj8) awS56S0500000_23.l2).LIZ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            c1534250q1n.getClass();
            C1534250q1n.LJIIIZ("TTNetDepender", "tryFetchFromCache", strLIZIZ, null, false);
            C1533790q13 c1533790q13 = (C1533790q13) awS56S0500000_23.l0;
            c1533790q13.LIZIZ = true;
            c1533790q13.LJI = true;
            c1533790q13.LJIJ = EnumC1534700q2W.NORMAL;
            ((C1533790q13) awS56S0500000_23.l0).LJIILL(c1534000q1OLJFF);
            C1534080q1W.LJIIIZ((Map) ((C259800zU) awS56S0500000_23.l1).element, (C1533790q13) awS56S0500000_23.l0, true, Long.valueOf(c1534110q1Z.LJ));
            return Boolean.TRUE;
        }
        C259800zU c259800zU = (C259800zU) awS56S0500000_23.l4;
        T t = c259800zU.element;
        T t2 = c1534110q1Z;
        if (t != 0) {
            t2 = t;
        }
        c259800zU.element = t2;
        return Boolean.FALSE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0041 A[PHI: r5
      0x0041: PHI (r5v5 boolean) = (r5v2 boolean), (r5v2 boolean), (r5v1 boolean) binds: [B:34:0x009a, B:35:0x009c, B:13:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049 A[PHI: r5
      0x0049: PHI (r5v4 boolean) = (r5v2 boolean), (r5v5 boolean) binds: [B:35:0x009c, B:15:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    /* JADX WARN: Type inference failed for: r10v1, types: [T, X.0q1u$b, java.lang.Object] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$4(kotlin.jvm.internal.AwS56S0500000_23 r9, java.lang.Object r10) {
        /*
            X.0q1u$b r10 = (X.C1534320q1u.b) r10
            java.lang.Object r0 = r9.l0
            X.00zU r0 = (X.C259800zU) r0
            r0.element = r10
            E r2 = r10.LIZ
            X.0q1Z r2 = (X.C1534110q1Z) r2
            if (r2 == 0) goto L96
            boolean r0 = r2.LIZ()
            if (r0 == 0) goto L96
            X.0q1u<X.0q1Z> r1 = r2.LJFF
            java.lang.Object r0 = r9.l1
            X.0q1u r0 = (X.C1534320q1u) r0
            if (r1 != r0) goto L96
            java.lang.String r1 = r2.LIZIZ
            r0 = 45
            java.lang.String r1 = kotlin.text.a0.LJJZZIII(r0, r1, r1)
            java.lang.String r0 = "forest_"
            java.lang.String r4 = kotlin.text.a0.LJJLJLI(r1, r0, r1)
            long r5 = r2.LJ
            r7 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r5 = 1
            r3 = 0
            if (r0 != 0) goto L9f
            r1 = 1
        L35:
            java.lang.Object r0 = r9.l2
            java.util.Set r0 = (java.util.Set) r0
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L99
            if (r1 == 0) goto L99
        L41:
            java.lang.String r0 = r2.LIZIZ
            boolean r0 = kotlin.text.a0.LJJJIL(r0)
            if (r0 == 0) goto L4c
        L49:
            r2.LIZJ(r3)
        L4c:
            boolean r0 = r2.LIZ()
            if (r0 == 0) goto L96
            if (r5 != 0) goto L96
            java.lang.Object r0 = r9.l0
            X.00zU r0 = (X.C259800zU) r0
            T r1 = r0.element
            X.0q1u$b r1 = (X.C1534320q1u.b) r1
            if (r1 == 0) goto L69
            E r0 = r1.LIZ
            if (r0 == r2) goto L6f
            if (r1 == 0) goto L69
            java.util.concurrent.atomic.AtomicReference<X.0q1u<E>$b<E>> r0 = r1.LIZIZ
            r0.set(r10)
        L69:
            java.lang.Object r0 = r9.l0
            X.00zU r0 = (X.C259800zU) r0
            r0.element = r10
        L6f:
            java.lang.Object r0 = r9.l2
            java.util.Set r0 = (java.util.Set) r0
            r0.add(r4)
            java.lang.Object r0 = r9.l3
            X.013C r0 = (X.C013C) r0
            boolean r0 = r0.element
            if (r0 != 0) goto L87
            java.lang.Object r1 = r9.l4
            java.lang.StringBuilder r1 = (java.lang.StringBuilder) r1
            r0 = 44
            r1.append(r0)
        L87:
            java.lang.Object r0 = r9.l3
            X.013C r0 = (X.C013C) r0
            r0.element = r3
            java.lang.Object r1 = r9.l4
            java.lang.StringBuilder r1 = (java.lang.StringBuilder) r1
            java.lang.String r0 = r2.LIZIZ
            r1.append(r0)
        L96:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L99:
            r5 = 0
            if (r1 != 0) goto L41
            if (r0 != 0) goto L49
            goto L41
        L9f:
            r1 = 0
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS56S0500000_23.invoke$4(kotlin.jvm.internal.AwS56S0500000_23, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS56S0500000_23(C259800zU c259800zU, C259800zU<C1531990py9<C1531820pxs>.b<C1531820pxs>> c259800zU2, C1531990py9<C1531820pxs> c1531990py9, Set<String> set, C013C c013c, StringBuilder sb) {
        super(1);
        this.$t = sb;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
        this.l2 = c1531990py9;
        this.l3 = set;
        this.l4 = c013c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS56S0500000_23(C259800zU c259800zU, C259800zU<Map<String, String>> c259800zU2, C1532710pzJ c1532710pzJ, C259800zU<C1531820pxs> c259800zU3, C259800zU<C1531820pxs> c259800zU4, C013C c013c) {
        super(1);
        this.$t = c013c;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
        this.l2 = c1532710pzJ;
        this.l3 = c259800zU3;
        this.l4 = c259800zU4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS56S0500000_23(C259800zU c259800zU, C259800zU<C1534320q1u<C1534110q1Z>.b<C1534110q1Z>> c259800zU2, C1534320q1u<C1534110q1Z> c1534320q1u, Set<String> set, C013C c013c, StringBuilder sb) {
        super(1);
        this.$t = sb;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
        this.l2 = c1534320q1u;
        this.l3 = set;
        this.l4 = c013c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS56S0500000_23(C1533790q13 c1533790q13, C1533790q13 c1533790q132, C259800zU<Map<String, String>> c259800zU, AbstractC1522680pj8 abstractC1522680pj8, C1534070q1V c1534070q1V, C259800zU<C1534110q1Z> c259800zU2) {
        super(1);
        this.$t = c259800zU2;
        this.l0 = c1533790q13;
        this.l1 = c1533790q132;
        this.l2 = c259800zU;
        this.l3 = abstractC1522680pj8;
        this.l4 = c1534070q1V;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS56S0500000_23(C1533790q13 c1533790q13, C1534070q1V c1534070q1V, AbstractC1522680pj8 abstractC1522680pj8, C1533490q0Z c1533490q0Z, Thread thread, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1533790q13;
        this.l1 = c1534070q1V;
        this.l2 = abstractC1522680pj8;
        this.l3 = c1533490q0Z;
        this.l4 = thread;
    }
}
