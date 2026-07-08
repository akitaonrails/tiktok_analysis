package kotlin.jvm.internal;

import X.C09AY;
import X.C1666200tSc;
import X.C2267001DoI;
import X.C341440Da2;
import X.InterfaceC1627880sSo;
import X.InterfaceC1665870tS5;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AwS2S0201001_25 extends C09AY implements Function2 {
    public final int $t;
    public float f3;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS2S0201001_25 awS2S0201001_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((C2267001DoI) awS2S0201001_25.l0).LIZLLL((InterfaceC1665870tS5) awS2S0201001_25.l1, awS2S0201001_25.f3, (InterfaceC1680500tpg) obj, awS2S0201001_25.i2 | 1);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS2S0201001_25 awS2S0201001_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1666200tSc.LIZIZ((InterfaceC1627880sSo) awS2S0201001_25.l0, (InterfaceC1685750ty9) awS2S0201001_25.l1, awS2S0201001_25.f3, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS2S0201001_25.i2 | 1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS2S0201001_25(InterfaceC1627880sSo interfaceC1627880sSo, InterfaceC1685750ty9 interfaceC1685750ty9, float f, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = interfaceC1627880sSo;
        this.l1 = interfaceC1685750ty9;
        this.f3 = f;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS2S0201001_25(C2267001DoI c2267001DoI, InterfaceC1665870tS5 interfaceC1665870tS5, float f, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = c2267001DoI;
        this.l1 = interfaceC1665870tS5;
        this.f3 = f;
        this.i2 = i;
    }
}
