package kotlin.jvm.internal;

import X.AbstractC1623806Xk;
import X.C09AY;
import X.C1612210s3X;
import X.C1613130s51;
import X.C627660Ojc;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes25.dex */
public class AwS8S0220000_24 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;
    public boolean z3;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS8S0220000_24 awS8S0220000_24, Object obj) {
        C1612210s3X c1612210s3X = (C1612210s3X) obj;
        if (awS8S0220000_24.z2) {
            return C1612210s3X.LIZ(c1612210s3X, new C627660Ojc((AbstractC1623806Xk) awS8S0220000_24.l0, null, null, (List) awS8S0220000_24.l1, 6), null, null, (AbstractC1623806Xk) awS8S0220000_24.l0, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, false, null, null, null, -10);
        }
        if (awS8S0220000_24.z3) {
            return C1612210s3X.LIZ(c1612210s3X, new C627660Ojc(null, (AbstractC1623806Xk) awS8S0220000_24.l0, null, (List) awS8S0220000_24.l1, 5), (AbstractC1623806Xk) awS8S0220000_24.l0, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, false, null, null, null, -4);
        }
        return C1612210s3X.LIZ(c1612210s3X, new C627660Ojc(null, null, (AbstractC1623806Xk) awS8S0220000_24.l0, (List) awS8S0220000_24.l1, 3), null, (AbstractC1623806Xk) awS8S0220000_24.l0, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, false, null, null, null, -6);
    }

    public static final Object invoke$1(AwS8S0220000_24 awS8S0220000_24, Object obj) {
        C1613130s51 c1613130s51 = (C1613130s51) obj;
        if (awS8S0220000_24.z2) {
            return C1613130s51.LIZ(c1613130s51, new C627660Ojc((AbstractC1623806Xk) awS8S0220000_24.l0, null, null, (List) awS8S0220000_24.l1, 6), null, null, (AbstractC1623806Xk) awS8S0220000_24.l0, null, null, false, false, 502);
        }
        if (awS8S0220000_24.z3) {
            return C1613130s51.LIZ(c1613130s51, new C627660Ojc(null, (AbstractC1623806Xk) awS8S0220000_24.l0, null, (List) awS8S0220000_24.l1, 5), (AbstractC1623806Xk) awS8S0220000_24.l0, null, null, null, null, false, false, 508);
        }
        return C1613130s51.LIZ(c1613130s51, new C627660Ojc(null, null, (AbstractC1623806Xk) awS8S0220000_24.l0, (List) awS8S0220000_24.l1, 3), null, (AbstractC1623806Xk) awS8S0220000_24.l0, null, null, null, false, false, 506);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS8S0220000_24(AbstractC1623806Xk abstractC1623806Xk, List list, boolean z, boolean z2, int i) {
        super(1);
        this.$t = i;
        this.z2 = z;
        this.l0 = abstractC1623806Xk;
        this.l1 = list;
        this.z3 = z2;
    }
}
