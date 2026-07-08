package kotlin.jvm.internal;

import X.C09AY;
import X.C20441214yg;
import X.C2188811AlT;
import X.C915980Zwa;
import X.C977620bY0;
import X.C977630bY1;
import X.EnumC919170a1j;
import X.EnumC976510bWD;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public class AwS8S0100200_15 extends C09AY implements Function0 {
    public final int $t;
    public long j1;
    public long j2;
    public Object l0;

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

    public static final Object invoke$0(AwS8S0100200_15 awS8S0100200_15) {
        if (((C977630bY1) awS8S0100200_15.l0).LJIILIIL.getValue() == EnumC919170a1j.MATCH_TYPE_1V1) {
            if (C915980Zwa.LJII().LJJIJ().size() < 2 && ((C977630bY1) awS8S0100200_15.l0).LJJIIZ()) {
                C20441214yg.LIZIZ("CombinedMatchInviterViewModel", "Timeout! Call cancel Co-Host invitation cuz it's not connected");
                C977630bY1 c977630bY1 = (C977630bY1) awS8S0100200_15.l0;
                C977630bY1.LJIIJ(awS8S0100200_15.j1, c977630bY1.LJJIZ.LIZIZ, c977630bY1.LJJJJZ);
            } else {
                EnumC976510bWD enumC976510bWD = EnumC976510bWD.TIME_OUT;
                C977630bY1 c977630bY12 = (C977630bY1) awS8S0100200_15.l0;
                boolean z = c977630bY12.LJJJ;
                int i = c977630bY12.LJJJJLL;
                c977630bY12.LJJI(awS8S0100200_15.j2, z, enumC976510bWD, Long.valueOf(awS8S0100200_15.j1), Integer.valueOf(i), c977630bY12.LJJJJZ, null);
            }
        } else {
            EnumC976510bWD enumC976510bWD2 = EnumC976510bWD.TIME_OUT;
            C977630bY1 c977630bY13 = (C977630bY1) awS8S0100200_15.l0;
            c977630bY13.LJJI(awS8S0100200_15.j2, c977630bY13.LJJJ, enumC976510bWD2, null, null, null, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS8S0100200_15 awS8S0100200_15) {
        int size = C915980Zwa.LJII().LJJIJ().size();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Timeout! coHostAnchorCount:");
        sbLIZ.append(size);
        C20441214yg.LIZIZ("TwoMatchInviterViewModel", C2188811AlT.LIZIZ(sbLIZ));
        if (size < 2 && ((C977620bY0) awS8S0100200_15.l0).LJJ()) {
            C20441214yg.LJIIL("TwoMatchInviterViewModel", "Timeout! Call cancel Co-Host invitation cuz it's not connected");
            C977620bY0 c977620bY0 = (C977620bY0) awS8S0100200_15.l0;
            C977620bY0.LJIIJ(awS8S0100200_15.j1, c977620bY0.LJJIJLIJ.LIZIZ, c977620bY0.LJJIJIIJI);
        } else {
            C20441214yg.LIZIZ("TwoMatchInviterViewModel", "Timeout! Request battle/cancel");
            EnumC976510bWD enumC976510bWD = EnumC976510bWD.TIME_OUT;
            C977620bY0 c977620bY02 = (C977620bY0) awS8S0100200_15.l0;
            c977620bY02.LJIJ(awS8S0100200_15.j2, c977620bY02.LJJIII, enumC976510bWD, awS8S0100200_15.j1, c977620bY02.LJJIJIIJIL, c977620bY02.LJJIJIIJI, null);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS8S0100200_15(C977620bY0 c977620bY0, long j, long j2, int i) {
        super(0);
        this.$t = i;
        this.l0 = c977620bY0;
        this.j1 = j;
        this.j2 = j2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS8S0100200_15(C977630bY1 c977630bY1, long j, long j2, int i) {
        super(0);
        this.$t = i;
        this.l0 = c977630bY1;
        this.j1 = j;
        this.j2 = j2;
    }
}
