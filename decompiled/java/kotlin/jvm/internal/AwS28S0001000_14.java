package kotlin.jvm.internal;

import X.C09AY;
import X.C0ZES;
import X.C1651206dK;
import X.C1729206pu;
import X.C2172771A1r;
import X.C291001Au;
import X.C867980Y3g;
import X.C875480YWc;
import X.C887820YsG;
import X.EnumC880850Yh1;
import X.InterfaceC2172841A1y;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public class AwS28S0001000_14 extends C09AY implements Function1 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f983i0;

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
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS28S0001000_14(int i) {
        super(1);
        this.$t = i;
        this.f983i0 = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS28S0001000_14(int i, int i2) {
        super(1);
        this.$t = i2;
        this.f983i0 = i;
    }

    public static final Object invoke$0(AwS28S0001000_14 awS28S0001000_14, Object obj) {
        return C1651206dK.LIZ((C1651206dK) obj, null, null, false, null, awS28S0001000_14.f983i0, false, 0, null, false, false, false, false, null, null, 524223);
    }

    public static final Object invoke$1(AwS28S0001000_14 awS28S0001000_14, Object obj) {
        return C887820YsG.LIZ((C887820YsG) obj, Integer.valueOf(awS28S0001000_14.f983i0), null, null, EnumC880850Yh1.NORMAL, null, null, null, null, null, null, null, null, 4086);
    }

    public static final Object invoke$2(AwS28S0001000_14 awS28S0001000_14, Object obj) {
        return C0ZES.LIZ((C0ZES) obj, null, null, null, null, null, null, new C291001Au(Integer.valueOf(awS28S0001000_14.f983i0)), null, null, 895);
    }

    public static final Object invoke$3(AwS28S0001000_14 awS28S0001000_14, Object obj) {
        boolean z;
        InterfaceC2172841A1y interfaceC2172841A1y = (InterfaceC2172841A1y) obj;
        if (interfaceC2172841A1y instanceof C2172771A1r) {
            C2172771A1r c2172771A1r = (C2172771A1r) interfaceC2172841A1y;
            if (awS28S0001000_14.f983i0 > 0) {
                z = true;
            } else {
                z = false;
            }
            return C2172771A1r.LIZ(c2172771A1r, 0, 0, null, z, 1535);
        }
        return interfaceC2172841A1y;
    }

    public static final Object invoke$4(AwS28S0001000_14 awS28S0001000_14, Object obj) {
        ((C867980Y3g) obj).LJIIL = Integer.valueOf(awS28S0001000_14.f983i0);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS28S0001000_14 awS28S0001000_14, Object obj) {
        return C1729206pu.LIZ((C1729206pu) obj, null, false, null, null, null, null, null, null, 0, awS28S0001000_14.f983i0, 0, null, null, false, 15871);
    }

    public static final Object invoke$6(AwS28S0001000_14 awS28S0001000_14, Object obj) {
        Map map = (Map) obj;
        long jCurrentTimeMillis = 0;
        if (C875480YWc.LIZIZ >= 0) {
            jCurrentTimeMillis = System.currentTimeMillis() - C875480YWc.LIZIZ;
        }
        map.put("span", Long.valueOf(jCurrentTimeMillis));
        map.put("state", Integer.valueOf(awS28S0001000_14.f983i0));
        map.put("last_state", Integer.valueOf(C875480YWc.LIZ));
        C875480YWc.LIZIZ = System.currentTimeMillis();
        C875480YWc.LIZ = awS28S0001000_14.f983i0;
        return Unit.LIZ;
    }
}
