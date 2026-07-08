package kotlin.jvm.internal;

import X.C09AY;
import X.C1129910fVd;
import X.C1133910fc5;
import X.C1135810ff9;
import X.C1135920ffK;
import X.C1136260ffs;
import X.C1140170fmB;
import X.C2188811AlT;
import X.C500260Jjc;
import X.InterfaceC1136020ffU;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes18.dex */
public class AwS9S0201100_17 extends C09AY implements Function0 {
    public final int $t;
    public int i2;
    public long j3;
    public Object l0;
    public Object l1;

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

    public static final Object invoke$0(AwS9S0201100_17 awS9S0201100_17) {
        C1135920ffK c1135920ffK = (C1135920ffK) awS9S0201100_17.l0;
        long j = awS9S0201100_17.j3;
        C1135810ff9 c1135810ff9 = (C1135810ff9) awS9S0201100_17.l1;
        int i = awS9S0201100_17.i2;
        c1135920ffK.LJIILJJIL("updateLynxGiftResourceStatus");
        for (InterfaceC1136020ffU interfaceC1136020ffU : c1135920ffK.LIZJ) {
            if (Intrinsics.LJFF(interfaceC1136020ffU, c1135810ff9) || interfaceC1136020ffU.getGiftId() == j) {
                interfaceC1136020ffU.LJJI().LJIILL = i;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updateLynxGiftResourceStatus success, selfMessageQueue: ");
                sbLIZ.append(i);
                C1133910fc5.LIZLLL("GiftTrayMessageQueue", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        c1135920ffK.LIZLLL.LIZJ(new C1136260ffs(c1135810ff9, j, i, new C1140170fmB(0)));
        c1135920ffK.LJIILL();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS9S0201100_17 awS9S0201100_17) {
        C1129910fVd c1129910fVd = (C1129910fVd) awS9S0201100_17.l0;
        c1129910fVd.LLILZIL = true;
        c1129910fVd.LLILZLL = awS9S0201100_17.i2;
        c1129910fVd.LL.invalidateItemDecorations();
        long j = awS9S0201100_17.j3;
        if (j > 0) {
            C500260Jjc.LJJLIIIJJI(j, new AwS418S0200000_17((C1129910fVd) awS9S0201100_17.l0, (C1129910fVd) awS9S0201100_17.l1, (Function0<Unit>) 78));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS9S0201100_17(C1129910fVd c1129910fVd, int i, AwS561S0100000_17 awS561S0100000_17, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1129910fVd;
        this.i2 = i;
        this.j3 = 3000L;
        this.l1 = awS561S0100000_17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS9S0201100_17(C1135920ffK c1135920ffK, long j, C1135810ff9 c1135810ff9, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1135920ffK;
        this.j3 = j;
        this.l1 = c1135810ff9;
        this.i2 = i;
    }
}
