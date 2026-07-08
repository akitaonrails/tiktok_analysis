package kotlin.jvm.internal;

import X.C09AY;
import X.C1666590tTF;
import X.C1666770tTX;
import X.C1670050tYp;
import X.C1683170ttz;
import X.C341440Da2;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import com.bytedance.android.live.liveinteract.multimatch.business.dialog.onlygiftselect.MatchOnlyGiftViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AwS4S0112000_25 extends C09AY implements Function2 {
    public final int $t;
    public int i2;
    public int i3;
    public Object l0;
    public boolean z1;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS4S0112000_25 awS4S0112000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1670050tYp.LIZJ((MatchOnlyGiftViewModel) awS4S0112000_25.l0, awS4S0112000_25.z1, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS4S0112000_25.i2 | 1), awS4S0112000_25.i3);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS4S0112000_25 awS4S0112000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        boolean z = awS4S0112000_25.z1;
        InterfaceC1685750ty9 interfaceC1685750ty9 = (InterfaceC1685750ty9) awS4S0112000_25.l0;
        C1683170ttz.LJ(C341440Da2.LIZ(awS4S0112000_25.i2 | 1), awS4S0112000_25.i3, (InterfaceC1680500tpg) obj, interfaceC1685750ty9, z);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS4S0112000_25 awS4S0112000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int i = awS4S0112000_25.i2;
        boolean z = awS4S0112000_25.z1;
        Function1 function1 = (Function1) awS4S0112000_25.l0;
        C1666590tTF.LIZ(i, C341440Da2.LIZ(awS4S0112000_25.i3 | 1), (InterfaceC1680500tpg) obj, function1, z);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS4S0112000_25 awS4S0112000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        boolean z = awS4S0112000_25.z1;
        InterfaceC1685750ty9 interfaceC1685750ty9 = (InterfaceC1685750ty9) awS4S0112000_25.l0;
        C1666770tTX.LIZJ(C341440Da2.LIZ(awS4S0112000_25.i2 | 1), awS4S0112000_25.i3, (InterfaceC1680500tpg) obj, interfaceC1685750ty9, z);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS4S0112000_25(int i, int i2, InterfaceC1685750ty9 interfaceC1685750ty9, boolean z, int i3) {
        super(2);
        this.$t = i3;
        this.z1 = z;
        this.l0 = interfaceC1685750ty9;
        this.i2 = i;
        this.i3 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS4S0112000_25(int i, int i2, Function1 function1, boolean z, int i3) {
        super(2);
        this.$t = i3;
        this.i2 = i;
        this.z1 = z;
        this.l0 = function1;
        this.i3 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS4S0112000_25(MatchOnlyGiftViewModel matchOnlyGiftViewModel, boolean z, int i, int i2, int i3) {
        super(2);
        this.$t = i3;
        this.l0 = matchOnlyGiftViewModel;
        this.z1 = z;
        this.i2 = i;
        this.i3 = i2;
    }
}
