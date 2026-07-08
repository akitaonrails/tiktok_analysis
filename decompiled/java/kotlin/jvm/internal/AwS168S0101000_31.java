package kotlin.jvm.internal;

import X.C09AY;
import X.C15TX;
import X.C20359414lU;
import X.C20365614mU;
import X.C20374514nv;
import X.C20377014oK;
import X.C20441214yg;
import X.C204608154k;
import X.C204615154r;
import X.C20649015r6;
import X.C2188811AlT;
import X.C403501hZ;
import X.EnumC1568370qup;
import X.EnumC1779290wP1;
import com.bytedance.android.livesdk.dialog.PriorityTaskDispatcher;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes32.dex */
public class AwS168S0101000_31 extends C09AY implements Function0 {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS168S0101000_31 awS168S0101000_31) {
        ((PriorityTaskDispatcher) awS168S0101000_31.l0).LLILLJJLI.remove(Integer.valueOf(awS168S0101000_31.i1));
        ((PriorityTaskDispatcher) awS168S0101000_31.l0).LLILLL.remove(awS168S0101000_31.i1);
        int i = awS168S0101000_31.i1;
        PriorityTaskDispatcher priorityTaskDispatcher = (PriorityTaskDispatcher) awS168S0101000_31.l0;
        if (i == priorityTaskDispatcher.LL) {
            priorityTaskDispatcher.vQ2();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS168S0101000_31 awS168S0101000_31) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStateChange, directorState=");
        sbLIZ.append(awS168S0101000_31.i1);
        C20441214yg.LJIIIZ("PlaybookDetailHandlerV2", C2188811AlT.LIZIZ(sbLIZ));
        C20377014oK c20377014oK = (C20377014oK) awS168S0101000_31.l0;
        c20377014oK.getClass();
        C403501hZ.LIZ(new AwS575S0100000_31(c20377014oK, 1467));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS168S0101000_31 awS168S0101000_31) {
        boolean z;
        C20359414lU c20359414lU = ((C20365614mU) awS168S0101000_31.l0).LIZ;
        int i = awS168S0101000_31.i1;
        if (C20374514nv.LJI(c20359414lU) && i == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$3(AwS168S0101000_31 awS168S0101000_31) {
        boolean z;
        C204615154r c204615154r = (C204615154r) awS168S0101000_31.l0;
        if (c204615154r.LJI && c204615154r.LJIIJ == awS168S0101000_31.i1) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$4(AwS168S0101000_31 awS168S0101000_31) {
        ((C204608154k) awS168S0101000_31.l0).LJII(awS168S0101000_31.i1 + 1);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS168S0101000_31 awS168S0101000_31) {
        if (awS168S0101000_31.i1 == EnumC1568370qup.NO_PREFETCH.getValue()) {
            ((C15TX) awS168S0101000_31.l0).LLILLJJLI = true;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS168S0101000_31 awS168S0101000_31) {
        C20649015r6 c20649015r6 = C20649015r6.LIZ;
        EnumC1779290wP1 enumC1779290wP1 = (EnumC1779290wP1) awS168S0101000_31.l0;
        int i = awS168S0101000_31.i1;
        c20649015r6.getClass();
        C20649015r6.LIZIZ(enumC1779290wP1, i);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS168S0101000_31(int i, C20377014oK c20377014oK, int i2) {
        super(0);
        this.$t = i2;
        this.i1 = i;
        this.l0 = c20377014oK;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS168S0101000_31(int i, C204608154k c204608154k, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c204608154k;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS168S0101000_31(int i, C15TX c15tx, int i2) {
        super(0);
        this.$t = i2;
        this.i1 = i;
        this.l0 = c15tx;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS168S0101000_31(EnumC1779290wP1 enumC1779290wP1, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = enumC1779290wP1;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS168S0101000_31(C20365614mU c20365614mU, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c20365614mU;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS168S0101000_31(C204615154r c204615154r, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c204615154r;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS168S0101000_31(PriorityTaskDispatcher priorityTaskDispatcher, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = priorityTaskDispatcher;
        this.i1 = i;
    }
}
