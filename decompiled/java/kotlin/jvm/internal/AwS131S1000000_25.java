package kotlin.jvm.internal;

import X.C09AY;
import X.C1175204ik;
import X.C1670400tZO;
import X.C1670600tZi;
import X.C1682320tsc;
import X.C1685190txF;
import X.InterfaceC1631620sYq;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import androidx.compose.foundation.layout.c;
import kotlin.Unit;

/* JADX INFO: loaded from: classes26.dex */
public class AwS131S1000000_25 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public String s0;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS131S1000000_25(String str, int i) {
        super(3);
        this.$t = i;
        this.s0 = str;
    }

    public static final Object invoke$0(AwS131S1000000_25 awS131S1000000_25, Object obj, Object obj2, Object obj3) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj2;
        if ((((Number) obj3).intValue() & 81) == 16 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1682320tsc.LIZIZ(awS131S1000000_25.s0, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1680500tpg, 0, 0, 131070);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS131S1000000_25 awS131S1000000_25, Object obj, Object obj2, Object obj3) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj2;
        ((Number) obj3).intValue();
        C1685190txF.LIZ(awS131S1000000_25.s0, c.LJIJJ(InterfaceC1685750ty9.LIZ, null, 3), C1670400tZO.LIZIZ(interfaceC1680500tpg).D2(), C1670400tZO.LJ(interfaceC1680500tpg).LJIIZILJ, 0L, 0, 0, false, 0, null, null, interfaceC1680500tpg, 48, 0, 2032);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS131S1000000_25 awS131S1000000_25, Object obj, Object obj2, Object obj3) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj2;
        if ((((Number) obj3).intValue() & 17) == 16 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1670600tZi.LIZ(new C1175204ik(awS131S1000000_25.s0), null, InterfaceC1685750ty9.LIZ, null, null, null, null, null, null, null, interfaceC1680500tpg, 432, 1016);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS131S1000000_25 awS131S1000000_25, Object obj, Object obj2, Object obj3) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj2;
        if ((((Number) obj3).intValue() & 17) == 16 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1670600tZi.LIZ(new C1175204ik(awS131S1000000_25.s0), null, c.LIZLLL(InterfaceC1685750ty9.LIZ), null, null, null, null, null, null, null, interfaceC1680500tpg, 432, 1016);
        }
        return Unit.LIZ;
    }
}
