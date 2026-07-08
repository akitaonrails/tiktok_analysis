package kotlin.jvm.internal;

import X.C09AY;
import X.C1680770tq7;
import X.C1683130ttv;
import X.EnumC1669110tXJ;
import X.InterfaceC1631620sYq;
import X.InterfaceC1680960tqQ;
import kotlin.Unit;

/* JADX INFO: loaded from: classes26.dex */
public class AwS70S0001000_25 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f1030i0;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS70S0001000_25(int i, int i2) {
        super(3);
        this.$t = i2;
        this.f1030i0 = i;
    }

    public static final Object invoke$0(AwS70S0001000_25 awS70S0001000_25, Object obj, Object obj2, Object obj3) {
        ((InterfaceC1680960tqQ) obj).LJIILIIL(new C1683130ttv(0.0f, 0.0f, Float.intBitsToFloat((int) (((C1680770tq7) obj2).LIZ >> 32)), awS70S0001000_25.f1030i0), EnumC1669110tXJ.CounterClockwise);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS70S0001000_25 awS70S0001000_25, Object obj, Object obj2, Object obj3) {
        ((InterfaceC1680960tqQ) obj).LJIILIIL(new C1683130ttv(0.0f, 0.0f, Float.intBitsToFloat((int) (((C1680770tq7) obj2).LIZ >> 32)), awS70S0001000_25.f1030i0), EnumC1669110tXJ.CounterClockwise);
        return Unit.LIZ;
    }
}
