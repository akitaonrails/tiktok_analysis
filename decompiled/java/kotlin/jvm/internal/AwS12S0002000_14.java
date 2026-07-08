package kotlin.jvm.internal;

import X.C09AY;
import X.C2172771A1r;
import X.C234400vO;
import X.C291001Au;
import X.InterfaceC2172841A1y;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public class AwS12S0002000_14 extends C09AY implements Function1 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f954i0;
    public int i1;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS12S0002000_14 awS12S0002000_14, Object obj) {
        C291001Au c291001Au = new C291001Au(Integer.valueOf(awS12S0002000_14.f954i0 - awS12S0002000_14.i1));
        obj.getClass();
        return new C234400vO(c291001Au);
    }

    public static final Object invoke$1(AwS12S0002000_14 awS12S0002000_14, Object obj) {
        InterfaceC2172841A1y interfaceC2172841A1y = (InterfaceC2172841A1y) obj;
        if (interfaceC2172841A1y instanceof C2172771A1r) {
            return C2172771A1r.LIZ((C2172771A1r) interfaceC2172841A1y, awS12S0002000_14.f954i0, awS12S0002000_14.i1, null, false, 2041);
        }
        return interfaceC2172841A1y;
    }

    public static final Object invoke$2(AwS12S0002000_14 awS12S0002000_14, Object obj) {
        InterfaceC2172841A1y interfaceC2172841A1y = (InterfaceC2172841A1y) obj;
        if (interfaceC2172841A1y instanceof C2172771A1r) {
            return C2172771A1r.LIZ((C2172771A1r) interfaceC2172841A1y, awS12S0002000_14.f954i0, awS12S0002000_14.i1, null, false, 2041);
        }
        return interfaceC2172841A1y;
    }

    public static final Object invoke$3(AwS12S0002000_14 awS12S0002000_14, Object obj) {
        InterfaceC2172841A1y interfaceC2172841A1y = (InterfaceC2172841A1y) obj;
        if (interfaceC2172841A1y instanceof C2172771A1r) {
            return C2172771A1r.LIZ((C2172771A1r) interfaceC2172841A1y, awS12S0002000_14.f954i0, awS12S0002000_14.i1, null, false, 2041);
        }
        return interfaceC2172841A1y;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS12S0002000_14(int i, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.f954i0 = i;
        this.i1 = i2;
    }
}
