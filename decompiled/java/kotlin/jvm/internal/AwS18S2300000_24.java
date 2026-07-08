package kotlin.jvm.internal;

import X.C09AY;
import X.C145100gz;
import X.C1569250qwF;
import X.C1605720rt4;
import X.C2487409ou;
import X.C727780Sgi;
import X.C729510SjV;
import X.InterfaceC1575850r6t;
import Y.ARunnableS10S1400000_24;
import Y.ARunnableS14S0201000_7;
import Y.ARunnableS7S1300000_7;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes25.dex */
public class AwS18S2300000_24 extends C09AY implements Function0 {
    public final int $t;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;
    public String s1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS18S2300000_24 r11) {
        /*
            java.lang.Object r2 = r11.l2
            X.0qwF r2 = (X.C1569250qwF) r2
            boolean r0 = r2.LJ
            if (r0 == 0) goto L17
            java.lang.String r1 = r11.s0
            if (r1 == 0) goto L17
            java.lang.String r0 = r2.LJFF
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L17
        L14:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L17:
            java.lang.Object r0 = r11.l2
            X.0qwF r0 = (X.C1569250qwF) r0
            java.util.List<X.0qwH> r1 = r0.LJI
            java.lang.String r3 = r11.s1
            boolean r0 = r1 instanceof java.util.Collection
            r2 = 0
            if (r0 == 0) goto La6
            r0 = r1
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto La6
        L2d:
            java.lang.Object r1 = r11.l2
            X.0qwF r1 = (X.C1569250qwF) r1
            int r0 = r1.LJII
            int r0 = r0 + (-1)
            r1.LJII = r0
        L37:
            java.lang.Object r0 = r11.l3
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto La1
            long r5 = r0.longValue()
        L41:
            java.lang.Object r0 = r11.l2
            X.0qwF r0 = (X.C1569250qwF) r0
            java.util.List<X.0qwH> r0 = r0.LJI
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L92
            r0 = r5
        L50:
            java.lang.Object r2 = r11.l2
            X.0qwF r2 = (X.C1569250qwF) r2
            java.util.List<X.0qwH> r3 = r2.LJI
            X.0qwH r4 = new X.0qwH
            java.lang.String r9 = r11.s1
            long r7 = r5 - r0
            java.lang.Object r10 = r11.l4
            java.util.Map r10 = (java.util.Map) r10
            r4.<init>(r5, r7, r9, r10)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            if (r10 == 0) goto L6d
            r2.putAll(r10)
        L6d:
            java.lang.String r1 = java.lang.String.valueOf(r7)
            java.lang.String r0 = "duration_ms"
            r2.put(r0, r1)
            java.util.List<java.lang.String> r0 = com.ss.android.ugc.aweme.feed.landscape.service.LandscapeFeedMonitorImpl.LIZ
            X.C20684815ws.LJIILLIIL(r9, r2)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.add(r4)
            java.lang.Object r2 = r11.l2
            X.0qwF r2 = (X.C1569250qwF) r2
            int r0 = r2.LJII
            if (r0 != 0) goto L14
            X.0qwE r1 = new X.0qwE
            r0 = 0
            r1.<init>(r2, r0)
            X.C1561780qkC.LIZ(r1)
            goto L14
        L92:
            java.lang.Object r0 = r11.l2
            X.0qwF r0 = (X.C1569250qwF) r0
            java.util.List<X.0qwH> r0 = r0.LJI
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r2)
            X.0qwH r0 = (X.C1569270qwH) r0
            long r0 = r0.LIZIZ
            goto L50
        La1:
            long r5 = java.lang.System.currentTimeMillis()
            goto L41
        La6:
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.util.Iterator r1 = r1.iterator()
        Lac:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r1.next()
            X.0qwH r0 = (X.C1569270qwH) r0
            java.lang.String r0 = r0.LIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r3)
            if (r0 == 0) goto Lac
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS18S2300000_24.invoke$0(kotlin.jvm.internal.AwS18S2300000_24):java.lang.Object");
    }

    public static final Object invoke$1(AwS18S2300000_24 awS18S2300000_24) {
        boolean z;
        ((C1605720rt4) awS18S2300000_24.l2).getClass();
        if (((Boolean) C145100gz.LIZ.getValue()).booleanValue()) {
            C1605720rt4 c1605720rt4 = (C1605720rt4) awS18S2300000_24.l2;
            LifecycleOwner lifecycleOwner = (LifecycleOwner) awS18S2300000_24.l3;
            c1605720rt4.getClass();
            int iIdentityHashCode = System.identityHashCode(lifecycleOwner);
            synchronized (c1605720rt4.LIZLLL.getValue()) {
                try {
                    z = !((ArrayList) c1605720rt4.LIZLLL.getValue()).contains(Integer.valueOf(iIdentityHashCode));
                    if (z) {
                        ((ArrayList) c1605720rt4.LIZLLL.getValue()).add(Integer.valueOf(iIdentityHashCode));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (z) {
                C2487409ou.LIZJ(new ARunnableS14S0201000_7(iIdentityHashCode, lifecycleOwner, c1605720rt4, 7));
            }
        }
        String str = awS18S2300000_24.s0;
        if (str != null && C729510SjV.LJIILJJIL(str)) {
            C1605720rt4 c1605720rt42 = (C1605720rt4) awS18S2300000_24.l2;
            c1605720rt42.LIZJ.LJIILIIL((LifecycleOwner) awS18S2300000_24.l3, new AwS138S1100000_24(c1605720rt42, awS18S2300000_24.s0, 13));
        }
        String str2 = awS18S2300000_24.s1;
        if (str2 != null) {
            C1605720rt4 c1605720rt43 = (C1605720rt4) awS18S2300000_24.l2;
            LifecycleOwner lifecycleOwner2 = (LifecycleOwner) awS18S2300000_24.l3;
            MutableLiveData<C727780Sgi> mutableLiveData = c1605720rt43.LIZIZ().get(str2);
            if (mutableLiveData != null) {
                C2487409ou.LIZJ(new ARunnableS7S1300000_7(mutableLiveData, lifecycleOwner2, c1605720rt43, str2, 1));
            }
        }
        if (awS18S2300000_24.s0 != null) {
            MutableLiveData<C727780Sgi> mutableLiveData2 = ((C1605720rt4) awS18S2300000_24.l2).LIZIZ().get(awS18S2300000_24.s0);
            if (mutableLiveData2 == null) {
                mutableLiveData2 = new MutableLiveData<>();
                ((C1605720rt4) awS18S2300000_24.l2).LIZIZ().put(awS18S2300000_24.s0, mutableLiveData2);
            }
            C2487409ou.LIZJ(new ARunnableS10S1400000_24(mutableLiveData2, (LifecycleOwner) awS18S2300000_24.l3, (C1605720rt4) awS18S2300000_24.l2, (InterfaceC1575850r6t) awS18S2300000_24.l4, awS18S2300000_24.s0, 0));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS18S2300000_24(C1569250qwF c1569250qwF, C1569250qwF c1569250qwF2, String str, Long l, String str2, Map<String, String> map) {
        super(0);
        this.$t = map;
        this.l2 = c1569250qwF;
        this.s0 = c1569250qwF2;
        this.l3 = str;
        this.s1 = l;
        this.l4 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS18S2300000_24(C1605720rt4 c1605720rt4, LifecycleOwner lifecycleOwner, String str, String str2, InterfaceC1575850r6t interfaceC1575850r6t, int i) {
        super(0);
        this.$t = i;
        this.l2 = c1605720rt4;
        this.l3 = lifecycleOwner;
        this.s0 = str;
        this.s1 = str2;
        this.l4 = interfaceC1575850r6t;
    }
}
