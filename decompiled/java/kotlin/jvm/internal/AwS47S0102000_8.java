package kotlin.jvm.internal;

import X.C09AY;
import X.C1667510tUj;
import X.C341440Da2;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public class AwS47S0102000_8 extends C09AY implements Function2 {
    public final int $t;
    public int i1;
    public int i2;
    public Object l0;

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

    public static final Object invoke$0(AwS47S0102000_8 awS47S0102000_8, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1667510tUj.LIZ((InterfaceC1685750ty9) awS47S0102000_8.l0, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS47S0102000_8.i1 | 1), awS47S0102000_8.i2);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS47S0102000_8 awS47S0102000_8, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1667510tUj.LIZ((InterfaceC1685750ty9) awS47S0102000_8.l0, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS47S0102000_8.i1 | 1), awS47S0102000_8.i2);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS47S0102000_8(int i, int i2, InterfaceC1685750ty9 interfaceC1685750ty9, int i3) {
        super(2);
        this.$t = i3;
        this.l0 = interfaceC1685750ty9;
        this.i1 = i;
        this.i2 = i2;
    }
}
