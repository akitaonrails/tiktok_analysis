package kotlin.jvm.internal;

import X.C09AY;
import X.C113G;
import X.C1415220mvo;
import X.C1418220n0e;
import X.C1418830n1d;
import X.C1418950n1p;
import X.C1426550nE5;
import X.C1427030nEr;
import X.C1428330nGx;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C814420VxA;
import X.DialogC1390150mHN;
import X.EnumC1426980nEm;
import X.EnumC1434770nRL;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public class AwS161S0101000_22 extends C09AY implements Function0 {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS161S0101000_22 awS161S0101000_22) {
        return new C1426550nE5((C113G) awS161S0101000_22.l0, null, awS161S0101000_22.i1, EnumC1426980nEm.LOADING, null, 0, true, false, null, null, null, null, null, null);
    }

    public static final Object invoke$1(AwS161S0101000_22 awS161S0101000_22) {
        ((C1427030nEr) awS161S0101000_22.l0).LLLLLJIL().notifyItemChanged(awS161S0101000_22.i1);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS161S0101000_22 awS161S0101000_22) {
        DialogC1390150mHN dialogC1390150mHN = ((C1428330nGx) awS161S0101000_22.l0).LLJJLIIIJLLLLLLLZ;
        if (dialogC1390150mHN != null) {
            dialogC1390150mHN.LJJLL(awS161S0101000_22.i1, true);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS161S0101000_22 awS161S0101000_22) {
        AwS601S0100000_22 awS601S0100000_22 = ((C1418950n1p) awS161S0101000_22.l0).LLJI;
        if (awS601S0100000_22 != null) {
            awS601S0100000_22.invoke(Integer.valueOf(awS161S0101000_22.i1));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS161S0101000_22 awS161S0101000_22) {
        RecyclerView.LayoutManager layoutManager;
        LinearLayoutManager linearLayoutManager;
        int width;
        RecyclerView recyclerView = ((C1418830n1d) awS161S0101000_22.l0).LLJZIJLIL;
        if (recyclerView != null) {
            layoutManager = recyclerView.getLayoutManager();
        } else {
            layoutManager = null;
        }
        if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null) {
            return null;
        }
        int i = awS161S0101000_22.i1;
        RecyclerView recyclerView2 = ((C1418830n1d) awS161S0101000_22.l0).LLJZIJLIL;
        if (recyclerView2 != null) {
            width = recyclerView2.getWidth();
        } else {
            width = 0;
        }
        linearLayoutManager.scrollToPositionWithOffset(i, ((width - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))) / 2);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS161S0101000_22 awS161S0101000_22) {
        ((C1415220mvo) awS161S0101000_22.l0).i3(new AwS35S0001000_22(awS161S0101000_22.i1, 23));
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS161S0101000_22 awS161S0101000_22) {
        ((C1418220n0e) awS161S0101000_22.l0).LJ.setProgress(awS161S0101000_22.i1);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS161S0101000_22 awS161S0101000_22) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((EnumC1434770nRL) awS161S0101000_22.l0).name().toLowerCase(Locale.ROOT));
        sbLIZ.append(": ");
        sbLIZ.append(awS161S0101000_22.i1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS161S0101000_22(C1415220mvo c1415220mvo, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1415220mvo;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS161S0101000_22(C1418220n0e c1418220n0e, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1418220n0e;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS161S0101000_22(C1418830n1d c1418830n1d, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1418830n1d;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS161S0101000_22(C1418950n1p c1418950n1p, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1418950n1p;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS161S0101000_22(C1427030nEr c1427030nEr, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1427030nEr;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS161S0101000_22(C1428330nGx c1428330nGx, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1428330nGx;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS161S0101000_22(EnumC1434770nRL enumC1434770nRL, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = enumC1434770nRL;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS161S0101000_22(C113G c113g, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c113g;
        this.i1 = i;
    }
}
