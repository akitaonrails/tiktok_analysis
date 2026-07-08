package kotlin.jvm.internal;

import X.AbstractC1683310tuD;
import X.AbstractC1686530tzP;
import X.C020W;
import X.C09AY;
import X.C0MAE;
import X.C1628190sTJ;
import X.C1637540siO;
import X.C1666600tTG;
import X.C1691480u7O;
import X.C19719212De;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public class AwS106S0201000_25 extends C09AY implements Function1 {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS106S0201000_25 awS106S0201000_25, Object obj) {
        return C1637540siO.LIZ((C1637540siO) obj, new C1628190sTJ(awS106S0201000_25.i2, awS106S0201000_25.l0, (Function0) awS106S0201000_25.l1), false, false, false, false, false, null, false, 1021);
    }

    public static final Object invoke$1(AwS106S0201000_25 awS106S0201000_25, Object obj) {
        int i;
        int i2;
        AbstractC1683310tuD abstractC1683310tuD = (AbstractC1683310tuD) obj;
        int iLJII = ((C1691480u7O) awS106S0201000_25.l0).LLJJ.LJII();
        int i3 = awS106S0201000_25.i2;
        if (iLJII < 0) {
            iLJII = 0;
        }
        if (iLJII > i3) {
            iLJII = i3;
        }
        C1691480u7O c1691480u7O = (C1691480u7O) awS106S0201000_25.l0;
        if (c1691480u7O.LLJJI) {
            i = iLJII - i3;
        } else {
            i = -iLJII;
        }
        if (c1691480u7O.LLJJIII) {
            i2 = 0;
        } else {
            i2 = i;
            i = 0;
        }
        AwS33S0102000_25 awS33S0102000_25 = new AwS33S0102000_25(i2, i, (AbstractC1686530tzP) awS106S0201000_25.l1, 2);
        abstractC1683310tuD.LIZ = true;
        awS33S0102000_25.invoke(abstractC1683310tuD);
        abstractC1683310tuD.LIZ = false;
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS106S0201000_25 awS106S0201000_25, Object obj) {
        List list = (List) awS106S0201000_25.l0;
        int i = awS106S0201000_25.i2;
        Function1 function1 = (Function1) awS106S0201000_25.l1;
        ((C0MAE) obj).LIZJ(list.size(), null, new C020W(AFwS266S0000000_25.get$arr$(523), list, 71), new C19719212De(-632812321, new C1666600tTG(list, i, function1), true));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS106S0201000_25(int i, int i2, Object obj, Function0<Unit> function0) {
        super(1);
        this.$t = function0;
        this.i2 = i;
        this.l0 = i2;
        this.l1 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS106S0201000_25(C1691480u7O c1691480u7O, int i, AbstractC1686530tzP abstractC1686530tzP, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c1691480u7O;
        this.i2 = i;
        this.l1 = abstractC1686530tzP;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS106S0201000_25(List list, List<Integer> list2, int i, Function1<? super Integer, Unit> function1) {
        super(1);
        this.$t = function1;
        this.l0 = list;
        this.i2 = list2;
        this.l1 = i;
    }
}
