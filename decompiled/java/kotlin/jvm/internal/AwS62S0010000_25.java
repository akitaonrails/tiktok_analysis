package kotlin.jvm.internal;

import X.C09AY;
import X.C1660920tK6;
import X.C1664650tQ7;
import X.InterfaceC1621930sJD;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes26.dex */
public class AwS62S0010000_25 extends C09AY implements Function0 {
    public final int $t;
    public boolean z0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS62S0010000_25 awS62S0010000_25) {
        boolean z;
        if (!C1660920tK6.LIZLLL && !C1660920tK6.LJ) {
            z = false;
        } else {
            z = true;
        }
        C1660920tK6.LJFF = z;
        ArrayList<InterfaceC1621930sJD> arrayList = C1660920tK6.LJI;
        boolean z2 = awS62S0010000_25.z0;
        for (InterfaceC1621930sJD interfaceC1621930sJD : arrayList) {
            if (z2) {
                interfaceC1621930sJD.LIZLLL();
            } else {
                interfaceC1621930sJD.LIZ();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS62S0010000_25 awS62S0010000_25) {
        boolean z;
        if (!C1660920tK6.LIZLLL && !C1660920tK6.LJ) {
            z = false;
        } else {
            z = true;
        }
        C1660920tK6.LJFF = z;
        ArrayList<InterfaceC1621930sJD> arrayList = C1660920tK6.LJI;
        boolean z2 = awS62S0010000_25.z0;
        for (InterfaceC1621930sJD interfaceC1621930sJD : arrayList) {
            if (z2) {
                interfaceC1621930sJD.LIZIZ();
            } else {
                interfaceC1621930sJD.LIZJ();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS62S0010000_25 awS62S0010000_25) {
        if (awS62S0010000_25.z0) {
            throw new C1664650tQ7("AlsLogicContainer not found because it was cleaned");
        }
        throw new C1664650tQ7("AlsLogicContainer not found");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS62S0010000_25(boolean z, int i) {
        super(0);
        this.$t = i;
        this.z0 = z;
    }
}
