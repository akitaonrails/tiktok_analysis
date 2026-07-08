package kotlin.jvm.internal;

import X.C09AY;
import X.C2218381Bs4;
import X.InterfaceC2218401Bs6;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes35.dex */
public class AwS67S0010000_34 extends C09AY implements Function0 {
    public final int $t;
    public boolean z0;

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

    public static final Object invoke$0(AwS67S0010000_34 awS67S0010000_34) {
        ArrayList<InterfaceC2218401Bs6> arrayList = C2218381Bs4.LJFF;
        boolean z = awS67S0010000_34.z0;
        for (InterfaceC2218401Bs6 interfaceC2218401Bs6 : arrayList) {
            if (z) {
                interfaceC2218401Bs6.LIZLLL();
            } else {
                interfaceC2218401Bs6.LIZ();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS67S0010000_34 awS67S0010000_34) {
        ArrayList<InterfaceC2218401Bs6> arrayList = C2218381Bs4.LJFF;
        boolean z = awS67S0010000_34.z0;
        for (InterfaceC2218401Bs6 interfaceC2218401Bs6 : arrayList) {
            if (z) {
                interfaceC2218401Bs6.LIZIZ();
            } else {
                interfaceC2218401Bs6.LIZJ();
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS67S0010000_34(boolean z, int i) {
        super(0);
        this.$t = i;
        this.z0 = z;
    }
}
